const showMsg= document.querySelector('#btn_mostrarcxmsg')

class CxMsg {
    titulo
    texto
    cor
    destino
    divmsg
    constructor(config) {
        this.titulo = config.titulo
        this.texto = config.texto
        this.cor = config.cor
        this.destino = document.body
        this.divmsg = null
    }

    mostrar = () => {
        this.divmsg = document.createElement('div')
        const estiloDiv = 
            "display: flex;" +
            "justify-content: center;" +
            "align-items: center;" +
            "position: absolute;" +
            "top: 0px;" +
            "left: 0px;" +
            "width: 100%;" +
            "height: 100vh;" +
            "background-color: rgba(0, 0, 0, 0.7)"

        this.divmsg.id = 'divMsg'
        this.divmsg.classList.add('divMsg')
        this.divmsg.setAttribute('style', estiloDiv)
        this.destino.prepend(this.divmsg)

        const areaDiv = document.createElement('div')
        const estiloAreaDiv = 
            "display: flex;" +
            "flex-direction: column;" +
            "justify-content: center;" +
            "align-items: center;" +
            "width: 300px;" +
            "background-color: white;"
        areaDiv.setAttribute('style', estiloAreaDiv)

        const tituloDiv = document.createElement('div')
        const estiloTituloDiv = 
            "width: 100%;" +
            "text-align: center;" +
            "background-color:" + this.cor + ";" +
            "color: white;"
        tituloDiv.setAttribute('style', estiloTituloDiv)
        tituloDiv.classList.add('tituloDiv')
        tituloDiv.textContent = this.titulo
        areaDiv.append(tituloDiv)


        const textoDiv = document.createElement('div')
        const estiloTextoDiv = 
            "width: 100%;" +
            "min-height: 100px;" +
            "text-align: center;" +
            "background-color: white;"
        textoDiv.setAttribute('style', estiloTextoDiv)
        textoDiv.classList.add('textoDiv')
        textoDiv.textContent = this.texto
        areaDiv.append(textoDiv)

        const divBtn = document.createElement('div')
        const estiloDivBtn = 
            "width: 100%;" +
            "display: flex;" +
            "justify-content: center;" +
            "align-items: center;"
        divBtn.setAttribute('style', estiloDivBtn)
        divBtn.classList.add('divBtn')
        areaDiv.append(divBtn)

        const btnFechar = document.createElement('button')
        const estilobtnFechar = 
            "padding: 10px;" +
            "margin: 10px;" +
            "background-color:" + this.cor + ";" +
            "color: white;"
        btnFechar.setAttribute('style', estilobtnFechar)
        btnFechar.classList.add('btnFechar')
        btnFechar.textContent = "Fechar"
        divBtn.append(btnFechar)

        btnFechar.addEventListener('click', () => {
            this.ocultar()
        })

        this.divmsg.append(areaDiv)     
    }

    ocultar = () => {
        this.divmsg.remove()
    }
}


const config = {
    titulo: "Prova de Residência",
    texto: "Parabéns, Amanda! Você foi aprovada para a próxima etapa.",
    cor: "#48f"
}
const caixa1 = new CxMsg (config)

showMsg.addEventListener('click', () => {
    caixa1.mostrar(config)
})