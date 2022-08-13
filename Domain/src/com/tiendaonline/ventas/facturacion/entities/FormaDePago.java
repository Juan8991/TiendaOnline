package com.tiendaonline.ventas.facturacion.entities;

import co.com.sofka.domain.generic.Entity;
import com.tiendaonline.ventas.facturacion.values.FormadePagoId;
import com.tiendaonline.ventas.facturacion.values.TarjetaCredito;
import com.tiendaonline.ventas.facturacion.values.TarjetaDebito;

import java.util.Objects;

public class FormaDePago extends Entity<FormadePagoId> {
    private TarjetaCredito tarjetaCredito;
    private TarjetaDebito tarjetaDebito;

    public FormaDePago(FormadePagoId entityId, TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito) {
        super(entityId);
        this.tarjetaCredito = tarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
    }
    public void ActualizarNumeroDeTarjetaCredito(TarjetaCredito tarjetaCredito){
        this.tarjetaCredito = Objects.requireNonNull(tarjetaCredito);

    }
}
