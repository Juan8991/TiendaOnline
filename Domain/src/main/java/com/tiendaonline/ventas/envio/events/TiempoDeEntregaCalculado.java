package com.tiendaonline.ventas.envio.events;

public class TiempoDeEntregaCalculado extends DomainEvent {
    private final DistribuidorId distribuidorId;
    private final DireccionDeEnvio direccionDeEnvio;

    public TiempoDeEntregaCalculado(DistribuidorId distribuidorId, DireccionDeEnvio direccionDeEnvio) {
        super("com.tiendaonline.ventas.TiempoDeEntregaCalculado")
        this.distribuidorId = distribuidorId;
        this.direccionDeEnvio = direccionDeEnvio;
    }

    public DistribuidorId getDistribuidorId() {
        return distribuidorId;
    }

    public DireccionDeEnvio getDireccionDeEnvio() {
        return direccionDeEnvio;
    }
}
