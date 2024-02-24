import { contatos } from './bancoContatos.js'

let contato = {
    addContato: (novoContato, destinoDOM) => {
        const div = document.createElement('div')
        div.classList.add('contato')

        const pNome = document.createElement('p')
        pNome.innerHTML = novoContato.nome

        const pTel = document.createElement('p')
        pTel.innerHTML = novoContato.tel

        const pEmail = document.createElement('p')
        pEmail.innerHTML = novoContato.email


        div.appendChild(pNome)
        div.appendChild(pTel)
        div.appendChild(pEmail)
        destinoDOM.appendChild(div)
    }
}

export default contato