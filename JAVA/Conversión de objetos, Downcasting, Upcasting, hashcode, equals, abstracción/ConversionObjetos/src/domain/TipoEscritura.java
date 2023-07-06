package domain;

// Enumeración que define los tipos de escritor
public enum TipoEscritura {
    // Valores posibles para el enum
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");

    // Atributo privado que almacena la descripción del tipo de escritor
    private final String descripcion;

    // Constructor del enum TipoEscritor
    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método getter para obtener la descripción del tipo de escritor
    public String getDescripcion() {
        return descripcion;
    }
}

