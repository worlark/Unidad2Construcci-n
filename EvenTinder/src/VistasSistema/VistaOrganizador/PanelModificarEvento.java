/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaOrganizador;

import ModuloGestionEventos.Evento;
import ModuloGestionPropiedades.Propiedad;
import VistasSistema.VistaPropietario.PanelModificarPropiedad;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelModificarEvento extends javax.swing.JPanel {

    /**
     * Creates new form PanelModificarEvento
     */
    
    private VentanaPrincipalOrganizador papa;
    private ArrayList<Propiedad> propiedades;
    private DefaultListModel modeloLista;
    private ArrayList<Evento> eventos;
    
    public PanelModificarEvento(VentanaPrincipalOrganizador papa) {
        this.papa=papa;
        initComponents();
        this.modeloLista=new DefaultListModel();
        this.actualizarlistaEventos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonModificarEvento = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        listaEventos = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fechaDeInicio = new javax.swing.JTextField();
        diasMaximosDevolucion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fechaDeTermino = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        botonModificarEvento.setText("Modificar evento");
        botonModificarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarEventoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Modificar de evento");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        listaEventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEventosActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("1. Selecciones el evento a modificar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(listaEventos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(listaEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setText("Dias maximo de devolucion");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("2. Ingrese los siguientes datos");

        jLabel5.setText("Nombre");

        jLabel14.setText("Capacidad");

        jLabel13.setText("Fecha de termino");

        jLabel12.setText("Fecha de inicio");

        jLabel15.setText("Descripcion");

        fechaDeTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaDeTerminoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaDeTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(diasMaximosDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaDeTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(diasMaximosDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(botonModificarEvento)))
                .addGap(373, 695, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonModificarEvento)
                .addContainerGap(424, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarEventoActionPerformed
        // TODO add your handling code here:
        int resp = this.validarDatos(this.nombre.getText(), this.descripcion.getText(), this.fechaDeInicio.getText(), this.fechaDeTermino.getText(), this.capacidad.getText(),this.diasMaximosDevolucion.getText());
        if(resp==0){
            boolean respuesta = false;
            respuesta = this.papa.getControladorOrganizador().modificarEvento(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdEvento(), this.nombre.getText(), this.descripcion.getText(),this.parseFecha(this.fechaDeInicio.getText()), this.parseFecha(this.fechaDeTermino.getText()), Integer.parseInt(this.capacidad.getText()),Integer.parseInt(this.diasMaximosDevolucion.getText()), false);
            if(respuesta){
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                this.nombre.setText("");
                this.fechaDeInicio.setText("");
                this.fechaDeTermino.setText("");
                this.capacidad.setText("");
                this.descripcion.setText("");
                this.diasMaximosDevolucion.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "El nombre del evento ya se enceuntra regustrado en la base de datos");
            }
        }
        if(resp==1){
            JOptionPane.showMessageDialog(null, "", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==2){
            JOptionPane.showMessageDialog(null, "", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==3){
            JOptionPane.showMessageDialog(null, "", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==4){
            JOptionPane.showMessageDialog(null, "", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==5){
            JOptionPane.showMessageDialog(null, "", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==6){
            JOptionPane.showMessageDialog(null, "", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_botonModificarEventoActionPerformed

    private void fechaDeTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaDeTerminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaDeTerminoActionPerformed

    private void listaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEventosActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_listaEventosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarEvento;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField diasMaximosDevolucion;
    private javax.swing.JTextField fechaDeInicio;
    private javax.swing.JTextField fechaDeTermino;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> listaEventos;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
    //Aca abajo van a estar los metodos que se tienen que hacer 
    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */
    
    public int validarDatos(String nombre, String descripcion, String fechaDeInicio, String fechaDeTermino, String capacidad, String diasMaximos){
        return 0;
    }
    
     //Aca abajo van a estar los metodos que se tienen que hacer 
    
    private void actualizarlistaEventos(){
        eventos = this.papa.getControladorOrganizador().obtenerInformacionDeEventosNoPublicadosDeUnOrganizador();
        listaEventos.removeAllItems();
        listaEventos.addItem("");
        if(this.eventos!=null){
            for(int i=0; i<this.eventos.size(); i++){
                listaEventos.addItem(eventos.get(i).getNombre());
            }
            this.repaint();
            this.revalidate();
        }
    }

    public Date parseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
}
