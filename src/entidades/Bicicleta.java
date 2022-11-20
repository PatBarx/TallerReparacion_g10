/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;



/**
 *
 * @author Usuario
 */
public class Bicicleta {
    private int nroSerie;
    private String marca;
    private String tipo;
    private String color;
    private int dniDuenio;
    private boolean estado; 

    public Bicicleta(int nroSerie, String marca, String tipo, String color, int dniDuenio, boolean estado) {
        this.nroSerie = nroSerie;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.dniDuenio = dniDuenio;
        this.estado = estado;
    }

    public Bicicleta(String marca, String tipo, String color, int dniDuenio, boolean estado) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.dniDuenio = dniDuenio;
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

    public int getDniDuenio() {
        return dniDuenio;
    }

    public void setDniDuenio(int dniDuenio) {
        this.dniDuenio = dniDuenio;
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
        return "Bicicleta{" + "nroSerie=" + nroSerie + ", marca=" + marca + ", tipo=" + tipo + ", color=" + color + ", dniDuenio=" + dniDuenio + ", estado=" + estado + '}';
    }
    

}