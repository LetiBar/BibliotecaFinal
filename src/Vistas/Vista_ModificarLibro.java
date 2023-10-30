/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import accesoADatos.LibroData;
import entidades.Libro;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author asdasd
 */
public class Vista_ModificarLibro extends javax.swing.JInternalFrame {

    LibroData libData = new LibroData();
    
    public Vista_ModificarLibro() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jlTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtIsbn = new javax.swing.JTextField();
        jtTitulo = new javax.swing.JTextField();
        jtAutor = new javax.swing.JTextField();
        jtGenero = new javax.swing.JTextField();
        jtEditorial = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setResizable(true);
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jlTitulo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jlTitulo.setText("MODIFICAR LIBRO");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel3.setText("isbn:");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel4.setText("Titulo:");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel5.setText("Autor:");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel6.setText("Genero:");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel7.setText("Editorial:");

        jLabel8.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel8.setText("Estado:");

        jtIsbn.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jtIsbn.setPreferredSize(new java.awt.Dimension(14, 30));

        jtTitulo.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jtTitulo.setPreferredSize(new java.awt.Dimension(14, 30));

        jtAutor.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jtAutor.setPreferredSize(new java.awt.Dimension(14, 30));

        jtGenero.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jtGenero.setPreferredSize(new java.awt.Dimension(14, 30));

        jtEditorial.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jtEditorial.setPreferredSize(new java.awt.Dimension(14, 30));

        jbModificar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setPreferredSize(new java.awt.Dimension(100, 40));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setPreferredSize(new java.awt.Dimension(100, 40));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Activo");

        jLabel9.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel9.setText("Id:");

        jtId.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jtId.setPreferredSize(new java.awt.Dimension(14, 30));

        jbBuscar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jbBuscar.setText("Buscar Libro");
        jbBuscar.setPreferredSize(new java.awt.Dimension(120, 40));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setPreferredSize(new java.awt.Dimension(100, 40));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel1.setText("Busque un libro existente y modifique los datos necesarios.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(jLabel1)
                .addContainerGap(308, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlTitulo)
                        .addGap(443, 443, 443))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(1, 1, 1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jRadioButton1)
                                        .addGap(258, 258, 258)))))
                        .addGap(264, 264, 264))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
       
       try {
            int isbn = Integer.parseInt(jtIsbn.getText());
            String titulo = jtTitulo.getText();
            String autor = jtAutor.getText();
            String genero = jtGenero.getText();
            String editorial = jtEditorial.getText();
            Boolean estado = jRadioButton1.isSelected();
            Libro libroModificado = new Libro(isbn, titulo, autor, genero, editorial, estado);

            if (titulo.isEmpty() || autor.isEmpty() || genero.isEmpty() || editorial.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios ");
            } else {
                libData.modificarLibro(libroModificado);                
                
            }

        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(this, "Debe ingresar un código en un formato válido " + e);
        }                                         
                
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
       try{
         Libro libro = libData.buscarLibro(Integer.parseInt(jtId.getText()));
         
         jtIsbn.setText(libro.getIsbn()+"");
         jtTitulo.setText(libro.getTitulo());
         jtAutor.setText(libro.getAutor());
         jtGenero.setText(libro.getGenero());
         jtEditorial.setText(libro.getEditorial());
         jRadioButton1.setSelected(true);
         
         
       }catch(NumberFormatException e){
           
           JOptionPane.showMessageDialog(this, "Se espera que ingrese un número.");
       }       
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        
        jtId.setText("");
        jtIsbn.setText("");
        jtTitulo.setText("");
        jtAutor.setText("");
        jtGenero.setText("");
        jtEditorial.setText("");
        jRadioButton1.setSelected(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtAutor;
    private javax.swing.JTextField jtEditorial;
    private javax.swing.JTextField jtGenero;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtIsbn;
    private javax.swing.JTextField jtTitulo;
    // End of variables declaration//GEN-END:variables
}
