var pepe = (nombre, apellido) => {
    console.log(nombre + apellido);
}

var lista = [
    ['lista 1', '2', '3', ['lista 2', '1', '2', '3', ['lista 3', '1', '2', 'final de las listas internas usando recursion']]]
];

function loop(x, j, k) {
    if (typeof(lista[0]) == typeof(lista[0][x])) {
        if (typeof(lista[0][x]) == typeof(lista[0][x][j])) {
            if (k != lista[0][x][j].length) {
                console.log(lista[0][x][j][k]);
                loop(x, j, ++k);
            }
        } else {
            console.log(lista[0][x][j]);
            loop(x, ++j, k);
        }
    } else {
        console.log(lista[0][x]);
        loop(++x, j, k);
    }
}

loop(0, 0, 0);

function foo() {}
console.log(foo)

var bar = foo;
console.log(foo)


//Funciones para prender y apagar la luz de la pagina
var imagen = document.getElementById('imagen');

function apagar() {
    document.body.style.backgroundColor = "black";
    document.querySelector("h1").style.color = "white";
    imagen.innerHTML = '<img src="negro.jpg" alt="hola que tal">'
}

function prender() {
    document.body.style.backgroundColor = "white";
    document.querySelector("h1").style.color = "black";
    imagen.innerHTML = ''
}

//funcion para agregar ceros al principio de un numero dado
function padZeros(num, totalLen) {
    var numStr = num.toString(); // Inicia liza un valor de retorno como cadena
    var numZeros = totalLen - numStr.length; // Calcula el no. de ceros
    for (var i = 1; i <= numZeros; i++) {
        numStr = "0" + numStr;
    }
    return numStr;
}

console.log(padZeros(2, 15))


//funciones por medio de objetos
var VideoJuego = {
    titulo: "",
    consola: "",
    jugar() {
        console.log("Estoy jugando a " + this.titulo + " en la consola " + this.consola);
    }
}

var Mario = Object.create(VideoJuego);
Mario.__init = function(titulo, version) {
    this.titulo = titulo;
    this.version = version;
}

Mario.consola = "Nintendo";
Mario.titulo = "Super Mario Bros";

var MarioDos = Object.create(Mario);
MarioDos.__init("Supero Mario Bros 2", 1);

var MarioTres = Object.create(Mario);
MarioTres.__init("Supero Mario Bros 3", 2);

console.log(VideoJuego);
console.log(Mario);
console.log(MarioDos);
console.log(MarioTres.jugar());

//funciones mediante constructor
//Clase Persona constructor
/*var Persona = function(nombre, apellido, nac) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.nac = nac;
    /*si la funcion saludar() esta dentro, se pasa siempre como parte del objeto
    this.saludar = function() {
        return "Hola soy " + this.nombre + " " + this.apellido;
    }
}*/

//agregando la funcion saludar() al prototipo de Persona
/*Persona.prototype.saludar = function() {
    return "Hola soy " + this.nombre + " " + this.apellido;
}

//Clase Directivo extiende a Persona
var Directivo = function(nombre, colegio) {
    Persona.call(this, nombre, "AlADC", 45);
    this.colegio = colegio;
}

//tengo que agregar esto para pasarle el prototipo de Persona a Directivo para que funcione saludar()
Directivo.prototype = Object.create(Persona.prototype);
Directivo.prototype.despedirse = function() {
    return "ay se ven batos";
}


//Uso de mis objetos
var pepe = new Persona("Dora", "LaExportaDroga", 25);
var pipo = new Persona("Peppa", "La Jarcor", 20);
var dirJuan = new Directivo("Pegale", "EETN°2");

console.log(pepe.saludar())
console.log(dirJuan.saludar())

//añadiendo funcion a Persona
Persona.diferenciaAnos = function(per1, per2) {
    return "La diferencia de edad es: " + (per1.nac - per2.nac) + " años";
}

console.log(Persona.diferenciaAnos(pepe, pipo));*/

//de la forma en que se escriben las funciones anteriores a partir de ECMAScript6

class Persona {
    constructor(nombre, apellido, nac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nac = nac;
    }
    saludar() {
        return "Hola soy " + this.nombre + " " + this.apellido;
    }
    static diferenciaAnos(per1, per2) {
        return "La diferencia de edad es: " + (per1.nac - per2.nac) + " años";
    }
}


class Directivo extends Persona {
    constructor(nombre, colegio) {
        super(nombre, "AlADC", 45);
        this.colegio = colegio;
    }
    despedirse() {
        return "ay se ven batos";
    }
}

var pepe = new Persona("Dora", "LaExportaDroga", 25);
var pipo = new Persona("Peppa", "La Jarcor", 20);
var dirJuan = new Directivo("Pegale", "EETN°2");

console.log(pepe.saludar())
console.log(dirJuan.saludar())


console.log(Persona.diferenciaAnos(pepe, pipo));