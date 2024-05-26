package org.example.ejercicio1;

import java.util.HashMap;

public class CorreoArgentino implements Transporte {
    private HashMap<CiudadDestino, Double> valoresPorCiudad =
            new HashMap();

    public CorreoArgentino() {
        valoresPorCiudad.put(CiudadDestino.CAPITAL, 500.0);
        valoresPorCiudad.put(CiudadDestino.OTRODESTINO, 800.0);
        valoresPorCiudad.put(CiudadDestino.BUENOSAIRES, 800.0);
    }

    @Override
    public double calcularCostoSegunDestino(double peso, CiudadDestino destino) {
        return valoresPorCiudad.get(destino);

    }
}
