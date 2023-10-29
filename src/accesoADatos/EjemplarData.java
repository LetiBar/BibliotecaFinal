package accesoADatos;

import entidades.Ejemplar;
import entidades.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EjemplarData {

    private Connection con = null;
    private Libro libro;
    private LibroData ld = new LibroData();

    public EjemplarData() {
        con = Conexion.getConexion();
    }

    //AGREGAR EJEMPLAR
    public void agregarEjemplar(Ejemplar ejem) {
        String sql = "INSERT INTO ejemplar (idLibro, stock, estado) "
                + "VALUES(?,?,?)";

        try {
            //Para generar el ps usamos la conexion(con). Pasamos sentencia sql 
            //y usamos la constante RETURN_GENERATED_KEYS
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, ejem.getLibro().getIdLibro());
            ps.setInt(2, ejem.getStock());
            ps.setBoolean(3, ejem.isActivo());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                // Al ejemplar (ejem) le seteamos el idEjemplar, el que se 
                //encuentra en el ResultSet (rs) en la columna nº1 
                ejem.setIdEjemplar(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ejemplar registrado");

            }
            ps.close();

        } catch (SQLException ex) {
            // mensaje error al acceder a la tabla de la base de datos
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar " + ex);
        }

    }

    //CONSULTAR STOCK 
    public Ejemplar Stock(int idLibro) {
        // que preunte si es menor a =1 que ponga el estado en falso 
        String sql = "SELECT * FROM ejemplar WHERE idLibro = ?";
        Ejemplar ejemplar = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLibro);
            ResultSet rs = ps.executeQuery();

            System.out.println(rs);
            while (rs.next()) {
                ejemplar = new Ejemplar();

                ejemplar.setStock(rs.getInt("stock"));
            }
                // libro.setIsbn(rs.getInt("isbn"));
                ps.close();
           
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar " + ex);
        }
            return ejemplar;
        }
    


    //ACTUALIZAR EJEMPLAR
    public void actualizarEjemplar(int idLibro, int stock) {
        String sql = "UPDATE ejemplar SET stock = ? WHERE idLibro = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setInt(2, idLibro);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Ejemplar actualizado");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar " + ex);
        }
    }

    //ELIMINAR EJEMPLAR (BORRADO FISICO)
    public void eliminarEjemplar(int idEjemplar) {
        String sql = "DELETE FROM ejemplar WHERE idEjemplar = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEjemplar);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Ejemplar Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ejemplar con ese Id");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar" + ex);
        }
    }

    //BORRADO LOGICO
    //OBTENER EJEMPLAR POR LIBRO
    /*Este código ejecuta una consulta SQL para buscar un ejemplar en la base de datos por su ID.
    Si se encuentra un ejemplar con esa identificación, crea un objeto Ejemplar con los datos obtenidos
    y lo devuelve. Si no se encuentra un ejemplar con ese ID, devuelve null.
     */
    public Ejemplar obtenerEjemplarPorLibro(int idLibro) {
        Ejemplar ejemplar = null;
        // Consulta SQL para obtener un ejemplar por su ID
        String sql = "SELECT * FROM ejemplar WHERE idLibro = ? AND estado = 1";

        try {

            // Preparamos la sentencia SQL con el ID del ejemplar a obtener
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLibro);

            // Ejecutamos la consulta SQL
            ResultSet rs = ps.executeQuery();

            // Verificamos si se encontró un ejemplar
            if (rs.next()) {

                // Creamos un objeto Ejemplar con los datos obtenidos
                ejemplar = new Ejemplar();

                // Obtener los datos del ejemplar desde el ResultSet
                ejemplar.setIdEjemplar(rs.getInt("idEjemplar"));
                Libro lib = ld.buscarLibro(idLibro);
                ejemplar.setLibro(lib);
                ejemplar.setStock(rs.getInt("stock"));
                ejemplar.setActivo(rs.getBoolean("estado"));

            }

            // Cerramos la preparación de la sentencia y el ResultSet
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar " + ex);
        }

        return ejemplar;
    }

    //OBTENER EJEMPLAR
    public Ejemplar buscarEjemplar(int id) {

        String sql = "SELECT * FROM Ejemplar "
                + "WHERE idEjemplar = ? AND estado = 1";

        Ejemplar ejemplar = null;

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                ejemplar = new Ejemplar();
                ejemplar.setIdEjemplar(id);
                int idLibro = rs.getInt("idLibro");
                libro = ld.buscarLibro(idLibro);
                ejemplar.setLibro(libro);
                ejemplar.setStock(rs.getInt("stock"));
                ejemplar.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe un ejemplar con el Id indicado o no está activo");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar" + ex);

        }
        return ejemplar;

    }

//    //LISTAR EJEMPLARES
//    public List<Ejemplar> obtenerTodosLosEjemplares() {
//        List<Ejemplar> listaEjemplares = new ArrayList<>();
//       
//        String sql = "SELECT * FROM ejemplar";
//        try {
//           
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                Ejemplar ejemplar = new Ejemplar();
//                
//                ejemplar.setIdEjemplar(rs.getInt("idEjemplar"));
//                Libro lib = ld.buscarLibro(rs.getInt("idLibro"));
//                ejemplar.setLibro(lib);
//                ejemplar.setStock(rs.getInt("stock"));
//                ejemplar.setActivo(true);
//               
//                listaEjemplares.add(ejemplar);
//            }
//
//            ps.close();
//            
//        } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ejemplar " + ex); 
//        }
//
//        return listaEjemplares;
//    }
}
