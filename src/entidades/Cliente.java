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
public class Cliente {
    private int dni;
    private String nombre;
    private String domicilio;
    private int tel;
    private boolean estado;

    public Cliente(int dni, String nombre, String domicilio, int tel, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.tel = tel;
        this.estado = estado;
    }

    public Cliente(String nombre, String domicilio, int tel, boolean estado) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.tel = tel;
        this.estado = estado;
    }

    public Cliente() {
    }
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
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
        hash = 23 * hash + this.dni;
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
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", domicilio=" + domicilio + ", tel=" + tel + ", estado=" + estado + '}';
    }
    
}