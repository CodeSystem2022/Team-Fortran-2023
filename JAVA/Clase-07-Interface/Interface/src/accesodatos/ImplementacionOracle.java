
package accesodatos;

public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar datos Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar datos Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar datos Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar datos Oracle");
    }
    
}
