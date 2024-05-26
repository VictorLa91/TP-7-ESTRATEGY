package org.example.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoCorto implements FormatearFecha {
    private LocalDate fechaNacimiento;

    public FormatoCorto(LocalDate fecha) {
        this.fechaNacimiento = fecha;
    }

    public String obtenerFecha() {
        return fechaNacimiento.format(DateTimeFormatter.ofPattern("d-MM-yyyy"));
    }

}
