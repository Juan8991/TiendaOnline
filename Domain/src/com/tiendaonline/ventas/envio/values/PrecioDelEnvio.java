package com.tiendaonline.ventas.envio.values;

import co.com.sofka.domain.generic.ValueObject;

public class PrecioDelEnvio implements ValueObject<PrecioDelEnvio.Props> {
    private final String tipoDeMoneda;
    private final Double monto;

    public PrecioDelEnvio(String tipoDeMoneda, Double monto) {
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
