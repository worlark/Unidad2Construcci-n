/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPrincipal;

import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelCreacionUsuario extends javax.swing.JPanel {

    /**
     * Creates new form VistaCreacionUsuario
     */
    
    private VentanaPrincipal papa;
    private String tipoUsuario="";
    
    
    public PanelCreacionUsuario(VentanaPrincipal papa) {
        this.papa=papa;
        initComponents();
        this.nombre.setEnabled(false);
        this.rut.setEnabled(false);
        this.clave.setEnabled(false);
        this.correoElectronico.setEnabled(false);
        this.numeroTelefonico.setEnabled(false);
        this.tarjetaDeCredito.setEnabled(false);
        this.CuentaBancaria.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botonUsuario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botonOrganizador = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        botonPropietario = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        tarjetaDeCredito = new javax.swing.JTextField();
        rut = new javax.swing.JTextField();
        correoElectronico = new javax.swing.JTextField();
        numeroTelefonico = new javax.swing.JTextField();
        CuentaBancaria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("1. Seleccione el tipo de usuario que quiere crear");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new java.awt.BorderLayout());

        botonUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonUsuarioMouseClicked(evt);
            }
        });
        botonUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonUsuarioKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Usuario");

        javax.swing.GroupLayout botonUsuarioLayout = new javax.swing.GroupLayout(botonUsuario);
        botonUsuario.setLayout(botonUsuarioLayout);
        botonUsuarioLayout.setHorizontalGroup(
            botonUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonUsuarioLayout.setVerticalGroup(
            botonUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        botonOrganizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonOrganizadorMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Organizador");

        javax.swing.GroupLayout botonOrganizadorLayout = new javax.swing.GroupLayout(botonOrganizador);
        botonOrganizador.setLayout(botonOrganizadorLayout);
        botonOrganizadorLayout.setHorizontalGroup(
            botonOrganizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonOrganizadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonOrganizadorLayout.setVerticalGroup(
            botonOrganizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonOrganizadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonPropietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPropietarioMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Propietario");

        javax.swing.GroupLayout botonPropietarioLayout = new javax.swing.GroupLayout(botonPropietario);
        botonPropietario.setLayout(botonPropietarioLayout);
        botonPropietarioLayout.setHorizontalGroup(
            botonPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonPropietarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        botonPropietarioLayout.setVerticalGroup(
            botonPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre completo");

        jLabel12.setText("Rut");

        jLabel13.setText("Clave");

        jLabel14.setText("N° Telefonico");

        jLabel15.setText("Correo Electronico");

        jLabel16.setText("Tarjeta de credito");

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        jLabel17.setText("Cuenta bancaria");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menu Creacion de usuario");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("2. Ingrese los siguientes datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(96, 96, 96)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonRegistrar)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(CuentaBancaria)
                                                .addComponent(tarjetaDeCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addGap(142, 142, 142)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(numeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tarjetaDeCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(CuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonRegistrar)))
                .addContainerGap(384, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
        jPanel2.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_claveActionPerformed

    private void botonUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonUsuarioKeyPressed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        if("".equals(this.tipoUsuario)){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de usuario", "Error al seleccionar el tipo de usuario", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.nombre.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Nombre completo", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.rut.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Rut", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.clave.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Clave", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.numeroTelefonico.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Numero Telefonico", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.correoElectronico.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Correo Electronico", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("Organizador".equals(this.tipoUsuario) || "Usuario".equals(this.tipoUsuario)){  
            if("".equals(this.tarjetaDeCredito.getText())){
                JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Tarjeta De Credito", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
                return;
            }
            boolean respuesta = this.papa.getControlador().crearUsuario(this.tipoUsuario, this.nombre.getText(), this.rut.getText(), this.clave.getText(), this.numeroTelefonico.getText(), this.correoElectronico.getText(), this.tarjetaDeCredito.getText(), null);
            if(respuesta){
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                this.papa.derivarAVentanaPrincipalUsuario();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo registrado en el sistema");
            }
        }
        if("Propietario".equals(this.tipoUsuario)){
            if("".equals(this.CuentaBancaria.getText())){
                JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Cuenta Bancaria", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
                return;
            }
            boolean respuesta = this.papa.getControlador().crearUsuario(this.tipoUsuario, this.nombre.getText(), this.rut.getText(), this.clave.getText(), this.numeroTelefonico.getText(), this.correoElectronico.getText(), null, this.CuentaBancaria.getText());
            if(respuesta){
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                this.papa.derivarAVentanaPrincipalUsuario();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo registrado en el sistema");
            }
        }
        boolean respuesta=false;
        if(respuesta){
            JOptionPane.showMessageDialog(null, "Se a registrado correctamente");
            this.papa.derivarAVentanaPrincipalUsuario();
        }else{
            JOptionPane.showMessageDialog(null, "No se encuentra registrado en el sistema");
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonPropietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPropietarioMouseClicked
        // TODO add your handling code here:
        this.tipoUsuario="Propietario";
        this.nombre.setEnabled(true);
        this.rut.setEnabled(true);
        this.clave.setEnabled(true);
        this.correoElectronico.setEnabled(true);
        this.numeroTelefonico.setEnabled(true);
        this.tarjetaDeCredito.setEnabled(false);
        this.CuentaBancaria.setEnabled(true);
    }//GEN-LAST:event_botonPropietarioMouseClicked

    private void botonOrganizadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOrganizadorMouseClicked
        // TODO add your handling code here:
        this.tipoUsuario="Organizador";
        this.nombre.setEnabled(true);
        this.rut.setEnabled(true);
        this.clave.setEnabled(true);
        this.correoElectronico.setEnabled(true);
        this.numeroTelefonico.setEnabled(true);
        this.tarjetaDeCredito.setEnabled(true);
        this.CuentaBancaria.setEnabled(false);
    }//GEN-LAST:event_botonOrganizadorMouseClicked

    private void botonUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonUsuarioMouseClicked
        // TODO add your handling code here:
        this.tipoUsuario="Usuario";
        this.nombre.setEnabled(true);
        this.rut.setEnabled(true);
        this.clave.setEnabled(true);
        this.correoElectronico.setEnabled(true);
        this.numeroTelefonico.setEnabled(true);
        this.tarjetaDeCredito.setEnabled(true);
        this.CuentaBancaria.setEnabled(false);
    }//GEN-LAST:event_botonUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CuentaBancaria;
    private javax.swing.JPanel botonOrganizador;
    private javax.swing.JPanel botonPropietario;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JPanel botonUsuario;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroTelefonico;
    private javax.swing.JTextField rut;
    private javax.swing.JTextField tarjetaDeCredito;
    // End of variables declaration//GEN-END:variables
}
