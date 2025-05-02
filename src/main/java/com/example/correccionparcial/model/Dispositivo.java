package com.example.correccionparcial.model;

/**
 * Interfaz común para dispositivos de seguridad.
 */
public interface Dispositivo {
    public String estado();
    public int prioridad();
    public String tipo();
}