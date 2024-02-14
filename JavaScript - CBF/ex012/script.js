nomeInput = document.querySelector('#f_nome')
portasInput = document.querySelector('#f_portas')
blindagemInput = document.querySelector('#f_blindagem')
municaoInput = document.querySelector('#f_municao')
addBtn = document.querySelector('#btn_addCarro')
radioMilitar = document.querySelector('#f_tipoMilitar')
radioNormal = document.querySelector('#f_tipoNormal')
divCarros = document.querySelector('.carros')


class Carro {
    constructor(nome, porta) {
        this.nome = nome
        this.porta = porta
        this.cor = 'azul'
    }
}

class Militar extends Carro {
    constructor (nome, porta, blindagem, municao) {
        super(nome, porta)
        this.cor = 'verde militar'
        this.blindagem = blindagem
        this.municao = municao
    }
}

radioMilitar.addEventListener('click', () => {
    blindagemInput.value = ''
    municaoInput.value = ''
    if (radioMilitar.checked) {
        blindagemInput.removeAttribute('disabled')
        municaoInput.removeAttribute('disabled')
    }
})

radioNormal.addEventListener('click', () => {
    blindagemInput.value = 0
    municaoInput.value = 0
    if (radioNormal.checked) {
        blindagemInput.setAttribute('disabled', 'disabled');
        municaoInput.setAttribute('disabled', 'disabled');
    }
})

function addCar() {
    let div = document.createElement('div')
    div.classList.add('carro')
    let novoCarro;

    if (radioMilitar.checked) {
        novoCarro = new Militar(
            nomeInput.value, 
            portasInput.value,
            blindagemInput.value,
            municaoInput.value)

        div.innerHTML = `Nome: ${novoCarro.nome} <br>`;
        div.innerHTML += `Portas: ${novoCarro.porta} <br>`;
        div.innerHTML += `Blindagem: ${novoCarro.blindagem}% <br>`;
        div.innerHTML += `Munição: ${novoCarro.municao}`;

        divCarros.appendChild(div)
    } else {
        novoCarro = new Carro(
            nomeInput.value,
            portasInput.value)

        div.innerHTML = `Nome: ${novoCarro.nome} <br>`;
        div.innerHTML += `Portas: ${novoCarro.porta} <br>`;

        divCarros.appendChild(div) 
   }
}

addBtn.addEventListener('click', () => {
    addCar()
})


