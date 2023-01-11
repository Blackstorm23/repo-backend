package com.miproyecto.blackstorm23.security.controller;

public class Mensaje {
    private String mensaje;
    
    //Contructor

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //Getters and Setters

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    } 
}