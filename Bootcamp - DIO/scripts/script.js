const pokemonList = document.querySelector('#list-pokedex')

function conversorHTML(pokemon) {
    return `               
        <li class="pokemon-box ${pokemon.types[0].type.name}">
            <span class="pokemon-id">#${pokemon.order}</span>
            <span class="pokemon-name">${pokemon.name}</span>
                
                <div class="details">
                    <ol class="types">
                        ${pokemon.types.map((typeSlot) => `<li class="type ${typeSlot.type.name}">${typeSlot.type.name}</li>`).join('')}
                    </ol>

                    <img class="pokemon-img" src="${pokemon.sprites.other.dream_world.front_default}" alt="${pokemon.name}">
                </div>

        </li>
`
}

pokeApi.getPokemons().then((listaPokemonFetch = []) => { //Agora com os itens(resultados) da aba 'results', que é a lista de pokemon, passe por cada pokemon usando map

    // for (let i = 0; i < listaPokemonFetch.length; i++) { //Loop para passar por cada pokemon da lista e adicionar a tela
    //     pokemonList.innerHTML += conversorHTML(listaPokemonFetch[i])
    // } 
    
    pokemonList.innerHTML += listaPokemonFetch.map(conversorHTML).join('') // Mesma função do for, porém menos código
})

