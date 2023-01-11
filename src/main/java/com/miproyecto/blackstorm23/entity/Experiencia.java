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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    private String logo;
    
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date inicio;
    
    @Temporal(TemporalType.DATE)
    private Date fin;
    
    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con los requisitos")
    private String puesto;
    
    @NotNull
    @Lob
    private String descripcion;
    
    public Experiencia(){
    }

    public Experiencia(String logo, Date inicio, Date fin, String puesto, String descripcion) {
        this.logo = logo;
        this.inicio = inicio;
        this.fin = fin;
        this.puesto = puesto;
        this.descripcion = descripcion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
