package com.tiendaonline.ventas.politicaDeDevolucion.values;

import co.com.sofka.domain.generic.ValueObject;

public class Razon implements ValueObject<String> {

    private final String razon;

    public Razon(String razon) {
        this.razon = razon;
    }
    @Override
    public String value() {
        return razon;
    }
}
