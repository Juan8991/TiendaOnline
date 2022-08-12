package com.tiendaonline.ventas.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class TiempoDeEntrega implements ValueObject<TiempoDeEntrega.Props> {
    private final String numeroDeRastreo;
    private final LocalDate fechaEstimadaDeEntrega;
    private final LocalDate fechaDeEntrega;
    private final Boolean estadoDeEntrega;

    public TiempoDeEntrega(String numeroDeRastreo, LocalDate fechaEstimadaDeEntrega, LocalDate fechaDeEntrega, Boolean estadoDeEntrega) {
        this.numeroDeRastreo = numeroDeRastreo;
        this.fechaEstimadaDeEntrega = fechaEstimadaDeEntrega;
        this.fechaDeEntrega = fechaDeEntrega;
        this.estadoDeEntrega = estadoDeEntrega;
    }
    @Override
    public Props value() {
        return new Props() {
            @Override
            public String obtenerNumeroDeRastreo() {
                return numeroDeRastreo;
            }
            @Override
            public LocalDate obtenerFechaEstimadaDeEntrega() {
                return fechaEstimadaDeEntrega;
            }
            @Override
            public LocalDate obtenerFechaDeEntrega() {
                return fechaDeEntrega;
            }
            @Override
            public Boolean obtenerEstadoDeLaEntrega(){
                return estadoDeEntrega;
            }
        };
    }
    public interface Props {
        String obtenerNumeroDeRastreo();
        LocalDate obtenerFechaEstimadaDeEntrega();
        LocalDate obtenerFechaDeEntrega();
        Boolean obtenerEstadoDeLaEntrega();

    }

}
