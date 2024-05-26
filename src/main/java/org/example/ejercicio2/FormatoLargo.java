package org.example.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoLargo implements FormatearFecha {
    private LocalDate fechaNacimiento;

    public FormatoLargo(LocalDate fecha) {
        this.fechaNacimiento = fecha;
    }

    public String obtenerFecha() {
        return fechaNacimiento.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy"));
    }
}
