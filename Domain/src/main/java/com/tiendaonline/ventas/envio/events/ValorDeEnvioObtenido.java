package com.tiendaonline.ventas.envio.events;

public class ValorDeEnvioObtenido extends DomainEvent {

    private final  EnviosNacionalesId enviosNacionalesId;
    private final PrecioDelEnvio precioDelEnvio;

    public ValorDeEnvioObtenido(EnviosNacionalesId enviosNacionalesId, PrecioDelEnvio precioDelEnvio) {
        super("com.tiendaonline.ventas.ValorDeEnvioObtenido")
        this.enviosNacionalesId = enviosNacionalesId;
        this.precioDelEnvio = precioDelEnvio;
    }

    public EnviosNacionalesId getEnviosNacionalesId() {
        return enviosNacionalesId;
    }

    public PrecioDelEnvio getPrecioDelEnvio() {
        return precioDelEnvio;
    }
}
