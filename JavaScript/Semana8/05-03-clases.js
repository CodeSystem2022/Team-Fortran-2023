class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    get nombre(){
        return this._nombre;
    }
}
//Herencia parte 1
class Empleado extends Persona{// clase hija
    constructor(departamento){
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento=departamento;
      
    }
}
let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);