import "./style.css";

document.querySelector("#app").innerHTML = `
  <div>
  * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes: </br>
  * - Múltiplos de 3 por la palabra "fizz".</br>
  * - Múltiplos de 5 por la palabra "buzz".</br>
  * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
  </div>
`;

for (let i = 1; i < 101; i++)
  i % 3 == 0 && i % 5 == 0
    ? console.log("fizzbuzz")
    : i % 5 == 0
    ? console.log("buzz")
    : i % 3 == 0
    ? console.log("fizz")
    : console.log(i);
