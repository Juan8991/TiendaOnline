package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.Identity;

public class FormadePagoId extends Identity {
    public FormadePagoId(String uuid) {
        super(uuid);
    }

    public FormadePagoId() {

    }
    public static FormadePagoId of(String uuid) {
        return new FormadePagoId(uuid);
    }
}
