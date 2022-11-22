package datos;

import entidades.ItemRep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Grupo10
 */
public class ItemRepData {
    private Connection con = null;   

    public ItemRepData() {
        this.con = Conexion.conectar();
    }
          public void guardarItemRep(ItemRep it) {
        String query = "INSERT INTO ItemRep(reparacionId,repuestoSerie,cantidad,costo) VALUES(?,?,?,?)";
            
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, it.getReparID().getId());
            ps.setInt(2, it.getRepuID().getSerie());
            ps.setInt(3, it.getCantidad());
            ps.setFloat(4,it.getCosto()*it.getCantidad());

           
            
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
    
//void altaItemRep(ItemRep item) //DANI
//void bajaItemRep(int id) (fisico solo si no esta cerrada la reparacion) //PATO
//void modificarItemRep(ItemRep item) //MAURO
//ItemRep buscarItemRep(int id) (no se si hace falta) //ADRI
//ArrayList<ItemRep> ListarItemRep
//VER: (costo) calcular (x idRepar) ????
    
}
