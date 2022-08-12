package com.tiendaonline.ventas.envio.events;

public class EstadoDeEntregaActualizado extends DomainEvent {

    private final DistribuidorId distribuidorId;
    private final TiempoDeEntrega tiempoDeEntrega;

    public EstadoDeEntregaActualizado(DistribuidorId distribuidorId, TiempoDeEntrega tiempoDeEntrega) {
       super("com.tiendaonline.ventas.EstadoDeEntregaActualizado")
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
