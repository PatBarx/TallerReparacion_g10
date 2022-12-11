package vistas;

import datos.ItemRepData;
import datos.ReparacionData;
import datos.RepuestoData;
import datos.ServicioData;
import entidades.Bicicleta;
import entidades.Cliente;
import entidades.ItemRep;
import entidades.Repuesto;
import entidades.Servicio;
import entidades.Reparacion;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author Grupo10
 */
public class Jf_Reparacion2 extends javax.swing.JFrame {

    private final java.awt.Frame padre;
    private Reparacion reparacion;
    private ReparacionData repaDa = new ReparacionData();
    private RepuestoData repuDat = new RepuestoData();
    private ItemRepData itemDat = new ItemRepData();
    private Servicio servicio = new Servicio();
    private Cliente cliente = new Cliente();
    private Bicicleta bicicleta = new Bicicleta();
    private DefaultTableModel tModeloItemRep = new DefaultTableModel(new String[]{"Repuesto", "Cantidad", "Costo"}, 0);
    private ArrayList<ItemRep> listaItems;
    private boolean cambiaPrecioItem = true;

    public Jf_Reparacion2(java.awt.Frame padre, Reparacion reparacion) {
        initComponents();
        this.padre = padre;
        this.reparacion = reparacion;
        this.repaDa = new ReparacionData();
        jCbox_Repuestos.removeAllItems();
        for (Repuesto repuesto : repuDat.listaRepuesto(1, "%", "%")) {
            jCbox_Repuestos.addItem(repuesto);
        }
        tModeloItemRep.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent evento) {
                actualizaSumasItem(evento);
            }
        });
    }

    private void actualizaSumasItem(TableModelEvent evento) {
        if (cambiaPrecioItem) {

            for (ItemRep item : listaItems) {
                if (item.getRepuesto().equals(tModeloItemRep.getValueAt(jTable_Reparacion.getSelectedRow(), 0))) {
                    int cantidad = Integer.parseInt(tModeloItemRep.getValueAt(jTable_Reparacion.getSelectedRow(), 1).toString());
                    float costo = item.getRepuesto().getCosto();
                    item.setCantidad(cantidad);
                    item.setCosto(costo * cantidad);
                }
            }
            cargaTablaItems();
        }
    }

    ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDChooser_fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Reparacion = new javax.swing.JTable();
        jRBut_Pendiiente = new javax.swing.JRadioButton();
        jRBut_Resuelto = new javax.swing.JRadioButton();
        jRBut_Entregado = new javax.swing.JRadioButton();
        jRBut_Anulado = new javax.swing.JRadioButton();
        jCbox_Repuestos = new javax.swing.JComboBox<>();
        btn_buscaB = new javax.swing.JButton();
        btn_buscaC = new javax.swing.JButton();
        btn_buscaS = new javax.swing.JButton();
        jTf_NumeroRepa = new javax.swing.JTextField();
        jTf_Servicio = new javax.swing.JTextField();
        jTf_Cliente = new javax.swing.JTextField();
        jTf_Bicicleta = new javax.swing.JTextField();
        jTf_PrecioFinal = new javax.swing.JTextField();
        jTf_totalRepue = new javax.swing.JTextField();
        btn_nwRepuesto = new javax.swing.JButton();
        btn_agregRepu = new javax.swing.JButton();
        btn_quitaRepu = new javax.swing.JButton();
        btn_nwCliente = new javax.swing.JButton();
        btn_nwServicio = new javax.swing.JButton();
        btn_nwBicicleta = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_MarcoNrj = new javax.swing.JLabel();
        lbl_marcoAzl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDChooser_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jDChooser_fecha.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.add(jDChooser_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 273, 150, 26));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0)));

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
        jTable_Reparacion.setRowHeight(22);
        jTable_Reparacion.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable_ReparacionInputMethodTextChanged(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_Reparacion);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 370, 150));

        jRBut_Pendiiente.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroup1.add(jRBut_Pendiiente);
        jRBut_Pendiiente.setAutoscrolls(true);
        jRBut_Pendiiente.setBorder(null);
        jPanel1.add(jRBut_Pendiiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 322, 20, 20));

        jRBut_Resuelto.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroup1.add(jRBut_Resuelto);
        jRBut_Resuelto.setAutoscrolls(true);
        jRBut_Resuelto.setBorder(null);
        jPanel1.add(jRBut_Resuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 352, 20, 20));

        jRBut_Entregado.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroup1.add(jRBut_Entregado);
        jRBut_Entregado.setAutoscrolls(true);
        jRBut_Entregado.setBorder(null);
        jPanel1.add(jRBut_Entregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 382, 20, 20));

        jRBut_Anulado.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroup1.add(jRBut_Anulado);
        jRBut_Anulado.setAutoscrolls(true);
        jRBut_Anulado.setBorder(null);
        jPanel1.add(jRBut_Anulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 412, 20, 20));

        jCbox_Repuestos.setBorder(null);
        jPanel1.add(jCbox_Repuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 86, 285, 28));

        btn_buscaB.setBackground(new java.awt.Color(82, 148, 202));
        btn_buscaB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/MLupa.png"))); // NOI18N
        btn_buscaB.setBorder(null);
        btn_buscaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscaBActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 220, 40, 40));

        btn_buscaC.setBackground(new java.awt.Color(82, 148, 202));
        btn_buscaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/MLupa.png"))); // NOI18N
        btn_buscaC.setBorder(null);
        btn_buscaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscaCActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 173, 40, 40));

        btn_buscaS.setBackground(new java.awt.Color(82, 148, 202));
        btn_buscaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/MLupa.png"))); // NOI18N
        btn_buscaS.setBorder(null);
        btn_buscaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscaSActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 128, 40, 40));

        jTf_NumeroRepa.setEditable(false);
        jTf_NumeroRepa.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_NumeroRepa.setBorder(null);
        jTf_NumeroRepa.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_NumeroRepaComponentShown(evt);
            }
        });
        jPanel1.add(jTf_NumeroRepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 93, 145, 20));

        jTf_Servicio.setEditable(false);
        jTf_Servicio.setBorder(null);
        jPanel1.add(jTf_Servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 145, 20));

        jTf_Cliente.setEditable(false);
        jTf_Cliente.setBorder(null);
        jTf_Cliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_ClienteComponentShown(evt);
            }
        });
        jPanel1.add(jTf_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 185, 145, 20));

        jTf_Bicicleta.setEditable(false);
        jTf_Bicicleta.setBorder(null);
        jTf_Bicicleta.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_BicicletaComponentShown(evt);
            }
        });
        jPanel1.add(jTf_Bicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 145, 20));

        jTf_PrecioFinal.setEditable(false);
        jTf_PrecioFinal.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jTf_PrecioFinal.setBorder(null);
        jTf_PrecioFinal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_PrecioFinalComponentShown(evt);
            }
        });
        jPanel1.add(jTf_PrecioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 385, 140, 50));

        jTf_totalRepue.setEditable(false);
        jTf_totalRepue.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jTf_totalRepue.setBorder(null);
        jTf_totalRepue.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_totalRepueComponentShown(evt);
            }
        });
        jPanel1.add(jTf_totalRepue, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 403, 120, 30));

        btn_nwRepuesto.setBackground(new java.awt.Color(82, 148, 202));
        btn_nwRepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Mas.png"))); // NOI18N
        btn_nwRepuesto.setBorder(null);
        btn_nwRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nwRepuestoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nwRepuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 40, 40));

        btn_agregRepu.setBackground(new java.awt.Color(82, 148, 202));
        btn_agregRepu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Mas.png"))); // NOI18N
        btn_agregRepu.setBorder(null);
        btn_agregRepu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregRepuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregRepu, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 170, 38, 38));

        btn_quitaRepu.setBackground(new java.awt.Color(82, 148, 202));
        btn_quitaRepu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Menos.png"))); // NOI18N
        btn_quitaRepu.setBorder(null);
        btn_quitaRepu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitaRepuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_quitaRepu, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 172, 38, 38));

        btn_nwCliente.setBackground(new java.awt.Color(82, 148, 202));
        btn_nwCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Mas.png"))); // NOI18N
        btn_nwCliente.setBorder(null);
        jPanel1.add(btn_nwCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 175, 40, 40));

        btn_nwServicio.setBackground(new java.awt.Color(82, 148, 202));
        btn_nwServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Mas.png"))); // NOI18N
        btn_nwServicio.setBorder(null);
        btn_nwServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nwServicioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nwServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 129, 40, 40));

        btn_nwBicicleta.setBackground(new java.awt.Color(82, 148, 202));
        btn_nwBicicleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Mas.png"))); // NOI18N
        btn_nwBicicleta.setBorder(null);
        jPanel1.add(btn_nwBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 221, 40, 40));

        btn_guardar.setBackground(new java.awt.Color(82, 148, 202));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-xGuarda.png"))); // NOI18N
        btn_guardar.setBorder(null);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 150, 55));

        btn_salir.setBackground(new java.awt.Color(82, 148, 202));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-xSalir.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 150, 55));

        lbl_MarcoNrj.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        lbl_MarcoNrj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Form-RepaYRepu.png"))); // NOI18N
        lbl_MarcoNrj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0), 2));
        jPanel1.add(lbl_MarcoNrj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_marcoAzl.setBackground(new java.awt.Color(82, 148, 202));
        lbl_marcoAzl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 77, 114), 2));
        lbl_marcoAzl.setOpaque(true);
        jPanel1.add(lbl_marcoAzl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 750, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTf_PrecioFinalComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_PrecioFinalComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_PrecioFinalComponentShown

    private void jTf_NumeroRepaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_NumeroRepaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_NumeroRepaComponentShown

    private void jTf_totalRepueComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_totalRepueComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_totalRepueComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.padre.setEnabled(false);
        if (reparacion != null) {
            jTf_NumeroRepa.setText(String.valueOf(reparacion.getId()));
            jTf_NumeroRepa.setEnabled(false);
            servicio = reparacion.getServicio();
            cliente = reparacion.getCliente();
            bicicleta = reparacion.getBici();

            if (servicio != null) {
                jTf_Servicio.setText(servicio.toString());
            }
            if (cliente != null) {
                jTf_Cliente.setText(cliente.toString());
            }
            if (bicicleta != null) {
                jTf_Bicicleta.setText(bicicleta.toString());
            }
            jDChooser_fecha.setDate(Date.valueOf(reparacion.getFechaEntrada()));
            jTf_PrecioFinal.setText(String.valueOf(reparacion.getCostoTotal()));
            switch (reparacion.getEstado()) {
                //(pendiente 1- resuelto 0 -Entregada 2 - anulada3)
                case 1:
                    jRBut_Pendiiente.setSelected(true);
                    break;
                case 2:
                    jRBut_Entregado.setSelected(true);
                    break;
                case 3:
                    jRBut_Anulado.setSelected(true);
                    break;
                case 0:
                    jRBut_Resuelto.setSelected(true);
                    break;
            }

            // - - Repuestos - - - - - - - - - -- - - *//// / / / / 
            listaItems = itemDat.listarItemRepPorReparacion(reparacion);
            cargaTablaItems();
            if (jRBut_Entregado.isSelected() || jRBut_Anulado.isSelected()) {
                //para desactivar (dejar solo lectura)            
                btn_buscaS.setEnabled(false);
                btn_nwServicio.setEnabled(false);
                btn_buscaC.setEnabled(false);
                btn_nwCliente.setEnabled(false);
                btn_buscaB.setEnabled(false);
                btn_nwBicicleta.setEnabled(false);
                jDChooser_fecha.setEnabled(false);
                jRBut_Pendiiente.setEnabled(false);
                jRBut_Resuelto.setEnabled(false);
                jRBut_Entregado.setEnabled(false);
                jRBut_Anulado.setEnabled(false);

                btn_nwRepuesto.setEnabled(false);
                btn_agregRepu.setEnabled(false);
                btn_quitaRepu.setEnabled(false);
                jTable_Reparacion.setEnabled(false);
                btn_guardar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_nwServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nwServicioActionPerformed
        Jf_Servicio jfServicio = new Jf_Servicio(this, null);
        jfServicio.setAlwaysOnTop(true);
        jfServicio.show(true);
        jfServicio.setVisible(true);
    }//GEN-LAST:event_btn_nwServicioActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.padre.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.padre.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void jTf_ClienteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_ClienteComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_ClienteComponentShown

    private void jTf_BicicletaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_BicicletaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_BicicletaComponentShown

    private void btn_buscaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscaSActionPerformed
        jf_BusquedaServicio jfBusquedaServicio = new jf_BusquedaServicio(this, servicio);
        jfBusquedaServicio.setAlwaysOnTop(true);
        jfBusquedaServicio.show(true);
        jfBusquedaServicio.setVisible(true);
    }//GEN-LAST:event_btn_buscaSActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (servicio.getCodigo() != 0) {
            jTf_Servicio.setText(servicio.toString());
        }
        if (cliente.getDni() != 0) {
            jTf_Cliente.setText(cliente.toString());
        }
        if (bicicleta.getNroSerie() != 0) {
            jTf_Bicicleta.setText(bicicleta.toString());
        }
        jCbox_Repuestos.removeAllItems();
        for (Repuesto repuesto : repuDat.listaRepuesto(1, "%", "%")) {
            jCbox_Repuestos.addItem(repuesto);
        }
        if (listaItems == null) {
            listaItems = new ArrayList();
        }

        cargaTablaItems();
    }//GEN-LAST:event_formWindowActivated

    private void btn_buscaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscaCActionPerformed
        jf_BusquedaCliente jfBusquedaCliente = new jf_BusquedaCliente(this, cliente);
        jfBusquedaCliente.setAlwaysOnTop(true);
        jfBusquedaCliente.show(true);
        jfBusquedaCliente.setVisible(true);
    }//GEN-LAST:event_btn_buscaCActionPerformed

    private void btn_buscaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscaBActionPerformed
        if (cliente == null || cliente.getDni() == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el cliente primero");
        } else {
            jf_BusquedaBicicleta jfBusquedaBicicleta = new jf_BusquedaBicicleta(this, bicicleta, cliente);
            jfBusquedaBicicleta.setAlwaysOnTop(true);
            jfBusquedaBicicleta.show(true);
            jfBusquedaBicicleta.setVisible(true);
        }
    }//GEN-LAST:event_btn_buscaBActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (reparacion == null) {
            reparacion = new Reparacion();
            reparacion.setBici(bicicleta);
            reparacion.setCliente(cliente);
            reparacion.setServicio(servicio);
            reparacion.setFechaEntrada(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(jDChooser_fecha.getDate())));
            if (jRBut_Pendiiente.isSelected()) {
                reparacion.setEstado(1);
            }
            if (jRBut_Entregado.isSelected()) {
                reparacion.setEstado(2);
            }
            if (jRBut_Anulado.isSelected()) {
                reparacion.setEstado(3);
            }
            if (jRBut_Resuelto.isSelected()) {
                reparacion.setEstado(0);
            }
            reparacion.setCostoTotal(Float.parseFloat(jTf_PrecioFinal.getText()));
            repaDa.altaReparacion(reparacion);
            jTf_NumeroRepa.setText(String.valueOf(reparacion.getId()));
        } else {
            reparacion.setBici(bicicleta);
            reparacion.setCliente(cliente);
            reparacion.setServicio(servicio);
            reparacion.setFechaEntrada(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(jDChooser_fecha.getDate())));
            if (jRBut_Pendiiente.isSelected()) {
                reparacion.setEstado(1);
            }
            if (jRBut_Entregado.isSelected()) {
                reparacion.setEstado(2);
            }
            if (jRBut_Anulado.isSelected()) {
                reparacion.setEstado(3);
            }
            if (jRBut_Resuelto.isSelected()) {
                reparacion.setEstado(0);
            }
            reparacion.setCostoTotal(Float.parseFloat(jTf_PrecioFinal.getText()));
            repaDa.modificarReparacion(reparacion);
        }

        for (ItemRep item : listaItems) {
            ItemRep itemaux = itemDat.buscarItemRep(reparacion, item.getRepuesto().getSerie());
            if (itemaux == null) {
                item.setReparacion(reparacion);
                itemDat.altaItemRep(item);
            } else {
                itemDat.modificarItemRep(item);
            }
        }
//        this.padre.setEnabled(true);
//        this.dispose();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nwRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nwRepuestoActionPerformed
        Jf_Repuesto jfRepuesto = new Jf_Repuesto(this, null);
        jfRepuesto.setAlwaysOnTop(true);
        jfRepuesto.show(true);
        jfRepuesto.setVisible(true);
    }//GEN-LAST:event_btn_nwRepuestoActionPerformed

    private void btn_agregRepuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregRepuActionPerformed
        boolean existe = false;
        if (listaItems == null) {
            listaItems = new ArrayList();
        }
        for (ItemRep it : listaItems) {
            if (it.getRepuesto().equals((Repuesto) jCbox_Repuestos.getSelectedItem())) {
                existe = true;
            }
        }
        if (!existe) {
            ItemRep item = new ItemRep();
            item.setReparacion(reparacion);
            item.setRepuesto((Repuesto) jCbox_Repuestos.getSelectedItem());
            item.setCantidad(1);
            item.setCosto(item.getRepuesto().getCosto());
            listaItems.add(item);
            cargaTablaItems();
        } else {
            JOptionPane.showMessageDialog(this, "No puede repetir un repuesto ya ingresado");
        }


    }//GEN-LAST:event_btn_agregRepuActionPerformed

    private void jTable_ReparacionInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable_ReparacionInputMethodTextChanged

    }//GEN-LAST:event_jTable_ReparacionInputMethodTextChanged

    private void btn_quitaRepuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitaRepuActionPerformed
        Iterator<ItemRep> iter = listaItems.iterator();
        while (iter.hasNext()) {
            if (iter.next().getRepuesto().equals((Repuesto) tModeloItemRep.getValueAt(jTable_Reparacion.getSelectedRow(), 0))) {
                if (reparacion != null) {//borramos set la BD
                    ItemRep itemaux = itemDat.buscarItemRep(reparacion, ((Repuesto) tModeloItemRep.getValueAt(jTable_Reparacion.getSelectedRow(), 0)).getSerie());
                    if (itemaux != null) {
                        itemDat.bajaItemRep(reparacion.getId(), ((Repuesto) tModeloItemRep.getValueAt(jTable_Reparacion.getSelectedRow(), 0)).getSerie());
                        iter.remove();
                        btn_guardarActionPerformed(evt);
                    }  else {
                    iter.remove();
                    }

                } else {
                    iter.remove();
                }
                  //borramos de la lista              
            }
        }
        cargaTablaItems();      //carga la tabla con la lista actualizada
    }//GEN-LAST:event_btn_quitaRepuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregRepu;
    private javax.swing.JButton btn_buscaB;
    private javax.swing.JButton btn_buscaC;
    private javax.swing.JButton btn_buscaS;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nwBicicleta;
    private javax.swing.JButton btn_nwCliente;
    private javax.swing.JButton btn_nwRepuesto;
    private javax.swing.JButton btn_nwServicio;
    private javax.swing.JButton btn_quitaRepu;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Repuesto> jCbox_Repuestos;
    private com.toedter.calendar.JDateChooser jDChooser_fecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBut_Anulado;
    private javax.swing.JRadioButton jRBut_Entregado;
    private javax.swing.JRadioButton jRBut_Pendiiente;
    private javax.swing.JRadioButton jRBut_Resuelto;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_Reparacion;
    private javax.swing.JTextField jTf_Bicicleta;
    private javax.swing.JTextField jTf_Cliente;
    private javax.swing.JTextField jTf_NumeroRepa;
    private javax.swing.JTextField jTf_PrecioFinal;
    private javax.swing.JTextField jTf_Servicio;
    private javax.swing.JTextField jTf_totalRepue;
    private javax.swing.JLabel lbl_MarcoNrj;
    private javax.swing.JLabel lbl_marcoAzl;
    // End of variables declaration//GEN-END:variables

    private void cargaTablaItems() {
        cambiaPrecioItem = false;
        tModeloItemRep.setNumRows(0);
        float totalRepuesto = 0;
        for (ItemRep item : listaItems) {
            tModeloItemRep.addRow(new Object[]{item.getRepuesto(), item.getCantidad(), item.getCosto()});
            totalRepuesto += item.getCosto();
        }
        jTable_Reparacion.setModel(tModeloItemRep);

        jTf_totalRepue.setText(String.valueOf(totalRepuesto));
        if (servicio != null) {
            jTf_PrecioFinal.setText(String.valueOf((totalRepuesto + servicio.getCosto()) * 1.15f));
        } else {
            jTf_PrecioFinal.setText(String.valueOf(totalRepuesto * 1.15f));
        }
        cambiaPrecioItem = true;
    }

}
