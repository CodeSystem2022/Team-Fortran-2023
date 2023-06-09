let x = 10;//variable primitiva
console.log(x.length);

//Creacion de un objeto
let persona = {
     nombre: 'Carlos',
     apellido: 'Gil',
     email: 'cgil@gmail.com',
     edad:30,
     nombreCompleto: function(){ //metodo o funcion en JavaScript
          return this.nombre+' '+this.apellido;
     }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.edad);
console.log(persona.email);
console.log(persona);
console.log(persona.nombreCompleto());

let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan'   
persona2.direccion = 'Salada 14'  
persona2.telefono = '658563845057' 
console.log(persona2.telefono); 

console.log(persona["apellido"]) // Acedemos como si fuera un arreglo

for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad])
}

persona.apellida = 'Betancud'; //Cambiamos dinamicamente un valor del objeto
delete persona.apellida; 
console.log(persona);




