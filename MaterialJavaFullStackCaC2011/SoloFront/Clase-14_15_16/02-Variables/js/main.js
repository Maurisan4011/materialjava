/**
 * Variables let y var podemos modificar EL VALOR
 * Variable VAR por defecto se le asigna undefined
 * TODO: VAriable LET es mas especifico porque me va a pedir que le asigne un valor
 * TODO: var y let permiten definir variables mutables.
 * TODO: const permite definir variables inmutables.
 * TODO: var permite crear variables con alcance a su función más cercana.
 * TODO: let permite definir variables con un alcance a su bloque más cercano.
 */


function foo() {
    const b = 2;
    let a = 5    
    console.log("primer valor de var a:" + a);
    a = 20;
    console.log("primer valor de var a:" + a);
}
foo();
b=9;
console.log(b);


// VARIABLE const NO DEBE CAMBIAR A LO LARGO DEL PROGRAMA  
//NO podemos Reasignar el valor rompe ejemplo
/*
function foo2() {
    var a = 5
    console.log("primer valor de  var a:" + a);

    console.log("primer valos de a:" + a);
    a = 20;
    console.log("primer valor de var a:" + a);

}*/