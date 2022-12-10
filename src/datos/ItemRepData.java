package datos;

import entidades.ItemRep;
import entidades.Reparacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Grupo10
 */
public class ItemRepData {
    private Connection con = null;   

    public ItemRepData() {
        this.con = Conexion.conectar();
    }
          public void altaItemRep(ItemRep it) {
        String query = "INSERT INTO ItemRep(reparacionId,repuestoSerie,cantidad,costo) VALUES(?,?,?,?)";
            
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, it.getReparacion().getId());
            ps.setInt(2, it.getRepuesto().getSerie());
            ps.setInt(3, it.getCantidad());
            ps.setFloat(4,it.getCosto());

           
            
             if (ps.executeUpdate() > 0) {
                 System.out.println( "ItemData Info : itemRep guardada Correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "itemData Error: No se pudo Agregar item ");
            }            
            ps.close();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "item Error : " + e);
            System.out.println(e);
        }
    }
        public void bajaItemRep(int idRepar, int idRepu){ //FISICO solo si no esta cerrada la reparacion
        //DELETE * FROM `itemrep` Left JOIN reparacion ON reparacion.id = reparacionId
        //WHERE `itemrep.reparacionId`= ? AND `itemrep.repuestoSerie`=? AND reparacion.estado = 1
        String query= "DELETE FROM itemrep WHERE reparacionId = ? AND repuestoSerie = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idRepar);
            ps.setInt(2, idRepu);
            
        if (ps.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null, "ItemRepData Info:\nBaja Exitosa" );                                
            }else {
                JOptionPane.showMessageDialog(null, "ItemRepData Error:\nEste Item de reparacion no pudo darse de baja" ); 
            }
        ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ItemRepData ERROR:\n" +e ); 
        }        
    }
         
    public void modificarItemRep(ItemRep itR) { //SEGURO HAY QUE CAMBIAR LOS MENSAJES PORQUE SINO VA A ESTRESAR-ArrayList
        String query = "UPDATE itemrep SET cantidad=?, costo=?  WHERE reparacionId=? and repuestoSerie = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, itR.getCantidad());
            ps.setFloat(2, itR.getCosto());
            ps.setInt(3, itR.getReparacion().getId());
            ps.setInt(4, itR.getRepuesto().getSerie());
            ps.executeUpdate();
            System.out.println( "Itemrep fue actualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Itemrep NO fue actualizada");
            Logger.getLogger(ReparacionData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReparacionData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        
    public ItemRep buscarItemRep(Reparacion reparacion, int repuesto) {
        RepuestoData rd = new RepuestoData();
        ItemRep itemRep = null;
        String query = "SELECT * FROM itemrep WHERE reparacionId=? and repuestoSerie = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, reparacion.getId());
            ps.setInt(2, repuesto);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                itemRep = new ItemRep();
                itemRep.setCantidad(rs.getInt("cantidad"));
                itemRep.setReparacion(reparacion);
                itemRep.setRepuesto(rd.buscarRepuesto(rs.getInt("repuestoSerie")));
                itemRep.setCosto(rs.getFloat("costo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemRepData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemRepData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return itemRep;
    }

    public ArrayList<ItemRep> listarItemRepPorReparacion(Reparacion rep) {
        RepuestoData rd = new RepuestoData();
        ArrayList<ItemRep> listaItemRep = new ArrayList();
        String query = "SELECT * FROM itemrep WHERE reparacionId=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, rep.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ItemRep itemRep = new ItemRep();
                itemRep.setCosto(rs.getFloat("costo"));
                itemRep.setCantidad(rs.getInt("cantidad"));
                itemRep.setReparacion(rep);
                itemRep.setRepuesto(rd.buscarRepuesto(rs.getInt("repuestoSerie")));
                listaItemRep.add(itemRep);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemRepData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemRepData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaItemRep;
    }
    
//LISTO!!!void altaItemRep(ItemRep item) //DANI
//LISTO!!!void bajaItemRep(int id) (fisico solo si no esta cerrada la reparacion) //PATO
//LISTO!!!void modificarItemRep(ItemRep item) //MAURO
//ItemRep buscarItemRep(int id) (no se si hace falta) //ADRI
//ArrayList<ItemRep> ListarItemRep
//VER: (costo) calcular (x idRepar) ????
    
}
