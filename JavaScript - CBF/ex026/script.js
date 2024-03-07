const long = document.querySelector('#long')
const lati = document.querySelector('#lati')

if (navigator.geolocation) {

    navigator.geolocation.getCurrentPosition(pegarLocalizacao, erroLocalizacao)

} else {

    console.log('Não foi possível pegar a Geolocation')

}

function pegarLocalizacao(pos){
    console.log(pos)
    lati.innerHTML = `Latitude: ${pos.coords.latitude}`
    long.innerHTML = `Longitude: ${pos.coords.longitude}`
}

function erroLocalizacao(){
    console.log('Erro ao consultar a localização, talvez esteja bloqueado.')
}