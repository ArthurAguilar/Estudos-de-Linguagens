// Faça um programa que receba N (quantidade de números) e seus respectivos valores.
//Imprima o maior número par e o menor número impar

const numero = [5, 3, 4, 1, 10, 8]
let menorNumeroImpar = numero[0];
let maiorNumeroPar = numero[0];

for (i=0; i <= numero.length;i++) {
    if (numero[i] % 2 == 0) {
        if (numero[i] > maiorNumeroPar) {
            maiorNumeroPar = numero[i]
        }
    } else {
        if (numero[i] < menorNumeroImpar) {
            menorNumeroImpar = numero[i]
        }
    }
}

console.log(maiorNumeroPar)
console.log(menorNumeroImpar)
