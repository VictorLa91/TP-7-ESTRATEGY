package org.example.ejercicio3;

public class Alimento implements CalculadorDePrecios {
    private static double DESCUENTO_POR_ENVIO = 10;
    private static double descuentos = 0.1;
    private static double impuestos = 0.05;
    private double precio;

    public Alimento(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        if (precio > 100) {
            descuentos = 0.15;
        }
        var precioFina0 = precio * (1 + impuestos) * (1 - descuentos);
        if (precio > 200) {
            precioFina0 -= DESCUENTO_POR_ENVIO;
        }
        return precioFina0;
    }
}