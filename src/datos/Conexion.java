package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    //Todas estaticas (constantes)
    private static String url = "jdbc:mysql://localhost/universidad";
    private static String usuario = "root";
    private static String password = "";
    private static Conexion conexion = null;
    
    //El consturctor es privado porque solo se peude usar desde la misma clase (SINGLETON)
    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver");
        }
    }
    //Es estatico porque se llama al metodo desde la Clase (no se crea objeto)
    public static Connection conectar() {
        Connection conn = null;
        if (conexion == null) {
            conexion = new Conexion();
        }
        {
            try {
                conn = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de Conexion");
            }
            return conn;
        }
    }

}
//COMO USAR
//CREAR UNA ATRIBUTO EN LA CLASE DATA
//private Connection con = Conexion.conectar();
//PARA USAR SOLO LLAMAR AL ATRIBUTO
//ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
