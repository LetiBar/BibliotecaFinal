package biblioteca_14;

import accesoADatos.EjemplarData;
import accesoADatos.LectorData;
import accesoADatos.LibroData;
import accesoADatos.PrestamoData;
import entidades.Ejemplar;
import entidades.Lector;
import entidades.Libro;
import entidades.Prestamo;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Biblioteca_14 {

    public static void main(String[] args) {

//EjemplarData
      //Instanciamos LibroData y EjemplarData  
//    LibroData ld = new LibroData();
//    EjemplarData ejemData = new EjemplarData();
//    
//    //Recuperamos un libro por su id
//    Libro lib = ld.buscarLibro(2);
//    
//    //Una vez que tenemos el libro creamos un ejemplar
//    Ejemplar ejemp = new Ejemplar(lib, 7, true);
////    
////    //GUARDAR EJEMPLAR
//    ejemData.agregarEjemplar(ejemp);
//    
//      //MODIFICAR EJEMPLAR
//       ejemData.actualizarEjemplar(5, 30);
//    
//      //ELIMINAR EJEMPLAR
//       ejemData.eliminarEjemplar(2);
    
//      //OBTENER EJEMPLAR POR ID
//        ejemData.obtenerEjemplarPorLibro(3);
//        System.out.println(ejemData.obtenerEjemplarPorLibro(3));
//    
        //LISTAR TODOS LOS EJEMPLARES
        //ejemData.obtenerTodosLosEjemplares();
    
    
    
// //prestamoData
       //INSTANCIAMOS LECTORDATA, EJEMPLAR DATA Y PRESTAMODATA
      LectorData ld = new LectorData();
       EjemplarData ed = new EjemplarData();
//       PrestamoData pd = new PrestamoData();
       //Recuperamos un lector por su id
      Lector lect = ld.buscarLectorPorId(2);
//        System.out.println(lect);
//        System.out.println(lect.getIdLector());
       //Recuperamos un ejemplar por su id
       Ejemplar ejem = ed.buscarEjemplar(5);

       //Creamos un objeto Prestamo
       Prestamo prestamo = new Prestamo(lect, ejem, LocalDate.of(2023, 10, 12), LocalDate.of(2023, 10, 15), LocalDate.of(2023, 10, 13), "Sin novedad");

       //Instanciar la clase PrestamoData para acceder a su método guardarPrestamo
       PrestamoData prestamoData = new PrestamoData();

       //GUARDAR PRESTAMO
       prestamoData.guardarPrestamo(prestamo);

           
//        //MODIFICAR PRESTAMO
//        PrestamoData pd = new PrestamoData(); // Asegúrate de tener una instancia de PrestamoData
//
//        int idPrestamo = 6; // Reemplaza con el ID del préstamo que deseas modificar
//        LocalDate nuevaFechaPrestamo = LocalDate.of(2023, 10, 20); // Reemplaza con la nueva fecha de préstamo
//        LocalDate nuevaFechaDevolucion = LocalDate.of(2023, 10, 30); // Reemplaza con la nueva fecha de devolución
//        String nuevasObservaciones = "Observaciones modificadas"; // Reemplaza con las nuevas observaciones
//
//        pd.modificarPrestamo(idPrestamo, nuevaFechaPrestamo, nuevaFechaDevolucion, nuevasObservaciones);
        
//        ELIMINAR PRESTAMO
//        pd.eliminarPrestamo(1, 3);
//        
        //OBTENER PRESTAMOS 
//       pd.obtenerPrestamo();
//        for (Prestamo prestamo : pd.obtenerPrestamo()) {
//           
//            System.out.println("id del Prestamo: " + prestamo.getIdPrestamo());
//            System.out.println("id del Lector: " + prestamo.getLector().getIdLector());
//            System.out.println("id del Ejemplar: " + prestamo.getEjemplar().getIdEjemplar());
//            System.out.println("Fecha de Prestamo: " + prestamo.getFechaPrestamo());
//            System.out.println("Fecha de Limite: " + prestamo.getFechaLimite());
//            System.out.println("Fecha de Devolucion: " + prestamo.getFechaDevolucion());
//            System.out.println("Observaciones: " + prestamo.getObservaciones());
//            System.out.println("----------------------");
//        }
//        
//    }
        //OBTENER PRESTAMOS POR LECTOR
//        for (Prestamo prestamo : pd.obtenerPrestamosPorLector(1)) {
//            
//            System.out.println("id del Prestamo: " + prestamo.getIdPrestamo());
//            System.out.println("id del Lector: " + prestamo.getLector().getIdLector());
//            System.out.println("id del Ejemplar: " + prestamo.getEjemplar().getIdEjemplar());
//            System.out.println("Fecha de Prestamo: " + prestamo.getFechaPrestamo());
//            System.out.println("Fecha de Limite: " + prestamo.getFechaLimite());
//            System.out.println("Fecha de Devolucion: " + prestamo.getFechaDevolucion());
//            System.out.println("----------------------");
//        }
//        
//        //OBTENER EJEMPLARES POR LECTOR
//        // ID del lector para el cual deseas obtener los ejemplares
//      //  int idLector = 1; // Reemplaza con el ID correcto
//
//        // Llamar al método para obtener los ejemplares
//        List<Ejemplar> ejemplares = pd.obtenerEjemplarxLector(1);
//
//        // Manejar los resultados (ejemplares)
//        for (Ejemplar ejemplar : ejemplares) {
//        // Realiza acciones con cada ejemplar
//        System.out.println("id del Ejemplar: " + ejemplar.getIdEjemplar());
////        System.out.println("Título del libro: " + ejemplar.getLibro().getTitulo());
//        System.out.println("Stock del ejemplar: " + ejemplar.getStock());
//        System.out.println("Activo del ejemplar: " + ejemplar.isActivo());
//}
//        
////        //OBTENER LIBROS PRESTADOS POR LECTOR
////           // Especifica el ID del lector para el que deseas obtener los libros
//        int idLector = 1; // Reemplaza con el ID del lector que desees
//
//        // Llama al método obtenerLibrosxLector para obtener la lista de libros
//        List<Libro> librosPrestados = pd.obtenerLibrosxLector(idLector);
//
//        // Imprime los libros prestados
//        System.out.println("Libros prestados al lector con ID " + idLector + ":");
//        for (Libro libro : librosPrestados) {
//            System.out.println("id del Libro: " + libro.getIdLibro());
//            System.out.println("ISBN: " + libro.getIsbn());
//            System.out.println("Título: " + libro.getTitulo());
//            System.out.println("Autor: " + libro.getAutor());
//            System.out.println("Género: " + libro.getGenero());
//            System.out.println("Editorial: " + libro.getEditorial());
//            System.out.println("Activo: " + libro.isActivo());
//            System.out.println();
//        }


//INSANCIAR LECTOR Y LECTORDATA
  //      LectorData lecData = new LectorData();
       // Lector lector = new Lector(2, "Gomez", "Pedro", 28353654, LocalDate.of(1980, 02, 12), "Alberdi 456", 280456235, "pedroGomez@gmail.com", true);

//GUARDAR NUEVO LECTOR
        //lecData.guardarLector(lector);
        
       //MODIFOCAR LECTOR
        //lecData.modificarLector(lector);
       
       //LISTAR LECTORES
//        for (Lector lector : lecData.listarLectores()) {
//            System.out.println(lector.toString());
//        }

       //ELIMINAR LECTOR
        //lecData.eliminarLector(2);
        
        //BUSCAR LECTOR POR ID
    //    System.out.println(lecData.buscarLectorPorId(1));
        
   //     BUSCAR LECTOR POR dni
   //     System.out.println(lecData.buscarLectorPorDni(26907605));    
        
        //BUSCAR LECTOR POR APELLIDO
        //System.out.println(lecData.buscarLectorPorApellido("perez"));


    
    
//    //PRESTAMO
//    PrestamoData prestamoD = new PrestamoData();
//    Prestamo prestam = new Prestamo();
//    
//    for (Prestamo p : prestamoD.obtenerPrestamo()) { 
//            System.out.println(p);
//    
//}
}

}



    




    
  

        
    


    