const c1 = document.querySelector("#caixa1");
const cAll = [...document.querySelectorAll(".curso")];
const cursos = [
  "HTML",
  "CSS",
  "JavaScript",
  "PHP",
  "React",
  "MySQL",
  "React Native",
];

const novoElemento = (idElemento, tech) => {
  // Cria o ELemento
  let elemento = document.createElement("div");
  elemento.setAttribute("id", idElemento);
  elemento.setAttribute("class", "curso c1");
  elemento.innerText = tech;
  c1.appendChild(elemento);

  // Cria o Botão de Apagar
  const btnApagar = document.createElement("p");
  btnApagar.innerText = 'Del'
  elemento.appendChild(btnApagar)

  // Função do botão de apagar
  btnApagar.addEventListener("click", (evento) => {
    c1.removeChild(evento.target.parentNode);
  });
};

cursos.map((conteudo, posicao) => {
  novoElemento(`C${posicao + 1}`, conteudo);
});
