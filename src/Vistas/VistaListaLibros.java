/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import accesoADatos.LibroData;
import entidades.Libro;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author recre
 */
public class VistaListaLibros extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel mod = new DefaultTableModel();

    /**
     * Creates new form VistaListaLibros
     */
    public VistaListaLibros() {
        initComponents();
        estilos();
        armarCabecera();
        armarCabecera2();
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

        jPFondo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jBMostrar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBLimpiar1 = new javax.swing.JButton();
        jButModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jcbxBuscarPor = new javax.swing.JComboBox<>();
        jTexBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jBLimpiar2 = new javax.swing.JButton();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jPFondo.setPreferredSize(new java.awt.Dimension(1080, 720));

        jlTitulo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jlTitulo.setText("LISTA DE LIBROS");

        jBMostrar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jBMostrar.setText("Mostrar");
        jBMostrar.setPreferredSize(new java.awt.Dimension(100, 40));
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
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

        jTable1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
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
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jBLimpiar1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jBLimpiar1.setText("Limpiar");
        jBLimpiar1.setPreferredSize(new java.awt.Dimension(100, 40));
        jBLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar1ActionPerformed(evt);
            }
        });

        jButModificar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jButModificar.setText("Modificar");
        jButModificar.setPreferredSize(new java.awt.Dimension(100, 40));
        jButModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButModificarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setPreferredSize(new java.awt.Dimension(100, 40));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jcbxBuscarPor.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jcbxBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listar por Título", "Listar por Autor", "Listar por Género", " " }));
        jcbxBuscarPor.setPreferredSize(new java.awt.Dimension(129, 30));
        jcbxBuscarPor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbxBuscarPorItemStateChanged(evt);
            }
        });

        jTexBuscar.setPreferredSize(new java.awt.Dimension(14, 30));
        jTexBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexBuscarActionPerformed(evt);
            }
        });
        jTexBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTexBuscarKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel2.setText("Selecciones una opción");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel3.setText("Ingrese título o autor");

        jTable2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setRowHeight(25);
        jScrollPane2.setViewportView(jTable2);

        jBLimpiar2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jBLimpiar2.setText("Limpiar");
        jBLimpiar2.setPreferredSize(new java.awt.Dimension(100, 40));
        jBLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFondoLayout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jButModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jBLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPFondoLayout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbxBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTexBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 318, Short.MAX_VALUE))
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFondoLayout.createSequentialGroup()
                                .addGap(470, 470, 470)
                                .addComponent(jBLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPFondoLayout.createSequentialGroup()
                                .addGap(468, 468, 468)
                                .addComponent(jlTitulo))
                            .addGroup(jPFondoLayout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jBMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 366, Short.MAX_VALUE))
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbxBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed

        if (modelo.getRowCount() > 0) {
            modelo.removeRow(0);//Usamos este metodo para eliminar todas las filas existentes para cargar nuevos datos.
        }

        LibroData lecData = new LibroData(); // Creamos una instancia de LibroData

        for (Libro libro : lecData.listarLibros()) {
            cargarLista(libro); // Agrega cada libro a la tabla

        }
    }//GEN-LAST:event_jBMostrarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        // Esto limpia todas las filas de la tabla
    }//GEN-LAST:event_jBLimpiar1ActionPerformed

    private void jButModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButModificarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas guardar los cambios?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {

            int filaSeleccionada = jTable1.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para modificar.");
                return;
            }
            try {
                // Habilitamos la edición en la celda de cada columna
                jTable1.editCellAt(filaSeleccionada, 1);
                jTable1.editCellAt(filaSeleccionada, 2);
                jTable1.editCellAt(filaSeleccionada, 3);
                jTable1.editCellAt(filaSeleccionada, 4);
                jTable1.editCellAt(filaSeleccionada, 5);

                // Coloca el foco en la celda para permitir la edición
                jTable1.getEditorComponent().requestFocus();

                // Obtenemos el ID del libro seleccionado en la tabla (asumiendo que está en la primera columna)
                int idLibro = (int) jTable1.getValueAt(filaSeleccionada, 0);

                // Buscamos el libro en la base de datos utilizando su ID
                LibroData libData = new LibroData();
                Libro libroSeleccionado = libData.buscarLibro(idLibro);

                // Obtenemos los datos editados de la fila seleccionada
                String nuevoIsbn = (String) jTable1.getValueAt(filaSeleccionada, 1);
                String nuevoTitulo = (String) jTable1.getValueAt(filaSeleccionada, 2);
                String nuevoAutor = (String) jTable1.getValueAt(filaSeleccionada, 3);
                String nuevoGenero = (String) jTable1.getValueAt(filaSeleccionada, 4);
                String nuevoEditorial = (String) jTable1.getValueAt(filaSeleccionada, 5);

                // Actualizamos los datos en el objeto Lector
                libroSeleccionado.setIsbn(Integer.parseInt(nuevoIsbn));
                libroSeleccionado.setTitulo(nuevoTitulo);
                libroSeleccionado.setAutor(nuevoAutor);
                libroSeleccionado.setGenero(nuevoGenero);
                libroSeleccionado.setEditorial(nuevoEditorial);

                // Actualizamos el libro en la base de datos
                libData.modificarLibro(libroSeleccionado);

                // Refrescamos la tabla para mostrar los cambios en la interfaz
                modelo.setValueAt(nuevoIsbn, filaSeleccionada, 1);
                modelo.setValueAt(nuevoTitulo, filaSeleccionada, 2);
                modelo.setValueAt(nuevoAutor, filaSeleccionada, 3);
                modelo.setValueAt(nuevoGenero, filaSeleccionada, 4);
                modelo.setValueAt(nuevoEditorial, filaSeleccionada, 5);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error al convertir un valor a número");
                e.printStackTrace();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No puede realizar cambios en este campo");
                e.printStackTrace();
            }

    }//GEN-LAST:event_jButModificarActionPerformed
    }
    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para eliminar.");
            return;
        }

        // Obtenemos el ID del libro seleccionado
        int idLibro = (int) jTable1.getValueAt(filaSeleccionada, 0);

        // Solicitamos una confirmación al usuario
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas eliminar este libro?", "Confirmación de Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Eliminamos el libro de la base de datos
            LibroData libData = new LibroData();
            libData.eliminarLibro(idLibro);

            // Borrado lógico de la fila de la tabla
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.removeRow(filaSeleccionada);

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jcbxBuscarPorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbxBuscarPorItemStateChanged
        String opcionSeleccionada = (String) jcbxBuscarPor.getSelectedItem();
        if ("Título".equals(opcionSeleccionada)) {
            // Lógica para ordenar por título
            LibroData libData = new LibroData();
            List<Libro> librosOrdenados = libData.librosPorTitulo();

            // Limpia el modelo actual
            DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();
            mod.setRowCount(0);

            // Agrega los libros ordenados al modelo
            for (Libro libro : librosOrdenados) {
                mod.addRow(new Object[]{libro.getIdLibro(), libro.getIsbn(), libro.getTitulo(), libro.getAutor(), libro.getGenero(), libro.getEditorial(), libro.isActivo()});
            }
        }
    }//GEN-LAST:event_jcbxBuscarPorItemStateChanged

    private void jTexBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexBuscarActionPerformed

    }//GEN-LAST:event_jTexBuscarActionPerformed
    
    private void jBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar2ActionPerformed
        limpiarTabla2();
    }//GEN-LAST:event_jBLimpiar2ActionPerformed

    private void jTexBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexBuscarKeyTyped
       
        limpiarTabla2();
        
        LibroData libData = new LibroData();
                    List<Libro> librosPorTitulo = libData.buscarPorTitulo(jTexBuscar.getText());
                    List<Libro> librosPorAutor = libData.buscarPorAutor(jTexBuscar.getText());
                    List<Libro> librosPorGenero = libData.buscarPorGenero(jTexBuscar.getText());
           
        if (jcbxBuscarPor.getSelectedIndex() == 0) {

                for (Libro libro : librosPorTitulo) {
                    cargarLista2(libro);                   
                }
                
            }if (jcbxBuscarPor.getSelectedIndex() == 1) {

                    for (Libro libro : librosPorAutor) {
                         cargarLista2(libro);                        
                    }  
                    
                }if (jcbxBuscarPor.getSelectedIndex() == 2) {
                    
                    for (Libro libro : librosPorGenero) {
                        cargarLista2(libro);
                    }                     
                }
                         
    }//GEN-LAST:event_jTexBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBMostrar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButModificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTexBuscar;
    private javax.swing.JComboBox<String> jcbxBuscarPor;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        modelo.addColumn("IdLibro");
        modelo.addColumn("Isbn");
        modelo.addColumn("Título");
        modelo.addColumn("Autor");
        modelo.addColumn("Género");
        modelo.addColumn("Editorial");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
    }

    private void armarCabecera2() {
        mod.addColumn("IdLibro");
        mod.addColumn("Isbn");
        mod.addColumn("Título");
        mod.addColumn("Autor");
        mod.addColumn("Género");
        mod.addColumn("Editorial");
        mod.addColumn("Estado");
        jTable2.setModel(mod);
    }

    private void cargarLista(Libro libro) {
        modelo.addRow(new Object[]{libro.getIdLibro(), libro.getIsbn(), libro.getTitulo(), libro.getAutor(), libro.getGenero(), libro.getEditorial(), libro.isActivo()});
    }

    private void cargarLista2(Libro libro) {
        mod.addRow(new Object[]{libro.getIdLibro(), libro.getIsbn(), libro.getTitulo(), libro.getAutor(), libro.getGenero(), libro.getEditorial(), libro.isActivo()});
    }
    
    private void limpiarTabla2(){
        DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();
        mod.setRowCount(0);
    }

}
