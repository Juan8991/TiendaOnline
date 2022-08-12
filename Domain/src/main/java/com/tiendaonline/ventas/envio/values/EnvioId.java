package com.tiendaonline.ventas.envio.values;

import co.com.sofka.domain.generic.Identity;

public class EnvioId extends Identity {
    private EnvioId(String valor){
        super(valor);
    }

    public EnvioId() {
    }
    public static EnvioId of(String valor) {
        return new EnvioId(valor);
    }
}
