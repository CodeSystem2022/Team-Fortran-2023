 //Clase 6 -Matias Peña-Get y Setter parte 2
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this.apellido = apellido;
    }

}
let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
console.log(persona1.apellido);
//console.log(persona1);
let persona2 = new Persona('Carlos','Lara');
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
console.log(persona2.apellido)
//console.log(persona2);
