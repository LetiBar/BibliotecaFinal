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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author asdasd
 */
public class Visata_Devolucion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelDev = new DefaultTableModel();
TableRowSorter trs;
    /**
     * Creates new form Visata_Devolucion
     */
    public Visata_Devolucion() {

        //setLocationRelativeTo(this);
        initComponents();
        cargarCombox();
        cargarDatoTodos();
        buscar();
        scaner();
        

        // scaner();
    }

    /**
     * @param args the command line arguments
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DEVOLUCION");

        jLabel2.setText("Cliente");

        jLabel3.setText("Fecha Prestamo");

        jLabel4.setText("Fecha Devolucion");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigfo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Prestamo", "Nombre", "Apellido", " " }));

        jLabel7.setText("Buscar");

        jLabel6.setText("Libro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(41, 41, 41)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))
                            .addComponent(jLabel1))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        devolucion();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargarCombox() {

        modelDev.addColumn("Id Prestamo");
        modelDev.addColumn("Nombre");
        modelDev.addColumn("Apellido");
        modelDev.addColumn("F Prestamo");

        jTable1.setModel(modelDev);

    }

    public void pasar2(String id) {
//        EjemplarData ejemD = new EjemplarData();
//        LectorData lecDat = new LectorData();
//        PrestamoData prestamoD = new PrestamoData();
//        Prestamo prestam = new Prestamo();
//        LectorData lecD = new LectorData();
//        Lector lector = new Lector();

        //jTextField1.setText(id);
        //cargarDato();
    }

//    public void pasar_clie(String id) {
// 
//        System.out.println("asd"+id);
//
//    }
//    
//
    private void cargarDato() {

        LectorData lecD = new LectorData();
        Libro lib = new Libro();
        LibroData libData = new LibroData();
        Lector lector = new Lector();
        LectorData lecDat = new LectorData();
        Prestamo prestam = new Prestamo();

        //lector = lecD.buscarLectorPorApellido(pasar_clie(jTextField1.getText()).getApellido());
        EjemplarData ejemD = new EjemplarData();

        PrestamoData prestamoD = new PrestamoData();

        for (Prestamo p : prestamoD.obtenerPrestamosPorLector(lector.getIdLector())) {

            modelDev.addRow(new Object[]{p.getIdPrestamo(), p.getEjemplar().getLibro().getTitulo()});

        }

    }

    public void cargarDatoTodos() {

        LectorData lecD = new LectorData();
        Lector lector = new Lector();

//        LibroData libData = new LibroData();
//        Libro lib = new Libro();

        PrestamoData prestamoD = new PrestamoData();
        Prestamo prestam = new Prestamo();

        EjemplarData ejemD = new EjemplarData();
        Ejemplar ejempla = new Ejemplar();

        for (Prestamo p : prestamoD.obtenerPrestamo()) {

            //modelDev.addRow(new Object[]{p.getIdPrestamo(), p.getEjemplar().getLibro().getTitulo()});
           modelDev.addRow(new Object[]{p.getIdPrestamo(),p.getEjemplar().getLibro().getTitulo(),p.getLector().getApellido(),p.getFechaPrestamo()});
           //jTextField1
            
        }

    }
    
    private void buscar() {

        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), jComboBox1.getSelectedIndex()));

            }

        });
        trs = new TableRowSorter(modelDev);
        jTable1.setRowSorter(trs);

    }

    

    public void devolucion() {
      
        
      
        EjemplarData ejemD = new EjemplarData();
        Ejemplar ejem = new Ejemplar();
        LectorData lecD = new LectorData();
        LibroData libData = new LibroData();
        Libro libro = new Libro();
        int idlec = lecD.buscarLectorPorApellido(jTextField2.getText()).getIdLector();
        //int idlector = Integer.parseInt( jTextField1.getText());
        int idejemplar = Integer.parseInt(jTextField3.getText());
        PrestamoData pd = new PrestamoData();
        libro = libData.buscarPorTitulo_str(jTextField4.getText());

        ejem = ejemD.Stock(libro.getIdLibro());
        ejemD.actualizarEjemplar(libro.getIdLibro(), ejem.getStock() + 1);
//        pd.eliminarPrestamoxid(idlec, idejemplar);
     
       
        
        

    }
    
//    public Libro libro(String lib) {
//   //     Libro libro = null;
//
//        scaner();
//
//       return libro;
//    }
    int borarF;
  
    private int limpiar(int borar){
    
        int borarF=borar;
        return borar;
    
    }
    public void scaner() {

        jTable1.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent Mouse_evt) {
                // System.out.println(Mouse_evt.getSource());
                JTable table = (JTable) Mouse_evt.getSource();

                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                limpiar(row);
                if (Mouse_evt.getClickCount() == 1) {

                    jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                    jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                    jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                    String f = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
                    LocalDate fe = LocalDate.parse(f);
                    java.util.Date date = java.util.Date.from(fe.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    jDateChooser1.setDate(date);
                    LocalDate fecha = java.time.LocalDate.now(ZoneId.systemDefault());

                    java.util.Date datehoy = java.util.Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    jDateChooser2.setDate(datehoy);
                }

            }

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
