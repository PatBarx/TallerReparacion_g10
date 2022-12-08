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

    public void guardarCliente(Cliente cl) {  //INSERT INTO
        String query = "INSERT INTO cliente(dni,nombre,domicilio,telefono,estado) VALUES(?,?,?,?,?)"; //"?" Comodines para reutilizar query

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, cl.getDni());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getDomicilio());
            ps.setInt(4, cl.getTel());
            ps.setBoolean(5, true);

            //ps.executeUpdate();
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, " Carga Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, " No se pudo obtener ID");
            }
            ps.close();
        } catch (SQLException excep) {
            System.out.println(excep);
        }
    }

    public Cliente buscarCliente(int dni) {   //SELECT
        //SELECT 1 
        Cliente cl = null;
        String sql = "SELECT * FROM cliente WHERE dni=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cl = new Cliente();
                cl.setDni(rs.getInt("dni"));
                cl.setNombre(rs.getString("nombre"));
                cl.setDomicilio(rs.getString("domicilio"));
                cl.setTel(rs.getInt("telefono"));
                cl.setEstado(rs.getBoolean("estado"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cl;
    }

    public void actualizarCliente(Cliente cl) { //UPDATE SET
        //UPDATE SET
        String query = "UPDATE cliente SET  nombre=?, domicilio=?, telefono=?, estado=?  WHERE dni=?";
        //System.out.println(query);
        try {
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, cl.getNombre());
            ps.setString(2, cl.getDomicilio());
            ps.setInt(3, cl.getTel());
            ps.setBoolean(4, cl.isEstado());
            ps.setInt(5, cl.getDni());
            //JOptionPane.showMessageDialog(null, ps.executeUpdate()+"gd");
            System.out.println(ps.executeUpdate() + "gd");
            if (ps.executeUpdate() != 0) {

                JOptionPane.showMessageDialog(null, "ClienteData Info : Actualizacion Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "ClienteData Error: No se pudo Actualizar");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Cliente> listarCliente() {    //SELECT *
        ArrayList<Cliente> clientes = new ArrayList();

        try {
            String sql = " SELECT *  FROM cliente where estado=1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
           int c=0;
            Cliente cl;

            while (resultSet.next()) {
                 c=1;
                cl = new Cliente();
                cl.setDni(resultSet.getInt("dni"));
                cl.setNombre(resultSet.getString("nombre"));
                cl.setDomicilio(resultSet.getString("domicilio"));
                cl.setTel(resultSet.getInt("telefono"));
                cl.setEstado(resultSet.getBoolean("estado"));

                clientes.add(cl);
            }
            
            pst.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "error al obtner Cliente");
        }
        return clientes;
    }
     public ArrayList<Cliente> listarClienteInactivos() {    //SELECT *
        ArrayList<Cliente> clientes = new ArrayList();

        try {
            String sql = " SELECT *  FROM cliente where estado=0 ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            Cliente cl;

            while (resultSet.next()) {

                cl = new Cliente();
                cl.setDni(resultSet.getInt("dni"));
                cl.setNombre(resultSet.getString("nombre"));
                cl.setDomicilio(resultSet.getString("domicilio"));
                cl.setTel(resultSet.getInt("telefono"));
                cl.setEstado(resultSet.getBoolean("estado"));

                clientes.add(cl);
            }
            pst.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "error al obtner Cliente");
        }
        return clientes;
    }
  public boolean activaCliente(int dni) {   //UPDATE SET / DELETE

        boolean borrado = false;

        String sql = "UPDATE cliente SET estado = 1 WHERE dni = ?";
        try {
            PreparedStatement pts = con.prepareStatement(sql);
            pts.setInt(1, dni);

            if (pts.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "cliente activado");
                borrado = true;
            } else {
                JOptionPane.showMessageDialog(null, " No se pudo Borrar");
            }
            pts.close();

        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al borrar cliente");

        }

        return borrado;
    }

    public boolean borrarCliente(int dni) {   //UPDATE SET / DELETE

        boolean borrado = false;

        String sql = "UPDATE cliente SET estado = 0 WHERE dni = ?";
        try {
            PreparedStatement pts = con.prepareStatement(sql);
            pts.setInt(1, dni);

            if (pts.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "cliente Borrado");
                borrado = true;
            } else {
                JOptionPane.showMessageDialog(null, " No se pudo Borrar");
            }
            pts.close();

        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al borrar cliente");

        }

        return borrado;
    }
    public ArrayList<Cliente> BuscarClientePorNombreActivo(String nombre) {   //SELECT 1 ALUMNO
        //SELECT 1 ALUMNO
       
        
        String sql = "SELECT * FROM cliente WHERE estado=1 and nombre=?";
      Cliente cli= null;
         ArrayList<Cliente>cliente = new ArrayList();
        int c=0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c=1;
                cli = new Cliente();
                cli.setDni(rs.getInt("dni"));
                cli.setNombre(rs.getString("nombre"));
                cli.setDomicilio(rs.getString("domicilio"));
                cli.setTel(rs.getInt("telefono"));
                //cli.setEstado(rs.getBoolean("estado"));
                cliente.add(cli);

            }
             if(c==0){JOptionPane.showMessageDialog(null, "no hay clientes con ese nombre");}

        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
       public ArrayList<Cliente> BuscarClientePorNombreinactivo(String nombre) {   //SELECT 1 ALUMNO
        //SELECT 1 ALUMNO
       
        
        String sql = "SELECT * FROM cliente WHERE estado=0 and nombre=?";
      Cliente cli= null;
         ArrayList<Cliente>cliente = new ArrayList();
       int c=0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c=1;
                cli = new Cliente();
                cli.setDni(rs.getInt("dni"));
                cli.setNombre(rs.getString("nombre"));
                cli.setDomicilio(rs.getString("domicilio"));
                cli.setTel(rs.getInt("telefono"));
                //cli.setEstado(rs.getBoolean("estado"));
                cliente.add(cli);

            }
           if(c==0){JOptionPane.showMessageDialog(null, "no hay clientes con ese nombre");}
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
               
     public ArrayList<Cliente> BuscarClientePorDni(int dni) {   //SELECT 1 ALUMNO
        //SELECT 1 ALUMNO
       
        int c=0;
        String sql = "SELECT * FROM cliente WHERE estado=1 and dni=?";
      Cliente cli= null;
         ArrayList<Cliente>cliente = new ArrayList();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c=1;
                cli = new Cliente();
                cli.setDni(rs.getInt("dni"));
                cli.setNombre(rs.getString("nombre"));
                cli.setDomicilio(rs.getString("domicilio"));
                cli.setTel(rs.getInt("telefono"));
                //cli.setEstado(rs.getBoolean("estado"));
                cliente.add(cli);

            }
 if(c==0){JOptionPane.showMessageDialog(null, "no hay cliente con ese dni");}
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
          public ArrayList<Cliente> BuscarClienteInacPorDni(int dni) {   //SELECT 1 ALUMNO
        //SELECT 1 ALUMNO
       
        
        String sql = "SELECT * FROM cliente WHERE estado=0 and dni=?";
      Cliente cli= null;
         ArrayList<Cliente>cliente = new ArrayList();
int c=0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c=1;
                cli = new Cliente();
                cli.setDni(rs.getInt("dni"));
                cli.setNombre(rs.getString("nombre"));
                cli.setDomicilio(rs.getString("domicilio"));
                cli.setTel(rs.getInt("telefono"));
                //cli.setEstado(rs.getBoolean("estado"));
                cliente.add(cli);

            }
             if(c==0){JOptionPane.showMessageDialog(null, "no hay cliente con ese dni");}

        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
}
