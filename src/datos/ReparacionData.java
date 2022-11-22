package datos;

import entidades.Reparacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
        public void actualizaInscripcion(Reparacion rep) {
        String query = "UPDATE reparacion SET `servicioCodigo=?,clienteDni=?,bicicletaSerie=?,fecha_entrada=?,costoTotal=?,estado=?  WHERE id=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, rep.getServCod().getCodigo());
            ps.setInt(2, rep.getCliDNI().getDni());
            ps.setInt(3, rep.getBiciSerie().getNroSerie());
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
               public boolean AnularReparacion(int id) {   //UPDATE SET / DELETE
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
    
//void altaReparacion(Reparacion repa) //PATO
//void bajaReparacion(int id) //DANI
//void modificarReparacion(Reparacion repa) //MAuro
//Reparacion buscarReparacion(int id) //ADRIAN
//listar el costo total por reparación.     //(trae el costo del servicio + la suma de los costos de los items (repuestos) para pegarlos en el costo del encabezado)
//listar las bicicletas pendientes de reparación, 
//listar los ya reparadas, 
//buscarBciCliente                  //Búsqueda de bicicletas por dueño
//Bicicleta buscarBiciServ(Servicio serv, Reparacion?) //Búsqueda de bicicletas por servicio
//buscarBiciFechEnt                 //Búsqueda de bicicletas por fecha de entrada.
//float calcuarCostoItems()
}
