package com.miproyecto.blackstorm23.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    private String url;
    
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date fecha;
    
    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con los requisitos")
    private String nombreproyec;
    
    @NotNull
    @Lob
    private String descripcion;

    public Proyectos() {
    }

    public Proyectos(String url, Date fecha, String nombreproyec, String descripcion) {
        this.url = url;
        this.fecha = fecha;
        this.nombreproyec = nombreproyec;
        this.descripcion = descripcion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreproyec() {
        return nombreproyec;
    }

    public void setNombreproyec(String nombreproyec) {
        this.nombreproyec = nombreproyec;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
