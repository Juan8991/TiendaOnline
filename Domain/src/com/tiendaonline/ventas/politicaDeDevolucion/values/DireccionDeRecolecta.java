package com.tiendaonline.ventas.politicaDeDevolucion.values;

import co.com.sofka.domain.generic.ValueObject;

public class DireccionDeRecolecta implements ValueObject<DireccionDeRecolecta.Props> {
    private final String cuidad;
    private final String direccion;
    private final String departamento;

    public DireccionDeRecolecta(String cuidad, String direccion, String departamento) {
        this.cuidad = cuidad;
        this.direccion = direccion;
        this.departamento = departamento;
    }
    @Override
    public Props value() {
        return new Props() {
            @Override
            public String obtenerCuidad() {
                return cuidad;
            }
            @Override
            public String obtenerDepartamento() {
                return departamento;
            }
            @Override
            public String obtenerDireccion() {
                return direccion;
            }
        };
    }
    public interface Props {
        String obtenerCuidad();
        String obtenerDepartamento();
        String obtenerDireccion();
    }
}
