
public class ListarPersonas {

  private String nombre;
  private String tel;
  private String email;
  private static int numeroPersonas = 0;
   
// Constructor vacio
  public Persona(){
      this.id = ++Persona.numeroPersonas;
  }
  // Constructor con parametro(sobrecarga de constructores)
  
  public Persona(String nombre, String tel, String emial){
      this();
      this.nombre = nombre;
      this.tel = tel;
      this.email = email;
  }

    @Override
    public String toString() {
        return "ListarPersonas{" + "nombre=" + nombre + ", tel=" + tel + ", email=" + email + '}';
    }
  
  public static void main(String[] args){
      Persona persona1 = new Persona("Juan Perez", "2617070701", "jperez@mail.com");
              System.out.println(persona1);
  }
}
