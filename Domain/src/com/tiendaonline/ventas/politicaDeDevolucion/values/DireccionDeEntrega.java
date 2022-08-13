package com.tiendaonline.ventas.politicaDeDevolucion.values;

import co.com.sofka.domain.generic.ValueObject;
import com.tiendaonline.ventas.envio.values.DireccionDeEnvio;

public class DireccionDeEntrega implements ValueObject<DireccionDeEntrega.Props> {
    private final String cuidad;
    private final String direccion;
    private final String departamento;

    public DireccionDeEntrega(String cuidad, String direccion, String departamento) {
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
