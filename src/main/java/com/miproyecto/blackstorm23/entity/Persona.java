package com.miproyecto.blackstorm23.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Persona {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
   @NotNull
   @Size(min = 1, max = 10, message = "no cumple con los requisitos")
    private String name;
 
   @NotNull
   @Size(min = 1, max = 30, message = "no cumple con los requisitos")
    private String frase;
   
   @NotNull
    private String banner;
   
   @NotNull
    private String image;
    
   @NotNull
   @Size(min = 1, max = 45, message = "no cumple con los requisitos")
    private String title;

   @NotNull
   @Lob
    private String descripcion; 
    
    public Persona(){
    }

    public Persona(String name, String frase, String banner, String image, String title, String descripcion) {
        this.name = name;
        this.frase = frase;
        this.banner = banner;
        this.image = image;
        this.title = title;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
