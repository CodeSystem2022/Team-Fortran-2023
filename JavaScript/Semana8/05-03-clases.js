//let persona3 = new Persona('Carla', 'Ponce'); esto no se debe hacer : persona is not defined 

class Persona{ //CLASE PADRE 

    static contadorPersonas = 0; //atributo estatico 
    //email = 'Valor default email';//atributo no estatico 

    static get MAX_OBJ(){ //este metodo simula una constante 
        return 5;
    }

    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
             this.idPersona = ++Persona.contadorPersonas;
        }
        else{
            console.log('Se ha superado el maximo de objetos permitidos');
        }
        console.log('Se incrementa el contador: '+Persona.contadorObjetosPersona);
    }
    
    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

   
//Clase 6- Get y Setter-parte 2-Matias Peña
    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this.idPersona+' '+this._nombre+' '+this._apellido;
    }
    //sobreescribiendo el metodo de la clase padre(object)

    toString(){ //regresa un string 
        //se aplica el polimorfismo que significa =miltiples formas en tiempo de ejecucion
        //el metodo que se ejecuta depende si es una referencia de tipo padre o hija 
        return this.nombreCompleto();

    }

    static saludar(){
        console.log('Saludos desde este metodo static');
    }
    static saludar2(persona){
        console.log(persona.nombre+' '+persona.apellido);
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
 
//Herencia parte 1
class Empleado extends Persona{// clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento=departamento;
      
    }
    //SOBREESCRITURA 
    nombreCompleto(){
        return super.nombreCompleto+', '+this._departamento;
    }
}
let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nomnbre);
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);

persona2.nombre = 'María Laura';
console.log(persona2.nombre);
//console.log(persona2);


let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//Object.prototype.toString esta es la manera de acceder a atributos y metodos de manera dinamica 

console.log(empleado1.toString);
console.log(persona1.toString());
//persona1.saludar(); no se utiliza desde el objeto 
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email); //da el valor 
console.log(empleado1.email); //da el valor 
//console.log(Persona.email); //no se puede acceder desde la Clase 

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);
let persona3 = new Persona('Facundo', 'Pereyra');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
Persona.MAX_OBJ = 10; //no se puede modificar 
console.log(Persona.MAX_OBJ); 

let persona4 = new Persona('Franco', 'Morales'); 
console.log(persona4.toString());
let persona5 = new Persona('Franco', 'Paz'); 
console.log(persona5.toString());

