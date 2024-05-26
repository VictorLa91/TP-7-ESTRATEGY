package org.example.ejercicio3;

public class Libro implements CalculadorDePrecios {
    private static double DESCUENTO_POR_ENVIO = 10;
    private static double descuentos = 0.1;
    private static double impuestos = 0.1;
    private double precio;

    public Libro(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        var precioFina0 = precio * (1 + impuestos) * (1 - descuentos);
        if (precio > 100) {
            precioFina0 -= DESCUENTO_POR_ENVIO;
        }
        return precioFina0;
    }
}
