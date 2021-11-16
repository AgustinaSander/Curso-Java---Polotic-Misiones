
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    @Id
    private int idCliente;
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencion;
    private String nombreDueno;
    private String celularDueno;
    private String observaciones;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String raza, String color, String alergico, String atencion, String nombreDueno, String celularDueno, String observaciones) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion = atencion;
        this.nombreDueno = nombreDueno;
        this.celularDueno = celularDueno;
        this.observaciones = observaciones;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getCelularDueno() {
        return celularDueno;
    }

    public void setCelularDueno(String celularDueno) {
        this.celularDueno = celularDueno;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
