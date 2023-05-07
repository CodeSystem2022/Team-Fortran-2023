package domain;

public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre,double sueldo,String departamento){
        super(nombre,sueldo);
        this.departamento = departamento;
    }
    
    //Sobrescribir el metodo
    @Override
    public String obtenerDetalles(){ 
        return super.obtenerDetalles()+", Departamento: "+this.departamento;
    }
}
