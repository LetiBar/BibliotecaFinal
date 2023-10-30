/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import accesoADatos.PrestamoData;
import entidades.Prestamo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VistaPrestamosVencidos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    
    public VistaPrestamosVencidos() {
        initComponents();
        cabeceraTabla();
        obtenerPrestamosVencidos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtPrestamosVencidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jtPrestamosVencidos.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jtPrestamosVencidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtPrestamosVencidos.setRowHeight(20);
        jtPrestamosVencidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPrestamosVencidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPrestamosVencidos);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel1.setText("PRESTAMOS VENCIDOS");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 11)); // NOI18N
        jLabel2.setText("Los prestamos que hayan pasado la fecha límite de devolución se mostraran en la tabla");

        jButSalir.setText("Salir");
        jButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193)
                .addComponent(jButSalir)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrestamosVencidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPrestamosVencidosMouseClicked
        
    }//GEN-LAST:event_jtPrestamosVencidosMouseClicked

    private void jButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jButSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPrestamosVencidos;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTabla(){
        
        modelo.addColumn("ID SOCIO");
        modelo.addColumn("SOCIO");
        modelo.addColumn("LIBRO");
        modelo.addColumn("ID PRESTAMO");
        modelo.addColumn("FECHA DE PRESTAMO");
        modelo.addColumn("FECHA LÍMITE");
        modelo.addColumn("DIAS VENCIDOS");
        jtPrestamosVencidos.setModel(modelo);
        
    }
    
    private void cargarTabla(Prestamo prestamo){
        
        modelo.addRow(new Object[]{prestamo.getLector().getIdLector(), prestamo.getLector().getApellido()+", "+prestamo.getLector().getNombre(), 
            prestamo.getEjemplar().getLibro().getTitulo(),prestamo.getIdPrestamo(), prestamo.getFechaPrestamo(), prestamo.getFechaLimite(), calcularDiasVencidos(prestamo)});
        
    }    

    public void obtenerPrestamosVencidos(){
        PrestamoData presData = new PrestamoData();
       
        
        for (Prestamo prestamo : presData.obtenerPrestamosSinDevolver()){
            LocalDate fechaLimite = prestamo.getFechaLimite();
            LocalDate fechaActual = LocalDate.now();
        
            int diferenciaDias = (int) ChronoUnit.DAYS.between(fechaLimite, fechaActual);
        
            if(diferenciaDias>1){
                
                cargarTabla(prestamo);
            }
            
        }
        
    }
    
    public int calcularDiasVencidos(Prestamo prestamo){
        PrestamoData presData = new PrestamoData();
       
            LocalDate fechaLimite = prestamo.getFechaLimite();
            LocalDate fechaActual = LocalDate.now();
        
            int diferenciaDias = (int) ChronoUnit.DAYS.between(fechaLimite, fechaActual);
        
        return diferenciaDias;
        
    }
    

}
