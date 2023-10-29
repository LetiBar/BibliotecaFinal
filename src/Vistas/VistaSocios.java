/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import accesoADatos.LectorData;
import com.formdev.flatlaf.ui.FlatUIUtils;
import entidades.Lector;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author recre
 */
public class VistaSocios extends javax.swing.JInternalFrame {

    LectorData lecData = new LectorData();
    Lector lecAct = null;
        
    public VistaSocios() {
        initComponents();
        estilos();

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

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jBuscar = new javax.swing.JButton();
        jTexSocio = new javax.swing.JTextField();
        jLSocio = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jTexApellido = new javax.swing.JTextField();
        jTexNombre = new javax.swing.JTextField();
        jTexDni = new javax.swing.JTextField();
        jLDni = new javax.swing.JLabel();
        jLFechaNac = new javax.swing.JLabel();
        jTexDirec = new javax.swing.JTextField();
        jTexTel = new javax.swing.JTextField();
        jTexMail = new javax.swing.JTextField();
        jLDirec = new javax.swing.JLabel();
        jLTel = new javax.swing.JLabel();
        jLMail = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jRBEstado = new javax.swing.JRadioButton();
        jLActivo = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();
        jDCFechaNac = new com.toedter.calendar.JDateChooser();
        jBEliminar = new javax.swing.JButton();

        jPanel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N

        jlTitulo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jlTitulo.setText("NUEVO SOCIO");

        jBuscar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.setPreferredSize(new java.awt.Dimension(100, 40));
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jTexSocio.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jTexSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexSocioActionPerformed(evt);
            }
        });

        jLSocio.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLSocio.setText("id Socio");

        jLApellido.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLApellido.setText("Apellido");

        jTexApellido.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N

        jTexNombre.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N

        jTexDni.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jTexDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTexDniKeyReleased(evt);
            }
        });

        jLDni.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLDni.setText("DNI");

        jLFechaNac.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLFechaNac.setText("Fecha de Nacimiento");

        jTexDirec.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N

        jTexTel.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N

        jTexMail.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N

        jLDirec.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLDirec.setText("Dirección");

        jLTel.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLTel.setText("Teléfono");

        jLMail.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLMail.setText("Email");

        jLEstado.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLEstado.setText("Estado");

        jLActivo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLActivo.setText("Activo");

        jBGuardar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setPreferredSize(new java.awt.Dimension(100, 40));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBLimpiar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setPreferredSize(new java.awt.Dimension(100, 40));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setPreferredSize(new java.awt.Dimension(100, 40));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLNombre.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLNombre.setText("Nombre");

        jDCFechaNac.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N

        jBEliminar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setPreferredSize(new java.awt.Dimension(100, 40));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jlTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(jRBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDni, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLMail, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLTel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTexDni)
                            .addComponent(jTexApellido)
                            .addComponent(jTexNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTexSocio)
                            .addComponent(jTexTel)
                            .addComponent(jTexMail)
                            .addComponent(jTexDirec)
                            .addComponent(jDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(480, 480, 480))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        try {

            String apellido = jTexApellido.getText();
            String nombre = jTexNombre.getText();
            int dni = Integer.parseInt(jTexDni.getText());
            LocalDate fechaNac = jDCFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String direccion = jTexDirec.getText();
            int telefono = Integer.parseInt(jTexTel.getText());
            String mail = jTexMail.getText();
            boolean estado = true;
            jRBEstado.setSelected(true);

            if (apellido.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || mail.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe completar los campos obligatorios");
                return;
            }

            if (lecAct == null) {
                // Guardar nuevo lector
                Lector lectorNuevo = new Lector(apellido, nombre, dni, fechaNac, direccion, telefono, mail, estado);
                lecData.guardarLector(lectorNuevo);

                jTexSocio.setText(lectorNuevo.getIdLector() + "");

                JOptionPane.showMessageDialog(this, "Nuevo lector registrado correctamente");
            } else {
                // Actualizar un lector existente (lecAct)
                lecAct.setApellido(apellido);
                lecAct.setNombre(nombre);
                lecAct.setDni(dni); // Puedes necesitar agregar un método setter para el DNI si no existe
                lecAct.setFechaNac(fechaNac);
                lecAct.setDireccion(direccion);
                lecAct.setTelefono(telefono);
                lecAct.setMail(mail);
                lecAct.setActivo(estado);
                lecData.modificarLector(lecAct);
                JOptionPane.showMessageDialog(this, "Cambios en el lector guardados correctamente");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un dato válido ");
        }


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            Integer dni = Integer.parseInt(jTexDni.getText());
            lecAct = lecData.buscarLectorPorDni(dni);

            if (lecAct != null) {

                jTexSocio.setText(lecAct.getIdLector() + "");
                jTexApellido.setText(lecAct.getApellido());
                jTexNombre.setText(lecAct.getNombre());
                LocalDate ld = lecAct.getFechaNac();
                java.util.Date date = java.util.Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDCFechaNac.setDate(date);
                jDCFechaNac.setDate(Date.valueOf(lecAct.getFechaNac()));
                jTexDirec.setText(lecAct.getDireccion());
                jTexTel.setText(lecAct.getTelefono() + "");
                jTexMail.setText(lecAct.getMail());
                jRBEstado.setSelected(lecAct.isActivo());

//                System.out.println("Lector encontrado: " + lecAct);
            } else {
                JOptionPane.showMessageDialog(this, "No existe el lector");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número de DNI válido");
        }

    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
        lecAct = null;
        jRBEstado.setSelected(false);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (lecAct != null) {

            lecData.eliminarLector(lecAct.getIdLector());
            lecAct = null;
            limpiar();

        } else {

            JOptionPane.showMessageDialog(this, "Socio no seleccionado");

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTexSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexSocioActionPerformed

    private void jTexDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexDniKeyReleased

    }//GEN-LAST:event_jTexDniKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private com.toedter.calendar.JDateChooser jDCFechaNac;
    private javax.swing.JLabel jLActivo;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLDirec;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLFechaNac;
    private javax.swing.JLabel jLMail;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLSocio;
    private javax.swing.JLabel jLTel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTexApellido;
    private javax.swing.JTextField jTexDirec;
    private javax.swing.JTextField jTexDni;
    private javax.swing.JTextField jTexMail;
    private javax.swing.JTextField jTexNombre;
    private javax.swing.JTextField jTexSocio;
    private javax.swing.JTextField jTexTel;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables
    private void limpiar() {

        jTexSocio.setText("");
        jTexDni.setText("");
        jTexApellido.setText("");
        jTexNombre.setText("");
        jTexDni.setText("");
        jDCFechaNac.setDate(null);
        jTexDirec.setText("");
        jTexTel.setText("");
        jTexMail.setText("");
        jRBEstado.setSelected(false);
    }
}
