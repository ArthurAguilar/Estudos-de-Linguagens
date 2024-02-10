// var isPalindrome = (x) => {
//   let str = x.toString();
//   let strInverso = str.split("").reverse().join("");

//   if (x == strInverso) {
//     return true;
//   } else {
//     return false;
//   }
// };

// console.log(isPalindrome(212));


// x = 3
// console.log(x > 5 ? `${x} é maior que 5` : `${x} é menor que 5`)

// const idades = [10, 15, 11, 13, 27, 25, 22, 45, 60]

// const menorIdade = idades.filter((idade) => {
//     if (idade < 18) {
//         return idades
//     }
// })

// const maiorIdade = idades.filter((idade) => {
//     if (idade >= 18) {
//         return idades
//     }
// })

// console.log(idades)
// console.log(maiorIdade)
// console.log(menorIdade)


// array = [8, 8, 1]
// arrayFrase = ['Eu', 'me', 'chamo', 'Arthur']
// soma = array.reduce((anterior, atual) => anterior + atual)
// media = array.reduce((ant, atual) => ant + atual) / array.length
// frase = arrayFrase.reduce((ant, atual) => ant + ' ' + atual)
// console.log(soma.toFixed(0))
// console.log(media.toFixed(0))
// console.log(frase)


// let aluno = [{
//     nome: 'Arthur',
//     idade: 25,
//     sexo: 'M'
// },{
//     nome: 'Amanda',
//     idade: 23,
//     sexo: 'F'
// }]
// console.log(aluno[1].nome)


// let valores = []
// for (i = 0; i < 5; i++) {
//     let random = Math.floor(Math.random() * 10)
//     valores.push(random)
// }
// const op = [
//     (valor) => {
//         let res = 0
//         for (v of valor) {
//             res += v
//         }
//         return res
// }, 
//     (valor) => {
//         let res = 1
//         for (v of valor) {
//             res *= v
//         }
//         return res
// }]
// console.log(valores)
// console.log(op[0](valores))
// console.log(op[1](valores))

// aluno1 = {
//     'Nome': 'Arthur',
//     'Idade': 25,
//     'Sexo': 'M'
// }
// console.log(aluno1)

// const mapa = new Map()

// mapa.set('Nome', 'Arthur')
// mapa.set('Idade', 25)
// mapa.set('Sexo', 'M')

// console.log(mapa)

// if (mapa.has('Sexo')) {
//     console.log('Existe na posição: ' + mapa.get('Sexo'))
// } else {
//     console.log('Não existe')
// }


// array = [1, 2, 3, 4, 5]
// const newArray = array.map((el) =>  el * 2)
// console.log(newArray)