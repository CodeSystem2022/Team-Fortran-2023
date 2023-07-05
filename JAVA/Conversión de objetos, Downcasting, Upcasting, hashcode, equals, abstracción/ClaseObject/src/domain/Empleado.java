
package domain;

import java.util.Objects;

// Clase que representa a un empleado
public class Empleado {
    // Atributos protegidos para el nombre y sueldo del empleado
    protected String nombre;
    protected double sueldo;

    // Constructor de la clase Empleado
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Método para obtener los detalles del empleado
    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }

    // Getter para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Setter para establecer el nombre del empleado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el sueldo del empleado
    public double getSueldo() {
        return sueldo;
    }

    // Setter para establecer el sueldo del empleado
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Método toString() para representar el objeto Empleado como una cadena de texto
    @Override
    public String toString(){
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        // Genera un código hash utilizando el atributo "nombre"
        hash = 53 * hash + Objects.hashCode(this.nombre);
        // Genera un código hash utilizando el atributo "sueldo"
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        // Retorna el código hash resultante
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        // Comprueba si los objetos son idénticos en referencia
        if (this == obj) {
            return true;
        }
        // Comprueba si el objeto es nulo
        if (obj == null) {
            return false;
        }
        // Comprueba si los objetos pertenecen a la misma clase
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Realiza un casting del objeto a la clase Empleado
        final Empleado other = (Empleado) obj;
        // Comprueba si los atributos "sueldo" son iguales utilizando bits
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        // Comprueba si los atributos "nombre" son iguales utilizando el método equals
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        // Los objetos son iguales en contenido
        return true;
    }

}

