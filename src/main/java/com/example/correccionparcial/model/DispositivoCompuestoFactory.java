package com.example.correccionparcial.model;

import com.example.correccionparcial.model.Dispositivo;
import com.example.correccionparcial.model.DispositivoCompuesto;

public class DispositivoCompuestoFactory implements DispositivoFactory {

    private String nombre;

    public DispositivoCompuestoFactory(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Dispositivo crearDispositivo() {
        return new DispositivoCompuesto(nombre);
    }
}