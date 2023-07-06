
class Producto{

static contadorProductos = 0;
constructor(nombre, precio){
    this._idProducto = ++Producto.contadorProductos;
    this._nombre = nombre;
    this._precio = precio;
}
    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    get precio(){
        return this._precio;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){ //Template Literals: Nos permite insertar codigo dinamicamente
        return `idProducto : ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
} //Fin de la clase producto
      


// Video 10.3-Prueba de Clase Producto

let producto1 = new Producto('Pantalon', 200);
let producto2 = new Producto('Camisa', 150);
//console.log(prduct1.toString());
//console.log(product2.toString());
// Clase 10.6-Prueba con la relacion Agregacion parte 2
let producto3 = new Producto('Cinturón', 50);
let orden1 = new Orden;
let orden2 = new Orden();

orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden2.agregarProducto(producto3);
orden1.mostrarOrden();
orden2.mostrarOrden();
//Clase 10.4 -Creacion de la Clase Orden
class Orden{
    static contadorOrdenes = 0;

    //Simula una constante
    static getMAX_PRODUCTOS() { return 5 ; }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get _idOrden(){return this._idOrden;}

    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto); //Tenemos dos tipos de sintaxis: -> primera sintaxis
            //this._productos[this._contadorProductosAgregados++] = producto; -> segunda sintaxis
        }
        else{
            console.log('No se pueden agregar mas productos')
        }
    } // Fin del metodo agregarProducto
    //Clase 10-Parte 5 Prueba con la relacion agregacion Parte 1
    clacularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){
            totalVenta += producto.precio;
        }//fin ciclo for
        return totalVenta;
    }// fin metodo calcular total

    mostrarOrden(){
        let productosOrden = ' ';
        for(let producto of this._productos){
            productosOrden += '\n{'+producto.toString()+' }';
        } //fin del ciclo For
        console.log(`Orden: ${this._idOrden}, Total:$${this.clacularTotal()}, Productos: ${productosOrden}`);
    }//Fin metodo mostrarOrden  
    
    }//Fin de la clase Orden


