package org.example.ejercicio3;

import java.util.HashMap;

class Producto {
    private TipoProducto tipo;
    private double precio;
    private HashMap<TipoProducto, CalculadorDePrecios> estrategia;


    public Producto(double precio) {
        estrategia = new HashMap<>();
        estrategia.put(TipoProducto.MEDICINA, new Medicina(precio));
        estrategia.put(TipoProducto.LIBRO, new Libro(precio));
        estrategia.put(TipoProducto.ALIMENTO, new Alimento(precio));
        this.tipo = tipo;
        this.precio = precio;
    }

    public double precioFinal(TipoProducto tipo) {
        return estrategia.get(tipo).calcularPrecio();
    }
}
