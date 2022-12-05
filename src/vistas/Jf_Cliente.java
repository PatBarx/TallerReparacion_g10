/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.ClienteData;
import entidades.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo10
 */
public class Jf_Cliente extends javax.swing.JFrame {

    private final java.awt.Frame padre;
    private Cliente cliente;
    private ClienteData cliDa;

    /**
     * Creates new form Jif_Cliente
     */
    public Jf_Cliente(java.awt.Frame padre, Cliente cliente) {
        initComponents();
        this.padre = padre;
        this.cliente = cliente;
        this.cliDa = new ClienteData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTf_nombre = new javax.swing.JTextField();
        jTf_dni = new javax.swing.JTextField();
        jTf_telefono = new javax.swing.JTextField();
        jTf_domicilio = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTf_nombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_nombre.setBorder(null);
        jTf_nombre.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_nombreComponentShown(evt);
            }
        });
        jPanel1.add(jTf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, 20));

        jTf_dni.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_dni.setBorder(null);
        jTf_dni.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_dniComponentShown(evt);
            }
        });
        jPanel1.add(jTf_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 270, 20));

        jTf_telefono.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_telefono.setBorder(null);
        jTf_telefono.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_telefonoComponentShown(evt);
            }
        });
        jPanel1.add(jTf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 270, 20));

        jTf_domicilio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_domicilio.setBorder(null);
        jTf_domicilio.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_domicilioComponentShown(evt);
            }
        });
        jPanel1.add(jTf_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 270, 20));

        btn_guardar.setBackground(new java.awt.Color(82, 148, 202));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-xGuarda.png"))); // NOI18N
        btn_guardar.setBorder(null);
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 140, 50));

        btn_salir.setBackground(new java.awt.Color(82, 148, 202));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-xSalir.png"))); // NOI18N
        btn_salir.setBorder(null);
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 140, 50));

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cliBkg.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTf_nombreComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_nombreComponentShown
        jTf_nombre.setOpaque(false);
    }//GEN-LAST:event_jTf_nombreComponentShown

    private void jTf_dniComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_dniComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_dniComponentShown

    private void jTf_telefonoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_telefonoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_telefonoComponentShown

    private void jTf_domicilioComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_domicilioComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_domicilioComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.padre.setEnabled(false);   
        if (cliente != null) {
            jTf_dni.setText(String.valueOf(cliente.getDni()));
            jTf_nombre.setText(cliente.getNombre());
            jTf_domicilio.setText(cliente.getDomicilio());
            jTf_telefono.setText(String.valueOf(cliente.getTel()));
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.padre.setEnabled(true);       
    }//GEN-LAST:event_formWindowClosing

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (cliente == null) {
            cliente = new Cliente();
            int dni = Integer.parseInt(jTf_dni.getText());
            String nombre = jTf_nombre.getText();
            String domicilio = jTf_domicilio.getText();
            int tel = Integer.parseInt(jTf_telefono.getText());
            cliente.setNombre(nombre);
            cliente.setDomicilio(domicilio);
            cliente.setDni(dni);
            cliente.setTel(tel);
            cliente.setEstado(true);
            cliDa.guardarCliente(cliente);
        } else {
            int dni = Integer.parseInt(jTf_dni.getText());
            String nombre = jTf_nombre.getText();
            String domicilio = jTf_domicilio.getText();
            int tel = Integer.parseInt(jTf_telefono.getText());
            // boolean estado=jrbEstado.isSelected(); //NO ACTUALIZAMOS EL ESTADO ACA, HAY QUE SACAR DEL METODO MODIFICAR  
            cliente.setDni(dni);
            cliente.setNombre(nombre);
            cliente.setDomicilio(domicilio);
            cliente.setTel(tel);
            //cliente.setEstado(true); //No seteamos, dejamos el que traia el Cliente.
            cliDa.actualizarCliente(cliente);
        }        
    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTf_dni;
    private javax.swing.JTextField jTf_domicilio;
    private javax.swing.JTextField jTf_nombre;
    private javax.swing.JTextField jTf_telefono;
    // End of variables declaration//GEN-END:variables
}
