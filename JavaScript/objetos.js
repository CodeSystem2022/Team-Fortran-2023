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

