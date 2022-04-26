$(document).ready(() => {
    $('#add-button-modal').click(() => {
        const name=$('#modal-name').val();
        const continent=$('#modal-continent').val();
        const capital=$('#modal-capital').val();
        const area=$('#modal-area').val();
        const currency=$('#modal-currency').val();

        const newCountry={
        name : name,
        continent : continent,
        capital : capital,
        area : area,
        currency : currency

        };

        if (countryToEdit == null) {
            addCountry(newCountry);
        }else {
            editCountry(countryToEdit,  newCountry)
        }
    });

    function addCountry(newCountry) {
        fetch('api/countries' , {
        method: 'POST',
        body: JSON.stringify(newCountry),
        headers: {
        'Content-Type': 'application/json'
        }
        }).then(response => {
        if(response.ok) {
            location.reload()
        }else {
            alert("There are errors " + response.status);
        }
        });
    }

    function editCountry(id, newCountry) {
        fetch('api/countries/' + id, {
        method: 'PUT',
        body :JSON.stringify(newCountry),
        headers: {
        'Content-Type': 'application/json'
        }
        }).then(response => {
        if(response.ok) {
        location.reload()
        }else {
        alert("There are errors " + response.status);
        }
        });
    }

    $('.edit-icon').click(function () {
    countryToEdit = this.parentElement.id;
    const row = this.parentElement.parentElement;
    const name = row.children[0].innerText;
    const continent = row.children[1].innerText;
    const capital =row.children[2].innertext;
    const area =row.children[3].innertext;
    const currency =row.children[4].innertext;

    $('#modal-name').val(name);
    $('#modal-continent').val(continent);
    $('#modal-capital').val(capital);
    $('#modal-area').val(area);
    $('#modal-currency').val(currency);
    });

    $('#add-country-button').click(function () {
        countryToEdit = null;
        clearModal();
    });

    function clearModal() {
            $('#modal-name ').val('');
            $('#modal-continent').val('');
            $('#modal-capital').val('');
            $('#modal-area').val('');
            $('#modal-currency').val('');
        }


    $('.delete-icon').click(function() {
        const countryId= this.parentElement.id;

        fetch('api/countries/' + countryId,{
        method: 'DELETE'
        }).then(response => location.reload());
    });
});