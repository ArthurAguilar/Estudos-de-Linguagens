const caixaCursos = document.querySelector("#caixaCursos");
const btnC = [...document.querySelectorAll(".curso")];
const c1_2 = document.querySelector("#c1_2");
const cursos = [
  "HTML",
  "CSS",
  "JavaScript",
  "PHP",
  "React",
  "MySQL",
  "React Native",
];
const btnCursoSelecionado = document.getElementById("btnCursoSelecionado");
const btnAdicionarCurso = document.getElementById("btnAdicionarNovoCurso");
const btnRemoverCurso = document.getElementById("btnRemoverCurso");

cursos.map((el, chave) => {
  const novoElemento = document.createElement("div");
  novoElemento.setAttribute("id", "c" + chave);
  novoElemento.setAttribute("class", "curso c1");
  novoElemento.innerHTML = el;

  const comandos = document.createElement("div");
  comandos.setAttribute("class", "comandos");

  const rb = document.createElement("input");
  rb.setAttribute("type", "radio");
  rb.setAttribute("name", "rb_curso");

  comandos.appendChild(rb);
  novoElemento.appendChild(comandos);
  caixaCursos.appendChild(novoElemento);
});

// Radio Selecionado
const radioSelecionado = () => {
  const todosRadios = [...document.querySelectorAll("input[type=radio]")];
  const radioSelec = todosRadios.find((el) => el.checked);
  return radioSelec;
};

// Botão de adicionar curso
btnAdicionarCurso.addEventListener("click", () => {
  let nomeCurso = document.getElementById("nomeCurso").value;
  if (nomeCurso.trim() === "") {
    alert("Por favor, adicione um nome primeiro!");
    return;
  }

  let novoCurso = document.createElement("div");
  novoCurso.setAttribute("class", "curso c1");
  novoCurso.innerText = nomeCurso;

  let divRadio = document.createElement("div");
  divRadio.setAttribute("class", "comandos");

  let radioInput = document.createElement("input");
  radioInput.setAttribute("type", "radio");
  radioInput.setAttribute("name", "rb_curso");

  divRadio.appendChild(radioInput);
  novoCurso.appendChild(divRadio);
  caixaCursos.appendChild(novoCurso);
});

//Botão de remover curso
btnRemoverCurso.addEventListener("click", () => {
  if (radioSelecionado()) {
    let cursoSelecionado = radioSelecionado().parentNode.parentNode;
    // console.log(cursoSelecionado)
    caixaCursos.removeChild(cursoSelecionado);
  } else {
    alert("Selecione um curso primeiro!");
  }
});

//Botão de verificar nome do curso
btnCursoSelecionado.addEventListener("click", () => {
  if (radioSelecionado()) {
    let cursoSelecionado =
      radioSelecionado().parentNode.previousSibling.textContent.trim();
    alert(`Curso selecionado: ${cursoSelecionado}`);
  } else {
    alert("Você não escolheu nenhum curso.");
  }
});
