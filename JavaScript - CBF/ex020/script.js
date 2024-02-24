import c from './contatos.js'
const listaContatos = document.getElementById('listaContatos')
const btn_gravar = document.getElementById('btn_gravar')
const nome = document.querySelector('#f_nome')
const tel = document.querySelector('#f_telefone')
const email = document.querySelector('#f_email')

btn_gravar.addEventListener('click', () => {
    const cont = {
        nome: nome.value,
        tel: tel.value,
        email: email.value,
    }
    c.addContato(cont, listaContatos)

    nome.value = ''
    tel.value = ''
    email.value = ''
    nome.focus()
})