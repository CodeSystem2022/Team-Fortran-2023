package test;

import domain.*;

// Clase de prueba para la clase Object
public class TestClaseObject {
    public static void main(String[] args) {
        // Creación de dos objetos Empleado con los mismos valores
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        // Comparación de referencias en memoria
        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen diferente referencia en memoria");
        }
        
        // Comparación de contenido de objetos
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son diferentes en contenido");
        }
        
        // Comparación de valores hashCode
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashCode es igual");
        } else {
            System.out.println("El valor hashCode es diferente");
        }
    }
}


