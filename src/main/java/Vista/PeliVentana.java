/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.PeliculaControl;
import Modelo.Pelicula;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulp
 */
public class PeliVentana extends javax.swing.JInternalFrame {

    /**
     * Creates new form PeliVentana
     */
    private PeliculaControl peliculaCtrl;

    public PeliVentana() {
        initComponents();
        peliculaCtrl = new PeliculaControl();
    }

    public void cargarPeliculaTabla() {
        DefaultTableModel modelo = (DefaultTableModel) TablaPelicula.getModel();
        modelo.setRowCount(0);
        for (Pelicula pelicula : peliculaCtrl.listar()) {
            Object[] rowData = {pelicula.getCodigo(),
                pelicula.getNombre(),
                pelicula.getGenero(),
                pelicula.getPaisOrigen(),
                pelicula.getFechaPublicacion()};
            modelo.addRow(rowData);
        }
        TablaPelicula.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnlistar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombreactor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPelicula = new javax.swing.JTable();
        txtnombre = new javax.swing.JTextField();
        txtgenero = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        txtpais = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("PELICULA");

        jLabel6.setText("CODIGO:");

        btnlistar.setText("LISTAR");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        jLabel4.setText("AÑO PUBLICACION:");

        jLabel2.setText("GENERO:");

        jLabel3.setText("PAIS ORIGEN:");

        TablaPelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE PEL", "GENERO", "PAIS ORIGEN", "AÑO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaPelicula);

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        btncrear.setText("CREAR");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE PELICULA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btncrear)
                        .addGap(72, 72, 72)
                        .addComponent(btnlistar)
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel6))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnombre)
                                    .addComponent(txtgenero)
                                    .addComponent(txtfecha)
                                    .addComponent(txtpais)
                                    .addComponent(txtnombreactor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtnombreactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncrear)
                    .addComponent(btnlistar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed

//        String nombre = txtnombre.getText();
//        String genero = txtgenero.getText();
//        String pais = txtpais.getText();
//        //String codigo = txtnombreactor.getText();
//        int codigo = 0;
//        int fecha = 0;
//        try {
//            fecha = Integer.parseInt(txtfecha.getText());
//            codigo = Integer.parseInt(txtnombreactor.getText());
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        Pelicula pelicula = new Pelicula(codigo, nombre, genero, pais, fecha);
//
//        if (!nombre.isBlank() && !genero.isBlank() && !pais.isBlank() && !txtfecha.getText().isBlank()) {
//            String[] params = new String[3];
//            params[0] = nombre;
//            params[1] = genero;
//            params[2] = pais;
//
//            peliculaCtrl.crear(codigo, params, fecha);
//        }
        cargarPeliculaTabla();
//        txtnombre.setText("");
//        txtnombreactor.setText("");
//        txtgenero.setText("");
//        txtpais.setText("");
//        txtfecha.setText("");

        JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente");
    }//GEN-LAST:event_btnlistarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed

        String nombre = txtnombre.getText();
        String genero = txtgenero.getText();
        String pais = txtpais.getText();
        int fecha = 0;
        int codigo = 0;

        Pelicula pelicula = new Pelicula(codigo, nombre, genero, pais, fecha);

        if (!nombre.isBlank() && !genero.isBlank() && !pais.isBlank() && !txtfecha.getText().isBlank()) {
            String[] params = new String[4];
            params[0] = nombre;
            params[1] = genero;
            params[2] = pais;

            try {
                codigo = Integer.parseInt(txtnombreactor.getText());
                fecha = Integer.parseInt(txtfecha.getText());
                try {
                    peliculaCtrl.crear(codigo, params, fecha);
                    JOptionPane.showMessageDialog(this, "Pelicula registrada", "CREAR", JOptionPane.INFORMATION_MESSAGE);
                    txtnombre.setText("");
                    txtnombreactor.setText("");
                    txtgenero.setText("");
                    txtpais.setText("");
                    txtfecha.setText("");
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "CREA", JOptionPane.ERROR_MESSAGE);
                }
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(this, "Dato numerico invalido, porfavor revise fecha de publicacion o codigo", "CREAR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btncrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPelicula;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btnlistar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtgenero;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombreactor;
    private javax.swing.JTextField txtpais;
    // End of variables declaration//GEN-END:variables
}
