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

// todo :  Arrancamos con las validacio 
document.addEventListener("DOMContentLoaded", function () {
    let formu = document.getElementById("formulario");
    formu.addEventListener('submit', validarForm);
});

let cont = 0;
// ? Agregamos funciones para validar formulario 
function validarForm(evento) {
    evento.preventDefault();

    var usuario = document.getElementById('usuario').value;

    // ! Validamos que el campo usuario no venga vacio
    if (usuario.length == 0) {
        alert('El campo usuario no puede ir vacio debera ingresar su Email');
        return;
    } else {
        //! Validamos que usuario  contenga @
        for (const user of usuario) {
            console.log("Valor de susuario ingresado: " + user);
            if (user == "@") {
                cont++;
                break;
            }
        }
        if (cont == 0) {
            alert("El campo Usuario debe contener un @ ej: mail@mail.com")
            return;
        }
    }

    var password = document.getElementById('password').value;
    console.log("pass ingresado :" + password);

    if (password.length < 6) {
        alert("Su contraseña debe contener al menos 6 caracteres");
        return;
    }
    this.submit(alert("GRACIAS PODES INGRESAR 🚀🚀🚀"));

}

