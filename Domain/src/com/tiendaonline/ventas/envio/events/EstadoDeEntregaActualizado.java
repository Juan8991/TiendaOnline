package com.tiendaonline.ventas.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.tiendaonline.ventas.envio.values.DistribuidorId;
import com.tiendaonline.ventas.envio.values.TiempoDeEntrega;

public class EstadoDeEntregaActualizado extends DomainEvent {

    private final DistribuidorId distribuidorId;
    private final TiempoDeEntrega tiempoDeEntrega;

    public EstadoDeEntregaActualizado(DistribuidorId distribuidorId, TiempoDeEntrega tiempoDeEntrega) {
       super("com.tiendaonline.ventas.EstadoDeEntregaActualizado");
        this.distribuidorId = distribuidorId;
        this.tiempoDeEntrega = tiempoDeEntrega;
    }

    public DistribuidorId getDistribuidorId() {
        return distribuidorId;
    }

    public TiempoDeEntrega getTiempoDeEntrega() {
        return tiempoDeEntrega;
    }
}
