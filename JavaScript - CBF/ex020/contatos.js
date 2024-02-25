import { agenda } from "./bancoContatos.js"

let contatos = {
    addContato: (dados, destinoDOM) => {
        
        const novoContato = {
            nome: dados.nome,
            tel: dados.tel,
            email: dados.email
        }

        agenda.push(novoContato)

        destinoDOM.innerHTML = ''

        agenda.forEach((contato) => {
            const div = document.createElement('div')
            div.classList.add('contato')

            const pNome = document.createElement('p')
            pNome.innerHTML = contato.nome

            const pTel = document.createElement('p')
            pTel.innerHTML = contato.tel

            const pEmail = document.createElement('p')
            pEmail.innerHTML = contato.email

            div.appendChild(pNome)
            div.appendChild(pTel)
            div.appendChild(pEmail)
            destinoDOM.appendChild(div)
        })
    }
}

export default contatos