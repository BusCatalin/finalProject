$(document).ready(() => {
    $('#add-button-modal').click(() => {
        const name=$('#modal-name').val();
        const continent=$('#modal-continent').val();

        const newCountry={
        name : name,
        continent : continent
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

    $('#modal-name').val(name);
    $('#modal-continent').val(continent);
    });

    $('#add-country-button').click(function () {
        countryToEdit = null;
        clearModal();
    });

    function clearModal() {
            $('#modal-description').val('');
            $('#modal-amount').val('');
            $('#modal-type').val('');
        }


    $('.delete-icon').click(function() {
        const countryId= this.parentElement.id;

        fetch('api/countries/' + countryId,{
        method: 'DELETE'
        }).then(response => location.reload());
    });
});