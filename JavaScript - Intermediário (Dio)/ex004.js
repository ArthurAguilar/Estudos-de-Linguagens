/* Faça um algoritmo que calcule IMC - Índice de Massa Corporal

Formula do IMC = peso / (altura * altura)

IMC em adultos:
    Abaixo de 18.5 = abaixo do peso
    entre 18.5 e 25 = peso normal
    entre 25 e 30 = acima do peso
    entre 30 e 40 = obeso
    acima de 40 = obesidade grave
*/

const nome = 'Arthur'
const peso = 80
const altura = 1.79
const imc = peso / (altura * altura)

console.log('Olá, ' + nome)
if (imc < 18.5) {
    console.log(`Seu IMC é de ${imc.toFixed(2)} e você está abaixo do peso ideal`)
} else if (imc < 25) {
    console.log(`Seu IMC é de ${imc.toFixed(2)} e você está com o peso normal`)
} else if (imc < 30) {
    console.log(`Seu IMC é de ${imc.toFixed(2)} e você está acima do peso ideal`)
} else if (imc < 40) {
    console.log(`Seu IMC é de ${imc.toFixed(2)} e você está em condição de obesidade`)
} else {
    console.log(`Seu IMC é de ${imc.toFixed(2)} e você está com obesidade grave!`)
}
