/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import daos.DaoUsuario;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelos.Usuario;

/**
 *
 * @author barre
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registros
     * 
     */
    int idUs=0;
    public Registro(Usuario us) {
        initComponents();
        transparenciaBoton();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro");
        this.setSize(new Dimension(700,500));
        btnActualizar.setVisible(false);
        if(us!=null){
            txtApellido.setText(us.getApellido());
            txtNombre.setText(us.getNombre());
            txtPass.setText("");
            txtTelefono.setText(us.getTelefono());
            txtUsuario.setText(us.getUsuario());
            txtUsuario.setEditable(false);
            btnRegistrar.setVisible(false);
            btnActualizar.setVisible(true);
            idUs=us.getIdUsuario();
        }
    }

    public void transparenciaBoton(){
        btnActualizar.setOpaque(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setBorderPainted(false);
        btnRegistrar.setOpaque(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setBorderPainted(false);
        btnCancelar.setOpaque(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setBorderPainted(false);
        txtNombre.setOpaque(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnEmpleado = new javax.swing.JRadioButton();
        btnEncargado = new javax.swing.JRadioButton();
        btnActualizar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblFondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 126, 10));

        txtApellido.setBorder(null);
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 126, 10));

        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 126, 10));

        txtPass.setBorder(null);
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 126, 10));

        txtTelefono.setBorder(null);
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 111, 10));

        btnEmpleado.setText("Empleado");
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        btnEncargado.setText("Encargado");
        btnEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncargadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 80, 30));

        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 90, 30));

        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 400, 80, 30));

        lblFondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/REGISTRO.png"))); // NOI18N
        lblFondoRegistro.setText("jLabel1");
        getContentPane().add(lblFondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 696, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        // TODO add your handling code here:
        btnEncargado.setSelected(false);
        btnEmpleado.setSelected(true);
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncargadoActionPerformed
        // TODO add your handling code here:
        btnEncargado.setSelected(true);
        btnEmpleado.setSelected(false);
    }//GEN-LAST:event_btnEncargadoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        this.registro();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        this.actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnEmpleado;
    private javax.swing.JRadioButton btnEncargado;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel lblFondoRegistro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    private void registro() {
        if (!txtUsuario.getText().isEmpty() && !txtPass.getText().isEmpty() && 
                !txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty()
                && !txtTelefono.getText().isEmpty() && (btnEmpleado.isSelected()
                || btnEncargado.isSelected())) {
            DaoUsuario controlUsuario = new DaoUsuario();
            Usuario usuario = new Usuario();
            usuario.setUsuario(txtUsuario.getText().trim());
            usuario.setPassword(txtPass.getText().trim());
            usuario.setApellido(txtApellido.getText().trim());
            usuario.setNombre(txtNombre.getText().trim());
            usuario.setTelefono(txtTelefono.getText().trim());
            if(btnEmpleado.isSelected())
                usuario.setTipo(1);
            else
                usuario.setTipo(2);
            
            if (controlUsuario.guardar(usuario)) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "Se registro correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }
    }
    
    private void actualizar() {
        if (!txtUsuario.getText().isEmpty() && !txtPass.getText().isEmpty() && 
                !txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty()
                && !txtTelefono.getText().isEmpty() && (btnEmpleado.isSelected()
                || btnEncargado.isSelected())) {
            DaoUsuario controlUsuario = new DaoUsuario();
            Usuario usuario = new Usuario();
            usuario.setUsuario(txtUsuario.getText().trim());
            usuario.setPassword(txtPass.getText().trim());
            usuario.setApellido(txtApellido.getText().trim());
            usuario.setNombre(txtNombre.getText().trim());
            usuario.setTelefono(txtTelefono.getText().trim());
            if(btnEmpleado.isSelected())
                usuario.setTipo(1);
            else
                usuario.setTipo(2);
            
            if (controlUsuario.actualizar(usuario, idUs)) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }
    }

}
