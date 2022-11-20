package tallerreparacion_finalg10;

import datos.BicicletaData;
import datos.ClienteData;
import entidades.Bicicleta;
import entidades.Cliente;

/**
 * @author Grupo10
 */
public class TallerReparacion_FinalG10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Cliente clie =new Cliente(22777777,"juan","españa_1669",2345678,false);  
        ClienteData clieDa =new ClienteData();
      Bicicleta bici = new Bicicleta(12,"benzo","mountain","celeste",clie,true); 
        
      BicicletaData biDa= new BicicletaData(clie,clieDa);
      
  // biDa.altaBicicleta(bici);
     // biDa.bajaBicicleta(12);
   // biDa.modificarBicicleta(bici);
    // System.out.println(biDa.listarBicicletas()); 
 //   System.out.println(biDa.buscaBicicleta(12));
    }
    
}
