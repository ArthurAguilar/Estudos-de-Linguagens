class Turma {
    static alunos = ['Arthur', 'Amanda']

    static addAluno = (nomeAluno) => {
        this.alunos.push(nomeAluno)
    }

    static removeAluno = (nomeAluno) => {
        var index = this.alunos.indexOf(nomeAluno)
        if (index !== -1) {
            this.alunos.splice(index, 1)
        }
    }
    
    static findAluno = (nomeAluno) => {
        var index = this.alunos.indexOf(nomeAluno)
        if (index !== -1) {
            console.log(`O aluno se encontra na posição ${index+2}`)
        } else {
            console.log('Não possui esse aluno nesta turma!')
        }
    }

    static clearAlunos = () => {
        this.alunos = ['Vazio']
    }
}

console.log(Turma.alunos)
Turma.addAluno('Raphael')
Turma.addAluno('Brayan')
Turma.addAluno('Renner')
Turma.addAluno('Gabi')
Turma.addAluno('Rayssa')
Turma.addAluno('Heitor')
Turma.addAluno('Leandro')
Turma.addAluno('Guigui')
console.log(Turma.alunos)
Turma.removeAluno('Arthur')
console.log(Turma.alunos)
Turma.findAluno('Amanda')
Turma.findAluno('Joséfino')
Turma.findAluno('Renner')
Turma.findAluno('Heitor')
// Turma.clearAlunos()
// console.log(Turma.alunos)
