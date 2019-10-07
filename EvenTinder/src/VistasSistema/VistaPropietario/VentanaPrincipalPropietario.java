/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPropietario;


import ControladorUsuarios.ControladorPrincipal;
import ControladorUsuarios.ControladorPropietario;
import VistasSistema.VistaPrincipal.PanelNosotros;
import VistasSistema.VistaPrincipal.VentanaPrincipal;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xebae
 */
public class VentanaPrincipalPropietario extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipalUsuario
     */
    
    private PanelDeOpciones panelDeOpciones;
    private Component componenteAnterior= null;
    private ControladorPropietario controladorPropietario;
    private ControladorPrincipal controladorPrincipal;
    private PanelHome home;
    private PanelModificarPropiedad modificarPropiedad ;

    public VentanaPrincipalPropietario() throws SQLException {
        this.controladorPropietario= new ControladorPropietario();
        this.controladorPrincipal= new ControladorPrincipal();
        this.panelDeOpciones=new PanelDeOpciones(this);
        initComponents();
        this.home= new PanelHome();
        getContentPane().add(panelDeOpciones, java.awt.BorderLayout.EAST);
        getContentPane().add(this.home, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=this.home;
        this.repaint();
        this.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void arranque() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VentanaPrincipalPropietario().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipalPropietario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public ControladorPrincipal getControladorPrincipal() {
        return controladorPrincipal;
    }

    public ControladorPropietario getControladorPropietario() {
        return controladorPropietario;
    }
    
    
    
    public void modificarCuenta() {
        PanelModificarPropietario modificar = new PanelModificarPropietario(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(modificar, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=modificar;
        this.repaint();
        this.revalidate();
    }

    public void contactenos() {
        
    }

    public void eliminarCuenta() {
        PanelEliminarPropietario eliminar = new PanelEliminarPropietario(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(eliminar, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=eliminar;
        this.repaint();
        this.revalidate();
    }

    public void cerrarSesion() {
        VentanaPrincipal nuevaVentana = new VentanaPrincipal();
        nuevaVentana.arranque();
        this.setVisible(false);
    }



    public void ventanaHome() {
        this.home = new PanelHome();
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(this.home, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=this.home;
        this.repaint();
        this.revalidate();
    }

    public void RegistrarPropiedad() {
        PanelCrearPropiedad crearPropiedad = new PanelCrearPropiedad(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(crearPropiedad, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=crearPropiedad;
        this.repaint();
        this.revalidate();
    }

    public void ModificarPropiedad() {
        modificarPropiedad = new PanelModificarPropiedad(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(modificarPropiedad, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=modificarPropiedad;
        this.repaint();
        this.revalidate();    
    }

    public void EliminarPropiedad() {
        PanelEliminarPropiedad eliminarPropiedad = new PanelEliminarPropiedad(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(eliminarPropiedad, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=eliminarPropiedad;
        this.repaint();
        this.revalidate();    
    }

    public void ListaDePropiedades() {
        
        PanelListaDePropiedades listaPropiedades = new PanelListaDePropiedades(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(listaPropiedades, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=listaPropiedades;
        this.repaint();
        this.revalidate();    
    }

    public void SolicitudDeEventos() {
        PanelAceptarYRechasarEventos eventos = new PanelAceptarYRechasarEventos();
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(eventos, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=eventos;
        this.repaint();
        this.revalidate();    
    }   

    public void ventanaContactenos() {
        PanelNosotros nosotros = new PanelNosotros();
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(nosotros, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=nosotros;
        this.repaint();
        this.revalidate();
    }

    public void eliminarSector(PanelEliminarSector sector ){
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(sector, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=sector;
        this.repaint();
        this.revalidate();
    }

    public void añadirSector(PanelAgregarSector sector) {
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(sector, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=sector;
        this.repaint();
        this.revalidate();
    }

    public void modificarSector(PanelModificarSector sector) {
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(sector, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=sector;
        this.repaint();
        this.revalidate();
    }

    public void volverAModificarPropiedad() {
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(modificarPropiedad, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=modificarPropiedad;
        this.repaint();
        this.revalidate();  
    }



}
