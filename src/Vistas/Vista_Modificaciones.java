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
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author asdasd mateo2270@gmail.com
 */
public class Vista_Modificaciones extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter trs;
   
 
    /**
     * Creates new form Vista_Modificaciones
     */
    public Vista_Modificaciones() {
        initComponents();
        estilos();
        cabeceraTabla1();
        buscarPrestamos();
        
        
        
    }

    public void estilos(){
       jlTitulo.putClientProperty( "FlatLaf.styleClass" , "h2" );
       jlTitulo.setForeground(Color.ORANGE);
       
//       jlMensaje1.putClientProperty( "FlatLaf.styleClass" , "monospaced" );
//       jlMensaje2.putClientProperty( "FlatLaf.styleClass" , "monospaced" );
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jlTitulo = new javax.swing.JLabel();
        jbtnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPrestamos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jdCFLímite = new com.toedter.calendar.JDateChooser();
        jdcFPrestamo = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtObservaciones = new javax.swing.JTextPane();
        jcbSocios = new javax.swing.JComboBox<>();
        jcbLibros = new javax.swing.JComboBox<>();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jlTitulo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jlTitulo.setText("MODIFICACIONES");

        jbtnModificar.setText("Realizar Modificacion");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jTPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTPrestamos);

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel2.setText("modificar prestamos, darlos de baja ,agregar mas dias  ");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel4.setText("Libro");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel5.setText("Socio");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel6.setText("Fecha Límite");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel7.setText("Fecha Prestamo");

        jLabel9.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel9.setText("Observaciones");

        jScrollPane2.setViewportView(jtxtObservaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(363, 363, 363))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(jlTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFPrestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jdCFLímite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jcbSocios, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbLibros, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jbtnModificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jdcFPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jdCFLímite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jbtnModificar)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        int filaSeleccionada = jTPrestamos.getSelectedRow();
        
        PrestamoData prestData = new PrestamoData();
        EjemplarData ejempData = new EjemplarData();
        
        int idPrestamo = (int) jTPrestamos.getValueAt(filaSeleccionada, 0);
        Lector lector = (Lector) jcbSocios.getSelectedItem();
        Libro libro = (Libro) jcbLibros.getSelectedItem();
        Ejemplar ejemplar = ejempData.obtenerEjemplarPorLibro(libro.getIdLibro());
        LocalDate fPrestamo = jdcFPrestamo.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fLimite = jdCFLímite.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String observ = jtxtObservaciones.getText();
        
            prestData.modificarPrestamo(idPrestamo, lector, ejemplar, fPrestamo, fLimite, observ);

       
        modelo.setRowCount(0);
        
        
        //cargar_datos();


    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jTPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPrestamosMouseClicked
       PrestamoData presData = new PrestamoData();
       LectorData lecData = new LectorData();
       Lector lector = new Lector();
       EjemplarData ejemData = new EjemplarData();
       LimpiarComboLibros();
       LimpiarComboSocios();
       cargarComboLibro();
       cargarComboSocios();
       
       int filaSeleccionada = jTPrestamos.getSelectedRow();
       
       int idPrestamo = (int) jTPrestamos.getValueAt(filaSeleccionada, 0);
       
       Prestamo prestamo = presData.obtenerPrestamosSinDevolver(idPrestamo);
       lector = prestamo.getLector();
       Libro libro = prestamo.getEjemplar().getLibro();
       LocalDate fPrestamo = prestamo.getFechaPrestamo();
       LocalDate fLimite = prestamo.getFechaLimite();
       String observ = prestamo.getObservaciones();
       
       jcbSocios.setSelectedIndex(filaSeleccionada);
       jcbLibros.setSelectedIndex(filaSeleccionada);
       jdcFPrestamo.setDate(Date.from(fPrestamo.atStartOfDay(ZoneId.systemDefault()).toInstant()));
       jdCFLímite.setDate(Date.from(fLimite.atStartOfDay(ZoneId.systemDefault()).toInstant()));
       if(!observ.isEmpty()){
           jtxtObservaciones.setText(observ);
       }else{
           jtxtObservaciones.setText(" ");
       }
       
    }//GEN-LAST:event_jTPrestamosMouseClicked

    

    private void cabeceraTabla1(){
        
        modelo.addColumn("ID PRESTAMO");    
        modelo.addColumn("SOCIO");
        modelo.addColumn("LIBRO");        
        modelo.addColumn("FECHA DE PRESTAMO");
        modelo.addColumn("FECHA LÍMITE");
        modelo.addColumn("OBSERVACIONES");
        jTPrestamos.setModel(modelo);
        
    }
    
    private void cargarTabla(Prestamo prestamo){  
        
        modelo.addRow(new Object[]{prestamo.getIdPrestamo(), prestamo.getLector().getApellido()+", "+prestamo.getLector().getNombre(), 
            prestamo.getEjemplar().getLibro().getTitulo(), prestamo.getFechaPrestamo(), prestamo.getFechaLimite(), prestamo.getObservaciones()});
        
    }  
    private void buscarPrestamos(){
        
        PrestamoData presData = new PrestamoData();
        
        for (Prestamo prestamo : presData.obtenerPrestamosSinDevolver()){
            cargarTabla(prestamo);
        }
    }
    
    private void cargarComboSocios(){
        
        LectorData lecData = new LectorData();
        
        for (Lector socio : lecData.listarLectores()){
            jcbSocios.addItem(socio.toString());
        }
    }
    
    private void cargarComboLibro(){
        LibroData libData = new LibroData();
        
        for (Libro libro : libData.listarLibros()){
            jcbLibros.addItem(libro.toString());
        }
    }

   private void LimpiarComboSocios(){
        
            jcbSocios.removeAllItems();
       
    }
   
   private void LimpiarComboLibros(){
        
            jcbLibros.removeAllItems();
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTPrestamos;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JComboBox<String> jcbLibros;
    private javax.swing.JComboBox<String> jcbSocios;
    private com.toedter.calendar.JDateChooser jdCFLímite;
    private com.toedter.calendar.JDateChooser jdcFPrestamo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextPane jtxtObservaciones;
    // End of variables declaration//GEN-END:variables
}
