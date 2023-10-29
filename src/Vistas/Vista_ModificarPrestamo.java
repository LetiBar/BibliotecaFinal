/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import accesoADatos.LectorData;
import accesoADatos.LibroData;
import accesoADatos.PrestamoData;
import entidades.Lector;
import entidades.Libro;
import entidades.Prestamo;
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
public class Vista_ModificarPrestamo extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter trs;

    /**
     * Creates new form Vista_Modificaciones
     */
    public Vista_ModificarPrestamo() {
        initComponents();
        estilos();
        cargarCombo();
        buscar();
        scaner();
        //cargar_datos();
        cargarDatoLec();
    }

    public void estilos(){
       jlTitulo.putClientProperty( "FlatLaf.styleClass" , "h2.semibold" );
//       jlTitulo.setForeground(Color.ORANGE);
       
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
        jtblDatosPrestamo = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jtxtObservaciones = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtSocio = new javax.swing.JTextField();
        jtxtTitulo = new javax.swing.JTextField();
        jdcFLimite = new com.toedter.calendar.JDateChooser();
        jdcFPrestamo = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlTitulo.setText("MODIFICACIONES");

        jbtnModificar.setText("Realizar Modificacion");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jtblDatosPrestamo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblDatosPrestamo);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("modificar prestamos, darlos de baja ,agregar mas dias  ");

        jLabel4.setText("Titulo");

        jLabel5.setText("Socio");

        jLabel6.setText("F Devolucion");

        jLabel7.setText("F Prestamo");

        jLabel8.setText("Observaciones");

        jLabel9.setText("Codigo");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 158, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(79, 79, 79)
                .addComponent(jtxtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jbtnModificar)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jlTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtxtSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(209, 209, 209)
                                            .addComponent(jLabel5))
                                        .addComponent(jdcFPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdcFLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnModificar)
                    .addComponent(jtxtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    obtenner prestamo por lector 
//            para modificar
    private void cargarDatoLec() {
        LectorData lecData = new LectorData();
        Lector lec = new Lector();

        for (Lector l : lecData.listarLectores()) {
            //jComboBox2.addItem(new Lector(l.getIdLector(),l.getNombre(),l.getApellido(),
            // + l.getDni(),l.getFechaNac(),l.getDireccion(),l.getTelefono(),l.getMail(),l.isActivo()));

            jComboBox2.addItem(l.getApellido());

        }

    }

    //buscar un lector
    private void id_lector() {
        LectorData lecData = new LectorData();
        String lect = jTextField1.getText();
        lecData.buscarLectorPorApellido(lect);
        //lecData.buscarLectorNombre(lect);

    }


    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        // TODO add your handling code here:
        PrestamoData prestData = new PrestamoData();

        LocalDate fecha = LocalDate.now(ZoneId.systemDefault());

        //jDateChooser1.setDate(date);   
        Date datehoy = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date nueva = jdcFLimite.getDate();

        if (nueva.after(datehoy)) {

            int id = Integer.parseInt(jtxtId.getText());
            LocalDate nueva_fe = nueva.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate nueva_hoy = datehoy.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String modificaciones = jtxtObservaciones.getText() + "Actualizado" + nueva_hoy.getDayOfWeek() + nueva_hoy.getDayOfMonth();
            prestData.modificarPrestamo(id, nueva_hoy, nueva_fe, modificaciones);

        } else {
            JOptionPane.showMessageDialog(null, "La Fecha límite de devolución debe ser mayor");
        }

        modelo.setRowCount(0);
        //cargar_datos();


    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        modelo.setRowCount(0);
        PrestamoData prestData = new PrestamoData();        
        Lector lec = new Lector();
        String apellido = (String) jComboBox2.getSelectedItem();

        LectorData lectorData = new LectorData();
        for (Prestamo prestamo : prestData.obtenerPrestamosPorLector(lectorData.buscarLectorPorApellido(apellido).getIdLector())) {

            modelo.addRow(new Object[]{prestamo.getEjemplar().getLibro().getTitulo(), 
                prestamo.getLector().getApellido()+","+prestamo.getLector().getNombre(), 
                prestamo.getFechaLimite(), prestamo.getObservaciones(), prestamo.getIdPrestamo()});

        }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Vista_Modificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Modificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Modificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Modificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Modificaciones().setVisible(true);
            }
        });
    }

    private void cargarCombo() {
        modelo.addColumn("Título");
        modelo.addColumn("Socio");
        modelo.addColumn("Fecha Límite");
        modelo.addColumn("Observaciones");
        modelo.addColumn("Id Prestamo");
        jtblDatosPrestamo.setModel(modelo);
    }

//    private void cargar_datos() {
//        LibroData libData = new LibroData();
//        LectorData lecda = new LectorData();
//        Prestamo prestamos = new Prestamo();
//        PrestamoData prestaData = new PrestamoData();
//
//        for (Prestamo l : prestaData.obtenerPrestamo()) {
//
//            modelo.addRow(new Object[]{l.getEjemplar().getLibro().getTitulo(), l.getLector().getApellido(), l.getFechaDevolucion(), l.getObservaciones(),
//                l.getIdPrestamo()});
//
//        }
//
//    }
    public void scaner() {

        jtblDatosPrestamo.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent Mouse_evt) {
                // System.out.println(Mouse_evt.getSource());
                JTable table = (JTable) Mouse_evt.getSource();

                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1) {

                    jtxtTitulo.setText(jtblDatosPrestamo.getValueAt(jtblDatosPrestamo.getSelectedRow(), 0).toString());
                    jtxtSocio.setText(jtblDatosPrestamo.getValueAt(jtblDatosPrestamo.getSelectedRow(), 1).toString());
                    LocalDate fPrestamo = (LocalDate) jtblDatosPrestamo.getValueAt(jtblDatosPrestamo.getSelectedRow(), 2);
                    jtxtId.setText(jtblDatosPrestamo.getValueAt(jtblDatosPrestamo.getSelectedRow(), 4).toString());

                    Date date = Date.from(fPrestamo.atStartOfDay(ZoneId.systemDefault()).toInstant());

                    LocalDate fecha = LocalDate.now(ZoneId.systemDefault());
                    jdcFLimite.setDate(date);
                    Date datehoy = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    jdcFPrestamo.setDate(datehoy);

                    jtxtObservaciones.setText(jtblDatosPrestamo.getValueAt(jtblDatosPrestamo.getSelectedRow(), 3).toString());
                }

            }

        });
    }

    private void buscar() {

        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), jComboBox1.getSelectedIndex()));

            }

        });
        trs = new TableRowSorter(modelo);
        jtblDatosPrestamo.setRowSorter(trs);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnModificar;
    private com.toedter.calendar.JDateChooser jdcFLimite;
    private com.toedter.calendar.JDateChooser jdcFPrestamo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtblDatosPrestamo;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtObservaciones;
    private javax.swing.JTextField jtxtSocio;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables
}
