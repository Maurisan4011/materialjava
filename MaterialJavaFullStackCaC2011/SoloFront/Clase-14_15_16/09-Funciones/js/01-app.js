// Declaración de Función ( Function Declaration )
function sumar() {
    console.log(2 + 2);
}
// Declaración de Función ( Function Declaration )
function calcularEdad(anioNacimiento) {

    return 2020 - anioNacimiento
}


sumar();
sumar();
sumar();


// Expresión de Función (Function Expression)
const calcularEdad = function () {
    return 2020 - anioNacimiento
}

sumar2();
sumar2();

/* //! FUNCION CONOCIDA 
prompt("INGRESAR SUS DATOS");

//! FUNCION PARA VER EN CONSOLA
console.log("VAMOS A  VER POR CONSOLA");

//? OTRA FUNCION  CONOCIDA
alert("SALIDA DE DATOS POR ALERT");

//? FUNCION CREADA POR EL DEV
mi_funcion();


const div = document.createElement("div"); // <div></div>
div.id = "page";          // <div id="page"></div>
div.className = "data";   // <div id="page" class="data"></div>
div.style = "color: red"; // <div id="page" class="data" style="color: red"></div>


//La propiedad textContent:  nos devuelve el contenido de texto de un elemento HTML. 
//Es útil para obtener (o modificar) sólo el texto dentro de un //elemento, obviando el etiquetado HTML:
const div = document.querySelector("div");  // <div></div>
div.textContent = "Hola a todos"; // <div>Hola a todos</div>
div.textContent;  // "Hola a todos"
//La propiedad innerHTML:  nos permite hacer lo mismo, pero interpretando el código HTML indicado y renderizando sus elementos:
const div = document.querySelector(".info"); // <div class="info"></div>
div.innerHTML = "<strong>Importante</strong>"; // Interpreta el HTML
div.innerHTML;  // "<strong>Importante</strong>"
div.textContent;  // "Importante"

//Remove()
const div = document.querySelector(".deleteme");
div.isConnected;    // true
div.remove();
div.isConnected;    // false */


