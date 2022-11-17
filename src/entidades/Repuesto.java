package entidades;


public class Repuesto {
    private int serie;
    private String descripcion;
    float costo;
    boolean estado;

    public Repuesto() {
    }

    public Repuesto(String descripcion, float costo, boolean estado) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
    }

    public Repuesto(int serie, String descripcion, float costo, boolean estado) {
        this.serie = serie;
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.serie;
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
        final Repuesto other = (Repuesto) obj;
        return this.serie == other.serie;
    }

    @Override
    public String toString() {
        return "Serie=" + serie + " - " + descripcion + '}';
    }

}
