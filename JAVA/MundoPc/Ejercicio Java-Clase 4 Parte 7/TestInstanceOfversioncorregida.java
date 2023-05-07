
package test;

import domain.*;

public class TestInstanceOfversioncorregida {
    
    public static void main(String[]args){
        
        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        //determinarTipo(empleado1);

    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            //MatiasPeña-Ejercicios con instanceof 1 y2
           ((Gerente)empleado).getDepartamento();
           //Gerente gerente = (Gerente)empleado;
           System.out.println("gerente = "+empleado);
           //gerente.getDepartamento();
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
           Gerente gerente = (Gerente)empleado;
           System.out.println("gerente ="+gerente.getDepartamento());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
            
        }
    }

