package com.example.correccionparcial.model;

import com.example.correccionparcial.model.Dispositivo;
import com.example.correccionparcial.model.DispositivoSimple;

public class DispositivoSimpleFactory implements DispositivoFactory {

    private String nombre;
    private boolean activo;
    private int prioridad;

    public DispositivoSimpleFactory(String nombre, boolean activo, int prioridad) {
        this.nombre = nombre;
        this.activo = activo;
        this.prioridad = prioridad;
    }

    @Override
    public Dispositivo crearDispositivo() {
        return new DispositivoSimple(nombre, activo, prioridad);
    }
}