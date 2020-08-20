/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.clientes;

import frontend.empleados.*;

/**
 *
 * @author lguilln
 */
public class Rastreo_Pedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar_Producto
     */
    public Rastreo_Pedido() {
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
        buscarTiempoTienda = new javax.swing.JButton();
        rastreoCodigoPedido = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblNombre5 = new javax.swing.JLabel();
        lblNombre6 = new javax.swing.JLabel();
        lblNombre7 = new javax.swing.JLabel();
        lblNombre8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rastreoProducto = new javax.swing.JTable();
        rastreoTienda2 = new javax.swing.JLabel();
        rastreoTienda1 = new javax.swing.JLabel();
        rastreoTotal = new javax.swing.JLabel();
        rastreoDias = new javax.swing.JLabel();
        rastreoRestante = new javax.swing.JLabel();
        rastreoAnticipo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Rastreo de Pedidos");
        setPreferredSize(new java.awt.Dimension(1189, 775));

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre.setText("Código Pedido:");

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

        buscarTiempoTienda.setBackground(new java.awt.Color(102, 255, 0));
        buscarTiempoTienda.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        buscarTiempoTienda.setText("Buscar");
        buscarTiempoTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTiempoTiendaActionPerformed(evt);
            }
        });

        rastreoCodigoPedido.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        lblNombre1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre1.setText("\"Lista de Producto\" ");

        lblNombre2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre2.setText("Dias Restantes:");

        lblNombre4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre4.setText("Anticipo: ");

        lblNombre5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre5.setText("Tienda Destino:");

        lblNombre6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre6.setText("Tienda Origen:");

        lblNombre7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre7.setText("Restante: ");

        lblNombre8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre8.setText("Total:");

        rastreoProducto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rastreoProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(rastreoProducto);

        rastreoTienda2.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N

        rastreoTienda1.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N

        rastreoTotal.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N

        rastreoDias.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N

        rastreoRestante.setBackground(new java.awt.Color(255, 0, 0));
        rastreoRestante.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N

        rastreoAnticipo.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNombre1)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(rastreoCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(203, 203, 203)
                                .addComponent(buscarTiempoTienda))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombre6)
                                    .addComponent(lblNombre2)
                                    .addComponent(lblNombre5)
                                    .addComponent(lblNombre8)
                                    .addComponent(lblNombre4)
                                    .addComponent(lblNombre7))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rastreoTienda2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rastreoTienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rastreoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rastreoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rastreoAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rastreoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(rastreoCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTiempoTienda))
                .addGap(33, 33, 33)
                .addComponent(lblNombre1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre6)
                            .addComponent(rastreoTienda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre5)
                            .addComponent(rastreoTienda2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre2)
                            .addComponent(rastreoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre8)
                            .addComponent(rastreoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre4)
                            .addComponent(rastreoAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre7)
                            .addComponent(rastreoRestante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)))
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

    private void buscarTiempoTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTiempoTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarTiempoTiendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarTiempoTienda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblNombre8;
    private javax.swing.JLabel rastreoAnticipo;
    private javax.swing.JTextField rastreoCodigoPedido;
    private javax.swing.JLabel rastreoDias;
    private javax.swing.JTable rastreoProducto;
    private javax.swing.JLabel rastreoRestante;
    private javax.swing.JLabel rastreoTienda1;
    private javax.swing.JLabel rastreoTienda2;
    private javax.swing.JLabel rastreoTotal;
    private javax.swing.JButton registrar;
    private javax.swing.JButton registrar1;
    // End of variables declaration//GEN-END:variables
}
