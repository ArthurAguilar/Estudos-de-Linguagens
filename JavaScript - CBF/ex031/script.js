const userId = document.querySelector('#userId')
const id = document.querySelector('#id')
const title = document.querySelector('#title')
const body = document.querySelector('#body')
const btn = document.querySelector('#btn')

const URL = 'https://jsonplaceholder.typicode.com/posts'

btn.addEventListener('click', () => {
    let dados = {
        userId: 200,
        id: 87,
        title: 'Eu sou o cara, papai!',
        body: 'Botar geral pá rodar!'
    };

    fetch(URL, {
        method: 'POST',
        body: JSON.stringify(dados),
        headers: {
            'Content-type': 'application/json; charset=UTF-8',
        }
    })
    .then(response => response.json())
    .then(json => console.log(json));
});


