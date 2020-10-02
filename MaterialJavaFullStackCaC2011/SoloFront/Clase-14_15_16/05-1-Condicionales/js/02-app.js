/* 
! Una sentencia switch permite a un programa evaluar una expresión e intentar 
! igualar el valor de dicha  expresión a una etiqueta de caso (case).
*/


var dia = prompt("QUE DIA ES HOY : lunes ,  martes, miercoles o viernes?? escriba porfavor")
var diaMin = dia.toLowerCase();

switch (diaMin) {
    case 'lunes':
        console.log("Hoy es lunes. Se arranca")
        console.log(dia)
        console.log(diaMin)
        break;
    case 'martes':
        console.log("Hoy es Martes. contodo")

        break;
    case 'miercoles':
        console.log("hoy es Miercoles. cortamos la semana")

        break;
    case 'viernes':
        console.log("Hoy es Viernes. Y tu codigo lo sabe!!")
        
        break;
    default:
        console.log("Che  te cuento que hoy no es ni Lunes , ni martes, ni miercoles, ni viernes :(")
        console.log("Hoy es:" + dia + "  Que tengas un gran dia!")
        break;
}
/* 
! aplicando  solo a Enteros 
*/
//!Depende que numero  declare en la variable , me va a devolver  la opcion 

var dia = 3

switch (dia) {
    case 1:
        console.log("Hoy es lunes. Se arranca")
        console.log(dia)
        console.log(diaMin)
        break;
    case 2:
        console.log("Hoy es Martes. contodo")
        console.log(dia)
        break;
    case 3:
        console.log("hoy es Miercoles. cortamos la semana")
        console.log(dia)
        break;
    case 5:
        console.log("Hoy es Viernes. Y tu codigo lo sabe!!")
        console.log(dia)
        break;
    default:
        console.log("Che  te cuento que hoy no es ni Lunes , ni martes, ni miercoles, ni viernes :(")
        console.log("Hoy es:" + dia + "  Que tengas un gran dia!")
        console.log(dia)
        break;
}
