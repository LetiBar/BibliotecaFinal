/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import accesoADatos.EjemplarData;
import accesoADatos.LectorData;
import accesoADatos.PrestamoData;
import entidades.Ejemplar;
import entidades.Lector;
import entidades.Prestamo;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class VistaDevolucion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo1 = new DefaultTableModel();
    private DefaultTableModel modelo2 = new DefaultTableModel();
    
    public VistaDevolucion() {
        initComponents();
        estilos();
        cabeceraTabla1();
        cabeceraTabla2();
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

        jlTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPrestamos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbtnRegistrarDevoluc = new javax.swing.JButton();
        jbtnCancelarSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMostrarDevolucion = new javax.swing.JTable();
        jtxtBusqueda = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtObservaciones = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlTitulo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jlTitulo.setText("DEVOLUCION");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel2.setText("Ingrese el dni del Socio para buscar los prestamos realizados:");

        jTPrestamos.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
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
        jTPrestamos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTPrestamos.setCellSelectionEnabled(true);
        jTPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTPrestamos.setRowHeight(25);
        jScrollPane1.setViewportView(jTPrestamos);

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel3.setText("Seleccione un préstamo de la tabla para registrar la devolución del libro.");

        jbtnRegistrarDevoluc.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jbtnRegistrarDevoluc.setText("REGISTRAR DEVOLUCIÓN");
        jbtnRegistrarDevoluc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarDevolucActionPerformed(evt);
            }
        });

        jbtnCancelarSalir.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jbtnCancelarSalir.setText("SALIR");
        jbtnCancelarSalir.setPreferredSize(new java.awt.Dimension(100, 40));
        jbtnCancelarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarSalirActionPerformed(evt);
            }
        });

        jtMostrarDevolucion.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jtMostrarDevolucion.setModel(new javax.swing.table.DefaultTableModel(
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
        jtMostrarDevolucion.setRowHeight(25);
        jScrollPane2.setViewportView(jtMostrarDevolucion);

        jtxtBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtBusquedaMouseClicked(evt);
            }
        });
        jtxtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBusquedaActionPerformed(evt);
            }
        });
        jtxtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBusquedaKeyTyped(evt);
            }
        });

        jtxtObservaciones.setColumns(20);
        jtxtObservaciones.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jtxtObservaciones.setRows(5);
        jScrollPane3.setViewportView(jtxtObservaciones);

        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel4.setText("Si la devolución ha sido registrada exitosamente podrá verla:");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel5.setText("Registre una observación si lo desea. Si el préstamo ya presentaba una observación será reemplazada:");

        jButton1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addComponent(jlTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(372, 473, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(jbtnCancelarSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(jbtnRegistrarDevoluc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnRegistrarDevoluc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnCancelarSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBusquedaActionPerformed
                           
    }//GEN-LAST:event_jtxtBusquedaActionPerformed

    private void jtxtBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtBusquedaMouseClicked
      
    }//GEN-LAST:event_jtxtBusquedaMouseClicked

    private void jtxtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBusquedaKeyTyped
   
    }//GEN-LAST:event_jtxtBusquedaKeyTyped

    private void jbtnRegistrarDevolucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarDevolucActionPerformed
       
       PrestamoData presData = new PrestamoData();
       LectorData lecData = new LectorData();
       Lector lector = new Lector();
       LocalDate fechaActual = LocalDate.now();
       EjemplarData ejemData = new EjemplarData();
       
           int filaSeleccionada = jTPrestamos.getSelectedRow();
        
        if (filaSeleccionada !=-1 ){
            
           TableModel tableModel = jTPrestamos.getModel();
            
           int idPrestamo = (int)tableModel.getValueAt(filaSeleccionada,0);
           Prestamo prestamo = presData.obtenerPrestamosSinDevolver(idPrestamo);           
           
           String observaciones = jtxtObservaciones.getText();
           if(observaciones.isEmpty()==false){
               
                presData.devolucion(idPrestamo, fechaActual, observaciones);
                Prestamo prestamoDevuelto = presData.obtenerPrestamo(idPrestamo);
                int idEjemp = prestamoDevuelto.getEjemplar().getIdEjemplar();
                int idLibro = prestamoDevuelto.getEjemplar().getLibro().getIdLibro();
                
                ejemData.actualizarEjemplar(idLibro, prestamoDevuelto.getEjemplar().getStock() +1);
                cargarTabla2(prestamoDevuelto);
           }else{
               presData.devolucion(idPrestamo, fechaActual);
               Prestamo prestamoDevuelto = presData.obtenerPrestamo(idPrestamo);
               int idEjemp = prestamoDevuelto.getEjemplar().getIdEjemplar();
               int idLibro = prestamoDevuelto.getEjemplar().getLibro().getIdLibro();
                
                ejemData.actualizarEjemplar(idLibro, prestamoDevuelto.getEjemplar().getStock() +1);
                cargarTabla2(prestamoDevuelto);
           }
                   
           
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un prestamo.");
        }
        
    }//GEN-LAST:event_jbtnRegistrarDevolucActionPerformed

    private void jbtnCancelarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnCancelarSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
     if(modelo1.getRowCount()>0) {
            borrarTabla1();
        }
        PrestamoData presData = new PrestamoData();
                          
        try {
            int dni = Integer.parseInt(jtxtBusqueda.getText()) ;
             
                for(Prestamo prestamo :  presData.obtenerPrestamosPorLectorSinDevolucion(dni)){
            
                  cargarTabla1(prestamo);
                }
            
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Debe ingresar sólo números.");
        }
                
       
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDevolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTPrestamos;
    private javax.swing.JButton jbtnCancelarSalir;
    private javax.swing.JButton jbtnRegistrarDevoluc;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtMostrarDevolucion;
    private javax.swing.JTextField jtxtBusqueda;
    private javax.swing.JTextArea jtxtObservaciones;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTabla1(){
        
        modelo1.addColumn("ID PRESTAMO");    
        modelo1.addColumn("SOCIO");
        modelo1.addColumn("LIBRO");        
        modelo1.addColumn("FECHA DE PRESTAMO");
        modelo1.addColumn("FECHA LÍMITE");
        modelo1.addColumn("OBSERVACIONES");
        jTPrestamos.setModel(modelo1);
        
    }
    
    private void cabeceraTabla2(){
        
        modelo2.addColumn("ID PRESTAMO");    
        modelo2.addColumn("SOCIO");
        modelo2.addColumn("LIBRO");        
        modelo2.addColumn("FECHA DE PRESTAMO");
        modelo2.addColumn("FECHA LÍMITE");
        modelo2.addColumn("FECHA DEVOLUCION");
        modelo2.addColumn("OBSERVACIONES");
        jtMostrarDevolucion.setModel(modelo2);
        
    }
    
    private void cargarTabla1(Prestamo prestamo){  
        
        modelo1.addRow(new Object[]{prestamo.getIdPrestamo(), prestamo.getLector().getApellido()+", "+prestamo.getLector().getNombre(), 
            prestamo.getEjemplar().getLibro().getTitulo(), prestamo.getFechaPrestamo(), prestamo.getFechaLimite(), prestamo.getObservaciones()});
        
    }  
    
    private void cargarTabla2(Prestamo prestamo){  
        
        modelo2.addRow(new Object[]{prestamo.getIdPrestamo(), prestamo.getLector().getApellido()+", "+prestamo.getLector().getNombre(), 
            prestamo.getEjemplar().getLibro().getTitulo(), prestamo.getFechaPrestamo(), prestamo.getFechaLimite(), prestamo.getFechaDevolucion(), prestamo.getObservaciones()});
        
    }  
    
    private void borrarTabla1() {

        int indice = modelo1.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo1.removeRow(i);
        }
    }

}
