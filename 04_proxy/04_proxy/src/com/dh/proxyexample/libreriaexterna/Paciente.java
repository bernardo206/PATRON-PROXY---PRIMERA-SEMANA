package com.dh.proxyexample.libreriaexterna;

import java.time.LocalDate;

public class Paciente {

    private String nombre;
    private LocalDate fechaDeVacunación;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeVacunación() {
        return fechaDeVacunación;
    }

    public void setFechaDeVacunación(LocalDate fechaDeVacunación) {
        this.fechaDeVacunación = fechaDeVacunación;
    }
}
