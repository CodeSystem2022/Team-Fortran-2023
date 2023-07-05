import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listadoPersonaApp { 
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del cilo while
        List<Persona> persona = new ArrayList<>();
        //Empezamos  con el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, persona);
            }catch (Exeption e){
                System.out.println("Ocurrio un error:" + e.getMessage());
            }
            System.out.println
      }//Fin del ciclo while
   }//Fin metodo main
    private static void mostrarMenu(){
        //mostramos las opciones
        System.out.print("""
                         ****** Listado de Personas ******
                         1. Agregar
                         2. Listar
                         3. Salir
                         """);
        System.out.print("Digite una de las opciones");
        
    }// Fin de metodo mostrarMenu
    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> persona){
        var opcion = Integer.parseInt(entrada.nexLine());
        var salir = false;
        //Revisamos la opcion digita a travez de un switch
        switch (opcion){
            case 1 -> {// Agregar una persona a la lista
                System.out.print("Digite el nombre:");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telona:");
                var tel = entrada.nextLine();
                System.out.print("Digite el correo:");
                var email = entrada.nextLine();
                //Creamos el objeto persona 
                personas.add(persona);
                System.out.println("La lista tine:" +personas.size()+"elementos");
            }//Fin caso 1
            case 2 ->{//Listar a las personas
                System.out.println("Listado de personas:");
                //Mejoras con lambda y el metodo de referencia
                //Personas.forEach((persona) -> System.out.println(persona))
                persona.forEach(System.out::println);
            }//Fin del caso 2
            case 3 -> {//Salir  del ciclo
                System.out.println("Hasta Pronto...");
                salir = true
            }//Fin del caso 3
            default -> System.out.println("Opcion incorrecta:" + opcion);
        } //Fin del switch
        return salir;
    }//FIn del metodo ejecutarOperacion
    }// Fin de la clase listadoPersonaApp