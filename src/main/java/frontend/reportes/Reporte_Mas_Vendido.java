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
public class Reporte_Mas_Vendido extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar_Producto
     */
    public Reporte_Mas_Vendido() {
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
        generarReporte7 = new javax.swing.JButton();
        exportarReporte7 = new javax.swing.JButton();
        fechaInicial = new com.toedter.calendar.JDateChooser();
        lblNombre1 = new javax.swing.JLabel();
        fechaFinal = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista de Productos más Vendidos");
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

        generarReporte7.setBackground(new java.awt.Color(102, 255, 0));
        generarReporte7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        generarReporte7.setText("Generar");
        generarReporte7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarReporte7ActionPerformed(evt);
            }
        });

        exportarReporte7.setBackground(new java.awt.Color(102, 255, 0));
        exportarReporte7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exportarReporte7.setText("Exportar");
        exportarReporte7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarReporte7ActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblNombre1.setText("Al:");

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
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(generarReporte7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exportarReporte7)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombre)
                        .addComponent(generarReporte7)
                        .addComponent(exportarReporte7)
                        .addComponent(lblNombre1))
                    .addComponent(fechaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void generarReporte7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarReporte7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generarReporte7ActionPerformed

    private void exportarReporte7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarReporte7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportarReporte7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportarReporte7;
    private com.toedter.calendar.JDateChooser fechaFinal;
    private com.toedter.calendar.JDateChooser fechaInicial;
    private javax.swing.JButton generarReporte7;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JButton registrar;
    private javax.swing.JButton registrar1;
    // End of variables declaration//GEN-END:variables
}
