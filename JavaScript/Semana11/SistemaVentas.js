class Producto{
    static contadorProductos = 0;
    contructor(nombre,precio){
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

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){ //Template Literals: Nos permite insertar codigo dinamicamente
        return 'idProducto : ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}';
    }

}//Fin de la clase Producto

class Orden{
  static contadorOrdenes = 0;
  static getMAX_PRODUCTOS(){
    return 5;
  } 
  constructor(){
    this._idOrden = ++Orden.contadorOrdenes;
    this._productos = [];
    this._contadorProductosAgregados = 0; 
  }
  get idOrden(){
    return this._idOrden;
  }
  agregarProducto(producto){
    if(this._productos.length < Orden.getMAX_PRODUCTOS()){
      this._productos.push(producto);
      // this._productos[this._contadorProductosAgregados++] = producto;
    }
    else{
      console.log('No se pueden agregar mas productos');
    }
  }//Fin del metodo agregar producto
}//Fin de la clase Orden
class Orden{
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS(){
        return 5;
    }

    constructor(){
        this.idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto); // Tenemos 2 tipos de sintaxis: 1
            //this._productos[this._contadorProductosAgregados++] = producto; // segunda sintaxis
        }
        else{
            console.log('No se puede agregar más productos');
        }
    } // Fin del método agregarProducto
} // Fin de la Clase Orden


let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 150);
console.log(producto1.toString());
console.log(producto2.toString());