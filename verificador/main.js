import "./style.css";

document.querySelector("#app").innerHTML = `
  <div>
  RUTINA PARA EL CÁLCULO DEL DIGITO VERIFICADOR </br>
 

  Se considera para efectuar el cálculo el siguiente ejemplo como clave AMIS: 22374 </br>
  
  ---Etapa 1: Rellenar por la izquierda con ceros si la clave es menor a 5 dígitos, comenzar desde la izquierda, 
  sumar todos los caracteres ubicados en las posiciones impares. </br>
  
  2 + 3 + 4 = 09 </br>
   
  ---Etapa 2: Multiplicar la suma obtenida en la etapa 1 por el número 3. </br>
  
  09 x 3 = 27 </br>
  
  ---Etapa 3: Comenzar desde la izquierda, sumar todos los caracteres que están ubicados en las posiciones pares de la clave AMIS: 22374 </br>
  
  2 + 7 = 09 </br>
  
  ---Etapa 4: Sumar los resultados obtenidos en las etapas 2 y 3. </br>
  
  27 + 09 = 36 </br>
  
  ---Etapa 5: Buscar el menor número que sumado al resultado obtenido en la etapa 4 dé un número múltiplo de 10. </br>
  Este será el valor del dígito verificador del módulo 10.
  </div>
`;

const codigo = 3126;
let indexReal;
let numerosEnPosicionImpar = 0;
let numerosEnPar = 0;
let etapaDos = 0;
let etapaCuatro = 0;

const iteraElNumero = (numero, index) => {
  indexReal = index + 1;

  return numero;
};

const numerosArr = Array.from(
  codigo.toString().padStart(5, "0"),
  iteraElNumero
);

sumaPosicionesImpares(numerosArr);

function sumaPosicionesImpares(array) {
  // console.log(indexReal);
  array.forEach((numero, index, array) => {
    if (index % 2 == 0) {
      numerosEnPosicionImpar += parseInt(array[index]);
    } else {
      numerosEnPar += parseInt(array[index]);
    }
  });
  // console.log(numerosEnPosicionImpar);
  // console.log(numerosEnPar);

  etapaDos = numerosEnPosicionImpar * 3;
  etapaCuatro = numerosEnPar + etapaDos;
  // console.log(etapaCuatro);

  for (let i = 0; i < 100; i++) {
    if ((i + etapaCuatro) % 10 == 0) {
      console.log("tu verificador es: ", i);
      return;
    }
  }
}
