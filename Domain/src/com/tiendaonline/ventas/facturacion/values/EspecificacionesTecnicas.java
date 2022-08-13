package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.ValueObject;

public class EspecificacionesTecnicas implements ValueObject<EspecificacionesTecnicas.Props> {
    private final Double peso;
    private final String dimenciones;

    public EspecificacionesTecnicas(Double peso, String dimenciones) {
        this.peso = peso;
        this.dimenciones = dimenciones;
    }
    @Override
    public Props value() {
        return new Props() {
            @Override
            public Double obtenerPeso() {
                return peso;
            }
            @Override
            public String obtenerDimensiones() {
                return dimenciones;
            }
        };
    }
    public interface Props {
        Double obtenerPeso();
        String obtenerDimensiones();
    }
}
