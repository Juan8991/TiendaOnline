package com.tiendaonline.ventas.envio.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.envio.values.DatosDelDestinatario;
import com.tiendaonline.ventas.envio.values.EnvioId;

public class CrearEnvio extends Command {

    private final EnvioId envioId;

    private final DatosDelDestinatario datosDelDestinatario;

    public CrearEnvio(EnvioId envioId, DatosDelDestinatario datosDelDestinatario) {
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
