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
public class Ver_Empleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar_Producto
     */
    public Ver_Empleado() {
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
        empleadoNombre = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        empleadoCodigo = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        registrar1 = new javax.swing.JButton();
        buscarEmpleados = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Empleados");

        lblNombre.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblNombre.setText("Nombre:");

        empleadoNombre.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        empleadoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoNombreActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblCodigo.setText("Código:");

        empleadoCodigo.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

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

        buscarEmpleados.setBackground(new java.awt.Color(102, 255, 0));
        buscarEmpleados.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        buscarEmpleados.setText("Buscar");
        buscarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblCodigo)
                .addGap(18, 18, 18)
                .addComponent(empleadoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empleadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(buscarEmpleados)
                .addContainerGap(74, Short.MAX_VALUE))
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(empleadoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empleadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombre)
                        .addComponent(buscarEmpleados)))
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

    private void buscarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarEmpleadosActionPerformed

    private void empleadoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarEmpleados;
    private javax.swing.JTextField empleadoCodigo;
    private javax.swing.JTextField empleadoNombre;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JButton registrar;
    private javax.swing.JButton registrar1;
    // End of variables declaration//GEN-END:variables
}
