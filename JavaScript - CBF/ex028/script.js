const fTexto = document.querySelector('#f_texto')
const fNumber = document.querySelector('#f_number')
const pTexto = document.querySelector('#p_texto')
const btnTexto = document.querySelector('#btn_texto')

// btnTexto.addEventListener('click', () => {
//     window.localStorage.setItem(fTexto, fNumber)
// })

localStorage.clear()

// localStorage.setItem('Arthur', 25)
// localStorage.setItem('Amanda', 23)

// alert(`Arthur: ${localStorage.getItem('Arthur')}`)
// alert(`Amanda: ${localStorage.getItem('Amanda')}`)

sessionStorage.setItem('Sofhia', 19)
sessionStorage.setItem('Matheus', 19)

sessionStorage.clear()

