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
    private DefaultTableModel tModeloCliente = new DefaultTableModel(new String[]{"Dni", "Nombre", "Domicilio", "Teléfono"}, 0);
    private DefaultTableModel tModeloBicicleta = new DefaultTableModel(new String[]{"Serie", "Marca", "Tipo", "Color","Cliente"}, 0);
    private DefaultTableModel tModeloRepuesto = new DefaultTableModel(new String[]{"Serie", "Descripcion", "Costo"}, 0);
    private DefaultTableModel tModeloServicio = new DefaultTableModel(new String[]{"Codigo", "Descripcion", "Costo"}, 0);
    private DefaultTableModel tModeloReparacion = new DefaultTableModel(new String[]{"Numero", "Servicio", "Cliente", "Bicicleta","Fecha","Precio"}, 0);
    private ClienteData cliDa = new ClienteData();
    private BicicletaData biciDa = new BicicletaData();
    private RepuestoData repuDa = new RepuestoData();
    private ServicioData servDa = new ServicioData();
    private ReparacionData repaDa = new ReparacionData();
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Bicicleta> listaBicicleta;
    private ArrayList<Repuesto> listaRepuesto;
    private ArrayList<Servicio> listaServicio;
    private ArrayList<Reparacion> listaReparacion;

    public Jf_TallerReparacion() {
        initComponents();
        cargarTablaCliente();
        cargarTablaBicicleta();
        cargarTablaRepuesto();
        cargarTablaServicio();
        cargarTablaReparacion();

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
        jLabel1 = new javax.swing.JLabel();
        tab_panelPrincipal = new javax.swing.JTabbedPane();
        tab_inicio = new javax.swing.JPanel();
        BKGLateral_lbl = new javax.swing.JLabel();
        tab_Cliente = new javax.swing.JPanel();
        btn_cliente_baja = new javax.swing.JButton();
        btn_cliente_alta = new javax.swing.JButton();
        btn_cliente_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cliente = new javax.swing.JTable();
        BKGLateral_lbl1 = new javax.swing.JLabel();
        tab_bici = new javax.swing.JPanel();
        btn_bicicleta_alta = new javax.swing.JButton();
        btn_bicicleta_baja = new javax.swing.JButton();
        btn_bicicleta_modificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Bicicleta = new javax.swing.JTable();
        BKGLateral_lbl2 = new javax.swing.JLabel();
        tab_repuesto = new javax.swing.JPanel();
        btn_repuesto_alta = new javax.swing.JButton();
        btn_repuesto_modificar = new javax.swing.JButton();
        btn_repuesto_baja = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Repuesto = new javax.swing.JTable();
        BKGLateral_lbl3 = new javax.swing.JLabel();
        tab_reparacion = new javax.swing.JPanel();
        btn_reparacion_alta = new javax.swing.JButton();
        btn_reparacion_modificar = new javax.swing.JButton();
        btn_reparacion_borrar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Reparacion = new javax.swing.JTable();
        BKGLateral_lbl4 = new javax.swing.JLabel();
        tab_servicio = new javax.swing.JPanel();
        btn_servicio_alta = new javax.swing.JButton();
        btn_servicio_baja = new javax.swing.JButton();
        btn_servicio_modificar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Servicio = new javax.swing.JTable();
        BKGLateral_lbl5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(82, 148, 202));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cliente.setBackground(new java.awt.Color(82, 148, 202));
        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Cli_btn.png"))); // NOI18N
        btn_cliente.setBorder(null);
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 120, 120));

        btn_bicicleta.setBackground(new java.awt.Color(82, 148, 202));
        btn_bicicleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Bici_btn.png"))); // NOI18N
        btn_bicicleta.setBorder(null);
        btn_bicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicletaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_bicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 120, 120));

        btn_Servicio.setBackground(new java.awt.Color(82, 148, 202));
        btn_Servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Serv_btn.png"))); // NOI18N
        btn_Servicio.setBorder(null);
        btn_Servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ServicioActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 120, 120));

        byn_Repuesto.setBackground(new java.awt.Color(82, 148, 202));
        byn_Repuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Repu_btn.png"))); // NOI18N
        byn_Repuesto.setBorder(null);
        byn_Repuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byn_RepuestoActionPerformed(evt);
            }
        });
        jPanel2.add(byn_Repuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 120, 120));

        btn_reparacion.setBackground(new java.awt.Color(82, 148, 202));
        btn_reparacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Repa_btn.png"))); // NOI18N
        btn_reparacion.setBorder(null);
        btn_reparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 120, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Logo-160-150.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1020, 160));

        tab_panelPrincipal.setBackground(new java.awt.Color(82, 148, 202));

        tab_inicio.setBackground(new java.awt.Color(255, 255, 255));
        tab_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BKGLateral_lbl.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl.setOpaque(true);
        tab_inicio.add(BKGLateral_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        tab_panelPrincipal.addTab("INICIO", tab_inicio);

        tab_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        tab_Cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cliente_baja.setText("BAJA");
        btn_cliente_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_bajaActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        btn_cliente_alta.setText("ALTA");
        btn_cliente_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_altaActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        btn_cliente_modificar.setText("MODIFICAR");
        btn_cliente_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_modificarActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

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

        tab_Cliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 790, -1));

        BKGLateral_lbl1.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl1.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl1.setOpaque(true);
        tab_Cliente.add(BKGLateral_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        tab_panelPrincipal.addTab("CLIENTE", tab_Cliente);

        tab_bici.setBackground(new java.awt.Color(255, 255, 255));
        tab_bici.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_bicicleta_alta.setText("ALTA");
        btn_bicicleta_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta_altaActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btn_bicicleta_baja.setText("BAJA");
        btn_bicicleta_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta_bajaActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        btn_bicicleta_modificar.setText("MODIFICAR");
        btn_bicicleta_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta_modificarActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jTable_Bicicleta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable_Bicicleta);

        tab_bici.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 790, -1));

        BKGLateral_lbl2.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl2.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl2.setOpaque(true);
        tab_bici.add(BKGLateral_lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        tab_panelPrincipal.addTab("BICICLETA", tab_bici);

        tab_repuesto.setBackground(new java.awt.Color(255, 255, 255));
        tab_repuesto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_repuesto_alta.setText("ALTA");
        btn_repuesto_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repuesto_altaActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_repuesto_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        btn_repuesto_modificar.setText("MODIFICAR");
        btn_repuesto_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repuesto_modificarActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_repuesto_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        btn_repuesto_baja.setText("BAJA");
        btn_repuesto_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repuesto_bajaActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_repuesto_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jTable_Repuesto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable_Repuesto);

        tab_repuesto.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 790, -1));

        BKGLateral_lbl3.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl3.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl3.setOpaque(true);
        tab_repuesto.add(BKGLateral_lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        tab_panelPrincipal.addTab("REPUESTO", tab_repuesto);

        tab_reparacion.setBackground(new java.awt.Color(255, 255, 255));
        tab_reparacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_reparacion_alta.setText("ALTA");
        btn_reparacion_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacion_altaActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_reparacion_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        btn_reparacion_modificar.setText("MODIFICAR");
        btn_reparacion_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacion_modificarActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_reparacion_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        btn_reparacion_borrar.setText("BORRAR");
        btn_reparacion_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacion_borrarActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_reparacion_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jTable_Reparacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable_Reparacion);

        tab_reparacion.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 790, -1));

        BKGLateral_lbl4.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl4.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl4.setOpaque(true);
        tab_reparacion.add(BKGLateral_lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        tab_panelPrincipal.addTab("-REPARACION-", tab_reparacion);

        tab_servicio.setBackground(new java.awt.Color(255, 255, 255));
        tab_servicio.setForeground(new java.awt.Color(255, 255, 255));
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

        jTable_Servicio.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable_Servicio);

        tab_servicio.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 790, -1));

        BKGLateral_lbl5.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl5.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl5.setOpaque(true);
        tab_servicio.add(BKGLateral_lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        tab_panelPrincipal.addTab("SERVICIO", tab_servicio);

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
        jfCliente.setVisible(true);          
    }//GEN-LAST:event_btn_cliente_altaActionPerformed

    private void btn_cliente_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_modificarActionPerformed
        Cliente cliente = cliDa.buscarCliente((Integer) tModeloCliente.getValueAt(jTable_Cliente.getSelectedRow(), 0));
        Jf_Cliente jfCliente = new Jf_Cliente(this,cliente);
        jfCliente.setAlwaysOnTop(true);
        jfCliente.show(true);
        jfCliente.setVisible(true);  
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
        Servicio servicio = servDa.buscarServicio((Integer) tModeloServicio.getValueAt(jTable_Servicio.getSelectedRow(), 0));
        Jf_Servicio jfServicio = new Jf_Servicio(this,servicio);
        jfServicio.setAlwaysOnTop(true);
        jfServicio.show(true);
        jfServicio.setVisible(true);
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
        cargarTablaCliente();
        cargarTablaBicicleta();
        cargarTablaRepuesto();
        cargarTablaServicio();
        cargarTablaReparacion();     // TODO add your handling code here:
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
    private javax.swing.JLabel BKGLateral_lbl;
    private javax.swing.JLabel BKGLateral_lbl1;
    private javax.swing.JLabel BKGLateral_lbl2;
    private javax.swing.JLabel BKGLateral_lbl3;
    private javax.swing.JLabel BKGLateral_lbl4;
    private javax.swing.JLabel BKGLateral_lbl5;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_Bicicleta;
    private javax.swing.JTable jTable_Cliente;
    private javax.swing.JTable jTable_Reparacion;
    private javax.swing.JTable jTable_Repuesto;
    private javax.swing.JTable jTable_Servicio;
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

    private void cargarTablaBicicleta() {
        tModeloBicicleta.setNumRows(0);
        listaBicicleta = biciDa.listarBicicletas();
        for (Bicicleta bicicleta : listaBicicleta) {
            tModeloBicicleta.addRow(new Object[]{bicicleta.getNroSerie(),bicicleta.getMarca(),bicicleta.getTipo(),bicicleta.getColor(),bicicleta.getCliente()});
        }
        jTable_Bicicleta.setModel(tModeloBicicleta);
    }

    private void cargarTablaRepuesto() {
       tModeloRepuesto.setNumRows(0);
        listaRepuesto = repuDa.listaRepuesto();
        for (Repuesto repuesto : listaRepuesto) {
            tModeloRepuesto.addRow(new Object[]{repuesto.getSerie(),repuesto.getDescripcion(),repuesto.getCosto()});
        }
        jTable_Repuesto.setModel(tModeloRepuesto);
    }

    private void cargarTablaServicio() {
               tModeloServicio.setNumRows(0);
        listaServicio = servDa.listarServicios();
        for (Servicio servicio : listaServicio) {
            tModeloServicio.addRow(new Object[]{servicio.getCodigo(),servicio.getDescripcion(),servicio.getCosto()});
        }
        jTable_Servicio.setModel(tModeloServicio);
    }

    private void cargarTablaReparacion() {
         tModeloReparacion.setNumRows(0);
        listaReparacion = repaDa.listarBicisPendientes();
        for (Reparacion reparacion : listaReparacion) {
//(new String[]{"Numero", "Servicio", "Cliente", "Bicicleta","Fecha","Precio"}, 0);
            tModeloReparacion.addRow(new Object[]{reparacion.getId(),reparacion.getServicio(), reparacion.getCliente(), reparacion.getBici(), reparacion.getFechaEntrada(), reparacion.getCostoTotal()});
        }
        jTable_Reparacion.setModel(tModeloReparacion);
    }
}
