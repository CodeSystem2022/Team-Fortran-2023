
package test;

import domain.*;

public class TextSobreescritura {
    
    public static void main(String[]args){
        
        Empleado empleado1 = new Empleado("Juan", 10000);
        imprimir(empleado1);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        
        Gerente gerente1 = new Gerente("Jose", 5000, "Sistema");
        imprimir(gerente1);
        //System.out.println("gerente =" + gerente1.obtenerDetalles());
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
}
