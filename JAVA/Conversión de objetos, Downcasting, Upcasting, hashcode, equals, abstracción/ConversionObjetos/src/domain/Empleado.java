
package domain;

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
}

