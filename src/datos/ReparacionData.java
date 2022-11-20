package datos;

import java.sql.Connection;

/**
 * @author Grupo10
 */
public class ReparacionData {
    private Connection con = null;

    public ReparacionData() {
        this.con = Conexion.conectar();
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
