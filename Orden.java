package ar.com.system2023.mundopc;

public class Orden {
private final int idOrden;
private Computadora computadora [];
private static int contadorOrdenes = 0;
private static final int MAX_COMPUTADORAS = 10;
private int contadorComputadora;
   
public Orden() {
    this.idOrden = ++Orden.contadorOrdenes;
    this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    this.contadorComputadora = 0;
}      
            





public static void agregarComputadora(Computadora computadora){ 

        if (this.contadorComputadora < Orden.MAX_COMPUTADORAS)
        {this.computadora[this.contadorComputadora++] = computadora;
                
    }
    
}
}
