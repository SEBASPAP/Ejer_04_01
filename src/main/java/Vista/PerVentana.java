/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.ActorControl;
import Controlador.PeliculaControl;
import Controlador.PersonajeControl;
import Modelo.Personaje;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulp
 */
public class PerVentana extends javax.swing.JInternalFrame {

    /**
     * Creates new form PerVentana
     */
    private PersonajeControl personajeCtrl;
    private ActorControl actorCtrl;
    private PeliculaControl peliculaCtrl;

    public PerVentana() {
        initComponents();
        actorCtrl = new ActorControl();
        personajeCtrl = new PersonajeControl();
        peliculaCtrl = new PeliculaControl();
        this.cargarPersonajeTablatelf();
    }

    public void cargarPersonajeTablatelf() {
        DefaultTableModel modelo = (DefaultTableModel) TablaPersonaje.getModel();
        modelo.setRowCount(0);
        for (Personaje personaje : personajeCtrl.listar()) {
            Object[] rowData = {personaje.getCodigo(),
                personaje.getNombrePer(),
                personaje.getFuncionPer(),
                personaje.getGeneroMof(),
                personaje.getActor().getNombre(),
                personaje.getPelicula().getNombre(),};
            modelo.addRow(rowData);
        }
        TablaPersonaje.setModel(modelo);
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public JButton getBtneliminar() {
        return btneliminar;
    }

    public JButton getBtnmodificar() {
        return btnmodificar;
    }

    public JTextField getTxtgenero() {
        return txtgenero;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public JTextField getTxtnomper() {
        return txtnomper;
    }

    public JTextField getTxtrol() {
        return txtrol;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnomper = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtrol = new javax.swing.JTextField();
        txtgenero = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPersonaje = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("PERSONAJE");

        jLabel5.setText("Nombre personaje:");

        jLabel2.setText("Rol del Personaje:");

        jLabel3.setText("Genero del Personaje:");

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        TablaPersonaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "PERSONAJE", "ROL", "GENERO", "ACTOR", "PELICULA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaPersonaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPersonajeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPersonaje);

        jLabel1.setText("Codigo:");

        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtgenero))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtrol)
                                    .addComponent(txtnomper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnCrear)
                .addGap(18, 18, 18)
                .addComponent(btnListar)
                .addGap(18, 18, 18)
                .addComponent(btnmodificar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnomper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtgenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnListar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
//        int codigo = 0;
//        String nombrePe = txtnomper.getText();
//        String funcionPer = txtrol.getText();
//        String generoMof = txtgenero.getText();
//
//        try {
//            codigo = Integer.parseInt(txtnombre.getText());
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        Personaje personaje = new Personaje(codigo, nombrePe, funcionPer, generoMof);
//
//        if (!txtnombre.getText().isBlank() && !funcionPer.isBlank() && !generoMof.isBlank() && !nombrePe.isBlank()) {
//            if (!actorCtrl.buscar(codigo).equals(null) && !peliculaCtrl.buscar(codigo).equals(null)) {
//                String[] params = new String[3];
//                params[0] = nombrePe;
//                params[1] = funcionPer;
//                params[2] = generoMof;
//
//                personajeCtrl.crear(codigo, params, actorCtrl.buscar(codigo), peliculaCtrl.buscar(codigo));
//            }
//        }
            try{
                cargarPersonajeTablatelf();
            }catch(RuntimeException e){
                JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente");
            }
        
//        txtnombre.setText("");
//        txtnomper.setText("");
//        txtrol.setText("");
//        txtgenero.setText("");

        
        //JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente", "Datos Ingresados Correctamente", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        int codigo = Integer.parseInt(txtnombre.getText());
        String nombrePer = txtnomper.getText();
        String funcionPer = txtrol.getText();
        String generoMof = txtgenero.getText();

        Personaje personaje = new Personaje(codigo, nombrePer, funcionPer, generoMof);

        if (!txtnombre.getText().isBlank() && !funcionPer.isBlank() && !generoMof.isBlank() && !nombrePer.isBlank()) {
            if (!actorCtrl.buscar(codigo).equals(null) && !peliculaCtrl.buscar(codigo).equals(null)) {
                String[] params = new String[3];
                params[0] = nombrePer;
                params[1] = funcionPer;
                params[2] = generoMof;
                personajeCtrl.crear(codigo, params, actorCtrl.buscar(codigo), peliculaCtrl.buscar(codigo));
            }
        }

        txtnombre.setText("");
        txtnomper.setText("");
        txtrol.setText("");
        txtgenero.setText("");

        JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente");

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        int codigo = Integer.parseInt(txtnombre.getText());
        String nombrePer = txtnomper.getText();
        String funcionPer = txtrol.getText();
        String generoMof = txtgenero.getText();

        Personaje personaje = new Personaje(codigo, nombrePer, funcionPer, generoMof);

        if (!txtnombre.getText().isBlank() && !funcionPer.isBlank() && !generoMof.isBlank() && !nombrePer.isBlank()) {
            //if (!actorCtrl.buscar(codigo).equals(null) && !peliculaCtrl.buscar(codigo).equals(null)) {
            String[] params = new String[3];
            params[0] = nombrePer;
            params[1] = funcionPer;
            params[2] = generoMof;

            personajeCtrl.crear(codigo, params, actorCtrl.buscar(codigo), peliculaCtrl.buscar(codigo));
            //}
        }
        cargarPersonajeTablatelf();

        txtnombre.setText("");
        txtnomper.setText("");
        txtrol.setText("");
        txtgenero.setText("");

        JOptionPane.showMessageDialog(null, "Datos Modificados Correctamente", "MODIFICAR", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int cod = Integer.parseInt(txtnombre.getText());
        personajeCtrl.eliminar(cod);
        cargarPersonajeTablatelf();

        txtnombre.setText("");
        txtnomper.setText("");
        txtrol.setText("");
        txtgenero.setText("");

        int i = JOptionPane.showConfirmDialog(this, "Desea eliminar este Actor", "Desea eliminar este Actor", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (i == 0) {
            JOptionPane.showMessageDialog(this, "Actor Eliminado", "ELIMINAR", JOptionPane.WARNING_MESSAGE);
        } else if (i == 1) {
            JOptionPane.showMessageDialog(this, "Actor Eliminado", "ELIMINAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void TablaPersonajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPersonajeMouseClicked
        int fila = TablaPersonaje.getSelectedRow();
        int nombre = (int) TablaPersonaje.getValueAt(fila, 0);
        String nombreper = TablaPersonaje.getValueAt(fila, 1).toString();
        String funcionPer = TablaPersonaje.getValueAt(fila, 2).toString();
        String generoMof = TablaPersonaje.getValueAt(fila, 3).toString();

        txtnombre.setText(String.valueOf(nombre));
        txtnomper.setText(nombreper);
        txtrol.setText(funcionPer);
        txtgenero.setText(generoMof);
    }//GEN-LAST:event_TablaPersonajeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPersonaje;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtgenero;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnomper;
    private javax.swing.JTextField txtrol;
    // End of variables declaration//GEN-END:variables
}
