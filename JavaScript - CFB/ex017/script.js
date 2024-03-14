const url = document.querySelector('#url')
const btnUrl = document.querySelector('#btn')
const form = document.querySelector('#form')

btnUrl.addEventListener('click', () => {
    window.location = url.value
});


form.addEventListener('submit', (event) => {
    event.preventDefault()
})