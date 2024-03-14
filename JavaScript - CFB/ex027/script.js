const fNome = document.querySelector('#f_nome')
const fNota = document.querySelector('#f_nota')
const fMsg = document.querySelector('#f_msg')
const btnValidar = document.querySelector('#btn_validar')

// btnValidar.addEventListener('click', (evt) => {
//     evt.preventDefault()
//     let msg;

//     let estadoValidacao = fNota.validity

//     if(estadoValidacao.valueMissing) {
//         msg = 'Por favor, digite algo, animal'
//     } 
//     else if(estadoValidacao.rangeOverflow) {
//         msg = 'Nome ficou grande demais, tu não entendeu as regras?!'
//     } 
//     else if(estadoValidacao.rangeUnderflow) {
//         msg = 'Agora tá pequeno, idiota! Prestenção!!!'
//     }

//     fMsg.innerHTML = msg
// })

btnValidar.addEventListener('click', (evt) => {
    evt.preventDefault()

    let estadoValidacao = fNota.validity

    if (estadoValidacao.valueMissing) {
        fNota.setCustomValidity('Tá faltando, zé!')
    } else if (estadoValidacao.rangeOverflow) {
        fNota.setCustomValidity('Botou caracteres demais, fiote!')
    } else if (estadoValidacao.rangeUnderflow) {
        fNota.setCustomValidity('Rapaz, tu não tem jeito, né?! Tá pequeno, orra')
    } else if (estadoValidacao.valid) {
        fNota.setCustomValidity('Finalmente acertou!')
    }

    fNota.reportValidity()
})
