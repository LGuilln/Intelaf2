/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.reportes;

import frontend.empleados.*;

/**
 *
 * @author lguilln
 */
public class Reporte_Mas_Vendido_Tienda extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar_Producto
     */
    public Reporte_Mas_Vendido_Tienda() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        registrar1 = new javax.swing.JButton();
        generarReporte8 = new javax.swing.JButton();
        exportarReporte8 = new javax.swing.JButton();
        fechaInicial = new com.toedter.calendar.JDateChooser();
        lblNombre1 = new javax.swing.JLabel();
        fechaFinal = new com.toedter.calendar.JDateChooser();
        lblNombre2 = new javax.swing.JLabel();
        tiendaNombre = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de Productos más Vendidos por una Tienda");
        setToolTipText("");

        lblNombre.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblNombre.setText("Del:");

        registrar.setBackground(new java.awt.Color(102, 255, 0));
        registrar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        registrar1.setBackground(new java.awt.Color(102, 255, 0));
        registrar1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        registrar1.setText("Atras");
        registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar1ActionPerformed(evt);
            }
        });

        generarReporte8.setBackground(new java.awt.Color(102, 255, 0));
        generarReporte8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        generarReporte8.setText("Generar");
        generarReporte8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarReporte8ActionPerformed(evt);
            }
        });

        exportarReporte8.setBackground(new java.awt.Color(102, 255, 0));
        exportarReporte8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exportarReporte8.setText("Exportar");
        exportarReporte8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarReporte8ActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblNombre1.setText("Al:");

        lblNombre2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblNombre2.setText("Tienda:");

        tiendaNombre.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        tiendaNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tiendaNombreItemStateChanged(evt);
            }
        });
        tiendaNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiendaNombreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblNombre2)
                .addGap(18, 18, 18)
                .addComponent(tiendaNombre, 0, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(generarReporte8)
                .addGap(18, 18, 18)
                .addComponent(exportarReporte8)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrar)
                .addGap(284, 284, 284)
                .addComponent(registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(477, 477, 477))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(generarReporte8)
                        .addComponent(exportarReporte8)
                        .addComponent(lblNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tiendaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 605, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(registrar1))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

    private void registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrar1ActionPerformed

    private void generarReporte8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarReporte8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generarReporte8ActionPerformed

    private void exportarReporte8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarReporte8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportarReporte8ActionPerformed

    private void tiendaNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tiendaNombreItemStateChanged
        // TODO add your handling code here:
        // agregarNombresTiendas2(dBConectorTienda.recuperarTiendas());
    }//GEN-LAST:event_tiendaNombreItemStateChanged

    private void tiendaNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiendaNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tiendaNombreMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportarReporte8;
    private com.toedter.calendar.JDateChooser fechaFinal;
    private com.toedter.calendar.JDateChooser fechaInicial;
    private javax.swing.JButton generarReporte8;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JButton registrar;
    private javax.swing.JButton registrar1;
    private javax.swing.JComboBox<String> tiendaNombre;
    // End of variables declaration//GEN-END:variables
}