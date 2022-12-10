package vistas;

import datos.BicicletaData;
import entidades.Bicicleta;
import entidades.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Garupo10
 */
public class jf_BusquedaBicicleta extends javax.swing.JFrame {
    private Bicicleta bicicleta;
    private Cliente cliente;
    private final java.awt.Frame padre;
    private DefaultTableModel tModeloBicicleta = new DefaultTableModel(new String[]{"Serie", "Marca", "Tipo", "Color","Cliente"}, 0);
    private ArrayList<Bicicleta> listaBicicleta;
    private BicicletaData biciDa = new BicicletaData();


    public jf_BusquedaBicicleta(Jf_Reparacion2 padre, Bicicleta bicicleta, Cliente cliente) {
        initComponents();
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.padre = padre;
        tModeloBicicleta.setNumRows(0);                 //Resetea la tabla a cero(Borra Filas)
        if (this.cliente.getDni() == 0 ) {
            listaBicicleta = biciDa.listarBicicletas();
        }else {
            listaBicicleta = biciDa.listarBicisActClienteDni(cliente.getNombre());
        }
             //Recorre el arreglo y Carga modelo con los datos que trae segun filtros
        for (Bicicleta bici : listaBicicleta) {
            tModeloBicicleta.addRow(new Object[]{bici.getNroSerie(),bici.getMarca(),bici.getTipo(),bici.getColor(),bici.getCliente()});
        }
        jTable_Bicicleta.setModel(tModeloBicicleta);     //Se carga la tabla con datos del modelo       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Bicicleta = new javax.swing.JTable();
        Btn_Select = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(530, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0)));

        jTable_Bicicleta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
        jTable_Bicicleta.setRowHeight(22);
        jScrollPane1.setViewportView(jTable_Bicicleta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 510, 310));

        Btn_Select.setBackground(new java.awt.Color(82, 148, 202));
        Btn_Select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-xSelect.png"))); // NOI18N
        Btn_Select.setBorder(null);
        Btn_Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SelectActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/TablaBicicleta.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SelectActionPerformed
        Bicicleta bici2 = biciDa.buscaBicicleta((Integer) tModeloBicicleta.getValueAt(jTable_Bicicleta.getSelectedRow(), 0));
        bicicleta.setNroSerie(bici2.getNroSerie());
        bicicleta.setMarca(bici2.getMarca());
        bicicleta.setTipo(bici2.getTipo());
        bicicleta.setCliente(bici2.getCliente());
        bicicleta.setColor(bici2.getColor());
        
//bici2.getNroSerie(),bici2.getMarca(),bici2.getTipo(),bici2.getColor(),bici2.getCliente()
        this.dispose();
        this.padre.setEnabled(true);
    }//GEN-LAST:event_Btn_SelectActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.padre.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.padre.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.padre.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Select;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Bicicleta;
    // End of variables declaration//GEN-END:variables
}
