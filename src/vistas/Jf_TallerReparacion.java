/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Pat
 */
public class Jf_TallerReparacion extends javax.swing.JFrame {

    /**
     * Creates new form Jf_TallerReparacion
     */
    public Jf_TallerReparacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_cliente = new javax.swing.JButton();
        btn_bicicleta = new javax.swing.JButton();
        btn_Servicio = new javax.swing.JButton();
        byn_Repuesto = new javax.swing.JButton();
        btn_reparacion = new javax.swing.JButton();
        tab_panelPrincipal = new javax.swing.JTabbedPane();
        tab_inicio = new javax.swing.JPanel();
        tab_Cliente = new javax.swing.JPanel();
        btn_cliente1 = new javax.swing.JButton();
        tab_bici = new javax.swing.JPanel();
        btn_bicicleta1 = new javax.swing.JButton();
        tab_servicio = new javax.swing.JPanel();
        btn_Servicio1 = new javax.swing.JButton();
        tab_repuesto = new javax.swing.JPanel();
        byn_Repuesto1 = new javax.swing.JButton();
        tab_reparacion = new javax.swing.JPanel();
        btn_reparacion1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(194, 217, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cliente.setText("CLIENTE");
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        btn_bicicleta.setText("BICICLETA");
        btn_bicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicletaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_bicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        btn_Servicio.setText("SERVICIO");
        btn_Servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ServicioActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        byn_Repuesto.setText("REPUESTO");
        byn_Repuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byn_RepuestoActionPerformed(evt);
            }
        });
        jPanel2.add(byn_Repuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        btn_reparacion.setText("REPARACION");
        btn_reparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 150));

        tab_inicio.setBackground(new java.awt.Color(109, 163, 210));
        tab_panelPrincipal.addTab("INICIO", tab_inicio);

        tab_Cliente.setBackground(new java.awt.Color(120, 162, 199));

        btn_cliente1.setText("VER VENTANA CLIENTE");
        btn_cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente1ActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente1);

        tab_panelPrincipal.addTab("CLIENTE", tab_Cliente);

        tab_bici.setBackground(new java.awt.Color(120, 162, 199));

        btn_bicicleta1.setText("VER VENTANA BICICLETA");
        btn_bicicleta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta1ActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta1);

        tab_panelPrincipal.addTab("BICICLETA", tab_bici);

        tab_servicio.setBackground(new java.awt.Color(120, 162, 199));

        btn_Servicio1.setText("VER VENTANA SERVICIO");
        btn_Servicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Servicio1ActionPerformed(evt);
            }
        });
        tab_servicio.add(btn_Servicio1);

        tab_panelPrincipal.addTab("SERVICIO", tab_servicio);

        tab_repuesto.setBackground(new java.awt.Color(120, 162, 199));

        byn_Repuesto1.setText("VER VENTANA REPUESTO");
        byn_Repuesto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byn_Repuesto1ActionPerformed(evt);
            }
        });
        tab_repuesto.add(byn_Repuesto1);

        tab_panelPrincipal.addTab("REPUESTO", tab_repuesto);

        tab_reparacion.setBackground(new java.awt.Color(120, 162, 199));

        btn_reparacion1.setText("VER VENTANA REPARACION");
        btn_reparacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacion1ActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_reparacion1);

        tab_panelPrincipal.addTab("-REPARACION-", tab_reparacion);

        getContentPane().add(tab_panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
tab_panelPrincipal.setSelectedIndex(1);
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_bicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bicicletaActionPerformed
tab_panelPrincipal.setSelectedIndex(2);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bicicletaActionPerformed

    private void btn_ServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ServicioActionPerformed
tab_panelPrincipal.setSelectedIndex(3);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ServicioActionPerformed

    private void byn_RepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byn_RepuestoActionPerformed
tab_panelPrincipal.setSelectedIndex(4);        // TODO add your handling code here:
    }//GEN-LAST:event_byn_RepuestoActionPerformed

    private void btn_reparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reparacionActionPerformed
tab_panelPrincipal.setSelectedIndex(5);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reparacionActionPerformed

    private void btn_cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente1ActionPerformed
        Jf_Cliente jfCliente = new Jf_Cliente(this,true);
        jfCliente.setAlwaysOnTop(true);
        jfCliente.show(true);
        jfCliente.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cliente1ActionPerformed

    private void btn_bicicleta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bicicleta1ActionPerformed
        Jf_Bicicleta jfBicicleta = new Jf_Bicicleta(this,true);
        jfBicicleta.setAlwaysOnTop(true);
        jfBicicleta.show(true);
        jfBicicleta.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btn_bicicleta1ActionPerformed

    private void btn_Servicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Servicio1ActionPerformed
        Jf_Servicio jfServicio = new Jf_Servicio(this,true);
        jfServicio.setAlwaysOnTop(true);
        jfServicio.show(true);
        jfServicio.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Servicio1ActionPerformed

    private void byn_Repuesto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byn_Repuesto1ActionPerformed
        Jf_Repuesto jfRepuesto = new Jf_Repuesto(this,true);
        jfRepuesto.setAlwaysOnTop(true);
        jfRepuesto.show(true);
        jfRepuesto.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_byn_Repuesto1ActionPerformed

    private void btn_reparacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reparacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reparacion1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Jf_TallerReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_TallerReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_TallerReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_TallerReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_TallerReparacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Servicio;
    private javax.swing.JButton btn_Servicio1;
    private javax.swing.JButton btn_bicicleta;
    private javax.swing.JButton btn_bicicleta1;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_cliente1;
    private javax.swing.JButton btn_reparacion;
    private javax.swing.JButton btn_reparacion1;
    private javax.swing.JButton byn_Repuesto;
    private javax.swing.JButton byn_Repuesto1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel tab_Cliente;
    private javax.swing.JPanel tab_bici;
    private javax.swing.JPanel tab_inicio;
    private javax.swing.JTabbedPane tab_panelPrincipal;
    private javax.swing.JPanel tab_reparacion;
    private javax.swing.JPanel tab_repuesto;
    private javax.swing.JPanel tab_servicio;
    // End of variables declaration//GEN-END:variables
}
