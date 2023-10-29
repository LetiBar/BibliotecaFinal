/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import accesoADatos.EjemplarData;
import accesoADatos.LectorData;
import accesoADatos.LibroData;
import accesoADatos.PrestamoData;
import entidades.Ejemplar;
import entidades.Lector;
import entidades.Libro;
import entidades.Prestamo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asdasd
 */
public class VentanaGenerarPrestamo extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form Vista_Prestar_libro
     */
    public VentanaGenerarPrestamo() {

        setLocationRelativeTo(this);

        initComponents();
       // cargarCobmo();
        // BORRAR scaner();

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtLibro = new javax.swing.JTextField();
        jdcFechaPrestamo = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlector = new javax.swing.JTextField();
        jBPrestar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxtObservaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jdcFechaLimite = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtStock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Libro");

        jLabel2.setText("Fecha Prestamo");

        jLabel4.setText("Lector");

        jlector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlectorActionPerformed(evt);
            }
        });

        jBPrestar.setText("Prestar");
        jBPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrestarActionPerformed(evt);
            }
        });

        jLabel5.setText("Comentarios");

        jLabel6.setText("Fecha limite");

        jLabel7.setText("PRESTAMOS DATA");

        jLabel8.setText("Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(281, 281, 281)
                            .addComponent(jLabel7))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel5))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jdcFechaLimite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdcFechaPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addComponent(jtxtLibro)
                                .addComponent(jlector))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jBPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jlector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2))
                    .addComponent(jdcFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jdcFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(64, 64, 64)
                .addComponent(jBPrestar)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaHoy() {
        LocalDate fecha = java.time.LocalDate.now(ZoneId.systemDefault());
        Date datehoy = java.util.Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jdcFechaPrestamo.setDate(datehoy);
        System.out.println("hola fechaaca sumo");
        
       
      LocalDate fecha30_ = java.time.LocalDate.of(fecha.getYear(), fecha.getMonth(), fecha.getDayOfMonth());
        java.util.Date fecha30 = java.util.Date.from(fecha30_.atStartOfDay(ZoneId.systemDefault()).plusMonths(1).toInstant());
      jdcFechaLimite.setDate(fecha30);

//      LocalDate fecha39 = java.time.LocalDate.of(fecha.getYear(), fecha.plusMonths(2).getMonth(), fecha.plusDays(20).getDayOfMonth());
//        java.util.Date fecha2_ = java.util.Date.from(fecha39.atStartOfDay(ZoneId.systemDefault()).toInstant());
//      jdcFechaLimite.setDate(fecha2_);
      
    }


    private void jBPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrestarActionPerformed
               
        Prestamo prest = new Prestamo();

        LectorData lectD = new LectorData();
        PrestamoData prestamoD = new PrestamoData();
        EjemplarData ejmpData = new EjemplarData();
        LibroData libData = new LibroData();
        
        Ejemplar ejmp = new Ejemplar();       

        Lector lect = lectD.buscarLectorPorApellido(jlector.getText());

        Libro lib = libData.buscarPorTitulo_str((jtxtLibro.getText()));

        LocalDate fEntrega = jdcFechaPrestamo.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate fDevolucion = jdcFechaEntrega.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fLimite = jdcFechaLimite.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

//      
        ejmp.setLibro(lib);  
        prest.setEjemplar(ejmpData.obtenerEjemplarPorLibro(lib.getIdLibro()));        
        prest.setLector(lect);
        prest.setFechaPrestamo(fEntrega);
//        prest.setFechaDevolucion(fDevolucion);
        prest.setFechaLimite(fLimite);
        prest.setObservaciones(jtxtObservaciones.getText());
        

        //ejmpData.restarStock(WIDTH, ABORT);
        ejmp = ejmpData.Stock(lib.getIdLibro());

        if (ejmp.getStock() >= 1) {
            ejmpData.actualizarEjemplar(lib.getIdLibro(), ejmp.getStock() - 1);
//         Ejemplar ejemplar = ejmpData.buscarEjemplar(ejmp.getIdEjemplar());
           /// eliminar el show pane
            prestamoD.guardarPrestamo(prest);
            
            
        } else{
            JOptionPane.showMessageDialog(null, "no hay más ejemplares");
        }
            
        jtxtStock.setText(ejmp.getStock()+"");
    }//GEN-LAST:event_jBPrestarActionPerformed

    private void jlectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlectorActionPerformed

    /**
     * @param args the command line arguments
     */
    private String libro;
    private String clien;

    public void pasar(String clien, String libro) {
        
        Libro lib = new Libro();
        LibroData libData = new LibroData();
        EjemplarData ejemD= new EjemplarData();
//this.libro = libro;
//        this.clien=clien;
        jtxtLibro.setText(libro);
        jlector.setText(clien);
        LocalDate fechaActual = LocalDate.now();
        fechaHoy();
        
         lib = libData.buscarPorTitulo_str(jtxtLibro.getText());
         int cant = ejemD.obtenerEjemplarPorLibro(lib.getIdLibro()).getStock();
        // System.out.println(cant);

        jtxtStock.setText(String.valueOf(cant));
        
    }



    private void cargarCombo_prest() {

        LectorData lecD = new LectorData();
        Libro lib = new Libro();
        LibroData libData = new LibroData();
        Lector lector = new Lector();

        lector = lecD.buscarLectorPorApellido(jlector.getText());

        EjemplarData ejemD = new EjemplarData();

        LectorData lecDat = new LectorData();

        PrestamoData prestamoD = new PrestamoData();
        Prestamo prestam = new Prestamo();

        for (Prestamo p : prestamoD.obtenerPrestamosPorLector(lector.getIdLector())) {

            model.addRow(new Object[]{p.getEjemplar().getLibro().getTitulo(), p.getFechaDevolucion(), p.getEjemplar().getLibro().isActivo()});

        }

        lib = libData.buscarPorTitulo_str(jtxtLibro.getText());

        int cant = ejemD.obtenerEjemplarPorLibro(lib.getIdLibro()).getStock();
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPrestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser jdcFechaLimite;
    private com.toedter.calendar.JDateChooser jdcFechaPrestamo;
    private javax.swing.JTextField jlector;
    private javax.swing.JTextField jtxtLibro;
    private javax.swing.JTextField jtxtObservaciones;
    private javax.swing.JTextField jtxtStock;
    // End of variables declaration//GEN-END:variables
}
