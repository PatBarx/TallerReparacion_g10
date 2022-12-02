package tallerreparacion_finalg10;

import datos.BicicletaData;
import datos.ClienteData;
import entidades.Bicicleta;
import entidades.Cliente;
import java.util.ArrayList;

/**
 * @author Grupo10
 */
public class TallerReparacion_FinalG10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //   Cliente clie =new Cliente(44,"anselmo marino","25 de mayo",134,true);  
     //   ClienteData clieDa =new ClienteData();
     //   Bicicleta bici = new Bicicleta(12,"benzo","mountain","celeste",clie,true); 
        
     //   BicicletaData biDa= new BicicletaData();

  // biDa.altaBicicleta(bici);
     // biDa.bajaBicicleta(12);
   // biDa.modificarBicicleta(bici);
    // System.out.println(biDa.listarBicicletas()); 
 //   System.out.println(biDa.buscaBicicleta(12));
 //guardar cliente
// clieDa.guardarCliente(clie);
//buscar cliente po id
// System.out.println(clieDa.buscarCliente(22777777));
// borrar cliente
//clieDa.borrarCliente(22777777);
//actualizar cliente
//clieDa.actualizarCliente(clie);
//listar clientes
/*ArrayList<Cliente>clientes= clieDa.listarCliente();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            
        }*/
        
        /*  CLASE RESPUESTO TESTING ******************************************************************
        Repuesto rp1 = new Repuesto(123,"Repuesto 1", 200, true);
        Repuesto rp2 = new Repuesto(456,"Repuesto 2", 300, true);
        Repuesto rp3 = new Repuesto(789, "Repuesto 3", 400, true);
        RepuestoData rd = new RepuestoData();
        ArrayList<Repuesto> listarepuesto = null;

        rd.altaRepuesto(rp1);
        //System.out.println(rp1);
        rd.altaRepuesto(rp2);
        rd.altaRepuesto(rp3);

        System.out.println("Lista Repuesto cargados");
        listarepuesto = rd.listaRepuesto();
        for (Repuesto repuesto : listarepuesto) {
            System.out.println(repuesto);
        }

        rd.bajaRepuesto(rp1);

        System.out.println("Lista Repuesto con una baja");
        listarepuesto = rd.listaRepuesto();
        for (Repuesto repuesto : listarepuesto) {
            System.out.println(repuesto);
        }
        
        rp3.setDescripcion("Repuesto 33");
        
        rd.modificacionRepuesto(rp3);
        
        System.out.println("Lista Repuesto con una modificacion");
        listarepuesto = rd.listaRepuesto();
        for (Repuesto repuesto : listarepuesto) {
            System.out.println(repuesto);
        }
        
        Repuesto repBuscado = rd.buscarRepuesto(456);
        System.out.println("Repuesto Buscado");
        System.out.println(repBuscado);
        ****************************************************************************************************
         */
        
        /*
        /////////        SERVICIO  PRUEBAS      /////////
    
    //Atributos (String descripcion, float costo, boolean estado)        
        ServicioData serData = new ServicioData();
        System.out.println("-   SERVICIO   -");
        Servicio serv1 = new Servicio("Emparchar", 100, true);  
    //ALTA SERVICIO:
        //serData.altaServicio(serv1);
        System.out.println("- ALTA SERVICIO -\n");
        System.out.println("-COD: \t"+ serv1.getCodigo()
                    +"\t| -Descripcion: " + serv1.getDescripcion()
                    +"\n-COSTO: "+ serv1.getCosto()
                    + "\t| -Estado: "+ serv1.isEstado()
                    + "\n");
        System.out.println("----------------------------------------");
    //BAJA SERVICIO:
        System.out.println("- BAJA SERVICIO -\n");
        //serData.bajaServicio(7);
        System.out.println("----------------------------------------");
    //BUSCAR SERVICIO:    
        System.out.println("- BUSCAR SERVICIO -\n");
                //x Codigo de ID, AI.Mostrado en Alta
        System.out.println(serData.buscarServicio(7));
        System.out.println("----------------------------------------");       
    //MODIFICAR SERVICIO:    
        System.out.println("- MODIFICAR SERVICIO -\n");
        //serv1 = serData.buscarServicio(7);
        //serv1.setDescripcion("Inflado");
        //serData.modificarServicio(serv1);
        System.out.println("-COD: \t"+ serv1.getCodigo()
                    +"\t| -Descripcion: " + serv1.getDescripcion()
                    +"\n-COSTO: "+ serv1.getCosto()
                    + "\t| -Estado: "+ serv1.isEstado()
                    + "\n");
        System.out.println("----------------------------------------");
    //LISTAR SERVICIOS ArrayList<Servicio> listarServicios()  
        System.out.println("- LISTAR SERVICIOS -\n");
        ArrayList<Servicio> listaServ = serData.listarServicios();
        //(int codigo, String descripcion, float costo, boolean estado)
        for (Servicio servicio : listaServ) {
            System.out.println("-COD: \t"+ servicio.getCodigo()
                    +"\t| -Descripcion: " + servicio.getDescripcion()
                    +"\n-COSTO: "+ servicio.getCosto()
                    + "\t| -Estado: "+ servicio.isEstado()
                    + "\n");
        }
        */


    }
    
}
