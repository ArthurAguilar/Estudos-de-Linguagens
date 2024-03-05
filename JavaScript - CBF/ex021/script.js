let nome = new String('Arthur Guido')
let nome2 = new String('Amanda')
let nomeComparacao = new String('Arthur')

console.log(nome)

console.log(typeof(nome))

console.log(nome.charAt(0))

console.log(nome.charCodeAt(0))

let nome3 = nome.concat(` e ${nome2}`)

console.log(nome3)

console.log(nome.indexOf('r'))

console.log(nome.lastIndexOf('r'))

console.log(nome.localeCompare(nomeComparacao))

console.log(nome.replace("Guido", "Aguilar"))

console.log(nome.search("Guido"))

let sobrenome = nome.slice(7, 12)
console.log(sobrenome)

let arrayNome = nome.split(" ")
console.log(arrayNome)