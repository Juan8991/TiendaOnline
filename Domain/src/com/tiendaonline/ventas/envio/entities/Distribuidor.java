package com.tiendaonline.ventas.envio.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import com.tiendaonline.ventas.envio.values.DistribuidorId;

public class Distribuidor extends AggregateEvent<DistribuidorId> {
    public Distribuidor(DistribuidorId entityId) {
        super(entityId);
    }
}
