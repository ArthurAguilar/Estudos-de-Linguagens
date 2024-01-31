const pokemonList = document.querySelector('#list-pokedex')

pokeApi.getPokemons().then((pokemon) => {
    pokemonList.innerHTML += pokemon.map(conversorHTML).join('')
})

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


