
package datos;

import entidades.Bicicleta;
import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class BicicletaData {
     
    private Connection con = null;
  
            
            
   // public BicicletaData() {
        //this.con = Conexion.conectar();
   // }

    public BicicletaData() {
       this.con = Conexion.conectar() ;
       
    }

 
    
    public void altaBicicleta(Bicicleta bici){
//INSERT INTO `bicicleta`(`serie`, `marca`, `tipo`, `color`, `clienteDni`,`estado`) VALUES ('?','?','?','?','?');
//INSERT INTO `bicicleta`(`serie`, `marca`, `tipo`, `color`, `clienteDni`, `estado`) VALUES ('1','venzo','montain','verde','23456789','1');
        String query = "INSERT INTO bicicleta (serie, marca, tipo, color, clienteDni, estado) VALUES ('?', '?', '?', '?', '?', '?')";
        try {
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bici.getNroSerie());
            ps.setString(2,bici.getMarca());
            ps.setString(3, bici.getTipo());
            ps.setString(4, bici.getColor());
            ps.setInt(5, bici.getCliente().getDni());
            ps.setBoolean(6,bici.isEstado());
            
            
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ServicioData Info : bicicleta guardada Correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "ServicioData Error: No se pudo Agregar Bicicleta ");
            }            
            ps.close();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "BicicletaData Error : " + e);
        }
    }
    public void bajaBicicleta(int id){
    
    //UPDATE `bicicleta` SET `estado`='0' WHERE serie=1;
        String query= "UPDATE bicicleta SET estado=0 WHERE serie=?";
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
    public void modificarBicicleta(Bicicleta bici){
       // UPDATE `bicicleta` SET `serie`='2',`marca`='venzo',`tipo`='paseo',`color`='rojo',`clienteDni`='23456789',`estado`='1' WHERE serie=2;
        String query = "UPDATE bicicleta SET serie=?, marca=?,tipo=?, color=?, clienteDni=?, estado=? WHERE serie=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, bici.getNroSerie());
            ps.setString(2, bici.getMarca());
            ps.setString(3, bici.getTipo());
            ps.setString(4, bici.getColor());
            ps.setInt(5, bici.getCliente().getDni());
            ps.setBoolean(6,bici.isEstado());
            ps.setInt(7, bici.getNroSerie());
            
            if (ps.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null, "bicicletaData Info:\nInformacion Actualizada" );                
            }else {
                JOptionPane.showMessageDialog(null, "BicicletaData Error:\nLos Datos no pudieron ser Actualizados");
            }
            ps.close();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "BicicletaData Error: " + e);
        }    
    }
    
    public ArrayList<Bicicleta> listarBicicletas(){
        ArrayList<Bicicleta> misBicis = new ArrayList();
       
        //SELECT * FROM `bicicleta` WHERE estado=1;
        String query = "SELECT * FROM bicicleta WHERE estado = 1"; 
        try {
           
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ClienteData clieDa=new ClienteData();
            Cliente clie=new Cliente();
            while (rs.next()) {
                
                Bicicleta bici = new Bicicleta();
                
                bici.setNroSerie(rs.getInt("serie"));
                bici.setMarca(rs.getString("marca"));
                bici.setTipo(rs.getString("tipo"));
                bici.setColor(rs.getString("color"));
                clie = clieDa.buscarCliente(rs.getInt("clienteDni"));
                bici.setCliente(clie);
                bici.setEstado(rs.getBoolean("estado"));
                misBicis.add(bici);
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "BicicletaData Error:\n" + e);
        }
        return misBicis;        
    }
    public Bicicleta buscaBicicleta(int id) {   
        //Creo un obj, instancio un query..
        ClienteData clieDa=new ClienteData();
            Cliente clie=new Cliente();
        Bicicleta bici = new Bicicleta();
     
        String query =  "SELECT * FROM bicicleta WHERE estado=1 AND serie = ? ";
        
        //Try: Ps/ ps.set(id xparametro).. / rs.. /if(next) ../ Set obj / ps.Close...
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) { 
               bici.setNroSerie(rs.getInt("serie"));
               bici.setMarca(rs.getString("marca"));
               bici.setTipo(rs.getString("tipo"));
               bici.setColor(rs.getString("color"));
               clie = clieDa.buscarCliente(rs.getInt("clienteDni"));
               bici.setCliente(clie);
               bici.setEstado(rs.getBoolean("estado"));
               
            } else {
                JOptionPane.showMessageDialog(null, "BicicletaData Error:\n No se encuentra el servicio/activo");
                return null;
            }
            ps.close();    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "BicicletaData Error:\n" + e);
            return null;
        }    
        return bici;
    } 
}
