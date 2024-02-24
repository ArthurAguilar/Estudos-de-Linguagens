import { agenda } from "./bancoContatos.js"

let contatos = {
    addContato: (dados, destino) => {
        const div = document.createElement('div')
        div.classList.add('contato')

        const pNome = document.createElement('p')
        pNome.innerHTML = dados.nome

        const pTel = document.createElement('p')
        pTel.innerHTML = dados.tel

        const pEmail = document.createElement('p')
        pEmail.innerHTML = dados.email

        div.appendChild(pNome)
        div.appendChild(pTel)
        div.appendChild(pEmail)

        destino.appendChild(div)
    }
}

export default contatos