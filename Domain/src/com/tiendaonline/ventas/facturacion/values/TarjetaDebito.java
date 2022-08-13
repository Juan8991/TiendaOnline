package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.ValueObject;

public class TarjetaDebito implements ValueObject<TarjetaDebito.Props> {
    private final String titularDeLaTarjeta;
    private final String numeroDeLaTarjeta;
    private final String cV;
    private final String fechaDeExpiracion;

    public TarjetaDebito(String titularDeLaTarjeta, String numeroDeLaTarjeta, String cV, String fechaDeExpiracion) {
        this.titularDeLaTarjeta = titularDeLaTarjeta;
        this.numeroDeLaTarjeta = numeroDeLaTarjeta;
        this.cV = cV;
        this.fechaDeExpiracion = fechaDeExpiracion;
    }
    @Override
    public Props value() {
        return new Props() {
            @Override
            public String obtenerTitular() {
                return titularDeLaTarjeta;
            }
            @Override
            public String obtenerNumeroDeTarjeta() {
                return numeroDeLaTarjeta;
            }
            @Override
            public String obtenerCV() {
                return cV;
            }
            @Override
            public String obtenerFechaDeExpiracion() {
                return fechaDeExpiracion;
            }
        };
    }
    public interface Props {
        String obtenerTitular();
        String obtenerNumeroDeTarjeta();
        String obtenerCV();
        String obtenerFechaDeExpiracion();

    }
}
