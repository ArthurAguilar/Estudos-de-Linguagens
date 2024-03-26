const pArray = document.querySelector("#array");
const txtPesquisar = document.querySelector("#txt_pesquisar");
const btnVerificar = document.querySelector("#btnVerificar");
const txtResultado = document.querySelector("#resultado");

//Criando o array randômicamente.
const arrayElementos = [1, 20, 25, 30, 26, 12];
// for (i = 0; i < 10; i++) {
//   let random = Math.floor(Math.random() * 100);
//   arrayElementos.push(random);
// }

pArray.textContent = arrayElementos;

btnVerificar.addEventListener("click", () => {
  arrayElementos.every((cont, ind) =>
    cont > 18
      ? (txtResultado.textContent = "Positivo")
      : (txtResultado.textContent = `Número: ${cont} - Posição ${ind+1}`)
  );
});
