/* 
    1. Crie uma classe para representar pessoas.
    Para cada pessoa teremos os atributos
        Nome, 
        peso e
        altura
    As pessoas devem ter a capacidade de dizer o valor do seu IMC (peso / altura²);
    Instancie uma pessoa chamada José que tenha 70kg e 1,75 de altura e peça ao José para dizer o valor do seu IMC;
*/

class Pessoa {
    nome;
    peso;
    altura;

    constructor(nome, peso, altura) {
        this.nome = nome
        this.peso = peso
        this.altura = altura
    }

    calcularImc() {
        let imc = this.peso / Math.pow(this.altura, 2)
        if (imc < 18.5) {
            return `Seu IMC é de ${imc.toFixed(2)} e você está abaixo do peso ideal`
        } else if (imc < 25) {
            return `Seu IMC é de ${imc.toFixed(2)} e você está com o peso normal`
        } else if (imc < 30) {
            return `Seu IMC é de ${imc.toFixed(2)} e você está acima do peso ideal`
        } else if (imc < 40) {
            return `Seu IMC é de ${imc.toFixed(2)} e você está em condição de obesidade`
        } else {
            return `Seu IMC é de ${imc.toFixed(2)} e você está com obesidade grave!`
        }
    }
}

let x = new Pessoa('José', 75, 1.80)

console.log(x.calcularImc())
