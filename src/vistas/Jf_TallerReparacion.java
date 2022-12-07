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

        buttonGroupServ = new javax.swing.ButtonGroup();
        buttonGroupClie = new javax.swing.ButtonGroup();
        buttonGroupBici = new javax.swing.ButtonGroup();
        buttonGroupRepue = new javax.swing.ButtonGroup();
        buttonGroupRepar = new javax.swing.ButtonGroup();
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
        panelBuscar3 = new javax.swing.JLabel();
        BKGLateral_lbl3 = new javax.swing.JLabel();
        btn_repuesto_alta = new javax.swing.JButton();
        btn_repuesto_modificar = new javax.swing.JButton();
        btn_repuesto_baja = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Repuesto = new javax.swing.JTable();
        marcoNrj3 = new javax.swing.JLabel();
        tab_reparacion = new javax.swing.JPanel();
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
        tab_Cliente.add(jRadBut_xNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 144, 20, 30));

        jRadBut_xDni.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupClie.add(jRadBut_xDni);
        jRadBut_xDni.setAutoscrolls(true);
        jRadBut_xDni.setBorder(null);
        tab_Cliente.add(jRadBut_xDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 114, 20, 30));

        jTf_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        jTf_busqueda.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda.setForeground(new java.awt.Color(0, 0, 0));
        jTf_busqueda.setBorder(null);
        jTf_busqueda.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busquedaComponentShown(evt);
            }
        });
        tab_Cliente.add(jTf_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, 145, 20));

        btn_Busca.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca.setBorder(null);
        btn_Busca.setOpaque(false);
        tab_Cliente.add(btn_Busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 252, 60, 60));

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
        tab_bici.add(jRadBut_xNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 144, 20, 30));

        jRadBut_xSerie.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupBici.add(jRadBut_xSerie);
        jRadBut_xSerie.setAutoscrolls(true);
        jRadBut_xSerie.setBorder(null);
        tab_bici.add(jRadBut_xSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 114, 20, 30));

        jTf_busqueda1.setBackground(new java.awt.Color(255, 255, 255));
        jTf_busqueda1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda1.setForeground(new java.awt.Color(0, 0, 0));
        jTf_busqueda1.setBorder(null);
        jTf_busqueda1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busqueda1ComponentShown(evt);
            }
        });
        tab_bici.add(jTf_busqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, 145, 20));

        btn_Busca2.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca2.setBorder(null);
        btn_Busca2.setOpaque(false);
        tab_bici.add(btn_Busca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 252, 60, 60));

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
        tab_servicio.add(jRadBut_xDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 144, 20, 30));

        jRadBut_xCodigo.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupServ.add(jRadBut_xCodigo);
        jRadBut_xCodigo.setAutoscrolls(true);
        jRadBut_xCodigo.setBorder(null);
        tab_servicio.add(jRadBut_xCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 114, 20, 30));

        jTf_busqueda2.setBackground(new java.awt.Color(255, 255, 255));
        jTf_busqueda2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda2.setForeground(new java.awt.Color(0, 0, 0));
        jTf_busqueda2.setBorder(null);
        jTf_busqueda2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busqueda2ComponentShown(evt);
            }
        });
        tab_servicio.add(jTf_busqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, 145, 20));

        btn_Busca3.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca3.setBorder(null);
        btn_Busca3.setOpaque(false);
        tab_servicio.add(btn_Busca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 252, 60, 60));

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
        tab_repuesto.add(jRadBut_xDescr, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 144, 20, 30));

        jRadBut_xNserie.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepue.add(jRadBut_xNserie);
        jRadBut_xNserie.setAutoscrolls(true);
        jRadBut_xNserie.setBorder(null);
        tab_repuesto.add(jRadBut_xNserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 114, 20, 30));

        btn_Busca4.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca4.setBorder(null);
        btn_Busca4.setOpaque(false);
        tab_repuesto.add(btn_Busca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 252, 60, 60));

        jTf_busqueda3.setBackground(new java.awt.Color(255, 255, 255));
        jTf_busqueda3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda3.setForeground(new java.awt.Color(0, 0, 0));
        jTf_busqueda3.setBorder(null);
        jTf_busqueda3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busqueda3ComponentShown(evt);
            }
        });
        tab_repuesto.add(jTf_busqueda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, 145, 20));

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

        jRadBut_Pendiente.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepar.add(jRadBut_Pendiente);
        jRadBut_Pendiente.setAutoscrolls(true);
        jRadBut_Pendiente.setBorder(null);
        tab_reparacion.add(jRadBut_Pendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 50, 20, 30));

        jRadBut_Resuelto.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepar.add(jRadBut_Resuelto);
        jRadBut_Resuelto.setAutoscrolls(true);
        jRadBut_Resuelto.setBorder(null);
        tab_reparacion.add(jRadBut_Resuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 80, 20, 30));

        jRadBut_Anulado.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepar.add(jRadBut_Anulado);
        jRadBut_Anulado.setAutoscrolls(true);
        jRadBut_Anulado.setBorder(null);
        tab_reparacion.add(jRadBut_Anulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 144, 20, 30));

        jRadBut_Entregado.setBackground(new java.awt.Color(82, 148, 202));
        buttonGroupRepar.add(jRadBut_Entregado);
        jRadBut_Entregado.setAutoscrolls(true);
        jRadBut_Entregado.setBorder(null);
        tab_reparacion.add(jRadBut_Entregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 114, 20, 30));

        jTf_busqueda4.setBackground(new java.awt.Color(255, 255, 255));
        jTf_busqueda4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTf_busqueda4.setForeground(new java.awt.Color(0, 0, 0));
        jTf_busqueda4.setBorder(null);
        jTf_busqueda4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTf_busqueda4ComponentShown(evt);
            }
        });
        tab_reparacion.add(jTf_busqueda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, 145, 20));

        btn_Busca5.setBackground(new java.awt.Color(82, 148, 202));
        btn_Busca5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa48x48.png"))); // NOI18N
        btn_Busca5.setBorder(null);
        btn_Busca5.setOpaque(false);
        tab_reparacion.add(btn_Busca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 252, 60, 60));

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
        Jf_Reparacion jfReparacion = new Jf_Reparacion(this,null);
        jfReparacion.setAlwaysOnTop(true);
        jfReparacion.show(true);
        jfReparacion.setVisible(true);  
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
       Bicicleta bicicleta = biciDa.buscaBicicleta((Integer)tModeloBicicleta.getValueAt(jTable_Bicicleta.getSelectedRow(),0));
if(bicicleta.isEstado()){
biciDa.bajaBicicleta(bicicleta);}
else{

biciDa.altaBicicleta(bicicleta);
}
cargarTablaBicicleta();
    }//GEN-LAST:event_btn_bicicleta_bajaActionPerformed

    private void btn_bicicleta_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bicicleta_modificarActionPerformed
            Bicicleta bicicleta = biciDa.buscaBicicleta((Integer)tModeloBicicleta.getValueAt(jTable_Bicicleta.getSelectedRow(), 0));
        Jf_Bicicleta jfBicicleta =new Jf_Bicicleta(this,bicicleta);
        jfBicicleta.setAlwaysOnTop(true);
        jfBicicleta.show(true);
        jfBicicleta.setVisible(true);
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
        Jf_Servicio jfServicio = new Jf_Servicio(this,servicio);
        jfServicio.setAlwaysOnTop(true);
        jfServicio.show(true);
        jfServicio.setVisible(true);
    }//GEN-LAST:event_btn_servicio_modificarActionPerformed

    private void btn_repuesto_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_repuesto_modificarActionPerformed
        Repuesto repuesto = repuDa.buscarRepuesto((Integer) tModeloRepuesto.getValueAt(jTable_Repuesto.getSelectedRow(), 0));
        Jf_Repuesto jfRepuesto = new Jf_Repuesto(this,repuesto);
        jfRepuesto.setAlwaysOnTop(true);
        jfRepuesto.show(true);
        jfRepuesto.setVisible(true);          
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reparacion_modificarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cargarTablaCliente();
        cargarTablaBicicleta();
        cargarTablaRepuesto();
        cargarTablaServicio();
        cargarTablaReparacion();     // TODO add your handling code here:
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
    private javax.swing.ButtonGroup buttonGroupClie;
    private javax.swing.ButtonGroup buttonGroupRepar;
    private javax.swing.ButtonGroup buttonGroupRepue;
    private javax.swing.ButtonGroup buttonGroupServ;
    private javax.swing.JButton byn_Repuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadBut_Anulado;
    private javax.swing.JRadioButton jRadBut_Entregado;
    private javax.swing.JRadioButton jRadBut_Pendiente;
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
