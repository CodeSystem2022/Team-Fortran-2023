
package calculadorautn;

import java.util.Scanner;


public class CalculadoraUTN {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        while (true) {            
            System.out.println("***** Aplicacion Calculadora ******");
            mostrarMenu();
            try{
                var operacion = Integer.parseInt(entrada.nextLine());
            if(operacion >= 1 && operacion <= 4){
                
                
                ejecutarOperacion(operacion, entrada);
                
            }
            else if (operacion == 5){
                System.out.println("Hasta pronto ...");
                break;
            }
            else {
                System.out.println("Operación erronea: "+operacion);
            }
            System.out.println();
            } catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
                System.out.println("");
            }
        }
    }
    
    private static void mostrarMenu(){
        //Mostramos el menú
            System.out.println("""
                               1. Suma
                               2. Resta
                               3. Multiplicación
                               4. División
                               5. Salir
                               """);
            System.out.print("Operación a relizar");
            
    }
    
    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Digite el valor para el operando1: ");
                var operando1 = Double.parseDouble(entrada.nextLine());
                System.out.print("Digite el valor para el operado2: ");
                var operando2 = Double.parseDouble(entrada.nextLine());
        int resultado;
                switch(operacion){
                    case 1 -> {
                        resultado = (int) (operando1 + operando2);
                        System.out.println("Resultado de la suma: "+resultado);
                    }
                    case 2 -> {
                        resultado = (int) (operando1 - operando2);
                        System.out.println("Resultado de la resta: "+resultado);   
                    }
                    case 3 -> {
                        resultado = (int) (operando1 * operando2);
                        System.out.println("Resultado de la multiplicación: "+resultado);
                    }
                    case 4 -> {
                        resultado = (int) (operando1 / operando2);
                        System.out.println("Resultado de la divición: "+resultado);
                    }
                    default -> System.out.println("Opcion erronea "+operacion);
                }
    }
}
