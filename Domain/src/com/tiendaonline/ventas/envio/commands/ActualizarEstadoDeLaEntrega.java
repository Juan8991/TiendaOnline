package com.tiendaonline.ventas.envio.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.envio.values.DistribuidorId;
import com.tiendaonline.ventas.envio.values.TiempoDeEntrega;

public class ActualizarEstadoDeLaEntrega extends Command {
    private final DistribuidorId distribuidorId;
    private final TiempoDeEntrega tiempoDeEntrega;

    public ActualizarEstadoDeLaEntrega(DistribuidorId distribuidorId, TiempoDeEntrega tiempoDeEntrega) {
        this.distribuidorId = distribuidorId;
        this.tiempoDeEntrega = tiempoDeEntrega;
    }

    public DistribuidorId getDistribuidorId() {
        return distribuidorId;
    }

    public Boolean getTiempoDeEntrega() {
        return tiempoDeEntrega.value().obtenerEstadoDeLaEntrega();
    }
}
