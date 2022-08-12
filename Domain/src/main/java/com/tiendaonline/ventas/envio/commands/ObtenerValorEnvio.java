package com.tiendaonline.ventas.envio.commands;

import co.com.sofka.domain.generic.Command;

public class ObtenerValorEnvio extends Command {
    private final  EnviosNacionalesId enviosNacionalesId;
    private final PrecioDelEnvio precioDelEnvio;

    public ObtenerValorEnvio(EnviosNacionalesId enviosNacionalesId, PrecioDelEnvio precioDelEnvio) {
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
