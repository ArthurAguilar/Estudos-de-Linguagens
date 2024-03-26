// Idade para votação

let idade =  

console.log(`Você tem ${idade} anos.`)
if (idade < 16) {
    console.log('Você ainda não possui idade para votar!')
} else if (idade < 18 || idade > 70) {
    console.log('O voto para você é facultativo!')
} else {
    console.log('Seu voto é obrigatório!')
}