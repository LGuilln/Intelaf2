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
public class Editar_Empleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar_Producto
     */
    public Editar_Empleado() {
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

        empleadolNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCodigoFabricante = new javax.swing.JLabel();
        empleadoCUI = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        empleadoNIT = new javax.swing.JTextField();
        lblGarantia = new javax.swing.JLabel();
        empleadoTelefono = new javax.swing.JTextField();
        empleadoDireccion = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        registrar1 = new javax.swing.JButton();
        editarEmpleado = new javax.swing.JButton();
        empleadoCorreo = new javax.swing.JTextField();
        lblGarantia1 = new javax.swing.JLabel();
        lblGarantia2 = new javax.swing.JLabel();
        empleadoUsuario = new javax.swing.JTextField();
        lblGarantia3 = new javax.swing.JLabel();
        empleadoContraseña = new javax.swing.JTextField();
        empleadoCodigo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Empleados");

        empleadolNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        empleadolNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        lblCodigoFabricante.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCodigoFabricante.setText("CUI:");

        empleadoCUI.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        empleadoCUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoCUIActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCodigo.setText("Código:");

        lblPrecio.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblPrecio.setText("Nit:");

        empleadoNIT.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        lblGarantia.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblGarantia.setText("Telefono:");

        empleadoTelefono.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        empleadoDireccion.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        lblDescripcion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblDescripcion.setText("Direccion:");

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

        editarEmpleado.setBackground(new java.awt.Color(102, 255, 0));
        editarEmpleado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        editarEmpleado.setText("Actualizar");
        editarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEmpleadoActionPerformed(evt);
            }
        });

        empleadoCorreo.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        lblGarantia1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblGarantia1.setText("Correo Electronico:");

        lblGarantia2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblGarantia2.setText("Usuario:");

        empleadoUsuario.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        empleadoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoUsuarioActionPerformed(evt);
            }
        });

        lblGarantia3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblGarantia3.setText("Contraseña:");

        empleadoContraseña.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        empleadoCodigo.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(registrar)
                .addGap(284, 284, 284)
                .addComponent(registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309)
                .addComponent(editarEmpleado)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGarantia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empleadoCorreo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigoFabricante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(empleadoCUI))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(empleadolNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(empleadoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGarantia)
                                .addGap(27, 27, 27)
                                .addComponent(empleadoTelefono))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrecio)
                                .addGap(18, 18, 18)
                                .addComponent(empleadoNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblGarantia2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(empleadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblGarantia3)
                                .addGap(27, 27, 27)
                                .addComponent(empleadoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(empleadoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empleadolNombre)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigo)
                        .addComponent(empleadoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoFabricante)
                    .addComponent(empleadoCUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio)
                    .addComponent(empleadoNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGarantia)
                    .addComponent(empleadoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGarantia1)
                    .addComponent(empleadoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empleadoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGarantia3)
                    .addComponent(empleadoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGarantia2)
                    .addComponent(empleadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(registrar1)
                    .addComponent(editarEmpleado))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empleadoCUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoCUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoCUIActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

    private void registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrar1ActionPerformed

    private void editarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarEmpleadoActionPerformed

    private void empleadoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarEmpleado;
    private javax.swing.JTextField empleadoCUI;
    private javax.swing.JLabel empleadoCodigo;
    private javax.swing.JTextField empleadoContraseña;
    private javax.swing.JTextField empleadoCorreo;
    private javax.swing.JTextField empleadoDireccion;
    private javax.swing.JTextField empleadoNIT;
    private javax.swing.JTextField empleadoTelefono;
    private javax.swing.JTextField empleadoUsuario;
    private javax.swing.JLabel empleadolNombre;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoFabricante;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblGarantia1;
    private javax.swing.JLabel lblGarantia2;
    private javax.swing.JLabel lblGarantia3;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JButton registrar;
    private javax.swing.JButton registrar1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
