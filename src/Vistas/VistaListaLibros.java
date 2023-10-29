/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import accesoADatos.LibroData;
import entidades.Libro;
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
        armarCabecera();
        armarCabecera2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBMostrar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBLimpiar1 = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jButModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jComboBoxOrdenar = new javax.swing.JComboBox<>();
        jTexBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jBFiltrar = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1050, 650));

        jPFondo.setPreferredSize(new java.awt.Dimension(1050, 619));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE LIBROS");

        jBMostrar.setText("Mostrar");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jBLimpiar1.setText("Limpiar");
        jBLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar1ActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jButModificar.setText("Modificar");
        jButModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButModificarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jComboBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listar por Título", "Listar por Autor", " " }));
        jComboBoxOrdenar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOrdenarItemStateChanged(evt);
            }
        });

        jTexBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecciones una opción");

        jLabel3.setText("Ingrese título o autor");

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
        jScrollPane2.setViewportView(jTable2);

        jBFiltrar.setText("Filtrar");
        jBFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFiltrarActionPerformed(evt);
            }
        });

        jBLimpiar2.setText("Limpiar");
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
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPFondoLayout.createSequentialGroup()
                            .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPFondoLayout.createSequentialGroup()
                                    .addGap(314, 314, 314)
                                    .addComponent(jBMostrar)
                                    .addGap(26, 26, 26))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondoLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButModificar)
                                    .addGap(52, 52, 52)))
                            .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPFondoLayout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPFondoLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jBEliminar)
                                    .addGap(105, 105, 105)
                                    .addComponent(jBLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPFondoLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPFondoLayout.createSequentialGroup()
                            .addGap(430, 430, 430)
                            .addComponent(jLabel1))
                        .addGroup(jPFondoLayout.createSequentialGroup()
                            .addGap(215, 215, 215)
                            .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(65, 65, 65)
                            .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPFondoLayout.createSequentialGroup()
                                    .addComponent(jTexBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBLimpiar2)
                .addGap(475, 475, 475))
            .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPFondoLayout.createSequentialGroup()
                    .addGap(289, 289, 289)
                    .addComponent(jBModificar)
                    .addContainerGap(678, Short.MAX_VALUE)))
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMostrar)
                    .addComponent(jBSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBLimpiar1)
                    .addComponent(jButModificar))
                .addGap(38, 38, 38)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBFiltrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBLimpiar2)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPFondoLayout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addComponent(jBModificar)
                    .addContainerGap(322, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

    }//GEN-LAST:event_jBModificarActionPerformed

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

    private void jComboBoxOrdenarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOrdenarItemStateChanged
        String opcionSeleccionada = (String) jComboBoxOrdenar.getSelectedItem();
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
    }//GEN-LAST:event_jComboBoxOrdenarItemStateChanged

    private void jTexBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexBuscarActionPerformed

    }//GEN-LAST:event_jTexBuscarActionPerformed

    private void jBFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFiltrarActionPerformed
        try {
            // Captura el texto ingresado en el JTextField
            String textoAFiltrar = jTexBuscar.getText();

            // Verifica si se ha ingresado un título o autor para filtrar
            if (!textoAFiltrar.isEmpty()) {

                // Valida que el texto ingresado solo contenga letras y espacios
                if (textoAFiltrar.matches("^[a-zA-Z\\s]+$")) {

                    // Lógica para filtrar los libros por título o autor
                    LibroData libData = new LibroData();
                    List<Libro> librosFiltrados = libData.filtrarLibrosPorTitulo(textoAFiltrar);
                    List<Libro> libroFiltrado = libData.filtrarLibrosPorAutor(textoAFiltrar);

                    // Verifica si se encontraron resultados antes de actualizar el modelo
                    if (!librosFiltrados.isEmpty() || !libroFiltrado.isEmpty()) {

                        // Limpia el modelo actual
                        DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();
                        mod.setRowCount(0);

                        // Agrega los libros filtrados por título al modelo
                        for (Libro libro : librosFiltrados) {
                            mod.addRow(new Object[]{libro.getIdLibro(), libro.getIsbn(), libro.getTitulo(), libro.getAutor(), libro.getGenero(), libro.getEditorial(), libro.isActivo()});
                        }

                        // Agrega los libros filtrados por autor al modelo
                        for (Libro libro : libroFiltrado) {
                            mod.addRow(new Object[]{libro.getIdLibro(), libro.getIsbn(), libro.getTitulo(), libro.getAutor(), libro.getGenero(), libro.getEditorial(), libro.isActivo()});
                        }
                    } else {
                        // Si no se encontraron resultados, mostrar un mensaje de advertencia
                        JOptionPane.showMessageDialog(this, "No se encontraron libros con el título o autor ingresado.");
                    }
                } else {
                    // Si el texto no contiene solo letras y espacios, muestra un mensaje de error
                    JOptionPane.showMessageDialog(this, "Los datos ingresados no son válidos. Por favor, ingresa solo letras y espacios.");
                }
            } else {
                // Si no se ingresó ningún título o autor, mostrar un mensaje de advertencia
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un título o autor para filtrar.");
            }
        } catch (Exception e) {
            // Captura cualquier excepción que pueda ocurrir durante el proceso y muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage());


    }//GEN-LAST:event_jBFiltrarActionPerformed
    }
    private void jBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar2ActionPerformed
        DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();
        mod.setRowCount(0);
    }//GEN-LAST:event_jBLimpiar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBFiltrar;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBMostrar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButModificar;
    private javax.swing.JComboBox<String> jComboBoxOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTexBuscar;
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

}