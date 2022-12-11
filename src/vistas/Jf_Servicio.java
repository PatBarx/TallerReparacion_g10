package vistas;

import datos.ServicioData;
import entidades.Servicio;
import javax.swing.JOptionPane;

/* @author Grupo10 */
public class Jf_Servicio extends javax.swing.JFrame {

    private final java.awt.Frame padre;
    private Servicio servicio;
    private ServicioData serDa;

    public Jf_Servicio(java.awt.Frame padre, Servicio servicio) {
        initComponents();
        this.padre = padre;
        this.servicio = servicio;
        this.serDa = new ServicioData();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTf_codServ = new javax.swing.JTextField();
        jTf_descrip = new javax.swing.JTextField();
        jTf_costo = new javax.swing.JTextField();
        btn_guardar1 = new javax.swing.JButton();
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

        jTf_codServ.setEditable(false);
        jTf_codServ.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_codServ.setBorder(null);
        jTf_codServ.setEnabled(false);
        jTf_codServ.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_codServComponentShown(evt);
            }
        });
        jPanel1.add(jTf_codServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, 20));

        jTf_descrip.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_descrip.setBorder(null);
        jTf_descrip.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_descripComponentShown(evt);
            }
        });
        jPanel1.add(jTf_descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 270, 20));

        jTf_costo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_costo.setBorder(null);
        jTf_costo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_costoComponentShown(evt);
            }
        });
        jPanel1.add(jTf_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 270, 20));

        btn_guardar1.setBackground(new java.awt.Color(82, 148, 202));
        btn_guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-xGuarda.png"))); // NOI18N
        btn_guardar1.setBorder(null);
        btn_guardar1.setPreferredSize(new java.awt.Dimension(140, 50));
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 140, 50));

        btn_salir.setBackground(new java.awt.Color(82, 148, 202));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-xSalir.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 140, 50));

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/servicioBkg.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTf_codServComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_codServComponentShown
        jTf_codServ.setOpaque(false);
    }//GEN-LAST:event_jTf_codServComponentShown

    private void jTf_descripComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_descripComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_descripComponentShown

    private void jTf_costoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_costoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_costoComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.padre.setEnabled(false); //desactiva la ventana padre   
        if (servicio != null) {
            jTf_codServ.setText(Integer.toString(servicio.getCodigo()));
            jTf_descrip.setText(servicio.getDescripcion());
            jTf_costo.setText(Float.toString(servicio.getCosto()));
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.padre.setEnabled(true);        
    }//GEN-LAST:event_formWindowClosing

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        if (jTf_descrip.getText().length() > 0 && esFloat(jTf_costo.getText())) {
            if (servicio == null) {
                servicio = new Servicio();
                servicio.setDescripcion(jTf_descrip.getText());
                servicio.setCosto(Float.parseFloat(jTf_costo.getText()));            
                serDa.altaServicio(servicio);            
                jTf_codServ.setText(Integer.toString(servicio.getCodigo())); 
                //Recupero la clave generada en el Objeto x el AltaData
        } else {
                //Estado -->Se Actualiza por METODO MODIFICAR  
                servicio.setCodigo(Integer.parseInt(jTf_codServ.getText()));
                servicio.setDescripcion(jTf_descrip.getText());
                servicio.setCosto(Float.parseFloat(jTf_costo.getText()));
                //Estado --> No seteamos, dejamos el que traia el Servicio.
                serDa.modificarServicio(servicio);
            }    
        } else {
            JOptionPane.showMessageDialog(this, "Los campos deben rellenarse correctamente");
        }
        this.padre.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // SALIR
        this.padre.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTf_codServ;
    private javax.swing.JTextField jTf_costo;
    private javax.swing.JTextField jTf_descrip;
    // End of variables declaration//GEN-END:variables

 public boolean esFloat(String cadena) {
        boolean resultado;
        try {
            Float.parseFloat(cadena);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
    }
}
