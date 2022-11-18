
package entidades;


public class Bicicleta {
  private int id;
   private int numeroSerie;
   private String marca;
   private String Tipo;
   private String color;
   private Cliente clienteDni;
   private boolean estado;

    public Bicicleta() {
    }

    public Bicicleta(int numeroSerie, String marca, String Tipo, String color, Cliente clienteDni, boolean estado) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.Tipo = Tipo;
        this.color = color;
        this.clienteDni = clienteDni;
        this.estado = estado;
    }

    public Bicicleta(int id, int numeroSerie, String marca, String Tipo, String color, Cliente clienteDni, boolean estado) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.Tipo = Tipo;
        this.color = color;
        this.clienteDni = clienteDni;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cliente getClienteDni() {
        return clienteDni;
    }

    public void setClienteDni(Cliente clienteDni) {
        this.clienteDni = clienteDni;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "id=" + id + ", numeroSerie=" + numeroSerie + ", marca=" + marca + ", Tipo=" + Tipo + ", color=" + color + ", clienteDni=" + clienteDni + ", estado=" + estado + '}';
    }

     
}
