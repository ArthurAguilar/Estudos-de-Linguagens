import { agenda } from "./bancoContatos.js"

let contatos = {
    addContato: (dados, destinoDOM) => {

        let numTotal;
        
        const novoContato = {
            id: Date.now(),
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

            const btnDelete = document.createElement('button')
            btnDelete.textContent = 'DEL'
            btnDelete.classList.add('btnDelete')

            btnDelete.addEventListener('click', () => {
                const divPai = btnDelete.parentNode;
                divPai.remove();

                const index = Array.from(listaContatos.children).indexOf(divPai)
                agenda.splice(index, 1)
            
            })
            
            div.appendChild(pNome)
            div.appendChild(pTel)
            div.appendChild(pEmail)
            div.appendChild(btnDelete)
            destinoDOM.appendChild(div)
        })
        // console.log(agenda)
    }
}

export default contatos
