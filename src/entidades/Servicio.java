package entidades;
/**
 * @author Grupo10
 */
public class Servicio {
//Atributos
    private int codigo;
    private String descripcion;
    private float costo;
    private boolean estado;
//Constructor Vacio
    public Servicio() {
    }
//Constructor con datos sin ID
   public Servicio(String descripcion, float costo, boolean estado) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
    }
//Constructor con todos los datos +ID
    public Servicio(int codigo, String descripcion, float costo, boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
    }
//Getter y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
//HashCode y Equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servicio other = (Servicio) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
//ToString
    @Override
    public String toString() {
        return "Servicio:\n" + "Codigo: " + codigo + "\tDescripcion: " + descripcion + "\tCosto: $" + costo + "\tEstado: " + estado + '.';
    }
    
}
