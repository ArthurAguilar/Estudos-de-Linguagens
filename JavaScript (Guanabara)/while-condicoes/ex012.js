let hora = new Date().getHours()
let minutos = new Date().getMinutes()

if (hora < 12) {
    console.log(`Bom dia! \nAgora são exatamente ${hora}:${minutos} horas.`)
} else if (hora < 18) {
    console.log(`Boa tarde! \nAgora são exatamente ${hora}:${minutos} horas.`)
} else {
    console.log(`Boa noite! \nAgora são exatamente ${hora}:${minutos} horas.`)
}