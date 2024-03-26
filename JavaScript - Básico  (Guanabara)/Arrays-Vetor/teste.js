let num = [3, 1, 6, 2, 9, 4]

/* console.log(`O vetor é ${num}`)
console.log(`Em ordem é ${num.sort()}`)
console.log(`Possui ${num.length} elementos`)
console.log(`Adicionando elemento 15:`)
num.push(15)
console.log(`Fica assim ${num}`)
console.log(`O primeiro número é o ${num[0]}`)
console.log(`O quinto número é o ${num[4]}`) */

for (let i = 0; i < num.length; i++) {
    console.log(`Número ${num[i]}`)
}

console.log('-----------------------------------------------------------------------------')

for (i in num) {
    console.log(`Posição ${i} = ${num[i]}`)
}