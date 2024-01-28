function calcularTabuada() {
    let num = document.querySelector('#num')
    let tab = document.querySelector('#seltab')

    if (num.value.length == 0 ) {
        alert('[ERROR] Digite um número!')
    } else {
        let n = Number(num.value)
        tab.innerHTML = ''
        for (let c = 0; c <= 10; c++) {
            let item = document.createElement('option')
            item.text = `${n} x ${c} = ${n*c}` 
            tab.appendChild(item)
        }

    }

    // for (let c = 0; c >=10; i++) {
    //     tab.innerHTML = `${n} x ${c} = ${n*c}`
    // }
}