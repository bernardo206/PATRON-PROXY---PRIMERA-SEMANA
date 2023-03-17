package com.dh.proxyexample.app.main;

import com.dh.proxyexample.app.proxy.RegistradorDeVacunaProxy;
import com.dh.proxyexample.libreriaexterna.Paciente;
import com.dh.proxyexample.libreriaexterna.RegistradorDeVacunas;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        RegistradorDeVacunas vacunador = new RegistradorDeVacunaProxy();
        Paciente p = new Paciente();

        p.setNombre("Marcos");
        p.setFechaDeVacunación(LocalDate.of(2023, 2, 15));

        vacunador.vacunar(p);
    }
}
