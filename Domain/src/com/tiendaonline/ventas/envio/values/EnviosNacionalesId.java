package com.tiendaonline.ventas.envio.values;

import co.com.sofka.domain.generic.Identity;

public class EnviosNacionalesId extends Identity {
    public EnviosNacionalesId(String uuid) {
        super(uuid);
    }

    public EnviosNacionalesId() {
    }
    public static EnviosNacionalesId of(String uuid){
        return new EnviosNacionalesId(uuid);
    }
}
