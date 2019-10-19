/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaUsuario;

import ModuloGestionEventos.Evento;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author xebae
 */
public class PanelMostrarEventos extends javax.swing.JPanel {

    /**
     * Creates new form PanelMostrarEventos
     */
    
    private VentanaPrincipalUsuario papa;
    private DefaultListModel modeloLista;
    private ArrayList<Evento> eventos;
    
    public PanelMostrarEventos(VentanaPrincipalUsuario papa) {
        this.papa=papa;
        this.modeloLista= new DefaultListModel();
        initComponents();
        this.actualizarListaDeEventos();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDeEventos = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Eventos Disponibles - 10/2019");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jButton1.setText("<");

        jButton2.setText(">");

        listaDeEventos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaDeEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDeEventosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaDeEventos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaDeEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDeEventosMouseClicked
        // TODO add your handling code here:
        if(this.listaDeEventos.getSelectedIndex()<0 || this.eventos==null){
            return;
        }
        //aca pregunto si es cliente pasa ni no no
        if(true){
            papa.comprarEntrada(this.eventos.get(this.listaDeEventos.getSelectedIndex()));
        }
    }//GEN-LAST:event_listaDeEventosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaDeEventos;
    // End of variables declaration//GEN-END:variables

    private void actualizarListaDeEventos() {
        this.eventos = this.papa.getControladorUsuario().obtenerTodosLosEventos();
        this.modeloLista.removeAllElements();
        if(eventos==null){
            this.modeloLista.addElement("No se encuentrar eventos en estas fechas");
            this.listaDeEventos.setModel(modeloLista);
            this.repaint();
            this.revalidate();
            return;
        }
        for (int i = 0; i < eventos.size(); i++) {
            this.modeloLista.addElement("Nombre: " + this.eventos.get(i).getNombre() + "  FechaInicio: " + this.eventos.get(i).getFechaDeInicio() + "   FechaTermino: " + this.eventos.get(i).getFechaDeTermino());
        }
        this.listaDeEventos.setModel(modeloLista);
        this.repaint();
        this.revalidate();
    }
}
