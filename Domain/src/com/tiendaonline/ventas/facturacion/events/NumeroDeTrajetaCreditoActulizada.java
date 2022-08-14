package com.tiendaonline.ventas.facturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.tiendaonline.ventas.facturacion.values.FormadePagoId;
import com.tiendaonline.ventas.facturacion.values.TarjetaCredito;

public class NumeroDeTrajetaCreditoActulizada extends DomainEvent {

    private final FormadePagoId formadePagoId;
    private final TarjetaCredito tarjetaCredito;


    public NumeroDeTrajetaCreditoActulizada(FormadePagoId formadePagoId,TarjetaCredito tarjetaCredito) {
        super("com.tiendaonline.ventas.facturacion.NumeroDeTrajetaCreditoActulizada");
        this.tarjetaCredito = tarjetaCredito;
        this.formadePagoId = formadePagoId;
    }

    public FormadePagoId getFormadePagoId() {
        return formadePagoId;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }
}
