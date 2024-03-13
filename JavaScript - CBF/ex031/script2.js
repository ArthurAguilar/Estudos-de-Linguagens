const formEl = document.querySelector('#form-api');

formEl.addEventListener('submit', event => {
    event.preventDefault();

    const formData = new FormData(formEl);
    const data = Object.fromEntries(formData);


    console.log(data)
});

