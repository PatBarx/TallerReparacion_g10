/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Bicicleta;
import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ClienteData {
   private Connection con = Conexion.conectar();
       public void guardarCliente(Cliente alu) {  //INSERT INTO
        String query = "INSERT INTO cliente(dni,nombre,domicilio,telefono,estado) VALUES(?,?,?,?,?)"; //"?" Comodines para reutilizar query

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, alu.getDni());
            ps.setString(2, alu.getNombre());
            ps.setString(3, alu.getDomicilio());
            ps.setInt(4, alu.getTel());
            ps.setBoolean(5, true);
          
            //ps.executeUpdate();
            
           if (ps.executeUpdate()!=0) {
            JOptionPane.showMessageDialog(null, "AlumnoData Info : Carga Exitosa");
          } else {
          JOptionPane.showMessageDialog(null, "AlumnoData Error: No se pudo obtener ID");
          }
            ps.close();
        } catch (SQLException excep) {
            System.out.println(excep);
        }
    }
    

    public Cliente buscarCliente(int dni){   //SELECT 1 ALUMNO
               //SELECT 1 ALUMNO
        Cliente alu= null;
        String sql="SELECT * FROM cliente WHERE dni=?";
        PreparedStatement ps;
       try { 
        ps=con.prepareStatement(sql);
        ps.setInt(1, dni);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            alu=new Cliente();
            alu.setDni(rs.getInt("dni"));
            alu.setNombre(rs.getString("nombre"));
            alu.setDomicilio(rs.getString("domicilio"));
            alu.setTel(rs.getInt("telefono"));
            alu.setEstado(rs.getBoolean("estado"));
           
                 
        }
        
    } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
       return alu;      
    }
        public void actualizarCliente(Cliente alu){ //UPDATE SET
            //UPDATE SET
        String query="UPDATE cliente SET  nombre=?, domicilio=?, telefono=?, estado=?  WHERE dni=?";
        //System.out.println(query);
        try {
        PreparedStatement ps = con.prepareStatement(query);
        
         
         ps.setString(1, alu.getNombre());
         ps.setString(2, alu.getDomicilio());
         ps.setInt(3,alu.getTel());
         ps.setBoolean(4,alu.isEstado());
         ps.setInt(5,alu.getDni());
           //JOptionPane.showMessageDialog(null, ps.executeUpdate()+"gd");
           System.out.println(ps.executeUpdate()+"gd");
         if (ps.executeUpdate()!=0) {
             
            JOptionPane.showMessageDialog(null, "AlumnoData Info : Actualizacion Exitosa");
          } else {
          JOptionPane.showMessageDialog(null, "AlumnoData Error: No se pudo Actualizar");
          }
          
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
         public ArrayList<Cliente> listarCliente(){    //SELECT * Alumnos
          ArrayList<Cliente>clientes =new ArrayList();
    
    try{
    String sql = " SELECT *  FROM cliente;";
    PreparedStatement pst = con.prepareStatement(sql);
    ResultSet resultSet = pst.executeQuery();
    
    Cliente alu;
    
    while(resultSet.next()){
        
        alu=new Cliente();
        alu.setDni(resultSet.getInt("dni"));
        alu.setNombre(resultSet.getString("nombre"));
        alu.setDomicilio(resultSet.getString("domicilio"));
        alu.setTel(resultSet.getInt("telefono"));
        alu.setEstado(resultSet.getBoolean("estado"));
        
        clientes.add(alu);
    }
    pst.close();
     }catch(SQLException e){

JOptionPane.showMessageDialog(null, "error al obtner alumno");
}
  return  clientes;
    }  
             public ArrayList<Bicicleta> listarBicicleta(Cliente cli) {    //SELECT * Alumnos
        ArrayList<Bicicleta> mater = new ArrayList();
         String sql = " SELECT * FROM bicicleta,cliente WHERE "
                + "bicicleta.estado=1 and bicicleta.dniDuenio=cliente.dni  and cliente.dni=? ";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, cli.getDni());
            ResultSet rs = pst.executeQuery();
            

            Bicicleta mate;

            while (rs.next()) {

                mate = new Bicicleta();
                // int nroSerie;
   // private String marca;
    //private String tipo;
   // private String color;
   // private String dniDuenio;
                mate.setNroSerie(rs.getInt("nroSerie"));
                mate.setMarca(rs.getString("marca"));
                mate.setTipo(rs.getString("tipo"));
                mate.setColor(rs.getString("color"));
                mate.setDniDuenio(rs.getInt("clienteDni"));
                mate.setEstado(rs.getBoolean("estado"));

                mater.add(mate);
            }
            pst.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "error al obtner alumno");
        }
        return mater;
    }
                 public boolean borrarliente(int dni) {   //UPDATE SET / DELETE

        boolean borrado = false;

        String sql = "UPDATE cliente SET estado = 0 WHERE dni = ?";
        try {
            PreparedStatement pts = con.prepareStatement(sql);
            pts.setInt(1, dni);

            if (pts.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "MateriaData Info: Materia Borrada");
                borrado = true;
            }

            else {
                JOptionPane.showMessageDialog(null, "MateriaData Info: No se pudo Borrar");
            }
            pts.close();
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al borrar materia");

        }

        return borrado;
    }
}
