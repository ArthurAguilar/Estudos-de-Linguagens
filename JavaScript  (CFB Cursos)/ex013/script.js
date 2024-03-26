class CarroBase {
    constructor() {
        if (this.constructor === CarroBase) {
            throw new TypeError('Esta classe não pode ser instânciada!')
        }
        if (this.ligar === undefined) {
            throw new TypeError('É necessário a implementação do método "Ligar"')
        }
        if (this.desligar === undefined) {
            throw new TypeError('É necessário a implementação do método "Desligar"')
        }
        this.portas = 4
        this.rodas = 4
        this.ligado = false
    }
}

class Carro extends CarroBase {
    constructor(tipo, potenciaTurbo) {
        super()
        this.potencia = new Turbo(potenciaTurbo)
        if (tipo == 1) {
            this.nome = 'Carro de Passeio'
            this.velMax = 150
        } else if (tipo == 2) {
            this.nome = 'Carro Esportivo'
            this.velMax = 250
        }else if (tipo == 3) {
            this.nome = 'Carro Super Esportivo'
            this.velMax = 400
        }
        this.velMax += this.potencia.potencia;
        
    }

    ligar(){
        this.ligado = true
    }
    desligar(){
        this.ligado = false
    }
    
    info() {
        console.log(this.nome)
        console.log(this.potencia)
        console.log(this.velMax)
        console.log(this.ligado)
        console.log('---------------')
    }
}

class Turbo {
    constructor(potencia) {
        if (potencia == 0) {
            this.potencia = 0
        } else if (potencia == 1) {
            this.potencia = 25
        } else if (potencia == 2) {
            this.potencia = 50
        } else if (potencia == 3) {
            this.potencia = 75
        } else if (potencia == 4) {
            this.potencia = 100
        }
    } 
}

class CarroEspecial extends Carro {
    constructor(potenciaTurbo) {
        super(4, potenciaTurbo)
        this.nome = 'Carro Especial'
        this.velMax = 400 + this.potencia.potencia
    }

    info(e = 0){
        if (e == 1) {
            super.info()
        } else {
            console.log(`Nome: ${this.nome}`)
            console.log(`Potência: ${this.potencia}`)
            console.log(`Vel.Max: ${this.velMax}`)
            console.log(`Ignição: ${this.ligado?'Ligada':'Desligada'}`)
            console.log('---------------------')
        }
    }
}


const c1 = new Carro(1, 3)
const c2 = new Carro(3, 2)
const c3 = new CarroEspecial(4)
// const c4 = new CarroBase

c1.info()
c1.ligar()
c1.info()

c3.info()
c3.ligar()
c3.info()


