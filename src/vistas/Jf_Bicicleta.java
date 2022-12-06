/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.BicicletaData;
import datos.ClienteData;
import entidades.Bicicleta;
import entidades.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Pat
 */
public class Jf_Bicicleta extends javax.swing.JFrame {
private final java.awt.Frame padre;
    private Bicicleta   bicicleta;
    private BicicletaData biciDa;
    /**
     * Creates new form Jif_Cliente
     */
    public Jf_Bicicleta(java.awt.Frame padre, Bicicleta bicicleta) {
        initComponents();
        this.padre = padre;
        this.bicicleta = bicicleta;
        this.biciDa = new BicicletaData();
         llenarCombos();
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

        jCbox_Dni.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jCbox_Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 441, 293, 35));

        btn_guardar1.setBackground(new java.awt.Color(82, 148, 202));
        btn_guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-xGuarda.png"))); // NOI18N
        btn_guardar1.setBorder(null);
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 140, 50));

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
this.padre.setEnabled(false);  
 if (bicicleta != null) {
jTf_serie.setText(String.valueOf(bicicleta.getNroSerie()));
jTf_serie.setEnabled(false);
jTf_marca.setText(bicicleta.getMarca());
jTf_tipo.setText(bicicleta.getMarca());
jTf_color.setText(bicicleta.getColor());
jCbox_Dni.setSelectedItem(bicicleta.getCliente());



 }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
this.padre.setEnabled(true);       
    }//GEN-LAST:event_formWindowClosing

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        if (esNumero(jTf_serie.getText()) && jTf_marca.getText().length() > 1&& jTf_tipo.getText().length() > 1&& jTf_color.getText().length() > 1) {  
        if(bicicleta==null){
       bicicleta= new Bicicleta();
       bicicleta.setNroSerie(Integer.parseInt(jTf_serie.getText()));
       bicicleta.setMarca(jTf_marca.getText());
       bicicleta.setTipo(jTf_tipo.getText());
       bicicleta.setColor(jTf_color.getText());
     
       Cliente clie =null;
       clie= (Cliente)jCbox_Dni.getSelectedItem();
      
       bicicleta.setCliente(clie);
       bicicleta.setEstado(true);
       biciDa.altaBicicleta(bicicleta);
       }else{
             bicicleta.setNroSerie(Integer.parseInt(jTf_serie.getText()));
       bicicleta.setMarca(jTf_marca.getText());
       bicicleta.setTipo(jTf_tipo.getText());
       bicicleta.setColor(jTf_color.getText()); 
       biciDa.modificarBicicleta(bicicleta);
              }}
       else{
       
       JOptionPane.showMessageDialog(this, "Debe completar todos los datos correctamente");
       
       
       }
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
 this.padre.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed
        public void llenarCombos(){
            ClienteData clieDa =new ClienteData();
    for (Cliente clie: clieDa.listarCliente()) {
       jCbox_Dni.addItem(clie);
        
    }}
            public boolean esNumero(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    public boolean esFloat(String cadena) {
        boolean resultado;
        try {
            Float.parseFloat(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<Cliente> jCbox_Dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTf_color;
    private javax.swing.JTextField jTf_marca;
    private javax.swing.JTextField jTf_serie;
    private javax.swing.JTextField jTf_tipo;
    // End of variables declaration//GEN-END:variables
}
