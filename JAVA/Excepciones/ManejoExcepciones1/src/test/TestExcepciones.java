
package test;

import static aritmetica.Aritmetica.division;

import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {

        //int resultado = 10/0;
        //System.out.println("resultado = " + resultado);
        int resultado = 0;
<<<<<<< HEAD
        //try {
=======
        try {
            
<<<<<<< HEAD
>>>>>>> da886a70c29077c4e75393d04217cd6a4d4665bc
=======
>>>>>>> da886a70c29077c4e75393d04217cd6a4d4665bc
            resultado = 10/0;
//        }catch(Exception e){
//            System.out.println("Ocurrio un Error");
//            e.printStackTrace(System.out); //se conoce como la pila de excepciones
//        }
        System.out.println("La variable de resultado tiene como valor: "+resultado);

        int resultado = 0;
         try {
            resultado = division(10,0);
        } catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out); //se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
<<<<<<< HEAD
=======
        System.out.println("La variable de resultado tiene como valor: "+resultado);

        int resultado = 0;
         try {
            resultado = division(10,0);
        } catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out); //se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
>>>>>>> da886a70c29077c4e75393d04217cd6a4d4665bc
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("La variable de resultado tiene como valor: " + resultado);

    }
}


