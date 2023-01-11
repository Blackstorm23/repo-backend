package com.miproyecto.blackstorm23.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Estudios {
    
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
    private String nombreInstituto;
    
    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con los requisitos")
    private String titulo;

    public Estudios() {
    }

    public Estudios(String logo, Date inicio, Date fin, String nombreInstituto, String titulo) {
        this.logo = logo;
        this.inicio = inicio;
        this.fin = fin;
        this.nombreInstituto = nombreInstituto;
        this.titulo = titulo;
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

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
