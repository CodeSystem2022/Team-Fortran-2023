let x= 10; //variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos');

//Objeto
let persona= {
    nombre:'Carlos',
    apellido:'Gil',
    email:'cgil@gmail.com',
    edad:30,
    nombreCompleto: function(){ //método o función  en js
        return this.nombre+' '+this.apellido;
    },
    get nombre(){
        return 'El nombre es:'+ this.nombre+' Edad:'+this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

console.log('Ejecutando con un objeto')
let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.direccion = "Salada 140";
persona2.telefono = "123456789";
console.log(persona2.telefono)

console.log('Creamos un nuevo objeto')
console.log(persona['apellido']);//Accedemos como si fuera un arreglo

//for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

console.log('Cambiamos y eliminamos un error')
persona.apellida = 'Betancud';//Cambiamos dinamicamente un valor del objeto 
delete persona.apellida; //eliminamos el error
console.log(persona);

//Distintas formas de imprimir un objeto.
//Número 1: la más sencilla: Concatenar cada valor de cada propiedad
console.log('Distintas formas de imprimir un objeto: forma 1');
console.log(persona.nombre+','+persona.apellido);

//Número 2: A través del ciclo for in
console.log('Distintas formas de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);  
}

//Número 3: La función Object.values()
console.log('Distintas formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: Utilizaremos el método JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);
console.log('Comenzamos a utilizar el metodo get')
console.log(persona.nombreEdad);

function Persona3(nombre = 'Luis ', apellido, email){ //Constructor
    this.nombre = nombre; 
    this.apellido = apellido;
    this.email = email;
}

let padre = new Persona3('Leo', 'Lopez', 'lopez@gmail.com');
console.log(padre);
// EJercicio 5.3 Agregar metodos al constructor del objeto
//Matias Peña
console.log('Distintas formas de imprimir un objeto: forma 4');
//let personaString = JSON.stringify(persona);
console.log(personaString);
console.log('Comenzamos a utilizar el metodo get')
console.log(persona.nombreEdad);
console.log('Comenzamos con el metodo get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona32(nombre = 'Luis ', apellido, email){ //Constructor
    this.nombre = nombre; 
    this.apellido = apellido;
    this.email = email;
}
let papa = new Persona32('Leo', 'Alvarez','alvarez@gmail.com');
papa.nombre = 'Luisito';
papa.telefono = '12345678';
console.log(papa.telefono);
console.log(papa); Persona3(nombre = 'Luis ', apellido='Lopez', email='lopez@gmail.com')

let madre = new Persona32('Laura','Contrera','contrera@gmail.com');
console.log(madre); Persona32(nombre ='Laura',apellido ='Contrera',email ='contrera@gmail.com')

//Diferentes formas de crear objetos

//caso número 1
let miObjeto = new Object(); //Esta es una opción formal
//caso objeto 2
let miObjeto2 = {}; //Esta opción es breve y recomendada

//casi String 1
let miCadena1 = new String('Hola'); //Sintaxis formal
//caso String 2
let miCadena2 = 'Hola'; //Esta es la sintaxis simplificada y recomendada

//caso con números 1
let miNumero = new Number(1);//Es formal no recomendable
//caso con números 2
let muNumero = 1;//Sintaxis recomendada

//caso boolean 1
let miBoolean1 = new Boolean(false); //Formal
//caso boolean 2
let miBoolean2 = false;//Sintaxis recomendada

//caso Arreglo 1
let miArreglo1 = new Array();//Formal
//caso Arreglo 2
let miArreglo2 = [];

//caso funcion 1
let miFuncion1 = new function () { }; //Todo despues de new es considerado objeto
//caso funcion 2
let miFuncion2 = function () { }; //Notación simplificada y recomendada 

//Uso del prototype 
Persona3.prototype.telefono = '1234567895';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '25846388952';
console.log(madre.telefono);

// uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo +': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.',123456789));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', 987654321));

// Metodo Apply
let arreglo = ['Ing', '54962476472'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));

