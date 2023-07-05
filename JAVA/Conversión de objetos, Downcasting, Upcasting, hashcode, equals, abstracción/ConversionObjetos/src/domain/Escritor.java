
package domain;

// Clase que representa a un escritor, que es un tipo de empleado
public class Escritor extends Empleado {
    // Atributo final que representa el tipo de escritura del escritor
    final TipoEscritura tipoEscritura;

    // Constructor de la clase Escritor
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    // Sobrescritura del método obtenerDetalles() para incluir el tipo de escritura
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Tipo Escritura: " + tipoEscritura.getDescripcion();
    }

    // Sobrescritura del método toString() para representar el objeto Escritor como una cadena de texto
    @Override
    public String toString(){
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}' + " " + super.toString();
    }

    // Método getter para obtener el tipo de escritura del escritor
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}

