const c1 = document.querySelector("#caixa1");
const cAll = [...document.querySelectorAll(".curso")];

c1.addEventListener("click", () => {
  console.log("Clicou");
});

cAll.map((el) => {
  el.addEventListener("click", (evt) => {
    evt.stopPropagation();
  });
});
