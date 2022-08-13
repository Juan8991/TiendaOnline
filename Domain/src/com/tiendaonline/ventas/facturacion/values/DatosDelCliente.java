package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.ValueObject;


public class DatosDelCliente implements ValueObject<DatosDelCliente.Props> {
    private final String nombre;

    private final String telefono;


    public DatosDelCliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String obtenerNombre() {
                return nombre;
            }
            @Override
            public String obtenerTelefono() {
                return telefono;
            }
        };
    }
    public interface Props {
        String obtenerNombre();
        String obtenerTelefono();
    }
}
