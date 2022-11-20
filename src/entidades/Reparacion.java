package entidades;

import java.sql.Date;

/**
 * @author Grupo10
 */
class Reparacion {
    private int id;
    private Servicio servCod;
    private Cliente cliDNI;
    private Bicicleta biciSerie;
    private Date fechaEntrada;
    private float costoTotal;
    private int estado; //(pendiente 1- resuelto 0 -Entregada 2 - anulada3)

    public Reparacion() {
    }

    public Reparacion(Servicio servCod, Cliente cliDNI, Bicicleta biciSerie, Date fechaEntrada, float costoTotal, int estado) {
        this.servCod = servCod;
        this.cliDNI = cliDNI;
        this.biciSerie = biciSerie;
        this.fechaEntrada = fechaEntrada;
        this.costoTotal = costoTotal;
        this.estado = estado;
    }

    public Reparacion(int id, Servicio servCod, Cliente cliDNI, Bicicleta biciSerie, Date fechaEntrada, float costoTotal, int estado) {
        this.id = id;
        this.servCod = servCod;
        this.cliDNI = cliDNI;
        this.biciSerie = biciSerie;
        this.fechaEntrada = fechaEntrada;
        this.costoTotal = costoTotal;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servicio getServCod() {
        return servCod;
    }

    public void setServCod(Servicio servCod) {
        this.servCod = servCod;
    }

    public Cliente getCliDNI() {
        return cliDNI;
    }

    public void setCliDNI(Cliente cliDNI) {
        this.cliDNI = cliDNI;
    }

    public Bicicleta getBiciSerie() {
        return biciSerie;
    }

    public void setBiciSerie(Bicicleta biciSerie) {
        this.biciSerie = biciSerie;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
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
        return "Reparacion: " + "id=" + id + ", servCod=" + servCod + ", cliDNI=" + cliDNI + ", biciSerie=" + biciSerie + ", fechaEntrada=" + fechaEntrada + ", costoTotal=" + costoTotal + ", estado=" + estado + '}';
    }
    
    
    
}
