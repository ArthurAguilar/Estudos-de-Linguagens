offset = 0
limit = 20
const url = `https://pokeapi.co/api/v2/pokemon/?offset=${offset}&limit=${limit}`;
const pokemonList = document.querySelector('#list-pokedex')

function conversorHTML(pokemon) {
    return `               
        <li class="pokemon-box">
            <span class="pokemon-id">#001</span>
            <span class="pokemon-name">${pokemon.name}</span>
                <div class="details">
                    <div class="type">
                        <span class="type">Grass</span>
                        <span class="type">Poison</span>
                    </div>

                    <img class="pokemon-img" src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg" alt="${pokemon.name}">
                </div>
        </li>
`
}

fetch(url)
    .then((convertendoJson) => convertendoJson.json()) //pega a API e transforma em JSON
    .then((jsonBody) => jsonBody.results) // Agora dentro da API já em formato JSON, acessa a aba 'results'
    .then((listaPokemon) => { //Agora com os itens(resultados) da aba 'results', que é a lista de pokemon, passe por cada pokemon usando map.
        pokemonList.innerHTML += listaPokemon.map(conversorHTML).join('')
    })
    .catch((err) => console.log(err))
    .finally(() => console.log('Requisição concluída!'))



