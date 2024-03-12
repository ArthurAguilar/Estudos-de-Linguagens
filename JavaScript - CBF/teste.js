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

// class Pessoa {
//     constructor (nome, idade) {
//         this.nome = nome
//         this.idade = idade
//     }

//     setNome(nome) {
//         this.nome = nome
//     }

//     setIdade(idade) {
//         this.idade = idade
//     }
// }

// const x = new Pessoa('Arthur', 25)

// console.log(x)
// x.setNome('Amanda')
// x.setIdade(23)
// console.log(x)

// class Npc {
//     static alerta = false
//     constructor(energia) {
//         this.energia = energia
//     }

//     info=()=>{
//         console.log(`Energia: ${this.energia}`)
//         console.log(`Alerta: ${(Npc.alerta?'Sim':'Não')}`)
//         console.log('-----------------------')
//     }
// }

// const npc1 = new Npc (100)
// const npc2 = new Npc (80)
// const npc3 = new Npc (30)

// npc1.alerta = true

// npc1.info()
// npc2.info()
// npc3.info()

// const array = ['Arthur', 'Amanda', 'Renner']
// const lastChar = array.length -1

// console.log(array[lastChar])

// const s1 = Symbol()
// const s2 = Symbol()
// console.log(s1)
// console.log(s2)
// console.log(s1 === s2)

// const s3 = Symbol.for('Arthur')
// const s4 = Symbol.for('Amanda')
// console.log(s3)
// console.log(s4)
// console.log(s3 === s4)
// console.log(Symbol.keyFor(s3))
// console.log(Symbol.keyFor(s4))

// const s5 = Symbol.for('Churastei')
// const s6 = Symbol.for('Churastei')
// console.log(s5)
// console.log(s6)
// console.log(s5 == s6)
// console.log(Symbol.keyFor(s5))
// console.log(Symbol.keyFor(s6))

// class Jogador {
//     constructor(nome) {
//         this.nome = nome
//         this.id = Symbol()
//     }
// }

// const jogadores = [new Jogador('j1'), new Jogador('j1'), new Jogador('j2'), new Jogador('j3'), new Jogador('j4'), new Jogador('j5'), new Jogador('j6'), new Jogador('j7'), new Jogador('j8'), new Jogador('j9'), new Jogador('j10')]

// const exclusaoJogador = jogadores[0].id

// const filtragemNome = jogadores.filter((cadaJogador) => {
//     return cadaJogador.nome != 'j1'
// })

// const filtragemID = jogadores.filter((cadaJogador) => {
//     return cadaJogador.id != exclusaoJogador
// })

// console.log(filtragemNome)

// const jogadores = [new Jogador('j1'), new Jogador('j1'), new Jogador('j2'), new Jogador('j3'), new Jogador('j4'), new Jogador('j5'), new Jogador('j6'), new Jogador('j7'), new Jogador('j8'), new Jogador('j9'), new Jogador('j10')]

// const simbolos = []

// const simbolosJogadores = jogadores.filter((cadaJogador) => {
//     return cadaJogador.nome != 'j1'
// })

// const idJogadores = simbolosJogadores.map((cadaJogador) =>  {
//     simbolos.push(cadaJogador.id)
// })

// console.log(simbolosJogadores)

// let nome = new String('Arthur Guido')
// let nome2 = new String('Amanda')
// // let nomeComparacao = new String('Arthur')

// console.log(nome)
// console.log(typeof(nome))
// console.log(nome.charAt(0))
// console.log(nome.charCodeAt(0))
// let nome3 = nome.concat(` e ${nome2}`)
// console.log(nome3)
// console.log(nome.indexOf('r'))
// console.log(nome.lastIndexOf('r'))
// console.log(nome.localeCompare(nomeComparacao))
// console.log(nome.replace("Guido", "Aguilar"))
// console.log(nome.search("Guido"))

// let a = 10
// let b = 20

// [a, b] = [b, a]

// console.log(a)
// console.log(b)

// let numeros = () => {
//     return [10, 20, 30, 40]
// }

// let [a, b, c, d] = numeros()

// console.log(a)
// console.log(b)
// console.log(c)
// console.log(d)


// let aluno = {nome: 'Amanda', idade: 23}

// let {nome, idade} = aluno

// console.log(nome)
// console.log(idade)

// let aluno = ['Amanda', 23]

// let [nome, idade] = aluno

// console.log(nome)
// console.log(idade)

// const cores = () => {
//     return ['Branco', 'Azul', 'Vermelho', 'Roxo', 'Amarelo']
// }

// let [c1,, c2,, c3] = cores()

// console.log(c1)
// console.log(c2)
// console.log(c3)

// texto = "Curso de JavaScript"
// let [...t1] = texto.split(' ')
// console.log(t1)

// let i; i = 10

// let num = [1, 2, 3]
// [n1, n2, n3] = num

// let num = [11, 22, 33];
// [n1, n2, n3] = num

// let num = [11, 22, 33]
// let [n1, n2, n3] = num

// let num = {
//     n1: 1, 
//     n2: 2,
//     n3: 3
// }
// let {n1, n2, n3} = num

// console.log(n1)

// let x = 3

// while (x) {
//     console.log(--x)
// }

// console.log('Hoje é só pela bolinha. Domingueira, po! Tive que ir a loja pela manhã (quase virado) e a tarde tirei um cochilo. Agora tô indo lá pra amada!')




