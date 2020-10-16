class Cliente {

    #nombre;

    setNombre(nombre) {
        this.#nombre = nombre;
    }

    getNombre() {
        return this.#nombre;
    }
}


const juan = new Cliente();
juan.setNombre('MAuri');
console.log(juan.getNombre() );
