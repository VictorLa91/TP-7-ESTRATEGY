package org.example.ejercicio1;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void testEnvioPorColectivo() {
        var producto1 = new Producto(150, 2);
        var producto2 = new Producto(150, 4);
        var envio = new Envio(5, CiudadDestino.OTRODESTINO, List.of(producto1, producto2));
        var delSur = new ColectivosDelSur();

        assertEquals(envio.enviarPor(delSur), 3800);
    }

    @org.junit.jupiter.api.Test
    public void testEnvioPorCorreo() {
        var producto1 = new Producto(150, 2);
        var producto2 = new Producto(150, 4);
        var envio = new Envio(5, CiudadDestino.BUENOSAIRES, List.of(producto1, producto2));
        var correo = new CorreoArgentino();

        assertEquals(envio.enviarPor(correo), 1100);
    }


}
