package entidades;
/**
 * @author Grupo 10
 */
public class Bicicleta {
    private int nroSerie;
    private String marca;
    private String tipo;
    private String color;
    private Cliente cliente;    //clienteDni;
    private boolean estado; 

    public Bicicleta(int nroSerie, String marca, String tipo, String color, Cliente clienteDni, boolean estado) {
        this.nroSerie = nroSerie;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.cliente = cliente;
        this.estado = estado;
    }

    public Bicicleta(String marca, String tipo, String color, Cliente clienteDni, boolean estado) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.cliente = cliente;
        this.estado = estado;
    }

    public Bicicleta() {
    }

    public int getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(int nroSerie) {
        this.nroSerie = nroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.nroSerie;
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
        final Bicicleta other = (Bicicleta) obj;
        if (this.nroSerie != other.nroSerie) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "nroSerie=" + nroSerie + ", marca=" + marca + ", tipo=" + tipo + ", color=" + color + ", cliente=" + cliente + ", estado=" + estado + '}';
    }
    

}