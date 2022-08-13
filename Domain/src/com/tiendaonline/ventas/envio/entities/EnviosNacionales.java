package com.tiendaonline.ventas.envio.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import com.tiendaonline.ventas.envio.values.EnviosNacionalesId;

public class EnviosNacionales extends AggregateEvent<EnviosNacionalesId> {
    public EnviosNacionales(EnviosNacionalesId entityId) {
        super(entityId);
    }
}
