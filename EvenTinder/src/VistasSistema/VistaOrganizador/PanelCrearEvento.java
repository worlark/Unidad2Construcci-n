/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaOrganizador;

import ModuloGestionPropiedades.Propiedad;
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
public class PanelCrearEvento extends javax.swing.JPanel {

    /**
     * Creates new form PanelCrearEvento
     */
    
    private VentanaPrincipalOrganizador papa;
    private ArrayList<Propiedad> propiedades;
    private DefaultListModel modeloLista;
    private DefaultListModel modeloLista2;
    private ArrayList<Integer> precios;
    private boolean go;
    
    public PanelCrearEvento(VentanaPrincipalOrganizador papa){
        this.papa=papa;
        initComponents();
        this.modeloLista=new DefaultListModel();
        this.modeloLista2=new DefaultListModel();
        this.actualizarMenuOpciones();
        this.lista.setModel(modeloLista2);
        this.listaSectores.removeAllItems();
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
        botonRegistrarPrecio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        listaPropiedades = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalles = new javax.swing.JList<>();
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
        botonCrearEvento = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setLayout(new java.awt.BorderLayout());

        jScrollPane3.setBorder(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Creación de evento");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("3. Añadir precio de la entrada por sector");

        listaSectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSectoresActionPerformed(evt);
            }
        });

        jLabel1.setText("Precio");

        botonRegistrarPrecio.setText("Guardar");
        botonRegistrarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarPrecioActionPerformed(evt);
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
                                .addComponent(botonRegistrarPrecio)
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
                .addComponent(botonRegistrarPrecio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("2. Seleccione la propiedad donde va a realizar el evento");

        listaPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPropiedadesActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(detalles);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(listaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel19.setText("1. Ingrese los siguientes datos");

        fechaDeTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaDeTerminoActionPerformed(evt);
            }
        });

        jLabel16.setText("Dias maximo de devolucion");

        jLabel5.setText("Nombre");

        botonCrearEvento.setText("Crear Evento");
        botonCrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearEventoActionPerformed(evt);
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
                                    .addComponent(botonCrearEvento)
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
                .addComponent(botonCrearEvento)
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
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
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
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel7);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void listaPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPropiedadesActionPerformed
        this.go=false;
        System.out.println(listaPropiedades.getSelectedIndex());
        if(listaPropiedades.getSelectedIndex()==0){
            this.detalles.removeAll();
        }
        if(listaPropiedades.getSelectedIndex()>0){
            this.detalles.removeAll();
            this.modeloLista=new DefaultListModel();
            this.modeloLista.addElement(("Nombre: " + this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getNombre()));
            this.modeloLista.addElement(("descripcion: " + this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getDescripcion()));
            this.modeloLista.addElement(("ubicacion: "+ this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getUbicacion()));
            this.modeloLista.addElement(("capacidadTotal: "+ this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getCapacidadTotal()));
            this.modeloLista.addElement(("cantidadDeSectores: "+ this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getListaSectores().size()));
            this.modeloLista.addElement(("valorArriendo: "+ this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getValorArriendo()));
            this.detalles.setModel(this.modeloLista);
            this.actualizarMenuSectores();
            this.actualizarListaSectores();
            
        }
    }//GEN-LAST:event_listaPropiedadesActionPerformed

    private void fechaDeTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaDeTerminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaDeTerminoActionPerformed

    private void botonCrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearEventoActionPerformed
        // TODO add your handling code here:
        int resp = this.validarDatos(this.nombre.getText(), this.descripcion.getText(), this.fechaDeInicio.getText(), this.fechaDeTermino.getText(), this.capacidad.getText(),this.diasMaximosDevolucion.getText());
        if(this.listaPropiedades.getSelectedIndex()<=0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una propiedad", "Error al seleccionar una propiedad", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!go){
            JOptionPane.showMessageDialog(null, "Debe agregar por lo menos un valor de entrada", "Error al registrar sector", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==0){
            int idEvento = 0;
            idEvento = this.papa.getControladorOrganizador().crearEvento(this.nombre.getText(), this.descripcion.getText(),this.parseFecha(this.fechaDeInicio.getText()), this.parseFecha(this.fechaDeTermino.getText()), Integer.parseInt(this.capacidad.getText()),Integer.parseInt(this.diasMaximosDevolucion.getText()), false, this.propiedades.get(this.listaPropiedades.getSelectedIndex()-1).getId());
            if(idEvento>0){
                for(int i=0; i< this.modeloLista2.getSize(); i++){
                    if(this.precios.get(i)!=-1){
                        this.papa.getControladorOrganizador().agregarPrecioSector(idEvento, this.precios.get(i), this.propiedades.get(this.listaPropiedades.getSelectedIndex()-1).getListaSectores().get(i).getNombre(), this.propiedades.get(this.listaPropiedades.getSelectedIndex()-1).getId());
                    }
                }
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                this.nombre.setText("");
                this.fechaDeInicio.setText("");
                this.fechaDeTermino.setText("");
                this.capacidad.setText("");
                this.descripcion.setText("");
                this.diasMaximosDevolucion.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo registrado en el sistema");
            }
        }
        if(resp==1){
            JOptionPane.showMessageDialog(null, "Se espera que el nombre del evento tenga solo letras y numeros \n"
                    + "Ej: LolaPaluzza", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
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
    }//GEN-LAST:event_botonCrearEventoActionPerformed

    private void listaSectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSectoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaSectoresActionPerformed

    private void botonRegistrarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarPrecioActionPerformed
        // TODO add your handling code here:
        if(this.listaSectores.getSelectedIndex()<=0){
            return;
        }
        if(this.precio.getText().equals("")){
            return ;
        }
        go=true;
        this.precios.set(this.listaSectores.getSelectedIndex()-1, Integer.parseInt(precio.getText()));
        this.precio.setText("");
        this.actualizarListaSectores();
    }//GEN-LAST:event_botonRegistrarPrecioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearEvento;
    private javax.swing.JButton botonRegistrarPrecio;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField descripcion;
    private javax.swing.JList<String> detalles;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lista;
    private javax.swing.JComboBox<String> listaPropiedades;
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
    
       /**
     * Método que se encarga de verificar que los numeros ingresados son numeros validos
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
    
    //Aca abajo van a estar los metodos que se tienen que hacer 
    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */
 
    // no se puede hacer tdd ya que necesita otro metodo
    private void actualizarMenuOpciones(){
        this.propiedades = this.papa.getControladorPropietario().mostrarInformacionDePropiedades();
        listaPropiedades.removeAllItems();
        this.detalles.setModel(this.modeloLista);
        this.detalles.removeAll();
        listaPropiedades.addItem("");
        if(this.propiedades!=null){
            for(int i=0; i<this.propiedades.size(); i++){
                listaPropiedades.addItem("id:" + this.propiedades.get(i).getId() + "  Nombre:" + this.propiedades.get(i).getNombre());
            }
            this.repaint();
            this.revalidate();
        }
    }
    
    private void actualizarMenuSectores(){
        this.propiedades = this.papa.getControladorOrganizador().obtenerInformacionPropiedades();
        this.listaSectores.removeAllItems();
        this.lista.setModel(this.modeloLista2);
        this.lista.removeAll();
        listaSectores.addItem("");
        this.precios= new ArrayList<>();
        this.precios.add(-1);
        if(this.propiedades!=null){
            for(int i=0; i<this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getListaSectores().size(); i++){
                this.precios.add(-1);
                listaSectores.addItem("Nombre:" + this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getListaSectores().get(i).getNombre());
            }
            this.repaint();
            this.revalidate();
        }
    }
    
    private void actualizarListaSectores(){
        this.propiedades = this.papa.getControladorPropietario().mostrarInformacionDePropiedades();
        this.lista.removeAll();
        this.modeloLista2=new DefaultListModel();
        if(this.propiedades!=null){
            for(int i=0; i<this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getListaSectores().size(); i++){
                this.precios.add(-1);
                this.modeloLista2.addElement("Nombre:" + this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getListaSectores().get(i).getNombre() + "  Capacidad:" +  this.propiedades.get(listaPropiedades.getSelectedIndex()-1).getListaSectores().get(i).getCapacidadDelSector() + "  precio:" + this.precios.get(i));
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
}
