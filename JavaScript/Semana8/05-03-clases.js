//let persona3 = new Persona('Carla', 'Ponce'); esto no se debe hacer : persona is not defined 

class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
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