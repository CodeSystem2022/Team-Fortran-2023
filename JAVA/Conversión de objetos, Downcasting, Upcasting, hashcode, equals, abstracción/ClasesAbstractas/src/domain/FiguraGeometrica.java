package domain;

// Clase abstracta que representa una figura geométrica
public abstract class FiguraGeometrica {
    protected String tipoFigura; // Variable para almacenar el tipo de figura
    
    // Constructor de la clase FiguraGeometrica
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    // Método abstracto para dibujar la figura (debe ser implementado por las subclases)
    public abstract void dibujar();

    // Getter para obtener el tipo de figura
    public String getTipoFigura() {
        return tipoFigura;
    }

    // Setter para establecer el tipo de figura
    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    // Método toString para obtener una representación en cadena de la figura
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
}

