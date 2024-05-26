package org.example.ejercicio1;

import java.util.HashMap;

public class ColectivosDelSur implements Transporte {
    private HashMap<CiudadDestino, Double> valoresPorCiudad = new HashMap();

    public ColectivosDelSur() {
        valoresPorCiudad.put(CiudadDestino.CAPITAL, 1000.0);
        valoresPorCiudad.put(CiudadDestino.BUENOSAIRES, 1500.0);
        valoresPorCiudad.put(CiudadDestino.OTRODESTINO, 3000.0);
    }

    @Override
    public double calcularCostoSegunDestino(double peso, CiudadDestino destino) {
        double costoTotal = valoresPorCiudad.get(destino);
        if (peso > 5 && peso < 30)
            costoTotal += 500;
        if (peso > 30)
            costoTotal += 200;

        return costoTotal;

    }
}
