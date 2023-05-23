class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    get nombre(){
        return this._nombre;
    }
}

let persona1 = new Persona('Martpin', 'Perez');
console.log(persona1.nombre);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);