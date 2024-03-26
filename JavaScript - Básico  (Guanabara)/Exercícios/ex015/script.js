function verificarIdade() {
    let resultado = document.querySelector('#result')
    let anoAtual = new Date().getFullYear()
    let anoNascim = Number(document.querySelector('#birth').value)
    let suaIdade = anoAtual - anoNascim 

    if (anoNascim.toString().length == 0 || anoNascim > anoAtual) {
        alert('[ERROR] Verifique os dados e tente novamente!')
    } else {
        let gen = ''
        let sex = document.getElementsByName('radsex')
        let img = document.createElement('img')
        img.setAttribute('id', 'foto')

        if (sex[0].checked) {
            gen = 'homem'
            if (suaIdade < 10) {
                img.setAttribute('src', 'crianca-h.png')
            } else if (suaIdade < 18) {
                img.setAttribute('src', 'adolescente-h.png')
            } else if (suaIdade < 65) {
                img.setAttribute('src', 'adulto-h.png')
            } else {
                img.setAttribute('src', 'idoso-h.png')
            }

        } else {
            gen = 'mulher'
            if (suaIdade < 0) {
                img.setAttribute('src', 'crianca-m.png')
            } else if (suaIdade < 18) {
                img.setAttribute('src', 'adolescente-m.png')
            } else if (suaIdade < 65) {
                img.setAttribute('src', 'adulta-m.png')
            } else {
                img.setAttribute('src', 'idosa-m.png')
            }            
        }
        resultado.style.textAlign = 'center'
        resultado.innerHTML = `Você é um(a) ${gen} e possui ${suaIdade} anos!`
        
        let container = document.querySelector('#container')
        container.style.height = '400px'
        resultado.appendChild(img)
    }    
}



