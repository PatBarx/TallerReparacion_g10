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
import java.util.ArrayList;

/**
 * @author Grupo10
 */
public class Jf_Reparacion extends javax.swing.JFrame {

    private final java.awt.Frame padre;
    private Reparacion reparacion;
    private ReparacionData repaDa;
    private ArrayList<Repuesto> listaRepuestos;
    private RepuestoData repuDat;
    private ArrayList<ItemRep> listaItems;
    private ItemRepData itemDat;
    
    public Jf_Reparacion(java.awt.Frame padre, Reparacion reparacion) {
        initComponents();
        this.padre = padre;
        this.reparacion = reparacion;
        this.repaDa = new ReparacionData();
        llenarComboServicio();
    }

    
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
        jCbox_Servicio = new javax.swing.JComboBox<>();
        jCbox_Cliente = new javax.swing.JComboBox<>();
        jCbox_Bicicleta = new javax.swing.JComboBox<>();
        jTf_NumeroRepa = new javax.swing.JTextField();
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

        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
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

        jCbox_Repuestos.setBackground(new java.awt.Color(255, 255, 255));
        jCbox_Repuestos.setBorder(null);
        jPanel1.add(jCbox_Repuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 86, 285, 28));

        jCbox_Servicio.setBackground(new java.awt.Color(255, 255, 255));
        jCbox_Servicio.setBorder(null);
        jPanel1.add(jCbox_Servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 135, 152, 28));

        jCbox_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        jCbox_Cliente.setBorder(null);
        jPanel1.add(jCbox_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 181, 152, 28));

        jCbox_Bicicleta.setBackground(new java.awt.Color(255, 255, 255));
        jCbox_Bicicleta.setBorder(null);
        jPanel1.add(jCbox_Bicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 227, 152, 28));

        jTf_NumeroRepa.setBackground(new java.awt.Color(255, 255, 255));
        jTf_NumeroRepa.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_NumeroRepa.setForeground(new java.awt.Color(0, 0, 0));
        jTf_NumeroRepa.setBorder(null);
        jTf_NumeroRepa.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_NumeroRepaComponentShown(evt);
            }
        });
        jPanel1.add(jTf_NumeroRepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 93, 145, 20));

        jTf_PrecioFinal.setBackground(new java.awt.Color(255, 255, 255));
        jTf_PrecioFinal.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jTf_PrecioFinal.setForeground(new java.awt.Color(0, 0, 0));
        jTf_PrecioFinal.setBorder(null);
        jTf_PrecioFinal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_PrecioFinalComponentShown(evt);
            }
        });
        jPanel1.add(jTf_PrecioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 385, 140, 50));

        jTf_totalRepue.setBackground(new java.awt.Color(255, 255, 255));
        jTf_totalRepue.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jTf_totalRepue.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanel1.add(btn_nwRepuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 40, 40));

        btn_agregRepu.setBackground(new java.awt.Color(82, 148, 202));
        btn_agregRepu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Mas.png"))); // NOI18N
        btn_agregRepu.setBorder(null);
        jPanel1.add(btn_agregRepu, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 170, 38, 38));

        btn_quitaRepu.setBackground(new java.awt.Color(82, 148, 202));
        btn_quitaRepu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Menos.png"))); // NOI18N
        btn_quitaRepu.setBorder(null);
        jPanel1.add(btn_quitaRepu, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 172, 38, 38));

        btn_nwCliente.setBackground(new java.awt.Color(82, 148, 202));
        btn_nwCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Mas.png"))); // NOI18N
        btn_nwCliente.setBorder(null);
        btn_nwCliente.setOpaque(false);
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
        btn_nwBicicleta.setOpaque(false);
        jPanel1.add(btn_nwBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 221, 40, 40));

        btn_guardar.setBackground(new java.awt.Color(82, 148, 202));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-xGuarda.png"))); // NOI18N
        btn_guardar.setBorder(null);
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
            jCbox_Servicio.setSelectedItem(reparacion.getServicio());
            jCbox_Cliente.setSelectedItem(reparacion.getCliente());
            jCbox_Bicicleta.setSelectedItem(reparacion.getBici());
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
            //jTable_Reparacion
            
            //jTf_totalRepue.setText(String.valueOf(listaItems.));
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_nwServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nwServicioActionPerformed
        Jf_Servicio jfServicio = new Jf_Servicio(this,null);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregRepu;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nwBicicleta;
    private javax.swing.JButton btn_nwCliente;
    private javax.swing.JButton btn_nwRepuesto;
    private javax.swing.JButton btn_nwServicio;
    private javax.swing.JButton btn_quitaRepu;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Bicicleta> jCbox_Bicicleta;
    private javax.swing.JComboBox<Cliente> jCbox_Cliente;
    private javax.swing.JComboBox<Repuesto> jCbox_Repuestos;
    private javax.swing.JComboBox<Servicio> jCbox_Servicio;
    private com.toedter.calendar.JDateChooser jDChooser_fecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBut_Anulado;
    private javax.swing.JRadioButton jRBut_Entregado;
    private javax.swing.JRadioButton jRBut_Pendiiente;
    private javax.swing.JRadioButton jRBut_Resuelto;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_Reparacion;
    private javax.swing.JTextField jTf_NumeroRepa;
    private javax.swing.JTextField jTf_PrecioFinal;
    private javax.swing.JTextField jTf_totalRepue;
    private javax.swing.JLabel lbl_MarcoNrj;
    private javax.swing.JLabel lbl_marcoAzl;
    // End of variables declaration//GEN-END:variables

 private void llenarComboServicio(){
        ServicioData servDa = new ServicioData();
        for (Servicio serv : servDa.listarServicios()) {
            jCbox_Servicio.addItem(serv);
        }
    }
}
