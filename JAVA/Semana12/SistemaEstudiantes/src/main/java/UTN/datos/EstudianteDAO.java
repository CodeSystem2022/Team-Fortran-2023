package UTN.datos;

import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //MÉTODO LISTAR
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        //creo objetos para comunicarme con la bd
        PreparedStatement ps; //envia la query
        ResultSet rs; //obtiene el resultado de la consulta
        //creo objeto conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try{
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                estudiantes.add(estudiante);
            }
        } catch (Exception e){
            System.out.println("Error al seleccionar datos " + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
        return estudiantes;
    }

    //Buscar estudiante por id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;
            }
        }catch (Exception e){
            System.out.println("Error al buscar estudiante: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("No se pudo cerrar la conexion: " + e.getMessage());
            }

        }
        return  false;
    }

    //agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute(); //solo vamos a insertar info, por eso no va el executequery porque NO es lectura
            return true;
        }catch (Exception e){
            System.out.println("Error al agregar estudiante: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("No se pudo cerrar la conexion: " + e.getMessage());
            }
        }
        return  false;
    }

    //Modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute(); //solo vamos a modificar info, por eso no va el executequery porque NO es lectura
            return true;
        }catch (Exception e){
            System.out.println("Error al modificar estudiante: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("No se pudo cerrar la conexion: " + e.getMessage());
            }
        }
        return  false;
    }





        public static void main(String[] args) {
        var estudianteDao = new EstudianteDAO();

        //BUSCAR POR ID (COMENTAR PARA EJECUTAR)
        /*var estudiante1 = new Estudiante(1);
        System.out.println("Estudiante antes de la busqueda: " + estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if(encontrado)
            System.out.println("Estudiante encontrado: " + estudiante1);
        else System.out.println("No se encontro el estudiante:" + estudiante1.getIdEstudiante());*/


        //Aregar estudiante (COMENTAR PARA EJECUTAR)
        /*var nuevoEstudiante = new Estudiante("roman", "riquelme", "36585658", "roman@boca.com");
        var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        if(agregado)
            System.out.println("estudiante agregado --> " + nuevoEstudiante);
        else
            System.out.println("no se agregó nada--> " + nuevoEstudiante);*/

        //Modificar estudiante (COMENTAR PARA EJECUTAR)
        var estudianteModificado = new Estudiante(1,"guillermo", "barros", "123585655", "mellizo@boca.com");
        var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        if(modificado)
            System.out.println("estudiante modificado --> " + estudianteModificado);
        else
            System.out.println("no se modificó nada--> " + estudianteModificado);

            //Listar los estudiantes
            System.out.println("Listado de estudiantes");
            List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
            estudiantes.forEach(System.out::println); //Funcion lambda para imprimir
    }
}
