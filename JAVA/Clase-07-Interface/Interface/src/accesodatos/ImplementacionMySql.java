
package accesodatos;

public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MSQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MYSQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MYSQL");
    }
    
}
