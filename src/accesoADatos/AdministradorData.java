
package accesoADatos;

import entidades.Administrador;
import entidades.Lector;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdministradorData {
    private Connection con = null;
    
    public AdministradorData(){
        con = Conexion.getConexion();
}
    
    public void registrarAdmin(Administrador administrador){
        String sql = "INSERT INTO administrador (usuario, pass) "
                + "VALUES (?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, administrador.getUsuario());
            ps.setString(2, administrador.getPass());
            
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                administrador.setUsuario(rs.getString(1));
                JOptionPane.showMessageDialog(null, "Registro válido");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }              
    }
    
    public Administrador inicioSesion(String usuario, String pass) {
    String sql = "SELECT * FROM administrador WHERE usuario = ? AND pass = ?";
    
    Administrador admin = null;
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            admin = new Administrador(); // Usando el constructor vacío de Administrador
            admin.setUsuario(usuario);
            admin.setPass(pass);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex);
    }
    
    return admin; // Devuelve el objeto Administrador si las credenciales son válidas, o null si son incorrectas.
}
}