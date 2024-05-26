package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Envio {
    private List<Producto> listaDeProducto;
    private double pesoTotal;
    private CiudadDestino destino;

    public Envio(double peso, CiudadDestino destino, List<Producto> listaProducto) {
        this.pesoTotal = peso;
        this.destino = destino;
        listaDeProducto = new ArrayList<>();
        listaDeProducto = listaProducto;
    }

    public double enviarPor(Transporte transporte) {
        var pesoTotal = calcularPeso();
        var costo = calcularCostoTotalDeProductos();
        costo += transporte.calcularCostoSegunDestino(pesoTotal, destino);
        return costo;
    }

    private double calcularPeso() {
        double peso = 0;
        for (Producto p : listaDeProducto) {
            peso += p.peso();
        }
        return peso;
    }

    private double calcularCostoTotalDeProductos() {
        double precio = 0;
        for (Producto p : listaDeProducto) {
            precio += p.precio();
        }
        return precio;
    }
}
