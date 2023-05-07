let x = 10; // variable de tipo primitivo
console.log(x.length);undefined
console.log('Tipos primitivos');
//Objeto
let persona = {
	nombre: 'Carlos',
	apellido: 'Gil',
	email: 'cgil@gmail.com',
	edad: '30',
	// metodo o funcion en Javascript
	nombreCompleto: function ()
	{
		return this.nombre + ' ' +this.apellido;
    }
}

	   
console.log(persona.nombre); 
console.log(persona.apellido); 
console.log(persona.email);
console.log(persona.edad); 
console.log(persona.nombreCompleto);
console.log('Probando con un objeto')

let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan Cuesta';
persona2.direccion = 'Almagro 21';
persona2.telefono = '232423423423';
console.log(persona2.telefono);
console.log('Creamos otro objeto');
console.log(persona['apellido']); //Accedemos como si fuera un arreglo

//for in y Accedemos como si fuera un Arreglo
for (propiedad in persona2) {
	console.log(propiedad); 
	console.log(persona2[propiedad]); 
}
persona.apellida = 'Betacund'; //Cambiamos dinamicamente un valor del objeto
delete persona.apellida; //Eliminamos el error
console.log(persona); 