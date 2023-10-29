
package entidades;

import java.time.LocalDate;

public class Prestamo {
    private int idPrestamo;
    private Lector lector;
    private Ejemplar ejemplar;
    private LocalDate fechaPrestamo;
    private LocalDate fechaLimite;
    private LocalDate fechaDevolucion = null;
    private String observaciones;
   

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Lector lector, Ejemplar ejemplar, LocalDate fechaPrestamo, LocalDate fechaLimite, LocalDate fechaDevolucion, String observaciones) {
        this.idPrestamo = idPrestamo;
        this.lector = lector;
        this.ejemplar = ejemplar;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaLimite = fechaLimite;
        this.fechaDevolucion = fechaDevolucion;
        this.observaciones = observaciones;
       
    }

    public Prestamo(Lector lector, Ejemplar ejemplar, LocalDate fechaPrestamo, LocalDate fechaLimite, LocalDate fechaDevolucion, String observaciones) {
        this.lector = lector;
        this.ejemplar = ejemplar;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaLimite = fechaLimite;
        this.fechaDevolucion = fechaDevolucion;
        this.observaciones = observaciones;
       
    }

    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idPrestamo=" + idPrestamo + ", lector=" + lector + ", ejemplar=" + ejemplar + ", fechaPrestamo=" + fechaPrestamo + ", fechaLimite=" + fechaLimite + ", fechaDevolucion=" + fechaDevolucion + ", observaciones=" + observaciones + '}';
    }

   
    
}
