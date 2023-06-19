package excepciones;

<<<<<<< HEAD
public class OperacionExcepcion extends Exception {
=======
public class OperacionExcepcion extends RuntimeException {
>>>>>>> da886a70c29077c4e75393d04217cd6a4d4665bc
    // Constructor  
    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
}

