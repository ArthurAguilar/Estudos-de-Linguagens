resultado = document.querySelector('.texto')
btnPromise = document.querySelector('#btnPromise')


function promise(){
    resultado.innerHTML = 'Processando..  <br> '
    let promise = new Promise((ok, notOk) => {
        let status = false
    
        setTimeout(()=>{
            if (status) {
                ok('Deu tudo certo, papai!')
            } else {
                notOk('Deu tudo errado! :C')
            }
        }, 1000)
    })
    return promise
}

resultado.innerHTML = 'Aguardando click!'

btnPromise.addEventListener('click', () => {
    console.log(promise())
    promise()
        .then((responseOk)=>{
            resultado.innerHTML += responseOk
            resultado.classList.add('ok')
            resultado.classList.remove('erro')
        }).catch((responseNotOk)=>{
            resultado.innerHTML += responseNotOk
            resultado.classList.add('erro')
            resultado.classList.remove('ok')
        }).finally(()=>{
            console.log('O que é isso?')
            resultado.innerHTML += '<br><br>Promessa finalizada!'
        })
})