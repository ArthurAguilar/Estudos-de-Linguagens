let valores = []
let num = document.querySelector('#inputNumber')
let valorAtual = Number(num.value)
let result = document.querySelector('#result')
let select = document.querySelector('#selectAnalisar')
let total = 0


function adicionarValor() {
    let valorAtual = Number(num.value)

    if (valores.length == 0) {
        select.innerHTML = ''
    }  

    if (valorAtual < 0 || valorAtual > 100) {
        alert('Tente novamente com um número entre 0 e 100.')
    } else if (valorAtual === 0) {
        alert('Adicione um valor!')
    } else {
        if (valores.indexOf(valorAtual) === -1) {
            valores.push(valorAtual)
            total += valorAtual

            let opt = document.createElement('option')
            opt.text = `Valor ${valorAtual} adicionado`
            select.append(opt)
        } else {
            alert('Número já adicionado!')
        }
    }
    num.value = '' 
    num.focus()
}


function analisarValor() {
    let media = total / valores.length 
    let maior = valores[0]
    let menor = valores[0]

    for (c in valores) {
        if (valores[c] > maior) {
            maior = valores[c]
        }
        if (valores[c] < menor) {
            menor = valores[c]
        }
    }

    if (valores.length == 0) {
        alert('Primeiro adicione um valor')
    } else {   
        result.innerHTML = `Você adicionou os valores ${valores}. <br>`
        result.innerHTML += `Ao todo foram ${valores.length} números digitados. <br>`
        result.innerHTML += `A soma de todos os números é ${total}. <br>`
        result.innerHTML += `A média de todos os números é ${media.toFixed(2)}. <br>`
        result.innerHTML += `O menor número é o ${menor}. <br>`
        result.innerHTML += `O maior número é o ${maior}. <br>`
    }
} 
