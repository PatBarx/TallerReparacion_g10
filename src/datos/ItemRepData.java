package datos;

import entidades.ItemRep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
                JOptionPane.showMessageDialog(null, "ItemData Info : itemRep guardada Correctamente");

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
        String query= "DELETE * FROM itemrep Left JOIN reparacion ON reparacion.id = reparacionId " +
            "WHERE itemrep.reparacionId= ? AND itemrep.repuestoSerie=? AND reparacion.estado = 1";
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
            JOptionPane.showMessageDialog(null, "Itemrep fue actualizado");
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
    
//LISTO!!!void altaItemRep(ItemRep item) //DANI
//LISTO!!!void bajaItemRep(int id) (fisico solo si no esta cerrada la reparacion) //PATO
//LISTO!!!void modificarItemRep(ItemRep item) //MAURO
//ItemRep buscarItemRep(int id) (no se si hace falta) //ADRI
//ArrayList<ItemRep> ListarItemRep
//VER: (costo) calcular (x idRepar) ????
    
}
