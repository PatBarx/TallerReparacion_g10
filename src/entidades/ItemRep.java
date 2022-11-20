package entidades;
/**
 * @author Grupo10
 */
public class ItemRep {
    //private int id; (Borrar)
    private Reparacion reparID;
    private Repuesto repuID;
    private int cantidad;
    private float costo;

    public ItemRep() {
    }

    public ItemRep(Repuesto repuID, int cantidad, float costo) {
        this.repuID = repuID;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public ItemRep(Reparacion reparID, Repuesto repuID, int cantidad, float costo) {
        this.reparID = reparID;
        this.repuID = repuID;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public Reparacion getReparID() {
        return reparID;
    }

    public void setReparID(Reparacion reparID) {
        this.reparID = reparID;
    }

    public Repuesto getRepuID() {
        return repuID;
    }

    public void setRepuID(Repuesto repuID) {
        this.repuID = repuID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "ItemRep: " + "reparID=" + reparID + ", repuID=" + repuID + ", cantidad=" + cantidad + ", costo=" + costo + '}';
    }
    
    
    
}
