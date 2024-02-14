class Carro {
    constructor(nome, porta) {
        this.nome = nome
        this.porta = porta
        this.cor = undefined
        this.ignicao = undefined
        this.velocidade = 0 
    }

    setColor(cor) {
        this.cor = cor
    }

    setIgnicao(ignicao) {
        this.ignicao = ignicao
    }

    setVel(vel) {
        this.velocidade = vel
    }
}

class Militar extends Carro {
    constructor (nome, porta, blindagem, municao) {
        super(nome, porta)
        this.cor = 'verde militar'
        this.blindagem = blindagem
        this.municao = municao
    }

    setAtirar(qtdTiros) {
        if (this.municao > 0 ) {
            this.municao -= qtdTiros
        }
    }
}

const carro1 = new Carro('Corolla', 4)
carro1.setColor('Azul')
carro1.setIgnicao('Ligado')
carro1.setVel(150)
console.log(`Nome: ${carro1.nome}`)
console.log(`Portas: ${carro1.porta}`)
console.log(`Ignição: ${carro1.ignicao}`)
console.log(`Velocidade: ${carro1.velocidade}`)
console.log(`Cor: ${carro1.cor}`)
console.log('--------------------------------')


const carro2 = new Militar('Tanque', 1, 'Sim', 100)
carro2.setColor('Verde Muscoso')
carro2.setIgnicao('Ligado')
carro2.setVel(30)
console.log(`Nome: ${carro2.nome}`)
console.log(`Portas: ${carro2.porta}`)
console.log(`Ignição: ${carro2.ignicao}`)
console.log(`Velocidade: ${carro2.velocidade}`)
console.log(`Munição: ${carro2.municao}`)
console.log(`Blindagem: ${carro2.blindagem}`)
console.log(`Cor: ${carro2.cor}`)
console.log('--------------------------------')

carro2.setAtirar(87)
console.log(`Munição: ${carro2.municao}`)
