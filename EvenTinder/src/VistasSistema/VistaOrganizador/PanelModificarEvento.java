/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaOrganizador;

import ModuloGestionEventos.Evento;
import ModuloGestionPropiedades.Propiedad;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelModificarEvento extends javax.swing.JPanel {

    /**
     * Creates new form PanelCrearEvento
     */
    
    private VentanaPrincipalOrganizador papa;
    private ArrayList<Propiedad> propiedades;
    private DefaultListModel modeloLista;
    private DefaultListModel modeloLista2;
    private ArrayList<Integer> precios;
    private ArrayList<Evento> eventos;
    private int contador;
    
    public PanelModificarEvento(VentanaPrincipalOrganizador papa){
        this.papa=papa;
        initComponents();
        this.modeloLista=new DefaultListModel();
        this.modeloLista2=new DefaultListModel();
        this.listaEventos.removeAllItems();
        this.lista.setModel(modeloLista2);
        this.listaSectores.removeAllItems();
        capacidad.setText("0");
        capacidad.setEnabled(false);
        capacidad.setEditable(false);
        actualizarMenuEventos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        listaSectores = new javax.swing.JComboBox<>();
        precio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonModificarPrecio = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        diasMaximosDevolucion = new javax.swing.JTextField();
        fechaDeInicio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fechaDeTermino = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonModificarEvento = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        listaEventos = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane3.setBorder(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú modificacion de evento");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("3. modifique precio de la entrada por sector");

        listaSectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSectoresActionPerformed(evt);
            }
        });

        jLabel1.setText("Precio");

        botonModificarPrecio.setText("Modificar precio sector");
        botonModificarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaSectores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(botonModificarPrecio)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(precio))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(listaSectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(botonModificarPrecio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(lista);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Lista de sectores");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Fecha de inicio");

        jLabel13.setText("Fecha de termino");

        jLabel14.setText("Capacidad");

        jLabel15.setText("Descripcion");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("2. Ingrese los siguientes datos");

        fechaDeTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaDeTerminoActionPerformed(evt);
            }
        });

        jLabel16.setText("Dias maximo de devolucion");

        jLabel5.setText("Nombre");

        botonModificarEvento.setText("Modificar Evento");
        botonModificarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
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
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonModificarEvento)
                                    .addComponent(diasMaximosDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addComponent(botonModificarEvento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("1. Seleccione el evento");

        listaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEventosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 200, Short.MAX_VALUE))
                    .addComponent(listaEventos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(listaEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel7);

        add(jScrollPane3);
    }// </editor-fold>//GEN-END:initComponents

    private void fechaDeTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaDeTerminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaDeTerminoActionPerformed

    private void botonModificarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarEventoActionPerformed
        // TODO add your handling code here:
        int resp = this.validarDatos(this.nombre.getText(), this.descripcion.getText(), this.fechaDeInicio.getText(), this.fechaDeTermino.getText(), this.capacidad.getText(),this.diasMaximosDevolucion.getText());
        if(resp==0){
            boolean respuesta = false;
            respuesta=this.papa.getControladorOrganizador().modificarEvento(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdEvento(), this.nombre.getText(), this.descripcion.getText(), this.parseFecha(this.fechaDeInicio.getText()),this.parseFecha(this.fechaDeTermino.getText()), this.eventos.get(this.listaEventos.getSelectedIndex()-1).getCapacidadMaximaDelEvento(), Integer.parseInt(this.diasMaximosDevolucion.getText()), false);
            if(respuesta){
                JOptionPane.showMessageDialog(null, "Operacion realizada correctamente");
                this.nombre.setText("");
                this.fechaDeInicio.setText("");
                this.fechaDeTermino.setText("");
                this.capacidad.setText("0");
                this.descripcion.setText("");
                this.diasMaximosDevolucion.setText("");
                this.listaEventos.setSelectedIndex(0);
                this.listaSectores.setSelectedIndex(0);
                this.actualizarListaSectores();
                this.actualizarMenuEventos();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo registrado en el sistema");
            }
        }
        if(resp==1){
            JOptionPane.showMessageDialog(null, "Se espera que el nombre del evento tenga solo letras y numeros \n"
                    + "Ej: La fista de los gatos", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==2){
            JOptionPane.showMessageDialog(null, "Se espera que la descripcion tenga entre entre sea: nnn nnn nnn - nok \n" + 
                    "Ej: 11111111-1", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==3){
            JOptionPane.showMessageDialog(null, "Se espera que la fecha de inicio tenga el siguiente formato: dd-mm-aaaa \n" + 
                    "Ej: 10-10-2010", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==4){
            JOptionPane.showMessageDialog(null, "Se espera que la fecha de termino tenga el siguiente formato: dd-mm-aaaa \n" + 
                    "Ej: 10-10-2020", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==5){
            JOptionPane.showMessageDialog(null, "Se espera que la capacidad sea mayor que 0 \n" + 
                    "Ej: 10", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==6){
            JOptionPane.showMessageDialog(null, "Se espera que los dias maximos de devolucion sea mayor que 0 \n" + 
                    "Ej: 10", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
    }//GEN-LAST:event_botonModificarEventoActionPerformed

    private void listaSectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSectoresActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_listaSectoresActionPerformed

    private void botonModificarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPrecioActionPerformed
        // TODO add your handling code here:
        this.eventos=this.papa.getControladorOrganizador().obtenerInformacionDeEventosNoPublicadosDeUnOrganizador();
        this.propiedades = this.papa.getControladorPropietario().mostrarInformacionTodasLasPropiedades();
        if(this.listaSectores.getSelectedIndex()<=0){
            return;
        }
        //pinki esta validacion hay que hacer
        if(this.precio.getText().equals("") || !isNumero(this.precio.getText())){
            return;
        }
        for(int i=0; i< this.propiedades.size(); i++){
            System.out.println("this.listaEventos.getSelectedIndex():" + this.listaEventos.getSelectedIndex());
            if(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdPropiedad()==this.propiedades.get(i).getId()){
                this.papa.getControladorOrganizador().modificarPrecioSector(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdEvento(), Integer.parseInt(this.precio.getText()),this.propiedades.get(i).getListaSectores().get(this.listaSectores.getSelectedIndex()-1).getNombre(), this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdPropiedad());
                int nuevoTotal=0;
                for (int j = 0; j < this.propiedades.get(i).getListaSectores().size(); j++) {
                    int a = this.papa.getControladorOrganizador().obtenerPrecioEntradaPorSector(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdEvento(), this.propiedades.get(i).getListaSectores().get(j).getNombre(), this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdPropiedad());
                    if(a>-1){
                        nuevoTotal+=this.propiedades.get(i).getListaSectores().get(j).getCapacidadDelSector();
                    }
                }
                this.papa.getControladorOrganizador().modificarEvento(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdEvento(), this.eventos.get(this.listaEventos.getSelectedIndex()-1).getNombre(), this.eventos.get(this.listaEventos.getSelectedIndex()-1).getDescripcion(), this.eventos.get(this.listaEventos.getSelectedIndex()-1).getFechaDeInicio(), this.eventos.get(this.listaEventos.getSelectedIndex()-1).getFechaDeTermino(), nuevoTotal, this.eventos.get(this.listaEventos.getSelectedIndex()-1).getPlazoDevolucionEntrada(), false);
                this.precio.setText("");
                this.listaEventos.setSelectedIndex(this.listaEventos.getItemCount()-1);
                this.listaSectores.setSelectedIndex(0);
                this.actualizarListaSectores();
                this.listaEventosActionPerformed(evt);
                JOptionPane.showMessageDialog(null, "Se a modificado el valor de la entrada con exito");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se pudo modificar el precio en el sistema");
    }//GEN-LAST:event_botonModificarPrecioActionPerformed

    private void listaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEventosActionPerformed
        if(this.listaEventos.getSelectedIndex()<=0){
            return;
        }
        this.nombre.setText(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getNombre());
        this.fechaDeInicio.setText(convertirFechaString(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getFechaDeInicio()));
        this.fechaDeTermino.setText(convertirFechaString(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getFechaDeTermino()));
        this.capacidad.setText(Integer.toString(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getCapacidadMaximaDelEvento()));
        this.descripcion.setText(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getDescripcion());
        this.diasMaximosDevolucion.setText(Integer.toString(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getPlazoDevolucionEntrada()));
        actualizarListaSectores();
    }//GEN-LAST:event_listaEventosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarEvento;
    private javax.swing.JButton botonModificarPrecio;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField diasMaximosDevolucion;
    private javax.swing.JTextField fechaDeInicio;
    private javax.swing.JTextField fechaDeTermino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lista;
    private javax.swing.JComboBox<String> listaEventos;
    private javax.swing.JComboBox<String> listaSectores;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables

    //Aca abajo van a estar los metodos que se tienen que hacer 
    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */
    
    public int validarDatos(String nombre,String descripcion, String fechaDeInicio, String fechaDeTermino, String capacidad, String diasMaximos){
        
        return 0;
    }
    
    public int validarNombre(String nombre){
        ArrayList<Integer> caracteres = new ArrayList();
        caracteres.add(193);
        caracteres.add(201);
        caracteres.add(205);
        caracteres.add(211);
        caracteres.add(218);
        caracteres.add(225);
        caracteres.add(233);
        caracteres.add(237);
        caracteres.add(243);
        caracteres.add(250);
        caracteres.add(209);
        caracteres.add(241);
        caracteres.add(32);
        if(!nombre.equals("")){
            char[] aux = nombre.toCharArray();
            if(aux.length <5){
                for(char c : aux){                
                    int ascii = (int) c;
                    if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122)|| (ascii >=48 && ascii <=57) || caracteres.contains(ascii)  )   ){
                        return 1;
                    }
                }  
            }
        }
        else{
            return 1;
        }
        return 0;
    }
    
    public int validarDescripcion(String descripcion){
        if(!descripcion.equals("")){
            char[] d = descripcion.toCharArray();
            if(d.length<=500){
                return 0;
            }
            else{
                return 2;
            }
        }
        else{
            return 2;
        }
    }
    
    /**
     * 
     * Retorna 0 si esta bien.
     * Retorna 3 si algo esta vacio.
     * Retorna 4 si el formato de fecha esta mal (tiene que ser dd/MM/yyyy.
     * Retorna 5 si el inicio es mayor que el termino, o los dias maximos no son numeros.
     * Retorna 6 si los dias ingresados no calzan con el inicio del evento y la fecha actual.
     * 
     * 
     * @param fechaDeInicio
     * @param fechaDeTermino
     * @param diasMaximosDevolucion
     * @return
     * @throws ParseException 
     */
    public int validarFechas(String fechaDeInicio, String fechaDeTermino, String diasMaximosDevolucion) throws ParseException{
        if(!fechaDeInicio.equals("") && !fechaDeTermino.equals("") && !diasMaximosDevolucion.equals("")  ){  
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                sdf.setLenient(false);
                
                Date inicio = sdf.parse(fechaDeInicio);               
                Date termino = sdf.parse(fechaDeTermino);
                Date actual = new Date();
                                
                if(inicio.after(actual) && (inicio.before(termino)|| inicio.equals(termino))  && isNumero(diasMaximosDevolucion) ){
                    int dias=(int) ((inicio.getTime()-actual.getTime())/86400000);                    
                    if(Integer.parseInt(diasMaximosDevolucion) <= dias){
                        return 0;
                    }
                    else{
                        return 6;
                    }
                }            
                else{
                    return 5;
                }

            }catch (ParseException e) {
                return 4;
            }            
        }
        return 3;
    }
    
    public int validarCapacidad(String capacidad){
        if(!capacidad.equals("") && isNumero(capacidad)){
            char[] aux = capacidad.toCharArray();
            if(aux.length <=10){
                return 0;
            }
            else{
                return 7;
            }
        }
        else{
            return 7;
        }
    }
    
    /**
     * MÃ©todo que se encarga de verificar que los numeros ingresados son numeros validos
     */
    private boolean isNumero(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        if (resultado==true) {
            int a = Integer.parseInt(cadena);
            if (a>0) {
                resultado = true;
            }
            else{
                resultado = false;
            }
        }
        return resultado;
    }
    
    private void actualizarListaSectores(){
        this.eventos=this.papa.getControladorOrganizador().obtenerInformacionDeEventosNoPublicadosDeUnOrganizador();
        if(this.listaEventos.getSelectedIndex()<=0){
            this.listaSectores.removeAllItems();
            this.modeloLista2=new DefaultListModel();
            this.lista.setModel(this.modeloLista2);
            this.repaint();
            this.revalidate();
            return;
        }
        this.propiedades = this.papa.getControladorPropietario().mostrarInformacionTodasLasPropiedades();
        this.lista.removeAll();
        this.modeloLista2=new DefaultListModel();
        this.listaSectores.removeAllItems();
        listaSectores.addItem("");
        int numero=-1;
        if(this.propiedades!=null){
            for(int i=0; i<this.propiedades.size();i++){
                if(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdPropiedad()==this.propiedades.get(i).getId()){
                    numero = i;
                    break;
                }
            }
            if(numero==-1){
                System.out.println("cago");
                return;
            }
            for(int i=0; i<this.propiedades.get(numero).getListaSectores().size(); i++){
                listaSectores.addItem(this.propiedades.get(numero).getListaSectores().get(i).getNombre());
                int a = this.papa.getControladorOrganizador().obtenerPrecioEntradaPorSector(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdEvento(), this.propiedades.get(numero).getListaSectores().get(i).getNombre(), this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdPropiedad());
                this.modeloLista2.addElement("Nombre:" + this.propiedades.get(numero).getListaSectores().get(i).getNombre() + "  Capacidad:" +  this.propiedades.get(numero).getListaSectores().get(i).getCapacidadDelSector() + "  precio:" + a);
            }
        }
        this.lista.setModel(this.modeloLista2);
        this.repaint();
        this.revalidate();
    }
    
    public Date parseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
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
    
    private void actualizarMenuEventos(){
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
    
    	
    public String convertirFechaString(Date date){

       Format formatter = new SimpleDateFormat("dd-MM-yyyy");
       return formatter.format(date);
    }
}
