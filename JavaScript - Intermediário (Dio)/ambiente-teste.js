notas = []
let soma = 0

notas.push(7)
notas.push(6)
notas.push(9)


for (i = 0; i < notas.length; i++) {
    soma += notas[i]
}

let media = soma / notas.length
console.log(media.toFixed(1))