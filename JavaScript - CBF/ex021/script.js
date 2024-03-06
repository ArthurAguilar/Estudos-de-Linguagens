// let nome = new String('Arthur Guido')
// let nome2 = new String('Amanda')
// let nomeComparacao = new String('Arthur')
// let nome4 = new String("Salve")

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
// let sobrenome = nome.slice(7, 12)
// console.log(sobrenome)
// let arrayNome = nome.split(" ")
// console.log(arrayNome)
// let substring = nome.substring(0, 6)
// console.log(substring)
// let substr = nome.substr(7, 5)
// console.log(substr)
// console.log(nome4.valueOf())

// let nome = new String("Arthur Guido")

// console.log(nome.toLowerCase().startsWith('arthur'))
// console.log(nome.toLowerCase().endsWith('guido'))
// console.log(nome.includes('thu'))

// console.log(nome.repeat(5))

// console.log(nome.charCodeAt(0))
// console.log(nome.charCodeAt(1))
// console.log(nome.charCodeAt(2))
// console.log(nome.charCodeAt(3))
// console.log(nome.charCodeAt(4))
// console.log(nome.charCodeAt(5))

// console.log(String.fromCodePoint(65, 114, 116, 104, 117, 114))


let nome = new String("Arthur Guido Aguilar")

console.log(nome)
console.log(nome.search("guido"))
console.log(nome.search(/guido/i))

console.log(nome.match("D"))
console.log(nome.match(/a/ig))

console.log(nome.replace(/g/ig, "T"))
