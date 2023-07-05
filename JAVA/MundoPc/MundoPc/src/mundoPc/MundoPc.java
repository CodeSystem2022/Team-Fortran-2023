
package mundoPc;

import ar.com.system2023.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        //Importar la clase
        //Objeto 1
        Monitor monitorHP = new Monitor("HP", 13); 
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //Objeto 2
        Monitor monitorGamer = new Monitor("Gamer", 32); 
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        
        //Inicializamos el arreglo vacio
        Orden orden1 = new Orden();
        Orden Orden2 = new Orden();
        
        //Agregamos los Objetos
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        //Creamos otra Computadora y Orden
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        Orden2.agregarComputadora(computadorasVarias);
        
        //Mostramos la orden
        orden1.mostrarOrden();
         orden1.mostrarOrden();

    }
}
