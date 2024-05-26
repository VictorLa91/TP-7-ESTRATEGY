package org.example.ejercicio3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        var p1 = new Producto(150);
        var p2 = new Producto(150);
        var p3 = new Producto(150);

        System.out.println(p1.precioFinal(TipoProducto.LIBRO));
        System.out.println(p2.precioFinal(TipoProducto.MEDICINA));
        System.out.println(p3.precioFinal(TipoProducto.ALIMENTO));

    }
}
