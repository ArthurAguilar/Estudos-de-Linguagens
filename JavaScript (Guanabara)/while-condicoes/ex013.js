let diaSemana = new Date().getDay()

/* 0 - Domingo
1 - Segunda
2 - Terça
3 - Quarta
4 - Quinta
5 - Sexta
6 - Sábado */

switch(diaSemana) {
    case 0:
        console.log('Hoje é domingo!')
        break
    case 1:
        console.log('Hoje é segunda-feira!')
        break
    case 2:
        console.log('Hoje é terça-feira!')
        break
    case 3:
        console.log('Hoje é quarta-feira!')
        break
    case 4:
        console.log('Hoje é quinta-feira!')
        break
    case 5:
        console.log('Hoje é sexta-feira!')
        break
    case 6:
        console.log('Hoje é sábado!')
        break
    default:
        console.log('[Erro] Dia inválido!')
}

let hora = new Date().getHours()
let minutos = new Date().getMinutes()

if (hora < 12) {
    console.log(`Bom dia! \nAgora são exatamente ${hora}:${minutos} horas.`)
} else if (hora < 18) {
    console.log(`Boa tarde! \nAgora são exatamente ${hora}:${minutos} horas.`)
} else {
    console.log(`Boa noite! \nAgora são exatamente ${hora}:${minutos} horas.`)
}
