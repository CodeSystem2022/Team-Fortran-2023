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

// uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo +': '+this.nombre+' '+this.apellido+' '+telefono;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.',123456789));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', 987654321));