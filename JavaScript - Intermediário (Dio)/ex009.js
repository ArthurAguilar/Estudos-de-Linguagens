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

const turma = []

turma.push(new Pessoa('José', 75, 1.80))
turma.push(new Pessoa('Arthur', 80, 1.90))
turma.push(new Pessoa('Amanda', 67, 1.60))

let eu = turma.find(pessoa => pessoa.nome === 'Arthur').calcularImc()
console.log(turma.find(pessoa => pessoa.nome === 'Arthur').calcularImc());
console.log(turma.find(pessoa => pessoa.nome ==='Amanda').calcularImc())
