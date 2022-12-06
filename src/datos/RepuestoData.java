package datos;

import entidades.Repuesto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RepuestoData {

    private Connection con = Conexion.conectar();

    public RepuestoData() {
    }

    public void altaRepuesto(Repuesto rep) {
        String query = "INSERT INTO repuesto (serie, descripcion, costo, estado) VALUES (?,?,?,?)";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setInt(1, rep.getSerie());
            ps.setString(2, rep.getDescripcion());
            ps.setFloat(3, rep.getCosto());
            ps.setBoolean(4, rep.isEstado());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se agrego el Repuesto");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el respuesto");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar el respuesto, serie duplicada?");
        }finally{
             try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void bajaRepuesto(Repuesto rep) {
         String query = "UPDATE repuesto SET estado = 0 WHERE serie = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setInt(1, rep.getSerie());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se borro el repuesto");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo borra el respuesto");
            }
        }catch (SQLException ex){
            Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
            public void activaRepuesto(Repuesto rep) {
         String query = "UPDATE repuesto SET estado = 1 WHERE serie = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setInt(1, rep.getSerie());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se reactivo el repuesto");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo reactivar el respuesto");
            }
        }catch (SQLException ex){
            Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void modificacionRepuesto(Repuesto rep) {
        String query = "UPDATE repuesto SET descripcion = ?, costo = ?, estado = ? WHERE serie = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1, rep.getDescripcion());
            ps.setFloat(2, rep.getCosto());
            ps.setBoolean(3, rep.isEstado());
            ps.setInt(4, rep.getSerie());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos del repuesto");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar los datos");
            }
        }catch (SQLException ex){
            Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public Repuesto buscarRepuesto(int serie){
     Repuesto rep = null;
        String sql = "SELECT * FROM repuesto WHERE serie = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, serie);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rep = new Repuesto();
                rep.setSerie(rs.getInt("serie"));
                rep.setDescripcion(rs.getString("descripcion"));
                rep.setCosto(rs.getFloat("costo"));
                rep.setEstado(rs.getBoolean("estado"));            }
        } catch (SQLException ex) {
            Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return rep;
    
    }

    public ArrayList<Repuesto> listaRepuesto() {
        ArrayList<Repuesto> repuestos = new ArrayList<>();
        Repuesto rep = null;
        String sql = "SELECT * FROM repuesto WHERE estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              rep = new Repuesto();
                rep.setSerie(rs.getInt("serie"));
                rep.setDescripcion(rs.getString("descripcion"));
                rep.setCosto(rs.getFloat("costo"));
                rep.setEstado(rs.getBoolean("estado"));      
                repuestos.add(rep);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(RepuestoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return repuestos;
    }
}
