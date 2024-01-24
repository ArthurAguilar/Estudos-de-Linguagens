function horaAtual() {
    let hora = new Date().getHours()
    let min = new Date().getMinutes()
    let txt = document.querySelector('#horaAgora') 
    let img = document.querySelector('#imagemAgora')
    
    hora = 19
    txt.innerHTML = `Agora são exatamente ${hora}:${min} horas!`
    if (hora < 12) {
        document.body.style.background = '#fcc575'
        img.src = 'foto-manha.png'
    } else if (hora < 18) {
        document.body.style.background = '#d67b78'
        img.src = 'foto-tarde.png'
    } else {
        document.body.style.background = '#212a27'
        document.querySelector('#titulo').style.color ='white'
        document.querySelector('footer').style.color = 'white'

       
        img.src = 'foto-noite.png'
    }
}