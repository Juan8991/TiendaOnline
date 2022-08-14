package com.tiendaonline.ventas.facturacion.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.envio.values.DistribuidorId;
import com.tiendaonline.ventas.facturacion.values.FormadePagoId;
import com.tiendaonline.ventas.facturacion.values.TarjetaCredito;

public class ActualizarNumeroDeTarjetaCreditoDeFormaDePago extends Command {

    private final TarjetaCredito tarjetaCredito;
    private final FormadePagoId formadePagoId;

    public ActualizarNumeroDeTarjetaCreditoDeFormaDePago(TarjetaCredito tarjetaCredito, FormadePagoId formadePagoId) {
        this.tarjetaCredito = tarjetaCredito;
        this.formadePagoId = formadePagoId;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public FormadePagoId getFormadePagoId() {
        return formadePagoId;
    }
}
