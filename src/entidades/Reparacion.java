package entidades;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;


public class Reparacion {
    private int id;
    private Servicio servicio;  //servCod;
    private Cliente cliente;    //cliDNI;
    private Bicicleta bici;     //biciSerie;
    private LocalDate fechaEntrada;
    private ArrayList<ItemRep> itemRep;
    private float costoTotal;
    private int estado; //(pendiente 1- resuelto 0 -Entregada 2 - anulada3)

    public Reparacion() {
    }

    public Reparacion(Servicio servicio, Cliente cliente, Bicicleta bici, LocalDate fechaEntrada, ArrayList<ItemRep> itemRep, float costoTotal, int estado) {
        this.servicio = servicio;
        this.cliente = cliente;
        this.bici = bici;
        this.fechaEntrada = fechaEntrada;
        this.itemRep = itemRep;
        this.costoTotal = costoTotal;
        this.estado = estado;
    }

    public Reparacion(int id, Servicio servicio, Cliente cliente, Bicicleta bici, LocalDate fechaEntrada, ArrayList<ItemRep> itemRep, float costoTotal, int estado) {
        this.id = id;
        this.servicio = servicio;
        this.cliente = cliente;
        this.bici = bici;
        this.fechaEntrada = fechaEntrada;
        this.itemRep = itemRep;
        this.costoTotal = costoTotal;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bicicleta getBici() {
        return bici;
    }

    public void setBici(Bicicleta biciSerie) {
        this.bici = biciSerie;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public ArrayList<ItemRep> getItemRep() {
        return itemRep;
    }

    public void setItemRep(ArrayList<ItemRep> itemRep) {
        this.itemRep = itemRep;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
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
        final Reparacion other = (Reparacion) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reparacion: " + "id=" + id + ", servicio=" + servicio + ", cliente=" + cliente + ", biciSerie=" + bici + ", fechaEntrada=" + fechaEntrada + ", costoTotal=" + costoTotal + ", estado=" + estado + '}';
    }
    
    
    
}