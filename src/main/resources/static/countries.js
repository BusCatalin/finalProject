$(document).ready(() => {
    $('#add-button-modal').click(() => {
        const name=$('#modal-name').val();
        const continent=$('#modal-continent').val();

        const newCountry={
        name : name,
        continent : continent
        };
        fetch('/api/countries', {
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
        })
    })



    $('.delete-icon').click(function() {
        const countryId= this.parentElement.id;

        fetch('api/countries/' + countryId,{
        method: 'DELETE'
        }).then(response => location.reload());
    });
});