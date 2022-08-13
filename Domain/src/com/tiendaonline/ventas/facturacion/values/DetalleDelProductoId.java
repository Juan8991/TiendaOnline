package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.Identity;

public class DetalleDelProductoId extends Identity {
    public DetalleDelProductoId(String uuid) {
        super(uuid);
    }

    public DetalleDelProductoId() {
    }
    public static DetalleDelProductoId of(String uuid) {
        return new DetalleDelProductoId(uuid);
    }
}
