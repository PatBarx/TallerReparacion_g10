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
        Cliente clie =new Cliente(44,"anselmo marino","25 de mayo",134,true);  
        ClienteData clieDa =new ClienteData();
        Bicicleta bici = new Bicicleta(12,"benzo","mountain","celeste",clie,true); 
        
        BicicletaData biDa= new BicicletaData();

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
        

    }
    
}
