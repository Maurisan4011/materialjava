/* 
! Una sentencia condicional es un conjunto de comandos que se ejecutan si una condición es verdadera.  
? JavaScript soporta dos sentencias condicionales: if...else y switch
*/



/* if (edadJesus > edadTatiana) {
    console.log("Jesus es mayor que Tatiana")

} else {
    console.log("Tatiana es mayor que Jesus")
} */

/* 
TODO:También se pueden armar sentencias más complejas usando else if para tener múltiples condiciones,  como se muestra a continuación:

*/
var edadJesus = 50
var edadTatiana = 50

if (edadJesus > edadTatiana) {
    console.log("Jesus es mayor que Tatiana")
} else if (edadTatiana > edadJesus) {
    console.log("Tatiana es mayor que Jesus")

} else {
    console.log("Tatiana y Jesus tienen la misma edad")
}