
package domain;

// Clase que representa un rectángulo, que es una subclase de FiguraGeometrica
public class Rectangulo extends FiguraGeometrica {
    
    // Constructor de la clase Rectangulo
    public Rectangulo(String tipoFigura){
        super(tipoFigura); // Llama al constructor de la clase padre (FiguraGeometrica)
    }
    
    // Implementación del método abstracto dibujar de la clase padre
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}

