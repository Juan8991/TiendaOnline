package com.tiendaonline.ventas.envio.events;

public class EnvioCreado extends DomainEvent {

    private final EnvioId envioId;

    private final DatosDelDestinatario datosDelDestinatario;

    public EnvioCreado(EnvioId envioId, DatosDelDestinatario datosDelDestinatario) {
        super("com.tiendaOnline.ventas.EnvioCreado");

        this.envioId = envioId;
        this.datosDelDestinatario = datosDelDestinatario;


    }

    public EnvioId getEnvioId() {
        return envioId;
    }

    public DatosDelDestinatario getDatosDelDestinatario() {
        return datosDelDestinatario;
    }
}
