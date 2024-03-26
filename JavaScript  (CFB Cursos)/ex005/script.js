const pArray = document.querySelector("#array");
const txtPesquisar = document.querySelector("#txt_pesquisar");
const btnPesquisar = document.querySelector("#btnPesquisar");
const txtResultado = document.querySelector("#resultado");

//Criando o array randômicamente.
const arrayElementos = [];
for (i = 0; i < 10; i++) {
  let random = Math.floor(Math.random() * 100);
  arrayElementos.push(random);
}

pArray.textContent = `[ ${arrayElementos} ]`;

//Função para pesquisa e mostrar na tela
btnPesquisar.addEventListener("click", () => {
  const pesquisa = arrayElementos.find((el, i) => {
    if (el == txtPesquisar.value) {
      txtResultado.textContent = `O número ${el} está na ${i + 1}ª posição`;
      return el;
    } else {
      txtResultado.textContent = "Não possui este número no array.";
    }
  });
});
