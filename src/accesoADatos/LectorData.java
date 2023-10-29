
package accesoADatos;

import entidades.Ejemplar;
import entidades.Lector;
import entidades.Libro;
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

public class LectorData {
    
    private Connection con = null;
    
    public LectorData(){
        con = Conexion.getConexion();
}
   //GUARDAR LECTOR
    public void guardarLector(Lector lector){
        String sql = "INSERT INTO lector (apellido, nombre, dni, fechaNacimiento, direccion, telefono, mail, estado) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, lector.getApellido());
            ps.setString(2, lector.getNombre());
            ps.setInt(3, lector.getDni());
            ps.setDate(4, Date.valueOf(lector.getFechaNac()));
            ps.setString(5, lector.getDireccion());
            ps.setInt(6, lector.getTelefono());
            ps.setString(7, lector.getMail());
            ps.setBoolean(8, lector.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                lector.setIdLector(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Nuevo Socio Guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  tabla 1" + ex.getMessage());
        }              
    }
    
    //LISTAR LECTORES
    public List<Lector> listarLectores(){
        String sql = "SELECT * FROM lector WHERE estado = 1";
        ArrayList <Lector> lectores = new ArrayList<>();      
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {

               Lector lector = new Lector();
               
               lector.setIdLector(rs.getInt("idLector"));
               lector.setApellido(rs.getString("apellido"));
               lector.setNombre(rs.getString("nombre"));
               lector.setDni(rs.getInt("dni"));
               lector.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               lector.setDireccion(rs.getString("direccion"));
               lector.setTelefono(rs.getInt("telefono"));
               lector.setMail(rs.getString("mail"));
               lector.setActivo(rs.getBoolean("estado"));
               
               lectores.add(lector);               
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  tabla 2" + ex);
        }        
        return lectores;
    }
    
    //MODIFICAR LECTOR
    public void modificarLector(Lector lector){
        
        String sql = "UPDATE lector SET apellido = ?, nombre = ?, dni = ?, fechaNacimiento = ?, direccion = ?, telefono = ?, mail = ? "
                + "WHERE idLector = ?";
      
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setString(1, lector.getApellido());
            ps.setString(2, lector.getNombre());
            ps.setInt(3, lector.getDni());
            ps.setDate(4, Date.valueOf(lector.getFechaNac()));
            ps.setString(5, lector.getDireccion());
            ps.setInt(6, lector.getTelefono());
            ps.setString(7, lector.getMail());
            ps.setInt(8, lector.getIdLector());
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "El lector ha sido modificado.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  tabla 3 " +ex.getMessage());
        }       
    }
    
    //ELIMINAR LECTOR
    public void eliminarLector(int id){
    String sql = "UPDATE lector SET estado = 0 WHERE idLector = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Lector Eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  tabla 4");
        }
    }
    
    //BUSCAR LECTOR POR ID
    public Lector buscarLectorPorId(int id) {
        String sql = "SELECT * FROM lector WHERE idLector = ? AND estado = 1";
        //Fuera de try - catch creamos una variable: 
        Lector lector = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //Dentro de if creamos un objeto alumno con la variable alumno:
                lector = new Lector(); // Estamos usando el contructor vacío de alumno
                //Vamos a setear los datos en base a los que devolvio el ResulSet
                lector.setIdLector(id);
                lector.setApellido(rs.getString("apellido"));
                lector.setNombre(rs.getString("nombre"));
                lector.setDni(rs.getInt("dni"));
                lector.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                lector.setDireccion("direccion");
                lector.setTelefono(rs.getInt("telefono"));
                lector.setMail(rs.getString("mail"));
                lector.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el lector");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  tabla 5 ");
        }
        return lector;
    }
    
   
    //BUSCAR LECTOR POR DNI
    public Lector buscarLectorPorDni(int dni) {
        String sql = "SELECT * FROM lector WHERE dni = ? AND estado = 1";
        Lector lector = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lector = new Lector();
                lector.setIdLector(rs.getInt("idLector"));
                lector.setNombre(rs.getString("nombre"));
                lector.setApellido(rs.getString("apellido"));
                lector.setDni(rs.getInt("dni"));
                lector.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                lector.setDireccion(rs.getString("direccion"));
                lector.setTelefono(rs.getInt("telefono"));
                lector.setMail(rs.getString("mail"));
                lector.setActivo(true);
             } 
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  tabla 6");
        }
        return lector;
    }
   
    
    //BUSCAR LECTOR POR APELLIDO
    public Lector buscarLectorPorApellido(String apellido) {
        String sql = "SELECT * FROM lector WHERE apellido = ? AND estado = 1";
        //Fuera de try - catch creamos una variable: 
        Lector lector = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, apellido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //Dentro de if creamos un objeto alumno con la variable alumno:
                lector = new Lector(); // Estamos usando el contructor vacío de alumno
                //Vamos a setear los datos en base a los que devolvio el ResulSet
                lector.setIdLector(rs.getInt("idLector"));
                lector.setApellido(apellido);
                lector.setNombre(rs.getString("nombre"));
                lector.setDni(rs.getInt("dni"));
                lector.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                lector.setDireccion("direccion");
                lector.setTelefono(rs.getInt("telefono"));
                lector.setMail(rs.getString("mail"));
                lector.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el lector");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error tabla 7" + ex);
        }
        return lector;
    }
}
