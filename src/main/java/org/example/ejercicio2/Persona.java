package org.example.ejercicio2;

import java.time.LocalDate;
import java.util.HashMap;

public class Persona {
    private LocalDate fechaNacimiento;
    private HashMap<String, FormatearFecha> strategia;

    // Constructor
    public Persona(LocalDate fechaNacimiento) {
        this.strategia = new HashMap<String, FormatearFecha>();
        strategia.put("larga", new FormatoLargo(fechaNacimiento));
        strategia.put("corta", new FormatoCorto(fechaNacimiento));
        this.fechaNacimiento = fechaNacimiento;
    }

    public String mostrarFechaDeNaciemiento(String formato) {
        return this.strategia.get(formato).obtenerFecha();
    }
}

