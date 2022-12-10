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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jf_TallerReparacion extends javax.swing.JFrame {

    private DefaultTableModel tModeloCliente = new DefaultTableModel(new String[]{"Dni", "Nombre", "Domicilio", "Teléfono"}, 0);
    private DefaultTableModel tModeloBicicleta = new DefaultTableModel(new String[]{"Serie", "Marca", "Tipo", "Color", "Cliente"}, 0);
    private DefaultTableModel tModeloRepuesto = new DefaultTableModel(new String[]{"Serie", "Descripcion", "Costo"}, 0);
    private DefaultTableModel tModeloServicio = new DefaultTableModel(new String[]{"Codigo", "Descripcion", "Costo"}, 0);
    private DefaultTableModel tModeloReparacion = new DefaultTableModel(new String[]{"Numero", "Servicio", "Cliente", "Bicicleta", "Fecha", "Precio"}, 0);
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
    private boolean refrescarTabla = false;

    public Jf_TallerReparacion() {

        initComponents();
        jRadBut_Entregado3.setSelected(true);
        jRadBut_Entregado4.setSelected(true);
        jRadBut_Pendiente.setSelected(true);
        jRadBut_Entregado1.setSelected(true);
        jRadBut_Entregado2.setSelected(true);
        cargarTablaCliente();
        cargarTablaBicicleta();
        cargarTablaRepuesto();
        cargarTablaServicio();
        cargarTablaReparacion();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupServ = new javax.swing.ButtonGroup();
        buttonGroupClie = new javax.swing.ButtonGroup();
        buttonGroupBici = new javax.swing.ButtonGroup();
        buttonGroupRepue = new javax.swing.ButtonGroup();
        buttonGroupRepar = new javax.swing.ButtonGroup();
        buttonGroupReparEstado = new javax.swing.ButtonGroup();
        buttonGroupCliEstado = new javax.swing.ButtonGroup();
        buttonGroupbiciEstado = new javax.swing.ButtonGroup();
        buttonGroupServEstado = new javax.swing.ButtonGroup();
        buttonGroupRepuEstado = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        btn_cliente = new javax.swing.JButton();
        btn_bicicleta = new javax.swing.JButton();
        btn_Servicio = new javax.swing.JButton();
        byn_Repuesto = new javax.swing.JButton();
        btn_reparacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tab_panelPrincipal = new javax.swing.JTabbedPane();
        tab_inicio = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BKGLateral_lbl = new javax.swing.JLabel();
        lbl_MarcoNja = new javax.swing.JLabel();
        tab_Cliente = new javax.swing.JPanel();
        jRadBut_xNom = new javax.swing.JRadioButton();
        jRadBut_xDni = new javax.swing.JRadioButton();
        jTf_busqueda = new javax.swing.JTextField();
        btn_Busca = new javax.swing.JButton();
        jRadBut_Anulado1 = new javax.swing.JRadioButton();
        jRadBut_Entregado1 = new javax.swing.JRadioButton();
        panelBuscar = new javax.swing.JLabel();
        BKGLateral_lbl1 = new javax.swing.JLabel();
        btn_cliente_baja = new javax.swing.JButton();
        btn_cliente_alta = new javax.swing.JButton();
        btn_cliente_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cliente = new javax.swing.JTable();
        marcoNrj = new javax.swing.JLabel();
        tab_bici = new javax.swing.JPanel();
        jRadBut_xNombre = new javax.swing.JRadioButton();
        jRadBut_xSerie = new javax.swing.JRadioButton();
        jTf_busqueda1 = new javax.swing.JTextField();
        btn_Busca2 = new javax.swing.JButton();
        jRadBut_Entregado2 = new javax.swing.JRadioButton();
        jRadBut_Anulado2 = new javax.swing.JRadioButton();
        panelBuscar1 = new javax.swing.JLabel();
        BKGLateral_lbl2 = new javax.swing.JLabel();
        btn_bicicleta_alta = new javax.swing.JButton();
        btn_bicicleta_baja = new javax.swing.JButton();
        btn_bicicleta_modificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Bicicleta = new javax.swing.JTable();
        marcoNrj1 = new javax.swing.JLabel();
        tab_servicio = new javax.swing.JPanel();
        jRadBut_xDescrip = new javax.swing.JRadioButton();
        jRadBut_xCodigo = new javax.swing.JRadioButton();
        jTf_busqueda2 = new javax.swing.JTextField();
        btn_Busca3 = new javax.swing.JButton();
        jRadBut_Entregado3 = new javax.swing.JRadioButton();
        jRadBut_Anulado3 = new javax.swing.JRadioButton();
        panelBuscar2 = new javax.swing.JLabel();
        BKGLateral_lbl5 = new javax.swing.JLabel();
        btn_servicio_alta = new javax.swing.JButton();
        btn_servicio_baja = new javax.swing.JButton();
        btn_servicio_modificar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Servicio = new javax.swing.JTable();
        marcoNrj2 = new javax.swing.JLabel();
        tab_repuesto = new javax.swing.JPanel();
        jRadBut_xDescr = new javax.swing.JRadioButton();
        jRadBut_xNserie = new javax.swing.JRadioButton();
        btn_Busca4 = new javax.swing.JButton();
        jTf_busqueda3 = new javax.swing.JTextField();
        jRadBut_Entregado4 = new javax.swing.JRadioButton();
        jRadBut_Anulado4 = new javax.swing.JRadioButton();
        panelBuscar3 = new javax.swing.JLabel();
        BKGLateral_lbl3 = new javax.swing.JLabel();
        btn_repuesto_alta = new javax.swing.JButton();
        btn_repuesto_modificar = new javax.swing.JButton();
        btn_repuesto_baja = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Repuesto = new javax.swing.JTable();
        marcoNrj3 = new javax.swing.JLabel();
        tab_reparacion = new javax.swing.JPanel();
        jRadBut_PorClie = new javax.swing.JRadioButton();
        jRadBut_PorServi = new javax.swing.JRadioButton();
        jRadBut_PorFech = new javax.swing.JRadioButton();
        jRadBut_Pendiente = new javax.swing.JRadioButton();
        jRadBut_Resuelto = new javax.swing.JRadioButton();
        jRadBut_Anulado = new javax.swing.JRadioButton();
        jRadBut_Entregado = new javax.swing.JRadioButton();
        jTf_busqueda4 = new javax.swing.JTextField();
        btn_Busca5 = new javax.swing.JButton();
        panelBuscar4 = new javax.swing.JLabel();
        BKGLateral_lbl4 = new javax.swing.JLabel();
        btn_reparacion_alta = new javax.swing.JButton();
        btn_reparacion_modificar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Reparacion = new javax.swing.JTable();
        marcoNrj4 = new javax.swing.JLabel();

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1010, 160));

        tab_panelPrincipal.setBackground(new java.awt.Color(82, 148, 202));

        tab_inicio.setBackground(new java.awt.Color(255, 255, 255));
        tab_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Logo.png"))); // NOI18N
        tab_inicio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, 320));

        jLabel2.setBackground(new java.awt.Color(9, 77, 114));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 77, 114));
        jLabel2.setText("DE BICICLETAS");
        tab_inicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 270, 70));

        jLabel3.setBackground(new java.awt.Color(9, 77, 114));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 77, 114));
        jLabel3.setText("BIENVENIDO AL SISTEMA DE GESTION");
        tab_inicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 650, 70));

        jLabel7.setBackground(new java.awt.Color(9, 77, 114));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 77, 114));
        jLabel7.setText("PARA TALLER DE REPARACION");
        tab_inicio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 540, 70));

        BKGLateral_lbl.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl.setOpaque(true);
        tab_inicio.add(BKGLateral_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        lbl_MarcoNja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0), 2));
        tab_inicio.add(lbl_MarcoNja, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 780, 480));

        tab_panelPrincipal.addTab("INICIO", tab_inicio);

        tab_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        tab_Cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadBut_xNom.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupClie.add(jRadBut_xNom);
        jRadBut_xNom.setAutoscrolls(true);
        jRadBut_xNom.setBorder(null);
        jRadBut_xNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_xNomActionPerformed(evt);
            }
        });
        tab_Cliente.add(jRadBut_xNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 102, 20, 30));

        jRadBut_xDni.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupClie.add(jRadBut_xDni);
        jRadBut_xDni.setAutoscrolls(true);
        jRadBut_xDni.setBorder(null);
        jRadBut_xDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_xDniActionPerformed(evt);
            }
        });
        tab_Cliente.add(jRadBut_xDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 69, 20, 30));

        jTf_busqueda.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda.setBorder(null);
        jTf_busqueda.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busquedaComponentShown(evt);
            }
        });
        tab_Cliente.add(jTf_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 162, 145, 20));

        btn_Busca.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca.setBorder(null);
        btn_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscaActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_Busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 204, 60, 60));

        jRadBut_Anulado1.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupCliEstado.add(jRadBut_Anulado1);
        jRadBut_Anulado1.setAutoscrolls(true);
        jRadBut_Anulado1.setBorder(null);
        jRadBut_Anulado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_Anulado1ActionPerformed(evt);
            }
        });
        tab_Cliente.add(jRadBut_Anulado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 492, 20, 30));

        jRadBut_Entregado1.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupCliEstado.add(jRadBut_Entregado1);
        jRadBut_Entregado1.setAutoscrolls(true);
        jRadBut_Entregado1.setBorder(null);
        jRadBut_Entregado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_Entregado1ActionPerformed(evt);
            }
        });
        tab_Cliente.add(jRadBut_Entregado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 459, 20, 30));

        panelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sectorBus-clie.png"))); // NOI18N
        tab_Cliente.add(panelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 190, 530));

        BKGLateral_lbl1.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl1.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl1.setOpaque(true);
        tab_Cliente.add(BKGLateral_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        btn_cliente_baja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Baja.png"))); // NOI18N
        btn_cliente_baja.setBorder(null);
        btn_cliente_baja.setPreferredSize(new java.awt.Dimension(150, 58));
        btn_cliente_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_bajaActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 150, 56));

        btn_cliente_alta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Alta.png"))); // NOI18N
        btn_cliente_alta.setBorder(null);
        btn_cliente_alta.setPreferredSize(new java.awt.Dimension(150, 58));
        btn_cliente_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_altaActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 56));

        btn_cliente_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Actua.png"))); // NOI18N
        btn_cliente_modificar.setBorder(null);
        btn_cliente_modificar.setPreferredSize(new java.awt.Dimension(150, 58));
        btn_cliente_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_modificarActionPerformed(evt);
            }
        });
        tab_Cliente.add(btn_cliente_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, 56));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0)));

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
        jTable_Cliente.setRowHeight(22);
        jScrollPane1.setViewportView(jTable_Cliente);

        tab_Cliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 750, 420));

        marcoNrj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0), 2));
        tab_Cliente.add(marcoNrj, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 800, 510));

        tab_panelPrincipal.addTab("CLIENTE", tab_Cliente);

        tab_bici.setBackground(new java.awt.Color(255, 255, 255));
        tab_bici.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadBut_xNombre.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupBici.add(jRadBut_xNombre);
        jRadBut_xNombre.setAutoscrolls(true);
        jRadBut_xNombre.setBorder(null);
        jRadBut_xNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_xNombreActionPerformed(evt);
            }
        });
        tab_bici.add(jRadBut_xNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 20, 30));

        jRadBut_xSerie.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupBici.add(jRadBut_xSerie);
        jRadBut_xSerie.setAutoscrolls(true);
        jRadBut_xSerie.setBorder(null);
        jRadBut_xSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_xSerieActionPerformed(evt);
            }
        });
        tab_bici.add(jRadBut_xSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 70, 20, 30));

        jTf_busqueda1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda1.setBorder(null);
        jTf_busqueda1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busqueda1ComponentShown(evt);
            }
        });
        tab_bici.add(jTf_busqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 162, 145, 20));

        btn_Busca2.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca2.setBorder(null);
        btn_Busca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Busca2ActionPerformed(evt);
            }
        });
        tab_bici.add(btn_Busca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 204, 60, 60));

        jRadBut_Entregado2.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupbiciEstado.add(jRadBut_Entregado2);
        jRadBut_Entregado2.setAutoscrolls(true);
        jRadBut_Entregado2.setBorder(null);
        jRadBut_Entregado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_Entregado2ActionPerformed(evt);
            }
        });
        tab_bici.add(jRadBut_Entregado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 460, 20, 30));

        jRadBut_Anulado2.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupbiciEstado.add(jRadBut_Anulado2);
        jRadBut_Anulado2.setAutoscrolls(true);
        jRadBut_Anulado2.setBorder(null);
        jRadBut_Anulado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_Anulado2ActionPerformed(evt);
            }
        });
        tab_bici.add(jRadBut_Anulado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 492, 20, 30));

        panelBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sectorBus-bici.png"))); // NOI18N
        tab_bici.add(panelBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 190, 530));

        BKGLateral_lbl2.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl2.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl2.setOpaque(true);
        tab_bici.add(BKGLateral_lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        btn_bicicleta_alta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Alta.png"))); // NOI18N
        btn_bicicleta_alta.setBorder(null);
        btn_bicicleta_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta_altaActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 56));

        btn_bicicleta_baja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Baja.png"))); // NOI18N
        btn_bicicleta_baja.setBorder(null);
        btn_bicicleta_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta_bajaActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 150, 56));

        btn_bicicleta_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Actua.png"))); // NOI18N
        btn_bicicleta_modificar.setBorder(null);
        btn_bicicleta_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bicicleta_modificarActionPerformed(evt);
            }
        });
        tab_bici.add(btn_bicicleta_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, 56));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0)));

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
        jScrollPane2.setViewportView(jTable_Bicicleta);

        tab_bici.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 750, 420));

        marcoNrj1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0), 2));
        tab_bici.add(marcoNrj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 800, 510));

        tab_panelPrincipal.addTab("BICICLETA", tab_bici);

        tab_servicio.setBackground(new java.awt.Color(255, 255, 255));
        tab_servicio.setForeground(new java.awt.Color(255, 255, 255));
        tab_servicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadBut_xDescrip.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupServ.add(jRadBut_xDescrip);
        jRadBut_xDescrip.setAutoscrolls(true);
        jRadBut_xDescrip.setBorder(null);
        tab_servicio.add(jRadBut_xDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 20, 30));

        jRadBut_xCodigo.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupServ.add(jRadBut_xCodigo);
        jRadBut_xCodigo.setAutoscrolls(true);
        jRadBut_xCodigo.setBorder(null);
        tab_servicio.add(jRadBut_xCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 70, 20, 30));

        jTf_busqueda2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda2.setBorder(null);
        jTf_busqueda2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busqueda2ComponentShown(evt);
            }
        });
        tab_servicio.add(jTf_busqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 162, 145, 20));

        btn_Busca3.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca3.setBorder(null);
        btn_Busca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Busca3ActionPerformed(evt);
            }
        });
        tab_servicio.add(btn_Busca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 204, 60, 60));

        jRadBut_Entregado3.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupServEstado.add(jRadBut_Entregado3);
        jRadBut_Entregado3.setAutoscrolls(true);
        jRadBut_Entregado3.setBorder(null);
        jRadBut_Entregado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_Entregado3ActionPerformed(evt);
            }
        });
        tab_servicio.add(jRadBut_Entregado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 460, 20, 30));

        jRadBut_Anulado3.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupServEstado.add(jRadBut_Anulado3);
        jRadBut_Anulado3.setAutoscrolls(true);
        jRadBut_Anulado3.setBorder(null);
        jRadBut_Anulado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_Anulado3ActionPerformed(evt);
            }
        });
        tab_servicio.add(jRadBut_Anulado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 493, 20, 30));

        panelBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sectorBus-servicio.png"))); // NOI18N
        tab_servicio.add(panelBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 190, 530));

        BKGLateral_lbl5.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl5.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl5.setOpaque(true);
        tab_servicio.add(BKGLateral_lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        btn_servicio_alta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Alta.png"))); // NOI18N
        btn_servicio_alta.setBorder(null);
        btn_servicio_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicio_altaActionPerformed(evt);
            }
        });
        tab_servicio.add(btn_servicio_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 56));

        btn_servicio_baja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Baja.png"))); // NOI18N
        btn_servicio_baja.setBorder(null);
        btn_servicio_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicio_bajaActionPerformed(evt);
            }
        });
        tab_servicio.add(btn_servicio_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 150, 56));

        btn_servicio_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Actua.png"))); // NOI18N
        btn_servicio_modificar.setBorder(null);
        btn_servicio_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicio_modificarActionPerformed(evt);
            }
        });
        tab_servicio.add(btn_servicio_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, 56));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0)));

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
        jTable_Servicio.setRowHeight(22);
        jScrollPane3.setViewportView(jTable_Servicio);

        tab_servicio.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 750, 420));

        marcoNrj2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0), 2));
        tab_servicio.add(marcoNrj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 800, 510));

        tab_panelPrincipal.addTab("SERVICIO", tab_servicio);

        tab_repuesto.setBackground(new java.awt.Color(255, 255, 255));
        tab_repuesto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadBut_xDescr.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepue.add(jRadBut_xDescr);
        jRadBut_xDescr.setAutoscrolls(true);
        jRadBut_xDescr.setBorder(null);
        tab_repuesto.add(jRadBut_xDescr, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 20, 30));

        jRadBut_xNserie.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepue.add(jRadBut_xNserie);
        jRadBut_xNserie.setAutoscrolls(true);
        jRadBut_xNserie.setBorder(null);
        tab_repuesto.add(jRadBut_xNserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 70, 20, 30));

        btn_Busca4.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca4.setBorder(null);
        btn_Busca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Busca4ActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_Busca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 204, 60, 60));

        jTf_busqueda3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda3.setBorder(null);
        jTf_busqueda3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busqueda3ComponentShown(evt);
            }
        });
        tab_repuesto.add(jTf_busqueda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 162, 145, 20));

        jRadBut_Entregado4.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepuEstado.add(jRadBut_Entregado4);
        jRadBut_Entregado4.setAutoscrolls(true);
        jRadBut_Entregado4.setBorder(null);
        jRadBut_Entregado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_Entregado4ActionPerformed(evt);
            }
        });
        tab_repuesto.add(jRadBut_Entregado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 460, 20, 30));

        jRadBut_Anulado4.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepuEstado.add(jRadBut_Anulado4);
        jRadBut_Anulado4.setAutoscrolls(true);
        jRadBut_Anulado4.setBorder(null);
        jRadBut_Anulado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_Anulado4ActionPerformed(evt);
            }
        });
        tab_repuesto.add(jRadBut_Anulado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 493, 20, 30));

        panelBuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sectorBus-repuesto.png"))); // NOI18N
        tab_repuesto.add(panelBuscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 190, 530));

        BKGLateral_lbl3.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl3.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl3.setOpaque(true);
        tab_repuesto.add(BKGLateral_lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        btn_repuesto_alta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Alta.png"))); // NOI18N
        btn_repuesto_alta.setText("ALTA");
        btn_repuesto_alta.setBorder(null);
        btn_repuesto_alta.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_repuesto_alta.setVerifyInputWhenFocusTarget(false);
        btn_repuesto_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repuesto_altaActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_repuesto_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 56));

        btn_repuesto_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Actua.png"))); // NOI18N
        btn_repuesto_modificar.setText("MODIFICAR");
        btn_repuesto_modificar.setBorder(null);
        btn_repuesto_modificar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_repuesto_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repuesto_modificarActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_repuesto_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, 56));

        btn_repuesto_baja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Baja.png"))); // NOI18N
        btn_repuesto_baja.setText("BAJA");
        btn_repuesto_baja.setBorder(null);
        btn_repuesto_baja.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_repuesto_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_repuesto_bajaActionPerformed(evt);
            }
        });
        tab_repuesto.add(btn_repuesto_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 150, 56));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0)));

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
        jTable_Repuesto.setRowHeight(22);
        jScrollPane4.setViewportView(jTable_Repuesto);

        tab_repuesto.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 750, 420));

        marcoNrj3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0), 2));
        tab_repuesto.add(marcoNrj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 800, 510));

        tab_panelPrincipal.addTab("REPUESTO", tab_repuesto);

        tab_reparacion.setBackground(new java.awt.Color(255, 255, 255));
        tab_reparacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadBut_PorClie.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepar.add(jRadBut_PorClie);
        jRadBut_PorClie.setAutoscrolls(true);
        jRadBut_PorClie.setBorder(null);
        tab_reparacion.add(jRadBut_PorClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 50, 20, 30));

        jRadBut_PorServi.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepar.add(jRadBut_PorServi);
        jRadBut_PorServi.setAutoscrolls(true);
        jRadBut_PorServi.setBorder(null);
        tab_reparacion.add(jRadBut_PorServi, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 82, 20, 30));

        jRadBut_PorFech.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepar.add(jRadBut_PorFech);
        jRadBut_PorFech.setAutoscrolls(true);
        jRadBut_PorFech.setBorder(null);
        tab_reparacion.add(jRadBut_PorFech, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 115, 20, 30));

        jRadBut_Pendiente.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupReparEstado.add(jRadBut_Pendiente);
        jRadBut_Pendiente.setAutoscrolls(true);
        jRadBut_Pendiente.setBorder(null);
        jRadBut_Pendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_PendienteActionPerformed(evt);
            }
        });
        tab_reparacion.add(jRadBut_Pendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 389, 20, 30));

        jRadBut_Resuelto.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupReparEstado.add(jRadBut_Resuelto);
        jRadBut_Resuelto.setAutoscrolls(true);
        jRadBut_Resuelto.setBorder(null);
        jRadBut_Resuelto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_ResueltoActionPerformed(evt);
            }
        });
        tab_reparacion.add(jRadBut_Resuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 421, 20, 30));

        jRadBut_Anulado.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupReparEstado.add(jRadBut_Anulado);
        jRadBut_Anulado.setAutoscrolls(true);
        jRadBut_Anulado.setBorder(null);
        jRadBut_Anulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_AnuladoActionPerformed(evt);
            }
        });
        tab_reparacion.add(jRadBut_Anulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 488, 20, 30));

        jRadBut_Entregado.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupReparEstado.add(jRadBut_Entregado);
        jRadBut_Entregado.setAutoscrolls(true);
        jRadBut_Entregado.setBorder(null);
        jRadBut_Entregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadBut_EntregadoActionPerformed(evt);
            }
        });
        tab_reparacion.add(jRadBut_Entregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 455, 20, 30));

        jTf_busqueda4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda4.setBorder(null);
        jTf_busqueda4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busqueda4ComponentShown(evt);
            }
        });
        tab_reparacion.add(jTf_busqueda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 162, 145, 20));

        btn_Busca5.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca5.setBorder(null);
        btn_Busca5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Busca5ActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_Busca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 204, 60, 60));

        panelBuscar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sectorBus-reparacion.png"))); // NOI18N
        tab_reparacion.add(panelBuscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 190, 530));

        BKGLateral_lbl4.setBackground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl4.setForeground(new java.awt.Color(82, 148, 202));
        BKGLateral_lbl4.setOpaque(true);
        tab_reparacion.add(BKGLateral_lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 180, 710));

        btn_reparacion_alta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Alta.png"))); // NOI18N
        btn_reparacion_alta.setBorder(null);
        btn_reparacion_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacion_altaActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_reparacion_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, 56));

        btn_reparacion_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Btn-Actua.png"))); // NOI18N
        btn_reparacion_modificar.setBorder(null);
        btn_reparacion_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reparacion_modificarActionPerformed(evt);
            }
        });
        tab_reparacion.add(btn_reparacion_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 150, 56));

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

        tab_reparacion.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 750, 420));

        marcoNrj4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 140, 0), 2));
        tab_reparacion.add(marcoNrj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 800, 510));

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
        Cliente cliente = cliDa.buscarCliente((Integer) tModeloCliente.getValueAt(jTable_Cliente.getSelectedRow(), 0));
        if (cliente.isEstado()) {
            cliDa.borrarCliente(cliente.getDni());
        } else {

            cliDa.activaCliente(cliente.getDni());
        }
        cargarTablaCliente();
    }//GEN-LAST:event_btn_cliente_bajaActionPerformed

    private void btn_bicicleta_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bicicleta_altaActionPerformed
        Jf_Bicicleta jfBicicleta = new Jf_Bicicleta(this, null);
        jfBicicleta.setAlwaysOnTop(true);
        jfBicicleta.show(true);
        jfBicicleta.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_bicicleta_altaActionPerformed

    private void btn_servicio_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicio_altaActionPerformed
        Jf_Servicio jfServicio = new Jf_Servicio(this, null);
        jfServicio.setAlwaysOnTop(true);
        jfServicio.show(true);
        jfServicio.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_servicio_altaActionPerformed

    private void btn_repuesto_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_repuesto_altaActionPerformed
        Jf_Repuesto jfRepuesto = new Jf_Repuesto(this, null);
        jfRepuesto.setAlwaysOnTop(true);
        jfRepuesto.show(true);
        jfRepuesto.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_repuesto_altaActionPerformed

    private void btn_reparacion_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reparacion_altaActionPerformed
        //Jf_Reparacion jfReparacion = new Jf_Reparacion(this,null); //inicial con comboBx
        Jf_Reparacion2 jfReparacion = new Jf_Reparacion2(this, null);
        jfReparacion.setAlwaysOnTop(true);
        jfReparacion.show(true);
        jfReparacion.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_reparacion_altaActionPerformed

    private void btn_cliente_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_altaActionPerformed
        Jf_Cliente jfCliente = new Jf_Cliente(this, null);
        jfCliente.setAlwaysOnTop(true);
        jfCliente.show(true);
        jfCliente.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_cliente_altaActionPerformed

    private void btn_cliente_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_modificarActionPerformed
        Cliente cliente = cliDa.buscarCliente((Integer) tModeloCliente.getValueAt(jTable_Cliente.getSelectedRow(), 0));
        Jf_Cliente jfCliente = new Jf_Cliente(this, cliente);
        jfCliente.setAlwaysOnTop(true);
        jfCliente.show(true);
        jfCliente.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_cliente_modificarActionPerformed

    private void btn_bicicleta_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bicicleta_bajaActionPerformed
        Bicicleta bicicleta = biciDa.buscaBicicleta((Integer) tModeloBicicleta.getValueAt(jTable_Bicicleta.getSelectedRow(), 0));
        if (bicicleta.isEstado()) {
            biciDa.bajaBicicleta(bicicleta);
        } else {

            biciDa.activaBicicleta(bicicleta);
        }
        cargarTablaBicicleta();
    }//GEN-LAST:event_btn_bicicleta_bajaActionPerformed

    private void btn_bicicleta_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bicicleta_modificarActionPerformed
        Bicicleta bicicleta = biciDa.buscaBicicleta((Integer) tModeloBicicleta.getValueAt(jTable_Bicicleta.getSelectedRow(), 0));
        Jf_Bicicleta jfBicicleta = new Jf_Bicicleta(this, bicicleta);
        jfBicicleta.setAlwaysOnTop(true);
        jfBicicleta.show(true);
        jfBicicleta.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_bicicleta_modificarActionPerformed

    private void btn_servicio_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicio_bajaActionPerformed
        Servicio servicio = servDa.buscarServicio((Integer) tModeloServicio.getValueAt(jTable_Servicio.getSelectedRow(), 0));
        if (servicio.isEstado()) {
            servDa.bajaServicio(servicio.getCodigo());
        } else {
            servDa.activaServicio(servicio.getCodigo());
        }
        cargarTablaServicio();
    }//GEN-LAST:event_btn_servicio_bajaActionPerformed

    private void btn_servicio_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicio_modificarActionPerformed
        Servicio servicio = servDa.buscarServicio((Integer) tModeloServicio.getValueAt(jTable_Servicio.getSelectedRow(), 0));
        Jf_Servicio jfServicio = new Jf_Servicio(this, servicio);
        jfServicio.setAlwaysOnTop(true);
        jfServicio.show(true);
        jfServicio.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_servicio_modificarActionPerformed

    private void btn_repuesto_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_repuesto_modificarActionPerformed
        Repuesto repuesto = repuDa.buscarRepuesto((Integer) tModeloRepuesto.getValueAt(jTable_Repuesto.getSelectedRow(), 0));
        Jf_Repuesto jfRepuesto = new Jf_Repuesto(this, repuesto);
        jfRepuesto.setAlwaysOnTop(true);
        jfRepuesto.show(true);
        jfRepuesto.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_repuesto_modificarActionPerformed

    private void btn_repuesto_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_repuesto_bajaActionPerformed
        Repuesto repuesto = repuDa.buscarRepuesto((Integer) tModeloRepuesto.getValueAt(jTable_Repuesto.getSelectedRow(), 0));
        if (repuesto.isEstado()) {
            repuDa.bajaRepuesto(repuesto);
        } else {
            repuDa.activaRepuesto(repuesto);
        }
        cargarTablaRepuesto();
    }//GEN-LAST:event_btn_repuesto_bajaActionPerformed

    private void btn_reparacion_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reparacion_modificarActionPerformed
        Reparacion reparacion = repaDa.buscarReparacion((Integer) tModeloReparacion.getValueAt(jTable_Reparacion.getSelectedRow(), 0));
        //Jf_Reparacion jfReparacion = new Jf_Reparacion(this,reparacion);  //Ventana inicial con comboBox
        Jf_Reparacion2 jfReparacion = new Jf_Reparacion2(this, reparacion);
        jfReparacion.setAlwaysOnTop(true);
        

        if (jRadBut_Entregado.isSelected() || jRadBut_Anulado.isSelected()) {
            //para desactivar (dejar solo lectura)
        }
       
        
        
        jfReparacion.show(true);
        jfReparacion.setVisible(true);
        refrescarTabla = true;
    }//GEN-LAST:event_btn_reparacion_modificarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (refrescarTabla) {
            cargarTablaCliente();
            cargarTablaBicicleta();
            cargarTablaRepuesto();
            cargarTablaServicio();
            cargarTablaReparacion();
            refrescarTabla = false;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jTf_busquedaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_busquedaComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_busquedaComponentShown

    private void jTf_busqueda1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_busqueda1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_busqueda1ComponentShown

    private void jTf_busqueda2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_busqueda2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_busqueda2ComponentShown

    private void jTf_busqueda3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_busqueda3ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_busqueda3ComponentShown

    private void jTf_busqueda4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTf_busqueda4ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_busqueda4ComponentShown

    private void jRadBut_xNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_xNomActionPerformed

    }//GEN-LAST:event_jRadBut_xNomActionPerformed

    private void jRadBut_xDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_xDniActionPerformed

    }//GEN-LAST:event_jRadBut_xDniActionPerformed

    private void btn_Busca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Busca4ActionPerformed
        cargarTablaRepuesto();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Busca4ActionPerformed

    private void jRadBut_Entregado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_Entregado4ActionPerformed
        cargarTablaRepuesto();
    }//GEN-LAST:event_jRadBut_Entregado4ActionPerformed

    private void jRadBut_Anulado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_Anulado4ActionPerformed
        cargarTablaRepuesto();
    }//GEN-LAST:event_jRadBut_Anulado4ActionPerformed

    private void btn_Busca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Busca3ActionPerformed
        cargarTablaServicio();
    }//GEN-LAST:event_btn_Busca3ActionPerformed

    private void jRadBut_Entregado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_Entregado3ActionPerformed
        cargarTablaServicio();
    }//GEN-LAST:event_jRadBut_Entregado3ActionPerformed

    private void jRadBut_Anulado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_Anulado3ActionPerformed
        cargarTablaServicio();
    }//GEN-LAST:event_jRadBut_Anulado3ActionPerformed

    private void jRadBut_Entregado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_Entregado1ActionPerformed
        cargarTablaCliente();
    }//GEN-LAST:event_jRadBut_Entregado1ActionPerformed

    private void jRadBut_Anulado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_Anulado1ActionPerformed
        cargarTablaClienteinactivos();
    }//GEN-LAST:event_jRadBut_Anulado1ActionPerformed

    private void btn_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscaActionPerformed
        BuscarPorDni();
        BuscarPorNombre();
    }//GEN-LAST:event_btn_BuscaActionPerformed

    private void jRadBut_PendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_PendienteActionPerformed
        cargarTablaReparacion();
    }//GEN-LAST:event_jRadBut_PendienteActionPerformed

    private void jRadBut_ResueltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_ResueltoActionPerformed
        cargarTablaReparacionResuelto();
    }//GEN-LAST:event_jRadBut_ResueltoActionPerformed

    private void jRadBut_EntregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_EntregadoActionPerformed
        cargarTablaReparacionTerminadas();
    }//GEN-LAST:event_jRadBut_EntregadoActionPerformed

    private void jRadBut_AnuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_AnuladoActionPerformed
        cargarTablaReparacionAnulados();
    }//GEN-LAST:event_jRadBut_AnuladoActionPerformed

    private void btn_Busca5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Busca5ActionPerformed

        if (jRadBut_Pendiente.isSelected()) {
            cargarTablaReparacion();
        }
        if (jRadBut_Entregado.isSelected()) {
            cargarTablaReparacionTerminadas();
        }
        if (jRadBut_Resuelto.isSelected()) {
            cargarTablaReparacionResuelto();
        }
        if (jRadBut_Anulado.isSelected()) {
            cargarTablaReparacionAnulados();
        }

    }//GEN-LAST:event_btn_Busca5ActionPerformed

    private void jRadBut_xSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_xSerieActionPerformed
       cargarTablaBicicleta();
    }//GEN-LAST:event_jRadBut_xSerieActionPerformed

    private void jRadBut_xNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_xNombreActionPerformed
        cargarTablaBicicleta();
    }//GEN-LAST:event_jRadBut_xNombreActionPerformed

    private void btn_Busca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Busca2ActionPerformed
         cargarTablaBicicleta();
    }//GEN-LAST:event_btn_Busca2ActionPerformed

    private void jRadBut_Entregado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_Entregado2ActionPerformed
       cargarTablaBicicleta();
    }//GEN-LAST:event_jRadBut_Entregado2ActionPerformed

    private void jRadBut_Anulado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadBut_Anulado2ActionPerformed
      cargarTablaBicicleta();
    }//GEN-LAST:event_jRadBut_Anulado2ActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton btn_Busca;
    private javax.swing.JButton btn_Busca2;
    private javax.swing.JButton btn_Busca3;
    private javax.swing.JButton btn_Busca4;
    private javax.swing.JButton btn_Busca5;
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
    private javax.swing.JButton btn_reparacion_modificar;
    private javax.swing.JButton btn_repuesto_alta;
    private javax.swing.JButton btn_repuesto_baja;
    private javax.swing.JButton btn_repuesto_modificar;
    private javax.swing.JButton btn_servicio_alta;
    private javax.swing.JButton btn_servicio_baja;
    private javax.swing.JButton btn_servicio_modificar;
    private javax.swing.ButtonGroup buttonGroupBici;
    private javax.swing.ButtonGroup buttonGroupCliEstado;
    private javax.swing.ButtonGroup buttonGroupClie;
    private javax.swing.ButtonGroup buttonGroupRepar;
    private javax.swing.ButtonGroup buttonGroupReparEstado;
    private javax.swing.ButtonGroup buttonGroupRepuEstado;
    private javax.swing.ButtonGroup buttonGroupRepue;
    private javax.swing.ButtonGroup buttonGroupServ;
    private javax.swing.ButtonGroup buttonGroupServEstado;
    private javax.swing.ButtonGroup buttonGroupbiciEstado;
    private javax.swing.JButton byn_Repuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadBut_Anulado;
    private javax.swing.JRadioButton jRadBut_Anulado1;
    private javax.swing.JRadioButton jRadBut_Anulado2;
    private javax.swing.JRadioButton jRadBut_Anulado3;
    private javax.swing.JRadioButton jRadBut_Anulado4;
    private javax.swing.JRadioButton jRadBut_Entregado;
    private javax.swing.JRadioButton jRadBut_Entregado1;
    private javax.swing.JRadioButton jRadBut_Entregado2;
    private javax.swing.JRadioButton jRadBut_Entregado3;
    private javax.swing.JRadioButton jRadBut_Entregado4;
    private javax.swing.JRadioButton jRadBut_Pendiente;
    private javax.swing.JRadioButton jRadBut_PorClie;
    private javax.swing.JRadioButton jRadBut_PorFech;
    private javax.swing.JRadioButton jRadBut_PorServi;
    private javax.swing.JRadioButton jRadBut_Resuelto;
    private javax.swing.JRadioButton jRadBut_xCodigo;
    private javax.swing.JRadioButton jRadBut_xDescr;
    private javax.swing.JRadioButton jRadBut_xDescrip;
    private javax.swing.JRadioButton jRadBut_xDni;
    private javax.swing.JRadioButton jRadBut_xNom;
    private javax.swing.JRadioButton jRadBut_xNombre;
    private javax.swing.JRadioButton jRadBut_xNserie;
    private javax.swing.JRadioButton jRadBut_xSerie;
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
    private javax.swing.JTextField jTf_busqueda;
    private javax.swing.JTextField jTf_busqueda1;
    private javax.swing.JTextField jTf_busqueda2;
    private javax.swing.JTextField jTf_busqueda3;
    private javax.swing.JTextField jTf_busqueda4;
    private javax.swing.JLabel lbl_MarcoNja;
    private javax.swing.JLabel marcoNrj;
    private javax.swing.JLabel marcoNrj1;
    private javax.swing.JLabel marcoNrj2;
    private javax.swing.JLabel marcoNrj3;
    private javax.swing.JLabel marcoNrj4;
    private javax.swing.JLabel panelBuscar;
    private javax.swing.JLabel panelBuscar1;
    private javax.swing.JLabel panelBuscar2;
    private javax.swing.JLabel panelBuscar3;
    private javax.swing.JLabel panelBuscar4;
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
            tModeloCliente.addRow(new Object[]{cliente.getDni(), cliente.getNombre(), cliente.getDomicilio(), cliente.getTel()});
        }
        jTable_Cliente.setModel(tModeloCliente);
    }

    public void cargarTablaClienteinactivos() {
        tModeloCliente.setNumRows(0);
        listaCliente = cliDa.listarClienteInactivos();
        for (Cliente cliente : listaCliente) {
            tModeloCliente.addRow(new Object[]{cliente.getDni(), cliente.getNombre(), cliente.getDomicilio(), cliente.getTel()});
        }
        jTable_Cliente.setModel(tModeloCliente);
    }

    public void BuscarPorDni() {

        if (jRadBut_Entregado1.isSelected() && jRadBut_xDni.isSelected()) {
            cargarTablaCliente();
            if (!esNumero(jTf_busqueda.getText())) {
                JOptionPane.showMessageDialog(null, "ingrese un numero");
            }
            int dni = Integer.parseInt(jTf_busqueda.getText());
            //int num=Integer.parseInt(jTf_busqueda.getText());
            borrarFilas();
            for (Cliente cliente : cliDa.BuscarClientePorDni(dni)) {
                tModeloCliente.addRow(new Object[]{cliente.getDni(), cliente.getNombre(), cliente.getDomicilio(), cliente.getTel()});

                jTable_Cliente.setModel(tModeloCliente);
            }
            jTf_busqueda.setText("");

        }
        if (jRadBut_Anulado1.isSelected() && jRadBut_xDni.isSelected()) {
            cargarTablaClienteinactivos();

            if (!esNumero(jTf_busqueda.getText())) {
                JOptionPane.showMessageDialog(null, "ingrese un numero");
            }
            int dni1 = Integer.parseInt(jTf_busqueda.getText());
            //Si Activos?

            borrarFilas();
            for (Cliente cliente : cliDa.BuscarClienteInacPorDni(dni1)) {
                tModeloCliente.addRow(new Object[]{cliente.getDni(), cliente.getNombre(), cliente.getDomicilio(), cliente.getTel()});

                jTable_Cliente.setModel(tModeloCliente);
            }
            jTf_busqueda.setText("");

        }

    }

    public void BuscarPorNombre() {

        if (jRadBut_Entregado1.isSelected() && jRadBut_xNom.isSelected()) {
            cargarTablaCliente();
            if (jTf_busqueda.getText().length() < 1) {

                JOptionPane.showMessageDialog(null, "ingrese un nombre");

            } else {
                cargarTablaCliente();
                String nom = jTf_busqueda.getText();

                borrarFilas();
                for (Cliente cliente : cliDa.BuscarClientePorNombreActivo(nom)) {
                    tModeloCliente.addRow(new Object[]{cliente.getDni(), cliente.getNombre(), cliente.getDomicilio(), cliente.getTel()});
                    jTable_Cliente.setModel(tModeloCliente);
                }
                jTf_busqueda.setText("");
            }
        }
        if (jRadBut_Anulado1.isSelected() && jRadBut_xNom.isSelected()) {
            cargarTablaClienteinactivos();
            if (jTf_busqueda.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "ingrese un nombre");
            } else {
                cargarTablaClienteinactivos();
                String nom1 = jTf_busqueda.getText();

                borrarFilas();
                for (Cliente cliente : cliDa.BuscarClientePorNombreinactivo(nom1)) {
                    tModeloCliente.addRow(new Object[]{cliente.getDni(), cliente.getNombre(), cliente.getDomicilio(), cliente.getTel()});
                    jTable_Cliente.setModel(tModeloCliente);
                }

                jTf_busqueda.setText("");

            }
        }
    }

    private void cargarTablaBicicleta() {
     if (jTf_busqueda1.getText().length() > 0 && jRadBut_xSerie.isSelected()&&jRadBut_Entregado2.isSelected()&&esNumero(jTf_busqueda1.getText())){
       listaBicicleta = biciDa.listarBicisActSerie(Integer.parseInt(jTf_busqueda1.getText()));
      
      }else if(jTf_busqueda1.getText().length() > 0 && jRadBut_xNombre.isSelected()&&jRadBut_Entregado2.isSelected() ){
        listaBicicleta = biciDa.listarBicisActClienteDni(jTf_busqueda1.getText()); 
      
      }else if(jTf_busqueda1.getText().length() > 0 && jRadBut_xSerie.isSelected()&&jRadBut_Anulado2.isSelected()&& esNumero(jTf_busqueda1.getText())){
      listaBicicleta = biciDa.listarBicisNoActSerie(Integer.parseInt(jTf_busqueda1.getText()));
      
      }else if(jTf_busqueda1.getText().length() == 0 && jRadBut_xSerie.isSelected()&&jRadBut_Anulado2.isSelected()){
      listaBicicleta = biciDa.listarBicicletasInac();
      
      }else if(jTf_busqueda1.getText().length() == 0 && jRadBut_xNombre.isSelected()&&jRadBut_Anulado2.isSelected()){
       listaBicicleta = biciDa.listarBicicletasInac();
     
      }else if(jTf_busqueda1.getText().length() > 0 && jRadBut_xNombre.isSelected()&&jRadBut_Anulado2.isSelected()){
      listaBicicleta = biciDa.listarBicisNoActClienteDni(jTf_busqueda1.getText());
      
      }else if(jTf_busqueda1.getText().length() > 0 && jRadBut_xSerie.isSelected()&&jRadBut_Entregado2.isSelected()&& !esNumero(jTf_busqueda1.getText())){
       JOptionPane.showMessageDialog(this, "Ingrese un Numero o Busque por nombre delcliente");
      
      }else if(jTf_busqueda1.getText().length() > 0 && jRadBut_xSerie.isSelected()&& jRadBut_Anulado2.isSelected()&& !esNumero(jTf_busqueda1.getText())){
       JOptionPane.showMessageDialog(this, "Ingrese un Numero o Busque por nombre del cliente");
      
      }else{listaBicicleta = biciDa.listarBicicletas();}   
          
          
        tModeloBicicleta.setNumRows(0);
    for (Bicicleta bicicleta : listaBicicleta) {
          tModeloBicicleta.addRow(new Object[]{bicicleta.getNroSerie(),bicicleta.getMarca(),bicicleta.getTipo(),bicicleta.getColor(),bicicleta.getCliente()});
    }
       jTable_Bicicleta.setModel(tModeloBicicleta);
    
    }

    private void cargarTablaRepuesto() {

        if (jTf_busqueda3.getText().length() > 0) {     //Si tiene Algo
            if (jRadBut_Entregado4.isSelected()) {      //Si Activos?
                if (jRadBut_xNserie.isSelected()) {     //Si x numero serie?
                    if (esNumero(jTf_busqueda3.getText())) {    //Check numero o Texto
                        //activo con serie
                        listaRepuesto = repuDa.listaRepuesto(1, "%" + jTf_busqueda3.getText() + "%", "%");
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingrese un Numero o Busque por Descripcion");
                        //solo activos
                        listaRepuesto = repuDa.listaRepuesto(1, "%", "%");
                    }
                } else if (jRadBut_xDescr.isSelected()) { //Si x Descripcion?
                    //activos por descripcion
                    listaRepuesto = repuDa.listaRepuesto(1, "%", "%" + jTf_busqueda3.getText() + "%");
                }
            } else if (jRadBut_Anulado4.isSelected()) {     //Si INactivos?
                if (jRadBut_xNserie.isSelected()) {         //Si x serie? (Inactivos)
                    if (esNumero(jTf_busqueda3.getText())) {//Check numero o Texto
                        //inactivo con serie
                        listaRepuesto = repuDa.listaRepuesto(0, "%" + jTf_busqueda3.getText() + "%", "%");
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingrese un Numero o Busque por Descripcion");
                        // solo inactivo
                        listaRepuesto = repuDa.listaRepuesto(0, "%", "%");
                    }
                } else if (jRadBut_xDescr.isSelected()) { //Si x Descripcion? (Inactivos)
                    //inactivo por descripcion 
                    listaRepuesto = repuDa.listaRepuesto(0, "%", "%" + jTf_busqueda3.getText() + "%");
                }
            }
        } else if (jRadBut_Entregado4.isSelected()) {   //Si Solo Activos?
            // solo activo
            listaRepuesto = repuDa.listaRepuesto(1, "%", "%");

        } else if (jRadBut_Anulado4.isSelected()) {     //Si Solo INactivos?
            //solo inactivo
            listaRepuesto = repuDa.listaRepuesto(0, "%", "%");
        }

        tModeloRepuesto.setNumRows(0);

        for (Repuesto repuesto : listaRepuesto) {
            tModeloRepuesto.addRow(new Object[]{repuesto.getSerie(), repuesto.getDescripcion(), repuesto.getCosto()});
        }
        jTable_Repuesto.setModel(tModeloRepuesto);
    }

    private void cargarTablaServicio() {
        if (jTf_busqueda2.getText().length() > 0) {     //Si tiene Algo
            if (jRadBut_Entregado3.isSelected()) {      //Si Activos?
                if (jRadBut_xCodigo.isSelected()) {     //Si x Codigo?
                    if (esNumero(jTf_busqueda2.getText())) {    //Check numero o Texto
                        listaServicio = servDa.listarServActCod(Integer.parseInt(jTf_busqueda2.getText()));
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingrese un Numero o Busque por Descripcion");
                        listaServicio = servDa.listarServicios();   //Si no es numero, carga la tabla con Activos
                    }
                } else if (jRadBut_xDescrip.isSelected()) { //Si x Descripcion?
                    listaServicio = servDa.listarServActDesc("%" + jTf_busqueda2.getText() + "%");//Puede buscar por cualquier caracter
                }
            } else if (jRadBut_Anulado3.isSelected()) {     //Si INactivos?
                if (jRadBut_xCodigo.isSelected()) {         //Si x Codigo? (Inactivos)
                    if (esNumero(jTf_busqueda2.getText())) {//Check numero o Texto
                        listaServicio = servDa.listarServInactCod(Integer.parseInt(jTf_busqueda2.getText()));
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingrese un Numero o Busque por Descripcion");
                        listaServicio = servDa.listarServInactivos();//Si no es numero, carga la tabla con INctivos
                    }
                } else if (jRadBut_xDescrip.isSelected()) { //Si x Descripcion? (Inactivos)
                    listaServicio = servDa.listarServInactDesc("%" + jTf_busqueda2.getText() + "%");
                }
            }
        } else if (jRadBut_Entregado3.isSelected()) {   //Si Solo Activos?
            listaServicio = servDa.listarServicios();

        } else if (jRadBut_Anulado3.isSelected()) {     //Si Solo INactivos?
            listaServicio = servDa.listarServInactivos();
        }
        tModeloServicio.setNumRows(0);                  //Resetea la tabla a cero(Borra Filas)
        for (Servicio servicio : listaServicio) {       //Recorre el arreglo y Carga modelo con los datos que trae segun filtros
            tModeloServicio.addRow(new Object[]{servicio.getCodigo(), servicio.getDescripcion(), servicio.getCosto()});
        }
        jTable_Servicio.setModel(tModeloServicio);      //Se carga la tabla con datos del modelo
    }


    private void cargarTablaReparacion() { //PENDIENTES
        //cliente jRadBut_PorClie servicio jRadBut_PorServi fecha jRadBut_PorFech
        if (jTf_busqueda4.getText().length() > 0) {
            if (jRadBut_PorClie.isSelected()) {
                listaReparacion = repaDa.listarBicisPendientes("%" + jTf_busqueda4.getText() + "%", "%", "%");
            } else if (jRadBut_PorServi.isSelected()) {
                listaReparacion = repaDa.listarBicisPendientes("%", "%" + jTf_busqueda4.getText() + "%", "%");
            } else if (jRadBut_PorFech.isSelected()) {
                listaReparacion = repaDa.listarBicisPendientes("%", "%", "%" + jTf_busqueda4.getText() + "%");
            } else {
                listaReparacion = repaDa.listarBicisPendientes("%", "%", "%");
            }
        } else {
            listaReparacion = repaDa.listarBicisPendientes("%", "%", "%");
        }
        tModeloReparacion.setNumRows(0);
        for (Reparacion reparacion : listaReparacion) {
            tModeloReparacion.addRow(new Object[]{reparacion.getId(), reparacion.getServicio(), reparacion.getCliente(), reparacion.getBici(), reparacion.getFechaEntrada(), reparacion.getCostoTotal()});
        }
        jTable_Reparacion.setModel(tModeloReparacion);
    }

    private void cargarTablaReparacionTerminadas() { //TERMINADAS ENTREGADAS
        if (jTf_busqueda4.getText().length() > 0) {
            if (jRadBut_PorClie.isSelected()) {
                listaReparacion = repaDa.listarBicisTerminadas("%" + jTf_busqueda4.getText() + "%", "%", "%");
            } else if (jRadBut_PorServi.isSelected()) {
                listaReparacion = repaDa.listarBicisTerminadas("%", "%" + jTf_busqueda4.getText() + "%", "%");
            } else if (jRadBut_PorFech.isSelected()) {
                listaReparacion = repaDa.listarBicisTerminadas("%", "%", "%" + jTf_busqueda4.getText() + "%");
            } else {
                listaReparacion = repaDa.listarBicisTerminadas("%", "%", "%");
            }
        } else {
            listaReparacion = repaDa.listarBicisTerminadas("%", "%", "%");
        }
        tModeloReparacion.setNumRows(0);
        for (Reparacion reparacion : listaReparacion) {
            tModeloReparacion.addRow(new Object[]{reparacion.getId(), reparacion.getServicio(), reparacion.getCliente(), reparacion.getBici(), reparacion.getFechaEntrada(), reparacion.getCostoTotal()});
        }
        jTable_Reparacion.setModel(tModeloReparacion);
    }

    private void cargarTablaReparacionResuelto() { //resueltos
        if (jTf_busqueda4.getText().length() > 0) {
            if (jRadBut_PorClie.isSelected()) {
                listaReparacion = repaDa.listarBicisResuelto("%" + jTf_busqueda4.getText() + "%", "%", "%");
            } else if (jRadBut_PorServi.isSelected()) {
                listaReparacion = repaDa.listarBicisResuelto("%", "%" + jTf_busqueda4.getText() + "%", "%");
            } else if (jRadBut_PorFech.isSelected()) {
                listaReparacion = repaDa.listarBicisResuelto("%", "%", "%" + jTf_busqueda4.getText() + "%");
            } else {
                listaReparacion = repaDa.listarBicisResuelto("%", "%", "%");
            }
        } else {
            listaReparacion = repaDa.listarBicisResuelto("%", "%", "%");
        }
        tModeloReparacion.setNumRows(0);

        for (Reparacion reparacion : listaReparacion) {
            tModeloReparacion.addRow(new Object[]{reparacion.getId(), reparacion.getServicio(), reparacion.getCliente(), reparacion.getBici(), reparacion.getFechaEntrada(), reparacion.getCostoTotal()});
        }
        jTable_Reparacion.setModel(tModeloReparacion);
    }

    private void cargarTablaReparacionAnulados() { //anulados
        if (jTf_busqueda4.getText().length() > 0) {
            if (jRadBut_PorClie.isSelected()) {
                listaReparacion = repaDa.listarBicisAnulado("%" + jTf_busqueda4.getText() + "%", "%", "%");
            } else if (jRadBut_PorServi.isSelected()) {
                listaReparacion = repaDa.listarBicisAnulado("%", "%" + jTf_busqueda4.getText() + "%", "%");
            } else if (jRadBut_PorFech.isSelected()) {
                listaReparacion = repaDa.listarBicisAnulado("%", "%", "%" + jTf_busqueda4.getText() + "%");
            } else {
                listaReparacion = repaDa.listarBicisAnulado("%", "%", "%");
            }
        } else {
            listaReparacion = repaDa.listarBicisAnulado("%", "%", "%");
        }
        tModeloReparacion.setNumRows(0);

        for (Reparacion reparacion : listaReparacion) {
            tModeloReparacion.addRow(new Object[]{reparacion.getId(), reparacion.getServicio(), reparacion.getCliente(), reparacion.getBici(), reparacion.getFechaEntrada(), reparacion.getCostoTotal()});
        }
        jTable_Reparacion.setModel(tModeloReparacion);
    }

    public void borrarFilas() {

        int a = tModeloCliente.getRowCount() - 1;//cuenta las filas pero el indice es uno menos
        for (int i = a; i >= 0; i--) {
            tModeloCliente.removeRow(i);
        }

    }

    //método que verifica si es Numero o no.
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
}
