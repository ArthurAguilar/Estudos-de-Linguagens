let valores = []
let num = document.querySelector('#inputNumber')
let result = document.querySelector('#result')

function adicionarValor() {
    let num = document.querySelector('#inputNumber')

    if (Number(num.value) == 0) {
        alert('Adicione um valor')
    } else if (Number(num.value) < 0 || Number(num.value) > 100) {
        alert('Adicione um valor de 0 a 100!')
    } else {
        valores.push(Number(num.value))
        let list = document.querySelector('#selectAnalisar') 
        let valor = document.createElement('option')
        valor.text = `Valor ${Number(num.value)} adicionado.`
        list.append(valor)

        num.value =''
        num.focus()


    }
}

function analisarValor() {
    if (valores.length == 0) {
        alert('Primeiro adicione um valor')
    } else {   
        result.innerHTML = `Você adicionou os valores ${valores}.`
        result.innerHTML = `Ao todo são {} números digitados`
        result.innerHTML = `A soma de todos os números é {}`
        result.innerHTML = `A média de todos os números é {}`
        result.innerHTML = `O maior número é o {}`
        result.innerHTML = `O menor número é o {}`
    }
} 