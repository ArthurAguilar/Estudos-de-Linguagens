inputNome = document.querySelector('#f_nome')
inputIdade = document.querySelector('#f_idade')
btnAdd = document.querySelector('#btn_add')
result = document.querySelector('.res')

class Pessoa {
    constructor(nome, idade) {
        this.nome = nome
        this.idade = idade
    }

    setNome(nome) {
        this.nome = nome
    }

    setIdade(idade) {
        this.idade = idade
    }
}

let turma = []
function addPerson() {
    let novaPessoa = new Pessoa(inputNome.value, inputIdade.value)
    inputNome.value = ''
    inputIdade.value = ''
    inputNome.focus()

    turma.push(novaPessoa)
    console.log(turma)

    result.innerHTML += `Nome: ${novaPessoa.nome} <br> Idade: ${novaPessoa.idade} <br><br>`;
}

btnAdd.addEventListener('click', addPerson)

inputIdade.addEventListener('keypress', (event) => {
    if (inputNome.value !== '' && event.key === 'Enter') {
        addPerson()
    }}
)





