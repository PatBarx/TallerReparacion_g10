package entidades;
/**
 * @author Grupo10
 */
public class ItemRep {
    //private int id; (Borrar)
    private Reparacion reparacion;
    private Repuesto repuesto;
    private int cantidad;
    private float costo;

    public ItemRep() {
    }

    public ItemRep(Repuesto repuID, int cantidad, float costo) {
        this.repuesto = repuID;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public ItemRep(Reparacion reparacion, Repuesto repuesto, int cantidad, float costo) {
        this.reparacion = reparacion;
        this.repuesto = repuesto;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(Repuesto repuesto) {
        this.repuesto = repuesto;
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
        return "ItemRep: " + "reparID=" + reparacion + ", repuID=" + repuesto + ", cantidad=" + cantidad + ", costo=" + costo + '}';
    }
    
    
    
}
