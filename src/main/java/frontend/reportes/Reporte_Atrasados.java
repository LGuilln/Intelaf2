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
public class Reporte_Atrasados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar_Producto
     */
    public Reporte_Atrasados() {
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
        generarReporte3 = new javax.swing.JButton();
        tiempoTienda = new javax.swing.JComboBox<>();
        exportarReporte3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de Pedidos que están Atrasados");

        lblNombre.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblNombre.setText("Tienda:");

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

        generarReporte3.setBackground(new java.awt.Color(102, 255, 0));
        generarReporte3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        generarReporte3.setText("Generar");
        generarReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarReporte3ActionPerformed(evt);
            }
        });

        tiempoTienda.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        tiempoTienda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tiempoTiendaItemStateChanged(evt);
            }
        });
        tiempoTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiempoTiendaMouseClicked(evt);
            }
        });

        exportarReporte3.setBackground(new java.awt.Color(102, 255, 0));
        exportarReporte3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exportarReporte3.setText("Exportar");
        exportarReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarReporte3ActionPerformed(evt);
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
                .addComponent(tiempoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(generarReporte3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exportarReporte3)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(tiempoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generarReporte3)
                    .addComponent(exportarReporte3))
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

    private void generarReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarReporte3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generarReporte3ActionPerformed

    private void tiempoTiendaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tiempoTiendaItemStateChanged
        // TODO add your handling code here:
        // agregarNombresTiendas2(dBConectorTienda.recuperarTiendas());
    }//GEN-LAST:event_tiempoTiendaItemStateChanged

    private void tiempoTiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoTiendaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoTiendaMouseClicked

    private void exportarReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarReporte3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportarReporte3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportarReporte3;
    private javax.swing.JButton generarReporte3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JButton registrar;
    private javax.swing.JButton registrar1;
    private javax.swing.JComboBox<String> tiempoTienda;
    // End of variables declaration//GEN-END:variables
}
