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
public class Jf_Bicicleta extends javax.swing.JFrame {
private final java.awt.Frame padre;
private boolean esNuevo;
    /**
     * Creates new form Jif_Cliente
     */
    public Jf_Bicicleta(java.awt.Frame padre, boolean esNuevo) {
        initComponents();
        this.padre = padre;
        this.esNuevo = esNuevo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTf_serie = new javax.swing.JTextField();
        jTf_marca = new javax.swing.JTextField();
        jTf_tipo = new javax.swing.JTextField();
        jTf_color = new javax.swing.JTextField();
        jCbox_Dni = new javax.swing.JComboBox<>();
        btn_guardar1 = new javax.swing.JButton();
        btn_cambiar = new javax.swing.JButton();
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

        jTf_serie.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_serie.setBorder(null);
        jTf_serie.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_serieComponentShown(evt);
            }
        });
        jPanel1.add(jTf_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, 20));

        jTf_marca.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_marca.setBorder(null);
        jTf_marca.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_marcaComponentShown(evt);
            }
        });
        jPanel1.add(jTf_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 270, 20));

        jTf_tipo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_tipo.setBorder(null);
        jTf_tipo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_tipoComponentShown(evt);
            }
        });
        jPanel1.add(jTf_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 270, 20));

        jTf_color.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_color.setBorder(null);
        jTf_color.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_colorComponentShown(evt);
            }
        });
        jPanel1.add(jTf_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 270, 20));

        jCbox_Dni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbox_Dni.setBorder(null);
        jPanel1.add(jCbox_Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 290, 30));

        btn_guardar1.setText("GUARDAR");
        jPanel1.add(btn_guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 130, 40));

        btn_cambiar.setText("CAMBIAR");
        jPanel1.add(btn_cambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 130, 40));

        btn_salir.setText("SALIR");
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 130, 40));

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/biciBkg.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTf_serieComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_serieComponentShown
        jTf_serie.setOpaque(false);
    }//GEN-LAST:event_jTf_serieComponentShown

    private void jTf_marcaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_marcaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_marcaComponentShown

    private void jTf_tipoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_tipoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_tipoComponentShown

    private void jTf_colorComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_colorComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_colorComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
this.padre.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
this.padre.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> jCbox_Dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTf_color;
    private javax.swing.JTextField jTf_marca;
    private javax.swing.JTextField jTf_serie;
    private javax.swing.JTextField jTf_tipo;
    // End of variables declaration//GEN-END:variables
}
