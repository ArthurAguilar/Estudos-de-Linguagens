function calcular() {
    let inicio = Number(document.querySelector('#inicio').value);
    let fim = Number(document.querySelector('#fim').value);
    let passo = Number(document.querySelector('#passo').value);
    let resultado = document.querySelector('#resultado');
    
    resultado.innerHTML = 'Contando: <br>' ;
    if (inicio > fim) {
        for (let i = inicio; i >= fim; i -= passo) {
            resultado.innerHTML += `${i} ▶ `;
        }
    } else {
        for (let i = inicio; i <= fim; i += passo) {
            resultado.innerHTML += `${i} ▶ `;
        }
    }
    resultado.innerHTML += 'Fim!'
}
