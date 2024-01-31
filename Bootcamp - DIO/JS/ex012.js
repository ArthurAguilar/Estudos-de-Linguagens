
// 3) Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.
// Para realizar o calculo receba o valor bruto do salário e o adicional dos benefícios.
// O salário a ser transferido é calculado da seguinte maneira: 
   
//    valor bruto do salário - percentual de imposto mediante a faixa salarial + adicional dos benefícios

// Para calcular o percentual de imposto segue as aliquotas:

//     De R$ 0.00 a R$ 1100.00 = 5.00%
//     De R$ 1100.01 a R$ 2500.00 = 10.00%
//     Maior que R$ 2500.00 = 15.00%

//     Exemplo:
//         Entrada:
//             2000
//             250

//         Saída:
//             2050.00

function calculoSalario(salario, beneficio) {
    if (salario < 1100) {
        desconto = 5/100 //5% de desconto
    } else if (salario < 2500) {
        desconto = 10/100 //10% de desconto
    } else {
        desconto = 15/100 //15% de desconto
    }
    valorFinal = salario - (salario-desconto) + beneficio
    return valorFinal.toFixed(0)
}

console.log(calculoSalario(2000, 250))