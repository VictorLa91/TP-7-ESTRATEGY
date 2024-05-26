package org.example.ejercicio3;

public class Medicina implements CalculadorDePrecios {
    private static double DESCUENTO_POR_ENVIO = 10;
    private static double descuentos = 0;
    private double precio;

    public Medicina(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        if (precio > 50) {
            descuentos = 0.1;
        }
        var precioFina0 = precio * (1 - descuentos);

        if (precio > 100) {
            precioFina0 -= DESCUENTO_POR_ENVIO;
        }
        return precioFina0;
    }
}
