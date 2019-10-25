/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaUsuario;

import ModuloGestionEventos.Evento;
import ModuloGestionPropiedades.Propiedad;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelComprarEntrada extends javax.swing.JPanel {

    /**
     * Creates new form PanelComprarEntrada
     */
    
    private VentanaPrincipalUsuario papa;
    private Evento evento;
    private DefaultListModel modeloLista;
    private ArrayList<Propiedad> propiedades;
    private int punteroPropiedad=-1;
    
    public PanelComprarEntrada(VentanaPrincipalUsuario papa, Evento evento) {
        this.papa=papa;
        this.evento=evento;
        this.modeloLista= new DefaultListModel();
        initComponents();
        this.actualizarDatosDelEvento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        botonVolverAtras = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        nombreSector = new javax.swing.JLabel();
        precioEntrada = new javax.swing.JLabel();
        capacidadDisponioble = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cantidadDeEntradas = new javax.swing.JTextField();
        botonCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fechaDeInicio = new javax.swing.JLabel();
        fechaDeTermino = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dias = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDeSectores = new javax.swing.JList<>();
        jLabel22 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botonVolverAtras.setText("<");
        botonVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAtrasActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú compra de entrada");

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("Detalles de la compra");

        nombreSector.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombreSector.setText("Nombre: ");

        precioEntrada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        precioEntrada.setText("Precio de la entrada: ");

        capacidadDisponioble.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        capacidadDisponioble.setText("Capacidad disponible: ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Cantidad de entradas a comprar: ");

        botonCompra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonCompra.setText("Comprar");
        botonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreSector)
                            .addComponent(precioEntrada)
                            .addComponent(capacidadDisponioble))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cantidadDeEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(botonCompra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(nombreSector)
                .addGap(18, 18, 18)
                .addComponent(capacidadDisponioble)
                .addGap(18, 18, 18)
                .addComponent(precioEntrada)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cantidadDeEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(botonCompra)
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(232, 232, 232));

        fechaDeInicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fechaDeInicio.setText("Fecha de inicio");

        fechaDeTermino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fechaDeTermino.setText("Fecha de termino");

        descripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        descripcion.setText("Descripcion");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Datos del evento");

        dias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dias.setText("Dias maximo de devolucion");

        nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre.setText("Nombre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre)
                    .addComponent(fechaDeTermino)
                    .addComponent(descripcion)
                    .addComponent(fechaDeInicio)
                    .addComponent(dias)
                    .addComponent(jLabel19))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(nombre)
                .addGap(18, 18, 18)
                .addComponent(descripcion)
                .addGap(21, 21, 21)
                .addComponent(fechaDeInicio)
                .addGap(18, 18, 18)
                .addComponent(fechaDeTermino)
                .addGap(18, 18, 18)
                .addComponent(dias)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(232, 232, 232));

        jPanel6.setBackground(new java.awt.Color(226, 226, 226));

        listaDeSectores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        listaDeSectores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDeSectoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaDeSectores);

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

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonVolverAtras)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonVolverAtras)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAtrasActionPerformed
        // TODO add your handling code here:
        this.papa.volverMostrarEventos();
    }//GEN-LAST:event_botonVolverAtrasActionPerformed

    private void botonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompraActionPerformed
        // TODO add your handling code here:
        if(this.listaDeSectores.getSelectedIndex()<0){
            return;
        }
        int resp = this.validadCantidad(this.cantidadDeEntradas.getText());        
        if(resp!=0){
            JOptionPane.showMessageDialog(null, "Se espera que la cantidad de entradas sea un numero entero positivo \n" + 
                    "Ej: 10", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            boolean bandera=false;
            for (int i = 0; i <this.propiedades.get(punteroPropiedad).getListaSectores().size(); i++) {
                if(this.propiedades.get(punteroPropiedad).getListaSectores().get(i).getNombre().equals(this.listaDeSectores.getSelectedValue())){
                   bandera = this.papa.getControladorUsuario().registrarCompra(this.evento.getIdEvento(), this.propiedades.get(punteroPropiedad).getListaSectores().get(i).getNombre(), Integer.parseInt(this.cantidadDeEntradas.getText()), this.evento.getIdPropiedad());
                   break;
                }
            }
            if(bandera){
                actualizarDatosDelEvento();
                this.cantidadDeEntradas.setText("");
                JOptionPane.showMessageDialog(null, "Se a registrado su compra con exito");
            }else{
                JOptionPane.showMessageDialog(null, "No quedan entradas disponibles", "Error comprar entrada", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_botonCompraActionPerformed

    private void listaDeSectoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDeSectoresMouseClicked
        // TODO add your handling code here:
        if(this.listaDeSectores.getSelectedIndex()<0){
            return;
        }
        for (int i = 0; i <this.propiedades.get(punteroPropiedad).getListaSectores().size(); i++) {
            System.out.println(this.propiedades.get(punteroPropiedad).getListaSectores().get(i).getNombre() + "   " + this.listaDeSectores.getSelectedValue());
            if(this.propiedades.get(punteroPropiedad).getListaSectores().get(i).getNombre().equals(this.listaDeSectores.getSelectedValue())){
                this.nombreSector.setText("Nombre del sector: " + this.propiedades.get(this.punteroPropiedad).getListaSectores().get(i).getNombre());
                this.capacidadDisponioble.setText("Capacidad disponible: " + this.papa.getControladorUsuario().obtenerEntradasRestantes(this.evento.getIdEvento()));
                this.precioEntrada.setText("Precio de la entrada: " + this.papa.getControladorUsuario().obtenerInformacionDePrecioDeUnSector(this.evento.getIdEvento(), this.propiedades.get(this.punteroPropiedad).getListaSectores().get(i).getNombre(), this.evento.getIdPropiedad()));
                return;
            }
        }
    }//GEN-LAST:event_listaDeSectoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCompra;
    private javax.swing.JButton botonVolverAtras;
    private javax.swing.JTextField cantidadDeEntradas;
    private javax.swing.JLabel capacidadDisponioble;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel dias;
    private javax.swing.JLabel fechaDeInicio;
    private javax.swing.JLabel fechaDeTermino;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaDeSectores;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombreSector;
    private javax.swing.JLabel precioEntrada;
    // End of variables declaration//GEN-END:variables

    private int validadCantidad(String cantidad) {
        if(!cantidad.equals("") && isNumero(cantidad)){
            return 0;
        }        
        else{
            return 1;
        }
    }
    
    /**
     * Método que se encarga de verificar que los numeros ingresados son numeros validos
     * @param cadena
     * @return 
     */
    public boolean isNumero(String cadena) {
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

    private void actualizarDatosDelEvento() {
        this.nombre.setText("Nombre: " + this.evento.getNombre());
        this.descripcion.setText("Descripcion: " + this.evento.getDescripcion());
        this.fechaDeInicio.setText("Fecha De Inicio: " + this.evento.getFechaDeInicio());
        this.fechaDeTermino.setText("Fecha De Termino: " + this.evento.getFechaDeTermino());
        this.dias.setText("Dias maximos de devolucion: " + this.evento.getPlazoDevolucionEntrada());
        this.modeloLista.removeAllElements();
        this.propiedades=this.papa.getControladorUsuario().obtenerListaDePropiedades();
        for (int j = 0; j < this.propiedades.size(); j++) {
            if(this.propiedades.get(j).getId()==this.evento.getIdPropiedad()){
                this.punteroPropiedad=j;
                for (int i = 0; i <this.propiedades.get(j).getListaSectores().size(); i++) {
                    if(-1<this.papa.getControladorUsuario().obtenerInformacionDePrecioDeUnSector(this.evento.getIdEvento(), this.propiedades.get(this.punteroPropiedad).getListaSectores().get(i).getNombre(), this.evento.getIdPropiedad())){
                        this.modeloLista.addElement(this.propiedades.get(j).getListaSectores().get(i).getNombre());
                    }
                }
                this.listaDeSectores.setModel(modeloLista);
                this.repaint();
                this.revalidate();
                return;
            }
        }
    }
}
