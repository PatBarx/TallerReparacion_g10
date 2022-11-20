package datos;

import java.sql.Connection;

/**
 * @author Grupo10
 */
public class ItemRepData {
    private Connection con = null;   

    public ItemRepData() {
        this.con = Conexion.conectar();
    }
    
//void altaItemRep(ItemRep item) //DANI
//void bajaItemRep(int id) (fisico solo si no esta cerrada la reparacion) //PATO
//void modificarItemRep(ItemRep item) //MAURO
//ItemRep buscarItemRep(int id) (no se si hace falta) //ADRI
//ArrayList<ItemRep> ListarItemRep
//VER: (costo) calcular (x idRepar) ????
    
}
