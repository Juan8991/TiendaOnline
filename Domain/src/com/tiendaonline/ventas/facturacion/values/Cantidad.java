package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.ValueObject;

public class Cantidad implements ValueObject<Integer> {
    private final Integer cantidad;


    public Cantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public Integer value() {
        return cantidad;
    }
}
