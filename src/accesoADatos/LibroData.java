package accesoADatos;

import entidades.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LibroData {

    private Connection con = null;

    public LibroData() {
        con = Conexion.getConexion();
    }

    //GUARDAR LIBRO
    public void guardarLibro(Libro libro) {
        String sql = "INSERT INTO libro (isbn, titulo, autor, genero, editorial, estado) "
                + "VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, libro.getIsbn());
            ps.setString(2, libro.getTitulo());
            ps.setString(3, libro.getAutor());
            ps.setString(4, libro.getGenero());
            ps.setString(5, libro.getEditorial());
            ps.setBoolean(6, libro.isActivo());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                libro.setIdLibro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Nuevo libro Guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro. ");
        }
    }

    //LISTAR LIBROS
    public List<Libro> listarLibros() {
        String sql = "SELECT idLibro, isbn, titulo, autor, editorial, genero, estado FROM libro WHERE estado = 1";
        ArrayList<Libro> libros = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Libro libro = new Libro();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setGenero(rs.getString("genero"));
                libro.setActivo(rs.getBoolean("estado"));

                libros.add(libro);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro. ");
        }
        return libros;
    }
    
    //LISTAR LIBROS POR TITULO
    public List<Libro> librosPorTitulo() {
    // Realiza una consulta SQL para obtener los libros ordenados por título
    String sql = "SELECT * FROM libro ORDER BY titulo";
    List<Libro> libros = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(sql);
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
            libros.add(libro);
        }
       
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro.");
    }

    return libros;
}
    
    //FILTRAR LIBROS POR TITULO
    public List<Libro> filtrarLibrosPorTitulo(String titulo) {
    // Realiza una consulta SQL para obtener los libros filtrados por título
    String sql = "SELECT * FROM libro WHERE titulo LIKE ?";
    List<Libro> librosFiltrados = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "%" + titulo + "%"); // Utiliza "%" para buscar títulos que contengan el texto ingresado
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
            librosFiltrados.add(libro);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro.");
    }

    return librosFiltrados;
}
    
    //FILTRAR POR AUTOR
    public List<Libro> filtrarLibrosPorAutor(String autor) {
    // Realiza una consulta SQL para obtener los libros filtrados por autor
    String sql = "SELECT * FROM libro WHERE autor LIKE ?";
    List<Libro> libroFiltrado = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "%" + autor + "%"); // Utiliza "%" para buscar autores que contengan el texto ingresado
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
            libroFiltrado.add(libro);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro.");
    }

    return libroFiltrado;
}    

    //MODIFICAR LIBRO
    public void modificarLibro(Libro libro) {

        String sql = "UPDATE libro SET isbn = ?, titulo = ?, autor = ?, genero = ?, editorial = ? "
                + "WHERE idLibro = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, libro.getIsbn());
            ps.setString(2, libro.getTitulo());
            ps.setString(3, libro.getAutor());
            ps.setString(4, libro.getGenero());
            ps.setString(5, libro.getEditorial());
            ps.setInt(6, libro.getIdLibro());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El libro ha sido modificado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro. ");
        }
    }

    //ELIMINAR DATOS DE LIBRO (BORRADO LOGICO)
    public void eliminarLibro(int id) {
        String sql = "UPDATE libro SET estado = 0 WHERE idLibro = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Libro Eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro");
        }
    }

    //BUSCAR LIBRO POR ID
    public Libro buscarLibro(int id) {
        String sql = "SELECT isbn, titulo, autor, genero, editorial FROM libro WHERE idLibro = ? AND estado = 1";
        //Fuera de try - catch creamos una variable: 
        Libro libro = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //Dentro de if creamos un objeto Libro con la variable libro:
                libro = new Libro(); // Estamos usando el contructor vacío de libro

                //Vamos a setear los datos en base a los que devolvio el ResulSet
                libro.setIdLibro(id);
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setGenero(rs.getString("genero"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese libro");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro");
        }
        return libro;
    }
    
     //BUSCAR LIBRO ELIMINADO POR ID
    public Libro buscarLibroEliminado(int id) {
        String sql = "SELECT isbn, titulo, autor, genero, editorial FROM libro WHERE idLibro = ? AND estado = 0";
        //Fuera de try - catch creamos una variable: 
        Libro libro = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //Dentro de if creamos un objeto Libro con la variable libro:
                libro = new Libro(); // Estamos usando el contructor vacío de libro

                //Vamos a setear los datos en base a los que devolvio el ResulSet
                libro.setIdLibro(id);
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setGenero(rs.getString("genero"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setActivo(false);

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese libro");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro");
        }
        return libro;
    }

    //BUSCAR LIBRO POR TITULO
    public List<Libro> buscarPorTitulo(String titulo) {
        String sql = "SELECT * FROM libro WHERE titulo LIKE '%" + titulo + "%'";
        ArrayList<Libro> libros = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Libro libro = new Libro();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setGenero(rs.getString("genero"));
                libro.setActivo(rs.getBoolean("estado"));

                libros.add(libro);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro. ");
        }
        return libros;
    }

    //BUSCAR LIBRO POR TITULO
    public Libro buscarPorTitulo_str(String titulo) {

        String sql = "SELECT * FROM libro WHERE titulo LIKE '%" + titulo + "%'";

        Libro libro = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                libro = new Libro();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setGenero(rs.getString("genero"));
                libro.setActivo(rs.getBoolean("estado"));

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro. ");
        }
        return libro;
    }
    
    public List<Libro> buscarPorAutor(String autor) {
        String sql = "SELECT * FROM libro WHERE autor LIKE '%" + autor + "%'";
        ArrayList<Libro> libros = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Libro libro = new Libro();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setGenero(rs.getString("genero"));
                libro.setActivo(rs.getBoolean("estado"));

                libros.add(libro);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro. ");
        }
        return libros;
    }

    //BUSCAR LIBRO POR EDITORIAL
    public List<Libro> buscarPorEditoral(String editorial) {
        String sql = "SELECT * FROM libro WHERE editorial LIKE '%" + editorial + "%'";
        ArrayList<Libro> libros = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Libro libro = new Libro();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setGenero(rs.getString("genero"));
                libro.setActivo(rs.getBoolean("estado"));

                libros.add(libro);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro. ");
        }
        return libros;
    }

    //BUSCAR LIBRO POR GENERO
    public List<Libro> buscarPorGenero(String genero) {
        String sql = "SELECT * FROM libro WHERE genero LIKE '%" + genero + "%'";
        ArrayList<Libro> libros = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Libro libro = new Libro();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setGenero(rs.getString("genero"));
                libro.setActivo(rs.getBoolean("estado"));

                libros.add(libro);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla libro. ");
        }
        return libros;
    }
}
