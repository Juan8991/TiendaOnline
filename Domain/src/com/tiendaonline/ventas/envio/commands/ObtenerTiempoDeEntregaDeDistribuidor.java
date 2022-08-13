package com.tiendaonline.ventas.envio.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.envio.values.DistribuidorId;
import com.tiendaonline.ventas.envio.values.TiempoDeEntrega;

public class ObtenerTiempoDeEntregaDeDistribuidor extends Command {

    private final DistribuidorId distribuidorId;
    private final TiempoDeEntrega tiempoDeEntrega;

    public ObtenerTiempoDeEntregaDeDistribuidor(DistribuidorId distribuidorId, TiempoDeEntrega tiempoDeEntrega) {
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
