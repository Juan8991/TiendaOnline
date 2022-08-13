package com.tiendaonline.ventas.envio.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.envio.values.EnviosNacionalesId;
import com.tiendaonline.ventas.envio.values.PrecioDelEnvio;

public class ObtenerValorEnvioDeEnviosNacionales extends Command {
    private final EnviosNacionalesId enviosNacionalesId;
    private final PrecioDelEnvio precioDelEnvio;

    public ObtenerValorEnvioDeEnviosNacionales(EnviosNacionalesId enviosNacionalesId, PrecioDelEnvio precioDelEnvio) {
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
