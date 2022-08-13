package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.ValueObject;


public class Precio implements ValueObject<Precio.Props> {
    private final String tipoDeMoneda;
    private final Double monto;

    public Precio(String tipoDeMoneda, Double monto) {
        this.tipoDeMoneda = tipoDeMoneda;
        this.monto = monto;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipoMoneda() {
                return tipoDeMoneda;
            }
            @Override
            public Double valor() {
                return monto;
            }
        };
    }
    public interface Props {
        String tipoMoneda();
        Double valor();
    }
}
