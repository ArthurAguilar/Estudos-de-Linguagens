resultado = document.querySelector('.texto')

let promise = new Promise((ok, notOk) => {
    let status = false

    setTimeout(()=>{
        if (status) {
            ok('Deu tudo certo, papai!')
        } else {
            notOk('Deu tudo errado! :C')
        }
    }, 200)
})

promise.then((responseOk)=>{
    resultado.innerHTML += responseOk
    resultado.classList.add('ok')
    resultado.classList.remove('erro')
}).catch((responseNotOk)=>{
    resultado.innerHTML += responseNotOk
    resultado.classList.add('erro')
    resultado.classList.remove('ok')
})


resultado.innerHTML = 'Processando..  <br> <br>'