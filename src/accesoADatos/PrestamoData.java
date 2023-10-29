package accesoADatos;

import entidades.Ejemplar;
import entidades.Lector;
import entidades.Libro;
import entidades.Prestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PrestamoData {

    private Connection con = null;
    private LectorData lecData = new LectorData();
    private EjemplarData ejeData = new EjemplarData();
    private Lector lector;
    private Ejemplar ejemplar;
    private LibroData libData = new LibroData();

    public PrestamoData() {
        con = Conexion.getConexion();
    }

    //GUARDAR PRESTAMO
    public void guardarPrestamo(Prestamo prestamo) {
        String sql = "INSERT INTO prestamo (IdLector, IdEjemplar, fechaPrestamo, fechaLimite, observaciones) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            if (prestamo.getLector() != null && prestamo.getEjemplar() != null) {
                ps.setInt(1, prestamo.getLector().getIdLector());
                ps.setInt(2, prestamo.getEjemplar().getIdEjemplar());
                ps.setDate(3, java.sql.Date.valueOf(prestamo.getFechaPrestamo()));
                ps.setDate(4, java.sql.Date.valueOf(prestamo.getFechaLimite()));
                ps.setString(5, prestamo.getObservaciones());
            } else {
                JOptionPane.showMessageDialog(null, "Error: Lector o Ejemplar es nulo");
            }

            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Préstamo agregado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar el préstamo.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar el préstamo: " + ex.getMessage());
        }
    }

    //ACTUALIZAR PRESTAMO
    public void modificarPrestamo(int idPrestamo, LocalDate nuevaFechaPrestamo, LocalDate nuevaFechaLimite, String nuevasObservaciones) {
        String sql = "UPDATE prestamo SET fechaPrestamo=?, fechaLimite=?, observaciones=? WHERE idPrestamo=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, java.sql.Date.valueOf(nuevaFechaPrestamo));
            ps.setDate(2, java.sql.Date.valueOf(nuevaFechaLimite));
            ps.setString(3, nuevasObservaciones);
            ps.setInt(4, idPrestamo);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Préstamo modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el préstamo.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el préstamo: " + ex.getMessage());
        }
    }
    
    public void devolucion(int idPrestamo, LocalDate FechaDevolucion, String nuevasObservaciones) {
        String sql = "UPDATE prestamo SET fechaDevolucion=?, observaciones=? WHERE idPrestamo=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

           
            ps.setDate(1, java.sql.Date.valueOf(FechaDevolucion));
            ps.setString(2, nuevasObservaciones);
            ps.setInt(3, idPrestamo);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Préstamo modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el préstamo.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el préstamo: " + ex.getMessage());
        }
    }
    
    public void devolucion(int idPrestamo, LocalDate FechaDevolucion) {
        String sql = "UPDATE prestamo SET fechaDevolucion=?, observaciones=? WHERE idPrestamo=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setDate(1, java.sql.Date.valueOf(FechaDevolucion));
            ps.setInt(2, idPrestamo);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Préstamo modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el préstamo.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el préstamo: " + ex.getMessage());
        }
    }

    //ELIMINAR PRESTAMO (BORRADO FISICO)
    public void eliminarPrestamo(int idLector, int idEjemplar) {
        String sql = "DELETE FROM prestamo WHERE idLector = ? AND idEjemplar = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idLector);
            ps.setInt(2, idEjemplar);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Prestamo Eliminado");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo");
        }
    }

    //OBTENER PRESTAMOS
    public List<Prestamo> obtenerPrestamo() {
        ArrayList<Prestamo> prestados = new ArrayList<>();
        String sql = "SELECT * FROM prestamo";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Dentro de while usamos el constructor vacio de Prestamo:
                //Creamos un objeto Prestamo
                Prestamo presta = new Prestamo();

                //Vamos a setear los datos en base a los que devolvio el ResulSet
                presta.setIdPrestamo(rs.getInt("idPrestamo"));//Seteamos el id
                Lector lecto = lecData.buscarLectorPorId(rs.getInt("idLector"));//Recuperamos el Lector
                Ejemplar ejempla = ejeData.buscarEjemplar(rs.getInt("idEjemplar"));//Recuperamos el Ejemplar
                presta.setLector(lecto);//Seteamos al prestamo el lector que acabamos de recuperar
                presta.setEjemplar(ejempla);//Seteamos al prestamo el ejemplar que acabamos de recuperar
                presta.setFechaPrestamo(rs.getDate("fechaPrestamo").toLocalDate());
                presta.setFechaLimite(rs.getDate("fechaLimite").toLocalDate());
                presta.setFechaDevolucion(rs.getDate("fechaDevolucion").toLocalDate());
                presta.setObservaciones(rs.getString("Observaciones"));

                //Armado el prestamo lo agregamos a nuestra lista prestados
                prestados.add(presta);
                //Nota: Por cada prestamo que tenga en el ResultSet recupero los datos,+
                //los seteamos y lo guardamos en el ArrayList (prestados)
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo " + ex);
        }

        return prestados;

    } 
    
    public List<Prestamo> obtenerPrestamosSinDevolver() {
        ArrayList<Prestamo> prestados = new ArrayList<>();
        String sql = "SELECT * FROM prestamo WHERE fechaDevolucion IS null ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Dentro de while usamos el constructor vacio de Prestamo:
                //Creamos un objeto Prestamo
                Prestamo presta = new Prestamo();

                //Vamos a setear los datos en base a los que devolvio el ResulSet
                presta.setIdPrestamo(rs.getInt("idPrestamo"));//Seteamos el id
                Lector lecto = lecData.buscarLectorPorId(rs.getInt("idLector"));//Recuperamos el Lector
                Ejemplar ejempla = ejeData.buscarEjemplar(rs.getInt("idEjemplar"));//Recuperamos el Ejemplar
                presta.setLector(lecto);//Seteamos al prestamo el lector que acabamos de recuperar
                presta.setEjemplar(ejempla);//Seteamos al prestamo el ejemplar que acabamos de recuperar
                presta.setFechaPrestamo(rs.getDate("fechaPrestamo").toLocalDate());
                presta.setFechaLimite(rs.getDate("fechaLimite").toLocalDate());
                presta.setObservaciones(rs.getString("Observaciones"));

                //Armado el prestamo lo agregamos a nuestra lista prestados
                prestados.add(presta);
                //Nota: Por cada prestamo que tenga en el ResultSet recupero los datos,+
                //los seteamos y lo guardamos en el ArrayList (prestados)
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo " + ex);
        }

        return prestados;

    } 
    
    public List<Prestamo> obtenerPrestamosPorLector(int idLector) {
        ArrayList<Prestamo> prestados = new ArrayList<>();
        String sql = "SELECT *FROM prestamo WHERE idLector = ? ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLector);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Dentro de while usamos el constructor vacio de Prestamo:
                //Creamos un objeto Prestamo
                Prestamo presta = new Prestamo();

                //Vamos a setear los datos en base a los que devolvio el ResulSet
                presta.setIdPrestamo(rs.getInt("idPrestamo"));//Seteamos el id
                Lector lecto = lecData.buscarLectorPorId(rs.getInt("idLector"));//Recuperamos el Lector
                Ejemplar ejempla = ejeData.buscarEjemplar(rs.getInt("idEjemplar"));//Recuperamos el Ejemplar
                presta.setLector(lecto);//Seteamos al prestamo el lector que acabamos de recuperar
                presta.setEjemplar(ejempla);//Seteamos al prestamo el ejemplar que acabamos de recuperar
                presta.setFechaPrestamo(rs.getDate("fechaPrestamo").toLocalDate());
                presta.setFechaLimite(rs.getDate("fechaLimite").toLocalDate());
               // presta.setFechaDevolucion(rs.getDate("fechaDevolucion").toLocalDate());
                presta.setObservaciones(rs.getString("Observaciones"));

                //Armado el prestamo lo agregamos a nuestra lista prestados
                prestados.add(presta);
                //Nota: Por cada prestamo que tenga en el ResultSet recupero los datos,+
                //los seteamos y lo guardamos en el ArrayList (prestados)
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo " + ex);
        }

        return prestados;

    } 

    public List<Prestamo> obtenerPrestamosPorLectorSinDevolucion(int dni) {
        ArrayList<Prestamo> prestados = new ArrayList<>();
        String sql = "SELECT *FROM prestamo JOIN lector ON (prestamo.idLector = lector.idLector)"
                + " WHERE dni = ? AND fechaDevolucion IS null";
//      "SELECT * FROM prestamo JOIN lector ON (prestamo.idLector = lector.idLector)\n" +
//        "WHERE apellido LIKE '%"+apellidoLector+"%' ";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                //Dentro de while usamos el constructor vacio de Prestamo:
                //Creamos un objeto Prestamo
                Prestamo presta = new Prestamo();

                //Vamos a setear los datos en base a los que devolvio el ResulSet
                presta.setIdPrestamo(rs.getInt("idPrestamo"));//Seteamos el id
                Lector lecto = lecData.buscarLectorPorId(rs.getInt("idLector"));//Recuperamos el Lector
                Ejemplar ejempla = ejeData.buscarEjemplar(rs.getInt("idEjemplar"));//Recuperamos el Ejemplar
                presta.setLector(lecto);//Seteamos al prestamo el lector que acabamos de recuperar
                presta.setEjemplar(ejempla);//Seteamos al prestamo el ejemplar que acabamos de recuperar
                presta.setFechaPrestamo(rs.getDate("fechaPrestamo").toLocalDate());
                presta.setFechaLimite(rs.getDate("fechaLimite").toLocalDate());
                presta.setObservaciones(rs.getString("Observaciones"));

                //Armado el prestamo lo agregamos a nuestra lista prestados
                prestados.add(presta);
                //Nota: Por cada prestamo que tenga en el ResultSet recupero los datos,+
                //los seteamos y lo guardamos en el ArrayList (prestados)
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo " + ex);
        }

        return prestados;

    } 
    
    public Prestamo obtenerPrestamo(int idPrestamo) {
        Prestamo presta = new Prestamo();
        String sql = "SELECT *FROM prestamo WHERE idPrestamo = ? ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPrestamo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               
                //Vamos a setear los datos en base a los que devolvio el ResulSet
                presta.setIdPrestamo(rs.getInt("idPrestamo"));//Seteamos el id
                Lector lecto = lecData.buscarLectorPorId(rs.getInt("idLector"));//Recuperamos el Lector
                Ejemplar ejempla = ejeData.buscarEjemplar(rs.getInt("idEjemplar"));//Recuperamos el Ejemplar
                presta.setLector(lecto);//Seteamos al prestamo el lector que acabamos de recuperar
                presta.setEjemplar(ejempla);//Seteamos al prestamo el ejemplar que acabamos de recuperar
                presta.setFechaPrestamo(rs.getDate("fechaPrestamo").toLocalDate());
                presta.setFechaLimite(rs.getDate("fechaLimite").toLocalDate());
                presta.setFechaDevolucion(rs.getDate("fechaDevolucion").toLocalDate());
                presta.setObservaciones(rs.getString("Observaciones"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo " + ex);
        }

        return presta;

    }    
    
    public Prestamo obtenerPrestamosSinDevolver(int idPrestamo) {
        Prestamo presta = new Prestamo();
        String sql = "SELECT *FROM prestamo WHERE idPrestamo = ? ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPrestamo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               
                //Vamos a setear los datos en base a los que devolvio el ResulSet
                presta.setIdPrestamo(rs.getInt("idPrestamo"));//Seteamos el id
                Lector lecto = lecData.buscarLectorPorId(rs.getInt("idLector"));//Recuperamos el Lector
                Ejemplar ejempla = ejeData.buscarEjemplar(rs.getInt("idEjemplar"));//Recuperamos el Ejemplar
                presta.setLector(lecto);//Seteamos al prestamo el lector que acabamos de recuperar
                presta.setEjemplar(ejempla);//Seteamos al prestamo el ejemplar que acabamos de recuperar
                presta.setFechaPrestamo(rs.getDate("fechaPrestamo").toLocalDate());
                presta.setFechaLimite(rs.getDate("fechaLimite").toLocalDate());
                presta.setObservaciones(rs.getString("Observaciones"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo " + ex);
        }

        return presta;

    }     
    
    public List<Prestamo> obtenerPrestamosPorLector(String apellidoLector) {
        ArrayList<Prestamo> librosPrestados = new ArrayList<>();

        String sql = "SELECT * FROM prestamo JOIN lector ON (prestamo.idLector = lector.idLector)\n" +
        "WHERE apellido LIKE '%"+apellidoLector+"%' ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, apellidoLector);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Prestamo prestamo = new Prestamo();

                prestamo.setIdPrestamo(rs.getInt("idPrestamo"));//Seteamos el id
                Ejemplar ejemplar = ejeData.buscarEjemplar(rs.getInt("idEjemplar"));//Recuperamos el Ejemplar
                Lector lector = lecData.buscarLectorPorId(rs.getInt("idLector"));//Recuperamos la Lector
                prestamo.setEjemplar(ejemplar);//Seteamos el prestamo del ejemplar que acabamos de recuperar
                prestamo.setLector(lector);//Seteamos el prestamo del lector que acabamos de recuperar

                Date fechaPrestamo = rs.getDate("fechaPrestamo");
                if (fechaPrestamo != null) {
                    prestamo.setFechaPrestamo(fechaPrestamo.toLocalDate());
                }

                Date fechaLimite = rs.getDate("fechaLimite");
                if (fechaLimite != null) {
                    prestamo.setFechaLimite(fechaLimite.toLocalDate());
                }

                Date fechaDevolucion = rs.getDate("fechaDevolucion");
                if (fechaDevolucion != null) {
                    prestamo.setFechaDevolucion(fechaDevolucion.toLocalDate());
                }
                
                prestamo.setObservaciones(rs.getString("observaciones"));

                // Agregamos el préstamo a la lista librosPrestados
                librosPrestados.add(prestamo);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo: " + ex);
        }

        return librosPrestados;
    }

//    //LISTAR EJEMPLARES POR LECTOR
    public List<Ejemplar> obtenerEjemplarxLector(int idLector) {
        List<Ejemplar> ejemplares = new ArrayList<>();

        String sql = "SELECT p.idEjemplar FROM prestamo p "
                + "WHERE p.idLector = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLector);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idEjemplar = rs.getInt("idEjemplar");
                Ejemplar ejemplar = ejeData.buscarEjemplar(idEjemplar);
                ejemplares.add(ejemplar);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo: " + ex);
        }
        return ejemplares;
    }

    //LISTAR LIBROS POR LECTOR
    public List<Libro> obtenerLibrosxLector(int idLector) {
        List<Libro> librosPrestados = new ArrayList<>();
        String sql = "SELECT DISTINCT l.* "
                + "FROM prestamo p "
                + "INNER JOIN ejemplar e ON p.idEjemplar = e.idEjemplar "
                + "INNER JOIN libro l ON e.idLibro = l.idLibro "
                + "WHERE p.idLector = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLector);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Libro libro = new Libro();
                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setGenero(rs.getString("genero"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setActivo(rs.getBoolean("estado"));

                librosPrestados.add(libro);
            }

            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return librosPrestados;
    }

    //AGREGAR PRESTAMO
    public void agregarPrestamo(int idLector, int idEjemplar, LocalDate fechaPrestamo) {
        try {
            Lector lector = lecData.buscarLectorPorId(idLector);
            Ejemplar ejemplar = ejeData.buscarEjemplar(idEjemplar);

            // Calculamos la fecha límite sumando 5 días a la fecha de préstamo
            LocalDate fechaLimite = fechaPrestamo.plusDays(5);
// Creamos una instancia de Prestamo con fechaDevolucion vacía
            //Para ello es necesario crear un constructor:
            //'public Prestamo(Lector lector, Ejemplar ejemplar, LocalDate fechaPrestamo, LocalDate fechaLimite, Object object)'
//            Prestamo prestamo = new Prestamo(lector, ejemplar, fechaPrestamo, fechaLimite);
//
//            // Llamamos al método guardarPrestamo para guardar el préstamo en la base de datos
//            guardarPrestamo(prestamo);

            JOptionPane.showMessageDialog(null, "Préstamo registrado con éxito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el préstamo: " + e.getMessage());
        }
    }

}
      






    
    




