const temp = document.querySelector('#pTemp')
const nivel = document.querySelector('#pNivel')
const pressao = document.querySelector('#pPressao')
const btn = document.querySelector('#btnText')

const url = 'https://fde9dfb9-1808-4408-91fe-38497fa86398-00-7vjs03en0nxb.worf.replit.dev/'

btn.addEventListener('click', () => {
    fetch(url)
        .then(response => response.json())
        .then(dadosResponse => {
            console.log(dadosResponse)

            responseTemp = dadosResponse.temperatura
            responseNivel = dadosResponse.nivel
            responsePressao = dadosResponse.temperatura

            temp.textContent += responseTemp
            nivel.textContent += responseNivel
            pressao.textContent += responsePressao
        })    
})

