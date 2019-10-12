/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaOrganizador;

import ModuloGestionEventos.Evento;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelMostrarListaEventosOrganizador extends javax.swing.JPanel {

    /**
     * Creates new form PanelMostrarListaEventosOrganizador
     */
    
    private ArrayList<Evento> eventos;
    private VentanaPrincipalOrganizador papa;
    private DefaultListModel modeloLista2;
    
    public PanelMostrarListaEventosOrganizador(VentanaPrincipalOrganizador papa) {
        this.papa=papa;
        initComponents();
        modeloLista2 = new DefaultListModel();
        this.lista.setModel(this.modeloLista2);
        this.actualizarMenuOpciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel20 = new javax.swing.JLabel();
        listaEventos = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Lista de eventos");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("1. Seleccione una opcion de listado de eventos");

        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Lista de eventos");

        listaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEventosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(listaEventos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addComponent(listaEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEventosActionPerformed
        // TODO add your handling code here:
        if(this.listaEventos.getSelectedIndex()<=0){
            return;
        }
        if(this.listaEventos.getSelectedIndex()==1){
            this.actualizarListaEventosTodos();
        }
        if(this.listaEventos.getSelectedIndex()==2){
            this.actualizarListaEventosPublicados();
        }
        if(this.listaEventos.getSelectedIndex()==3){
            this.actualizarListaEventosNoPublicados();
        }
        if(this.listaEventos.getSelectedIndex()==4){
            this.actualizarListaEventosFinalizados();
        }

    }//GEN-LAST:event_listaEventosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JComboBox<String> listaEventos;
    // End of variables declaration//GEN-END:variables

    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */

    //
    // no se puede hacer tdd ya que necesita otro metodo
    public void actualizarMenuOpciones(){
        this.listaEventos.removeAllItems();
        this.listaEventos.addItem("");
        this.listaEventos.addItem("Todos los eventos");
        this.listaEventos.addItem("Eventos Publicados");
        this.listaEventos.addItem("Eventos No Publicados");
        this.listaEventos.addItem("Eventos Finalizados");
        this.repaint();
        this.revalidate();
    }
    
    //Aca abajo van a estar los metodos que se tienen que hacer 
    private void actualizarListaEventosTodos(){
        eventos = this.papa.getControladorOrganizador().obtenerInformacionDeTodosLosEventosDeUnOrganizador();
        this.modeloLista2=new DefaultListModel();
        if(this.eventos!=null){
            for(int i=0; i<this.eventos.size(); i++){
                this.modeloLista2.addElement(eventos.get(i).getNombre());
            }
        }
        this.lista.setModel(this.modeloLista2);
        this.repaint();
        this.revalidate();
    }
    
    //Aca abajo van a estar los metodos que se tienen que hacer 
    private void actualizarListaEventosPublicados(){
        eventos = this.papa.getControladorOrganizador().obtenerInformacionDeEventosPublicadosDeUnOrganizador();
        this.modeloLista2=new DefaultListModel();
        if(this.eventos!=null){
            for(int i=0; i<this.eventos.size(); i++){
                this.modeloLista2.addElement(eventos.get(i).getNombre());
            }
        }
        this.lista.setModel(this.modeloLista2);
        this.repaint();
        this.revalidate();
    }
    
    //Aca abajo van a estar los metodos que se tienen que hacer 
    private void actualizarListaEventosNoPublicados(){
        eventos = this.papa.getControladorOrganizador().obtenerInformacionDeEventosNoPublicadosDeUnOrganizador();
        this.modeloLista2=new DefaultListModel();
        if(this.eventos!=null){
            for(int i=0; i<this.eventos.size(); i++){
                this.modeloLista2.addElement(eventos.get(i).getNombre());
            }
        }
        this.lista.setModel(this.modeloLista2);
        this.repaint();
        this.revalidate();
    }
    //Aca abajo van a estar los metodos que se tienen que hacer 
    // no se puede hacer tdd ya que necesita otro metodo
    private void actualizarListaEventosFinalizados(){
        eventos = this.papa.getControladorOrganizador().obtenerInformacionDeEventosFinalizadosDeUnOrganizador();
        this.modeloLista2=new DefaultListModel();
        if(this.eventos!=null){
            for(int i=0; i<this.eventos.size(); i++){
                this.modeloLista2.addElement(eventos.get(i).getNombre());
            }
        }
        this.lista.setModel(this.modeloLista2);
        this.repaint();
        this.revalidate();
    }

}
