package com.tiendaonline.ventas.envio;

import co.com.sofka.domain.generic.AggregateEvent;
import com.tiendaonline.ventas.envio.entities.Distribuidor;
import com.tiendaonline.ventas.envio.entities.EnviosNacionales;
import com.tiendaonline.ventas.envio.values.EnvioId;

public class Envios extends AggregateEvent<EnvioId> {
    protected Distribuidor distribuidor;
    protected EnviosNacionales enviosNacionales;

    public Envios(EnvioId envioId) {
        super(envioId);
    }
}
