package com.tiendaonline.ventas.envio.commands;

import co.com.sofka.domain.generic.Command;

public class CalcularTiempoDeEntrega extends Command {

    private final DistribuidorId distribuidorId;
    private final DireccionDeEnvio direccionDeEnvio;

    public CalcularTiempoDeEntrega(DistribuidorId distribuidorId, DireccionDeEnvio direccionDeEnvio) {
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
