package com.tiendaonline.ventas.envio.values;

import co.com.sofka.domain.generic.Identity;

public class DistribuidorId extends Identity {
    public DistribuidorId() {
    }

    public DistribuidorId(String uuid) {
        super(uuid);
    }
    public static DistribuidorId of(String uuid){
        return new DistribuidorId(uuid);
    }
}
