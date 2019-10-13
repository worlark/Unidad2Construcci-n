/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPropietario;

import ModuloGestionEventos.Evento;
import ModuloGestionPropiedades.Propiedad;
import java.sql.SQLException;
import java.text.Format;
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
public class PanelAceptarYRechasarEventos extends javax.swing.JPanel {

    /**
     * Creates new form PanelAceptarEventos
     */
    
    private VentanaPrincipalPropietario papa;
    private ArrayList<Evento> eventos;
    private ArrayList<Propiedad> propiedades;
    private DefaultListModel modeloLista;
    
    public PanelAceptarYRechasarEventos(VentanaPrincipalPropietario papa) throws SQLException {
        modeloLista= new DefaultListModel();
        this.papa=papa;
        initComponents();
        lista.setModel(modeloLista);
        actualizarMenuOpciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        listaPropiedades = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        rechazar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        capacidad = new javax.swing.JLabel();
        fechaDeInicio = new javax.swing.JLabel();
        fechaDeTermino = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        listaPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPropiedadesActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Descripcion del evento");

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("1. Elija una propiedad");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Lista de solicitudes de eventos");

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        rechazar.setText("Rechazar");
        rechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechazarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        nombre.setText("Nombre: ");

        descripcion.setText("Descripcion: ");

        capacidad.setText("Capacidad: ");

        fechaDeInicio.setText("Fecha de inicio:");

        fechaDeTermino.setText("Fecha de termino:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(capacidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaDeInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(fechaDeTermino)
                        .addGap(0, 353, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capacidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaDeInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaDeTermino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("Lista de eventos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel20))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(aceptar)
                        .addGap(18, 18, 18)
                        .addComponent(rechazar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel21))
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(listaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
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
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(listaPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(rechazar))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPropiedadesActionPerformed
        // TODO add your handling code here:
        
        if(this.listaPropiedades.getSelectedIndex()<=0){
            return;
        }
        if(this.listaPropiedades.getSelectedIndex()==1){
            
            this.actualizarListaEventosTodos();
            this.nombre.setText("Nombre: ");
            this.descripcion.setText("Descripcion: ");
            this.capacidad.setText("Capacidad: ");
            this.fechaDeInicio.setText("Fecha de inicio: ");
            this.fechaDeTermino.setText("Fecha de termino:");
            return;
        }
        try {  
            this.actualizarListaEventosPorPropiedad(this.propiedades.get(this.listaPropiedades.getSelectedIndex()-2).getId());
        } catch (SQLException ex) {
            Logger.getLogger(PanelAceptarYRechasarEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.nombre.setText("Nombre: ");
        this.descripcion.setText("Descripcion: ");
        this.capacidad.setText("Capacidad: ");
        this.fechaDeInicio.setText("Fecha de inicio: ");
        this.fechaDeTermino.setText("Fecha de termino:");
    }//GEN-LAST:event_listaPropiedadesActionPerformed

    private void rechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechazarActionPerformed
        // TODO add your handling code here:
        if(this.lista.getSelectedIndex()<0){
            return;
        }
        System.out.println("evento a rechazar id: " +this.eventos.get(this.lista.getSelectedIndex()).getIdEvento());
        this.papa.getControladorPropietario().rechazarSolicitud(this.eventos.get(this.lista.getSelectedIndex()).getIdEvento());
        this.listaPropiedadesActionPerformed(evt);
        JOptionPane.showMessageDialog(null, "Se a rechazo correctamente");
    }//GEN-LAST:event_rechazarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        if(this.lista.getSelectedIndex()<0){
            return;
        }
        System.out.println("evento a aceptar id: " +this.eventos.get(this.lista.getSelectedIndex()).getIdEvento());
        this.papa.getControladorPropietario().aceptarSolicitud(this.eventos.get(this.lista.getSelectedIndex()).getIdEvento());
        this.listaPropiedadesActionPerformed(evt);
        JOptionPane.showMessageDialog(null, "Se a aceptado correctamente");
    }//GEN-LAST:event_aceptarActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        // TODO add your handling code here:
        if(this.lista.getSelectedIndex()<0){
            this.nombre.setText("Nombre: ");
            this.descripcion.setText("Descripcion: ");
            this.capacidad.setText("Capacidad: ");
            this.fechaDeInicio.setText("Fecha de inicio: ");
            this.fechaDeTermino.setText("Fecha de termino:");
            return;
        }
        this.nombre.setText("Nombre: " + this.eventos.get(lista.getSelectedIndex()).getNombre());
        this.descripcion.setText("Descripcion: " + this.eventos.get(lista.getSelectedIndex()).getDescripcion());
        this.capacidad.setText("Capacidad: " +Integer.toString(this.eventos.get(lista.getSelectedIndex()).getCapacidadMaximaDelEvento()));
        this.fechaDeInicio.setText("Fecha de inicio: " + convertirFechaString(this.eventos.get(lista.getSelectedIndex()).getFechaDeInicio()));
        this.fechaDeTermino.setText("Fecha de termino:" + convertirFechaString(this.eventos.get(lista.getSelectedIndex()).getFechaDeTermino()));
    }//GEN-LAST:event_listaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel capacidad;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel fechaDeInicio;
    private javax.swing.JLabel fechaDeTermino;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    private javax.swing.JComboBox<String> listaPropiedades;
    private javax.swing.JLabel nombre;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JButton rechazar;
    // End of variables declaration//GEN-END:variables

    //Aca abajo van a estar los metodos que se tienen que hacer 
    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */
    
    // no se puede hacer tdd ya que necesita otro metodo
    public void actualizarMenuOpciones() throws SQLException{
        this.propiedades = papa.getControladorPropietario().mostrarInformacionDePropiedadesDeUnPropietario();
        this.listaPropiedades.removeAllItems();
        this.listaPropiedades.addItem("");
        this.listaPropiedades.addItem("Todas las propiedades");
        for(int i=0; i<this.propiedades.size(); i++){
            this.listaPropiedades.addItem("nombre:" + this.propiedades.get(i).getNombre());
        }
        this.repaint();
        this.revalidate();
    }
    
    //Aca abajo van a estar los metodos que se tienen que hacer 
    private void actualizarListaEventosTodos(){
        eventos = papa.getControladorPropietario().obtenerInformacionSolicitudesDeEventos();
        this.modeloLista=new DefaultListModel();
        if(this.eventos!=null){
            for(int i=0; i<this.eventos.size(); i++){
                this.modeloLista.addElement(eventos.get(i).getNombre());
            }
        }
        this.lista.setModel(this.modeloLista);
        this.repaint();
        this.revalidate();
    }
    
    //Aca abajo van a estar los metodos que se tienen que hacer 
    private void actualizarListaEventosPorPropiedad(int id) throws SQLException{
        this.eventos = papa.getControladorPropietario().obtenerInformacionSolicitudesDeEventos();
        this.propiedades = papa.getControladorPropietario().mostrarInformacionDePropiedadesDeUnPropietario();
        this.modeloLista=new DefaultListModel();
        if(this.eventos!=null && this.propiedades!=null){
            for(int i=0; i<this.eventos.size(); i++){
                for(int j=0; j<this.propiedades.size(); j++){
                    if(this.eventos.get(i).getIdPropiedad()==id){
                        this.modeloLista.addElement(eventos.get(i).getNombre());
                        break;
                    }
                }
            }
        }
        this.lista.setModel(this.modeloLista);
        this.repaint();
        this.revalidate();
    }
    
    public String convertirFechaString(Date date){

       Format formatter = new SimpleDateFormat("dd-MM-yyyy");
       return formatter.format(date);
    }
}
