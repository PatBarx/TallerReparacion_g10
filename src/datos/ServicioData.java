package datos;

import entidades.Servicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Grupo10
 */
public class ServicioData {
    
    private Connection con = null;

    public ServicioData() {
        this.con = Conexion.conectar();
    }
    public void altaServicio(Servicio serv){
    //Query: INSERT INTO `servicio`(`codigo`, `descripcion`, `costo`, `estado`) VALUES ('?','?',?,'?')
        String query = "INSERT INTO servicio (descripcion, costo, estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, serv.getDescripcion());
            ps.setFloat(2,serv.getCosto());
            ps.setBoolean(3, true);
             
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ServicioData Info : Alta Exitosa");
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    serv.setCodigo(rs.getInt(1));                    
                } else {
                    JOptionPane.showMessageDialog(null, "ServicioData Error: No se pudo Recuperar el ID");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ServicioData Error: No se pudo Agregar");
            }            
            ps.close();             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData Error: " + e);
        }
    }
    public void bajaServicio(int id){
    //UPDATE `servicio` SET estado=0 WHERE codigo=1
        String query= "UPDATE servicio SET estado=0 WHERE codigo=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
        if (ps.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null, "ServicioData Info:\nBaja Exitoso" );                                
            }else {
                JOptionPane.showMessageDialog(null, "ServicioData Error:\nNO pudo borrarse el Servicio" ); 
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData ERROR:\n" +e ); 
        }        
    }
    public void activaServicio(int id){
    //UPDATE `servicio` SET estado=0 WHERE codigo=1
        String query= "UPDATE servicio SET estado=1 WHERE codigo=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
        if (ps.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null, "ServicioData Info:\nReactivacion Exitosa" );                                
            }else {
                JOptionPane.showMessageDialog(null, "ServicioData Error:\nNO pudo activarse el Servicio" ); 
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData ERROR:\n" +e ); 
        }        
    }
    
    public void modificarServicio(Servicio serv){
    //UPDATE `servicio` SET `descripcion`='[value-1]',`costo`='[value-2]',`estado`='[value-3]' WHERE codigo=1;
        String query = "UPDATE servicio SET descripcion=?, costo=?, estado=? WHERE codigo=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, serv.getDescripcion());
            ps.setFloat(2, serv.getCosto());
            ps.setBoolean(3, serv.isEstado());
            ps.setInt(4, serv.getCodigo());
            if (ps.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null, "ServicioData Info:\nInformacion Actualizada" );                
            }else {
                JOptionPane.showMessageDialog(null, "ServicioData Error:\nLos Datos no pudieron ser Actualizados");
            }
            ps.close();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData Error: " + e);
        }    
    }
    
    public ArrayList<Servicio> listarServicios(){
        ArrayList<Servicio> arrServ = new ArrayList();
        //SELECT `codigo`, `descripcion`, `costo`, `estado` FROM `servicio` WHERE 1
        String query = "SELECT * FROM servicio WHERE estado = 1"; 
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Servicio serv = new Servicio();
                serv.setCodigo(rs.getInt("codigo"));
                serv.setDescripcion(rs.getString("descripcion"));
                serv.setCosto(rs.getFloat("costo"));
                serv.setEstado(rs.getBoolean("estado"));                
                arrServ.add(serv);
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData Error:\n" + e);
        }
        return arrServ;        
    }
    
    public Servicio buscarServicio(int id) {   
        //Creo un obj, instancio un query..
        Servicio serv = new Servicio();
        String query =  "SELECT * FROM servicio WHERE estado = 1 AND codigo = ? ";
        //Try: Ps/ ps.set(id xparametro).. / rs.. /if(next) ../ Set obj / ps.Close...
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) { 
                serv.setCodigo(rs.getInt("codigo"));
                serv.setDescripcion(rs.getString("descripcion"));
                serv.setCosto(rs.getFloat("costo"));
                serv.setEstado(rs.getBoolean("estado")); 
            } else {
                JOptionPane.showMessageDialog(null, "ServicioData Error:\n No se encuentra el servicio/activo");
                return null;
            }
            ps.close();    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData Error:\n" + e);
            return null;
        }    
        return serv;
    }
    
    
  // - - - Metodo Extra para filtro de inactivos tabla    
    public ArrayList<Servicio> listarServInactivos(){
        ArrayList<Servicio> arrServ = new ArrayList();
        //SELECT `codigo`, `descripcion`, `costo`, `estado` FROM `servicio` WHERE 1
        String query = "SELECT * FROM servicio WHERE estado = 0"; //DEvuelve inactivos
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Servicio serv = new Servicio();
                serv.setCodigo(rs.getInt("codigo"));
                serv.setDescripcion(rs.getString("descripcion"));
                serv.setCosto(rs.getFloat("costo"));
                serv.setEstado(rs.getBoolean("estado"));                
                arrServ.add(serv);
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData Error:\n" + e);
        }
        return arrServ;        
    }
    // - - - - METODOS Extra Para Listar combinados Tabla - - - - - - //
    public ArrayList<Servicio> listarServActCod(int cod){
        ArrayList<Servicio> arrServ = new ArrayList();
        //SELECT `codigo`, `descripcion`, `costo`, `estado` FROM `servicio` WHERE 1
        String query = "SELECT * FROM servicio WHERE estado = 1 AND codigo = ?"; //Por CODIGO activos
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Servicio serv = new Servicio();
                serv.setCodigo(rs.getInt("codigo"));
                serv.setDescripcion(rs.getString("descripcion"));
                serv.setCosto(rs.getFloat("costo"));
                serv.setEstado(rs.getBoolean("estado"));                
                arrServ.add(serv);
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData Error:\n" + e);
        }
        return arrServ;        
    }
    public ArrayList<Servicio> listarServInactCod(int cod){
        ArrayList<Servicio> arrServ = new ArrayList();
        //SELECT `codigo`, `descripcion`, `costo`, `estado` FROM `servicio` WHERE 1
        String query = "SELECT * FROM servicio WHERE estado = 0 AND codigo = ?"; //Por CODIGO inactivos
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Servicio serv = new Servicio();
                serv.setCodigo(rs.getInt("codigo"));
                serv.setDescripcion(rs.getString("descripcion"));
                serv.setCosto(rs.getFloat("costo"));
                serv.setEstado(rs.getBoolean("estado"));                
                arrServ.add(serv);
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData Error:\n" + e);
        }
        return arrServ;        
    }
    public ArrayList<Servicio> listarServActDesc(String descrip){
        ArrayList<Servicio> arrServ = new ArrayList();
        //SELECT `codigo`, `descripcion`, `costo`, `estado` FROM `servicio` WHERE 1
        String query = "SELECT * FROM servicio WHERE estado = 1 AND descripcion LIKE ?"; //Por DESCRIPCION activos
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, descrip);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Servicio serv = new Servicio();
                serv.setCodigo(rs.getInt("codigo"));
                serv.setDescripcion(rs.getString("descripcion"));
                serv.setCosto(rs.getFloat("costo"));
                serv.setEstado(rs.getBoolean("estado"));                
                arrServ.add(serv);
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData Error:\n" + e);
        }
        return arrServ;        
    }
    public ArrayList<Servicio> listarServInactDesc(String descrip){
        ArrayList<Servicio> arrServ = new ArrayList();
        //SELECT `codigo`, `descripcion`, `costo`, `estado` FROM `servicio` WHERE 1
        String query = "SELECT * FROM servicio WHERE estado = 0 AND descripcion LIKE ?"; //Por DESCRIPCION inactivos
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, descrip);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Servicio serv = new Servicio();
                serv.setCodigo(rs.getInt("codigo"));
                serv.setDescripcion(rs.getString("descripcion"));
                serv.setCosto(rs.getFloat("costo"));
                serv.setEstado(rs.getBoolean("estado"));                
                arrServ.add(serv);
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ServicioData Error:\n" + e);
        }
        return arrServ;        
    }
}
