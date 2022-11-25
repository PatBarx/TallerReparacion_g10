package datos;

import entidades.Bicicleta;
import entidades.Cliente;
import entidades.ItemRep;
import entidades.Reparacion;
import entidades.Servicio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Grupo10
 */
public class ReparacionData {
    private Connection con = null;

    public ReparacionData() {
        this.con = Conexion.conectar();
    }
    
    public void altaReparacion(Reparacion repa){
    //Query: INSERT INTO `reparacion`(`servicioCodigo`, `clienteDni`, `bicicletaSerie`, `fecha_entrada`, `costoTotal`, `estado`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')
        String query = "INSERT INTO itemrep (servicioCodigo, clienteDni, bicicletaSerie, fecha_entrada, costoTotal, estado) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);          
            ps.setInt(1, repa.getServicio().getCodigo());   //1,servicioCodigo
            ps.setInt(2, repa.getCliente().getDni());   //2,clienteDni
            ps.setInt(3, repa.getBici().getNroSerie()); //3,bicicletaSerie
            ps.setDate(4, Date.valueOf(repa.getFechaEntrada()));  // 4,fecha_entrada
            ps.setFloat(5,repa.getCostoTotal()); //5,costoTotal
            ps.setInt(6, 1); //6,estado
             
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ReparacionData Info : Alta Exitosa");
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    repa.setId(rs.getInt(1));                    
                } else {
                    JOptionPane.showMessageDialog(null, "ReparacionData Error: No se pudo Recuperar el ID");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ReparacionData Error: No se pudo Agregar");
            }            
            ps.close();             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ReparacionData Error: " + e);
        }
    }
    
        public void modificarReparacion(Reparacion rep) {
        String query = "UPDATE reparacion SET `servicioCodigo=?,clienteDni=?,bicicletaSerie=?,fecha_entrada=?,costoTotal=?,estado=?  WHERE id=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, rep.getServicio().getCodigo());
            ps.setInt(2, rep.getCliente().getDni());
            ps.setInt(3, rep.getBici().getNroSerie());
            ps.setDate(4, Date.valueOf(rep.getFechaEntrada()));
            ps.setFloat(5, rep.getCostoTotal());
            ps.setInt(6, rep.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La reparacion fue actualizada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La reparacion NO fue actualizada");
            Logger.getLogger(ReparacionData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReparacionData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
               public boolean BajaReparacion(int id) {   //UPDATE SET / DELETE
        boolean borrado = false;
        String sql = "UPDATE reparacion SET estado = 3 WHERE id = ?";
        try {
            PreparedStatement pts = con.prepareStatement(sql);
            pts.setInt(1, id);

            if (pts.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "reparacion borrada");
                borrado = true;
            }

            else {
                JOptionPane.showMessageDialog(null, " No se pudo Borrar");
            }
            pts.close();
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al borrar reparacion");
        }
        return borrado;
    }
                 public ArrayList<Reparacion> listarBicisPendientes(){
         ServicioData ser=new ServicioData();
        
        ClienteData clieDa=new ClienteData();
         BicicletaData bic=new BicicletaData();
        ArrayList<Reparacion>reparaciones = new ArrayList();
       
        //SELECT * FROM `bicicleta` WHERE estado=1;
        String query = "SELECT * FROM reparacion WHERE reparacion.estado = 1 or reparacion.estado=0"; 
        try {
           
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Reparacion rep=new Reparacion();
                
                rep.setId(rs.getInt("id"));
                Servicio se=ser.buscarServicio(rs.getInt("servicioCodigo"));
                rep.setServicio(se);
                Cliente clie = clieDa.buscarCliente(rs.getInt("clienteDni"));
                rep.setCliente(clie);
                Bicicleta bi = bic.buscaBicicleta(rs.getInt("bicicletaSerie"));
                rep.setBici(bi);
                rep.setFechaEntrada(rs.getDate("fecha_entrada").toLocalDate());
                rep.setCostoTotal(rs.getFloat("costoTotal"));
                rep.setEstado(rs.getInt("estado"));
                reparaciones.add(rep);
                
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ReparacionData Error:\n" + e);
        }
        return reparaciones;        
    }
            public ArrayList<Reparacion> listarBicisTerminadas(){
         ServicioData ser=new ServicioData();
         BicicletaData bic=new BicicletaData();
        ClienteData clieDa=new ClienteData();
        ArrayList<Reparacion>reparaciones = new ArrayList();
       
        //SELECT * FROM `bicicleta` WHERE estado=1;
        String query = "SELECT * FROM reparacion WHERE reparacion.estado = 2"; 
        try {
           
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Reparacion rep=new Reparacion();
                
                rep.setId(rs.getInt("id"));
                Servicio se=ser.buscarServicio(rs.getInt("servicioCodigo"));
                rep.setServicio(se);
                Cliente clie = clieDa.buscarCliente(rs.getInt("clienteDni"));
                rep.setCliente(clie);
                Bicicleta bi = bic.buscaBicicleta(rs.getInt("bicicletaSerie"));
                rep.setBici(bi);
                rep.setFechaEntrada(rs.getDate("fecha_entrada").toLocalDate());
                rep.setCostoTotal(rs.getFloat("costoTotal"));
                rep.setEstado(rs.getInt("estado"));
                reparaciones.add(rep);
                
                ps.close();    
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ReparacionData Error:\n" + e);
        }
        return reparaciones;        
    }
   //RETOCAR MAU         
    /*public float calcularCostoReparacion(Reparacion rep) { //(Servicio costo, ItemRep costo ){
        float total = 0;
        for (ItemRep item : rep.getItemRep()) {
            total += item.getCosto();
        }
        return rep.getServicio().getCosto() + total;
    }*/
    public ArrayList buscarBciCliente(int dniCli){      //Búsqueda de bicicletas por dueño
           ArrayList<Bicicleta> liBicis = new ArrayList();
           BicicletaData biDat = new BicicletaData();        

           String query = "SELECT bicicleta.* FROM reparacion \n" +
               "Left Join bicicleta ON bicicleta.serie = reparacion.bicicletaSerie \n" +
               "WHERE reparacion.clienteDni = ? GROUP BY reparacion.bicicletaSerie";
           try {
               PreparedStatement ps = con.prepareStatement(query);
               ps.setInt(1, dniCli);            
               ResultSet rs = ps.executeQuery();

               while(rs.next()){                
               Bicicleta bici= biDat.buscaBicicleta(rs.getInt("serie"));

               liBicis.add(bici);
               }
               ps.close();
           } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, "ReparacionData Error: " + e);
           }            
           return liBicis;
       }
               
    
//LISTO!!! void altaReparacion(Reparacion repa) //PATO 
//LISTO!!! void bajaReparacion(int id) //DANI
//LISTO!!! void modificarReparacion(Reparacion repa) //MAuro
//Reparacion buscarReparacion(int id) //ADRIAN
//LISTO!!! listar el costo total por reparación. //MAU    //(trae el costo del servicio + la suma de los costos de los items (repuestos) para pegarlos en el costo del encabezado)
//LISTO!!! listar las bicicletas pendientes de reparación, //Dani
//LISTO!!! listar los ya reparadas, //Dani
//LISTO!!! buscarBciCliente() //Pato                    //Búsqueda de bicicletas por dueño
//Bicicleta buscarBiciServ(Servicio serv) //ADRIAN      //Búsqueda de bicicletas por servicio
//buscarBiciFechEnt  //Pato               //Búsqueda de bicicletas por fecha de entrada.
//float calcuarCostoItems() //MAU
}
