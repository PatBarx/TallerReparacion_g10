package vistas;
import entidades.Cliente;
import datos.ClienteData;
import entidades.Bicicleta;
import datos.BicicletaData;
import entidades.Repuesto;
import datos.RepuestoData;
import entidades.Servicio;
import datos.ServicioData;
import entidades.Reparacion;
import datos.ReparacionData;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Jf_TallerReparacion extends javax.swing.JFrame {
    private DefaultTableModel tModeloCliente = new DefaultTableModel(new String[]{"Dni", "Nombre", "Domicilio", "Teléfono"}, 0);;
    private ClienteData cliDa = new ClienteData();
    private ArrayList<Cliente> listaCliente;

    public Jf_TallerReparacion() {
        initComponents();
        
        cargarTablaCliente();

    }

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
        btn_cliente_baja = new javax.swing.JButton();
        btn_cliente_alta = new javax.swing.JButton();
        btn_cliente_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cliente = new javax.swing.JTable();
        tab_bici = new javax.swing.JPanel();
        btn_bicicleta_alta = new javax.swing.JButton();
        btn_bicicleta_baja = new javax.swing.JButton();
        btn_bicicleta_modificar = new javax.swing.JButton();
        tab_servicio = new javax.swing.JPanel();
        btn_servicio_alta = new javax.swing.JButton();
        btn_servicio_baja = new javax.swing.JButton();
        btn_servicio_modificar = new javax.swing.JButton();
        tab_repuesto = new javax.swing.JPanel();
        btn_repuesto_alta = new javax.swing.JButton();
        btn_repuesto_modificar = new javax.swing.JButton();
        btn_repuesto_baja = new javax.swing.JButton();
        tab_reparacion = new javax.swing.JPanel();
        btn_reparacion_alta = new javax.swing.JButton();
        btn_reparacion_modificar = new javax.swing.JButton();
        btn_reparacion_borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
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
        tab_Cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cliente_baja.setText("BAJA");
        btn_cliente_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_bajaActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        btn_cliente_alta.setText("ALTA");
        btn_cliente_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_altaActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btn_cliente_modificar.setText("MODIFICAR");
        btn_cliente_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_modificarActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jTable_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Cliente);

        tab_Cliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 790, -1));

        tab_panelPrincipal.addTab("CLIENTE", tab_Cliente);

        tab_bici.setBackground(new java.awt.Color(120, 162, 199));
        tab_bici.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_bicicleta_alta.setText("ALTA");
        btn_bicicleta_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta_altaActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btn_bicicleta_baja.setText("BAJA");
        btn_bicicleta_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta_bajaActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        btn_bicicleta_modificar.setText("MODIFICAR");
        btn_bicicleta_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta_modificarActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        tab_panelPrincipal.addTab("BICICLETA", tab_bici);

        tab_servicio.setBackground(new java.awt.Color(120, 162, 199));
        tab_servicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_servicio_alta.setText("ALTA");
        btn_servicio_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicio_altaActionPerformed(evt);
            }
        });
        tab_servicio.add(btn_servicio_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        btn_servicio_baja.setText("BAJA");
        btn_servicio_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicio_bajaActionPerformed(evt);
            }
        });
        tab_servicio.add(btn_servicio_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        btn_servicio_modificar.setText("MODIFICAR");
        btn_servicio_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicio_modificarActionPerformed(evt);
            }
        });
        tab_servicio.add(btn_servicio_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        tab_panelPrincipal.addTab("SERVICIO", tab_servicio);

        tab_repuesto.setBackground(new java.awt.Color(120, 162, 199));
        tab_repuesto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_repuesto_alta.setText("ALTA");
        btn_repuesto_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repuesto_altaActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_repuesto_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        btn_repuesto_modificar.setText("MODIFICAR");
        btn_repuesto_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repuesto_modificarActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_repuesto_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btn_repuesto_baja.setText("BAJA");
        btn_repuesto_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repuesto_bajaActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_repuesto_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        tab_panelPrincipal.addTab("REPUESTO", tab_repuesto);

        tab_reparacion.setBackground(new java.awt.Color(120, 162, 199));
        tab_reparacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_reparacion_alta.setText("ALTA");
        btn_reparacion_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacion_altaActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_reparacion_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        btn_reparacion_modificar.setText("MODIFICAR");
        btn_reparacion_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacion_modificarActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_reparacion_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        btn_reparacion_borrar.setText("BORRAR");
        btn_reparacion_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacion_borrarActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_reparacion_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

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

    private void btn_cliente_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_bajaActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_btn_cliente_bajaActionPerformed

    private void btn_bicicleta_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bicicleta_altaActionPerformed
        Jf_Bicicleta jfBicicleta = new Jf_Bicicleta(this,null);
        jfBicicleta.setAlwaysOnTop(true);
        jfBicicleta.show(true);
        jfBicicleta.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btn_bicicleta_altaActionPerformed

    private void btn_servicio_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicio_altaActionPerformed
        Jf_Servicio jfServicio = new Jf_Servicio(this,null);
        jfServicio.setAlwaysOnTop(true);
        jfServicio.show(true);
        jfServicio.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_servicio_altaActionPerformed

    private void btn_repuesto_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_repuesto_altaActionPerformed
        Jf_Repuesto jfRepuesto = new Jf_Repuesto(this,null);
        jfRepuesto.setAlwaysOnTop(true);
        jfRepuesto.show(true);
        jfRepuesto.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btn_repuesto_altaActionPerformed

    private void btn_reparacion_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reparacion_altaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reparacion_altaActionPerformed

    private void btn_cliente_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_altaActionPerformed
        Jf_Cliente jfCliente = new Jf_Cliente(this,null);
        jfCliente.setAlwaysOnTop(true);
        jfCliente.show(true);
        jfCliente.setVisible(true);          // TODO add your handling code here:
        cargarTablaCliente();
    }//GEN-LAST:event_btn_cliente_altaActionPerformed

    private void btn_cliente_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_modificarActionPerformed
        
        Cliente cliente = cliDa.buscarCliente((Integer) tModeloCliente.getValueAt(jTable_Cliente.getSelectedRow(), 0)); //REMPLAZAR POR EL DNI DEL CLIENTE EN LA TABLA MOSTRADA
        Jf_Cliente jfCliente = new Jf_Cliente(this,cliente);
        jfCliente.setAlwaysOnTop(true);
        jfCliente.show(true);
        jfCliente.setVisible(true);          // TODO add your handling code here:
        cargarTablaCliente();
    }//GEN-LAST:event_btn_cliente_modificarActionPerformed

    private void btn_bicicleta_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bicicleta_bajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bicicleta_bajaActionPerformed

    private void btn_bicicleta_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bicicleta_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bicicleta_modificarActionPerformed

    private void btn_servicio_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicio_bajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_servicio_bajaActionPerformed

    private void btn_servicio_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicio_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_servicio_modificarActionPerformed

    private void btn_repuesto_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_repuesto_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_repuesto_modificarActionPerformed

    private void btn_repuesto_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_repuesto_bajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_repuesto_bajaActionPerformed

    private void btn_reparacion_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reparacion_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reparacion_modificarActionPerformed

    private void btn_reparacion_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reparacion_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reparacion_borrarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
cargarTablaCliente();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
    private javax.swing.JButton btn_bicicleta;
    private javax.swing.JButton btn_bicicleta_alta;
    private javax.swing.JButton btn_bicicleta_baja;
    private javax.swing.JButton btn_bicicleta_modificar;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_cliente_alta;
    private javax.swing.JButton btn_cliente_baja;
    private javax.swing.JButton btn_cliente_modificar;
    private javax.swing.JButton btn_reparacion;
    private javax.swing.JButton btn_reparacion_alta;
    private javax.swing.JButton btn_reparacion_borrar;
    private javax.swing.JButton btn_reparacion_modificar;
    private javax.swing.JButton btn_repuesto_alta;
    private javax.swing.JButton btn_repuesto_baja;
    private javax.swing.JButton btn_repuesto_modificar;
    private javax.swing.JButton btn_servicio_alta;
    private javax.swing.JButton btn_servicio_baja;
    private javax.swing.JButton btn_servicio_modificar;
    private javax.swing.JButton byn_Repuesto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Cliente;
    private javax.swing.JPanel tab_Cliente;
    private javax.swing.JPanel tab_bici;
    private javax.swing.JPanel tab_inicio;
    private javax.swing.JTabbedPane tab_panelPrincipal;
    private javax.swing.JPanel tab_reparacion;
    private javax.swing.JPanel tab_repuesto;
    private javax.swing.JPanel tab_servicio;
    // End of variables declaration//GEN-END:variables

    public void cargarTablaCliente() {
        tModeloCliente.setNumRows(0);
        listaCliente = cliDa.listarCliente();
        for (Cliente cliente : listaCliente) {
            tModeloCliente.addRow(new Object[]{cliente.getDni(),cliente.getNombre(),cliente.getDomicilio(),cliente.getTel()});
        }
        jTable_Cliente.setModel(tModeloCliente);
    }
}
