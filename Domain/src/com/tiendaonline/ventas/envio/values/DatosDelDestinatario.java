package com.tiendaonline.ventas.envio.values;

import co.com.sofka.domain.generic.ValueObject;

public class DatosDelDestinatario implements ValueObject<DatosDelDestinatario.Props> {

    private final String nombre;

    private final String telefono;


    public DatosDelDestinatario(String nombre, String telefono) {
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
