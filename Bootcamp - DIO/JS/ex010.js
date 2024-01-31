// Crie um programa que seja capaz de percorrer uma lista de número e imprima cada número par encontrado

lista = [0, 3, 5, 3, 6, 10, 17, 20, 123, 36, 37, 122, 7, 78, 63, 51]

for (i = 0; i <= lista.length; i++) {
    if (lista[i] % 2 == 0) {
        console.log(lista[i])
    }
}