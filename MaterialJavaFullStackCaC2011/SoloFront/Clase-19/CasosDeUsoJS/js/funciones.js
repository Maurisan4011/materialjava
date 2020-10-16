//! declaro una varieble global 

var numIntgerval;

function cambioDeColor() {
    
    numIntgerval = setInterval(flashTexto, 200);

}
function flashTexto() {
    var miElemento = document.getElementById('mi_mensaje');
//    console.log(miElemento)

    // !  miElemento.style.color  adquiere un operador ternario para modificar 
    miElemento.style.color = miElemento.style.color == 'blue' ? 'yellow' : 'blue';
}

// todo: De esta manera estopeamos el loop infinito que creamos en setInterval
function detenerCambioDeColor() {
    console.log(numIntgerval)
    clearInterval(numIntgerval)
}
