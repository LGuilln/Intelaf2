/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.empleados;

/**
 *
 * @author lguilln
 */
public class Modificar_Tiempo_Tienda extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar_Producto
     */
    public Modificar_Tiempo_Tienda() {
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
        modificarTiempoTienda = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        tiempoDias = new javax.swing.JTextField();
        lblPrecio1 = new javax.swing.JLabel();
        tiempoTienda1 = new javax.swing.JComboBox<>();
        tiempoTienda2 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Tiempo en Tienda");

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre.setText("Código Tienda 1:");

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

        modificarTiempoTienda.setBackground(new java.awt.Color(102, 255, 0));
        modificarTiempoTienda.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        modificarTiempoTienda.setText("Actualizar");
        modificarTiempoTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTiempoTiendaActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNombre1.setText("Código Tienda 2:");

        tiempoDias.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        lblPrecio1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblPrecio1.setText("Tiempo (Dias)");

        tiempoTienda1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        tiempoTienda1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tiempoTienda1ItemStateChanged(evt);
            }
        });
        tiempoTienda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiempoTienda1MouseClicked(evt);
            }
        });

        tiempoTienda2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPrecio1)
                            .addGap(18, 18, 18)
                            .addComponent(tiempoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre1)
                                .addComponent(lblNombre))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tiempoTienda1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tiempoTienda2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registrar)
                        .addGap(284, 284, 284)
                        .addComponent(registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309)
                        .addComponent(modificarTiempoTienda)))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre1)
                            .addComponent(tiempoTienda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tiempoTienda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio1)
                    .addComponent(tiempoDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(registrar1)
                    .addComponent(modificarTiempoTienda))
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

    private void modificarTiempoTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTiempoTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarTiempoTiendaActionPerformed

    private void tiempoTienda1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tiempoTienda1ItemStateChanged
        // TODO add your handling code here:
       // agregarNombresTiendas2(dBConectorTienda.recuperarTiendas());
    }//GEN-LAST:event_tiempoTienda1ItemStateChanged

    private void tiempoTienda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoTienda1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoTienda1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JButton modificarTiempoTienda;
    private javax.swing.JButton registrar;
    private javax.swing.JButton registrar1;
    private javax.swing.JTextField tiempoDias;
    private javax.swing.JComboBox<String> tiempoTienda1;
    private javax.swing.JComboBox<String> tiempoTienda2;
    // End of variables declaration//GEN-END:variables
}
