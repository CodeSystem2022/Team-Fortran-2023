package test;

import domain.*;

// Clase de prueba para la conversión de objetos
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        // Creación de un objeto Escritor y asignación a la variable empleado
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println(empleado.obtenerDetalles());
        
        // Downcasting: Conversión de empleado a escritor
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        // Upcasting: Conversión de escritor a empleado
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}

