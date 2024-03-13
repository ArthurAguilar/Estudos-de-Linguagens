const texto = document.querySelector('#p_texto')
const btn = document.querySelector('#btn_texto')

const url = 'https://fde9dfb9-1808-4408-91fe-38497fa86398-00-7vjs03en0nxb.worf.replit.dev/'

btn.addEventListener('click', () => {
    fetch(url)
    .then(response => response.text())
    .then(dadosResponse => {
        let dados = dadosResponse

        texto.textContent = `Os dados são: ${dados}`
    })
})



