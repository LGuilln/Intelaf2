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
public class Reporte_Pedidos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar_Producto
     */
    public Reporte_Pedidos() {
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
        generarReporte6 = new javax.swing.JButton();
        clienteNombre = new javax.swing.JComboBox<>();
        exportarReporte6 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de Pedidos en Curso por Cliente");
        setToolTipText("");

        lblNombre.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblNombre.setText("Cliente:");

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

        generarReporte6.setBackground(new java.awt.Color(102, 255, 0));
        generarReporte6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        generarReporte6.setText("Generar");
        generarReporte6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarReporte6ActionPerformed(evt);
            }
        });

        clienteNombre.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        clienteNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clienteNombreItemStateChanged(evt);
            }
        });
        clienteNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteNombreMouseClicked(evt);
            }
        });

        exportarReporte6.setBackground(new java.awt.Color(102, 255, 0));
        exportarReporte6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exportarReporte6.setText("Exportar");
        exportarReporte6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarReporte6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(registrar)
                .addGap(284, 284, 284)
                .addComponent(registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(477, 477, 477))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(generarReporte6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exportarReporte6)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(clienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generarReporte6)
                    .addComponent(exportarReporte6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 609, Short.MAX_VALUE)
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

    private void generarReporte6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarReporte6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generarReporte6ActionPerformed

    private void clienteNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clienteNombreItemStateChanged
        // TODO add your handling code here:
        // agregarNombresTiendas2(dBConectorTienda.recuperarTiendas());
    }//GEN-LAST:event_clienteNombreItemStateChanged

    private void clienteNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteNombreMouseClicked

    private void exportarReporte6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarReporte6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportarReporte6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> clienteNombre;
    private javax.swing.JButton exportarReporte6;
    private javax.swing.JButton generarReporte6;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JButton registrar;
    private javax.swing.JButton registrar1;
    // End of variables declaration//GEN-END:variables
}
