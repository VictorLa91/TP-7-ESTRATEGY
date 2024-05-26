package org.example.ejercicio2;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.Test
    public void testearFechaCorta() {
        LocalDate fecha = LocalDate.of(1990, 5, 15);
        var persona = new Persona(fecha);

        assertEquals(persona.mostrarFechaDeNaciemiento("corta"), "15-05-1990");
    }

    @org.junit.Test
    public void testearFechaLarga() {
        LocalDate fecha = LocalDate.of(1990, 6, 15);
        var persona = new Persona(fecha);

        assertEquals(persona.mostrarFechaDeNaciemiento("larga"), "15 de junio de 1990");

    }
}
