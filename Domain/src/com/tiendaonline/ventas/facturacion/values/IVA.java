package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.ValueObject;

public class IVA implements ValueObject<Double> {
    private final Double iva;


    public IVA(Double iva) {
        this.iva = iva;
    }

    @Override
    public Double value() {
        return iva;
    }
}
