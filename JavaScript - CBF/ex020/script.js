//Refazendo o exercício para macetar na cabeça (lá ele!)

import contatos from "./contatos.js"

const btnGravar = document.querySelector('#btn_gravar')
const inputNome = document.querySelector('#f_nome')
const inputTel = document.querySelector('#f_telefone')
const inputEmail = document.querySelector('#f_email')
const listaContatos = document.querySelector('#listaContatos')

btnGravar.addEventListener('click', () => {
    const novoContato = {
        nome: inputNome.value,
        tel: inputTel.value,
        email: inputEmail.value,
    }

    contatos.addContato(novoContato, listaContatos)
    
    inputNome.value = ''
    inputTel.value = ''
    inputEmail.value = ''
    inputNome.focus()
})
