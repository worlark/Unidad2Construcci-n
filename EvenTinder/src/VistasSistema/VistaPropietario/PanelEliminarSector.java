/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPropietario;

import ModuloGestionPropiedades.Propiedad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelEliminarSector extends javax.swing.JPanel {

    /**
     * Creates new form PanelEliminarSector
     */
    
    VentanaPrincipalPropietario papa;
    private int id;
    private ArrayList<Propiedad> propiedades;
    
    public PanelEliminarSector(VentanaPrincipalPropietario papa, int id) {
        this.papa=papa;
        this.id=id;
        initComponents();
        this.actualizarMenuSectores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eliminarSector = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        listaSectores = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        eliminarSector.setText("Eliminar");
        eliminarSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarSectorActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Eliminar sector");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("1. Selecciones un sector para eliminarlo");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        listaSectores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaSectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSectoresActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(listaSectores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminarSector)
                        .addGap(18, 18, 18)
                        .addComponent(volver)))
                .addContainerGap(181, Short.MAX_VALUE))
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
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(listaSectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminarSector)
                            .addComponent(volver))))
                .addGap(56, 298, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarSectorActionPerformed
        // TODO add your handling code here:
        int capacidad=0;
        if(listaSectores.getSelectedIndex()!=-1){
            if(this.propiedades.get(id).getListaSectores().size()==1){
                JOptionPane.showMessageDialog(null, "No se puede eliminar el sector dado que es el ultimo", "Error al eliminar el sector", JOptionPane.WARNING_MESSAGE);
                return;
            }
            boolean bandera = false;
            try {
                capacidad=this.propiedades.get(id).getListaSectores().get(listaSectores.getSelectedIndex()).getCapacidadDelSector();
                bandera = this.papa.getControladorPropietario().eliminarSector(this.propiedades.get(id).getId(), this.propiedades.get(id).getListaSectores().get(listaSectores.getSelectedIndex()).getNombre());
            } catch (SQLException ex) {
                Logger.getLogger(PanelEliminarSector.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(bandera){
                JOptionPane.showMessageDialog(null, "Se a eliminado el sector correctamente");
                try {
                    this.papa.getControladorPropietario().modifcarPropiedad(this.propiedades.get(id).getId(), this.propiedades.get(id).getNombre(), this.propiedades.get(id).getUbicacion(), this.propiedades.get(id).getFechaDePublicacion(), (this.propiedades.get(id).getCapacidadTotal() - capacidad), this.propiedades.get(id).getValorArriendo(), this.propiedades.get(id).getDescripcion());
                } catch (SQLException ex) {
                    Logger.getLogger(PanelEliminarSector.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.actualizarMenuSectores();
            }else{
                JOptionPane.showMessageDialog(null, "No se a podido eliminar el sector de la base de datos", "Error al eliminar el sector", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "no se puede eliminar el sector dado que no a seleccionado uno", "Error al seleccioanr sector", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_eliminarSectorActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        this.papa.volverAModificarPropiedad();
    }//GEN-LAST:event_volverActionPerformed

    private void listaSectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSectoresActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_listaSectoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarSector;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> listaSectores;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables


    private void actualizarMenuSectores(){
        this.propiedades = this.papa.getControladorPropietario().mostrarInformacionDePropiedades();
        this.listaSectores.removeAllItems();
        if(this.propiedades!=null){
            for(int i=0; i<this.propiedades.get(id).getListaSectores().size(); i++){
                this.listaSectores.addItem("Nombre Sector: " + this.propiedades.get(id).getListaSectores().get(i).getNombre());
            }
            this.repaint();
            this.revalidate();
        }
    }
}
