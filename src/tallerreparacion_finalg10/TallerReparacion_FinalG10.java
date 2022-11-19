package tallerreparacion_finalg10;

import datos.BicicletaData;
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
              Cliente clie =new Cliente(23456789,"ricardo","españa_1669",2345678,false);  
        
      Bicicleta bici = new Bicicleta(8,"benzo","mountain","celeste",23456789,true); 
        
      BicicletaData biDa= new BicicletaData();
      
   //  biDa.altaBicicleta(bici);
      //   biDa.bajaBicicleta(8);
    // biDa.modificarBicicleta(bici);
     // System.out.println(biDa.listarBicicletas()); 
       System.out.println(biDa.buscaBicicleta(3));
    }
    
}
