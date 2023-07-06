
package test;

import accesodatos.*;

public class TestInterface {
  
    public static void main(String[]args){
        IAccesoDatos datos = new ImplementacionMySql();
       // datos.listar();
       // imprimir(datos);
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    
    }
}
