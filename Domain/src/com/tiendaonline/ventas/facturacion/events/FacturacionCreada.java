package com.tiendaonline.ventas.facturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.tiendaonline.ventas.facturacion.values.DatosDelCliente;
import com.tiendaonline.ventas.facturacion.values.FacturacionId;

public class FacturacionCreada extends DomainEvent {

    private final FacturacionId facturacionId;
    private final DatosDelCliente datosDelCliente;

    public FacturacionCreada(FacturacionId facturacionId, DatosDelCliente datosDelCliente) {
        super("com.tiendaonline.ventas.facturacion.FacturacionCreada");
        this.facturacionId = facturacionId;
        this.datosDelCliente = datosDelCliente;
    }

    public FacturacionId getFacturacionId() {
        return facturacionId;
    }

    public DatosDelCliente getDatosDelCliente() {
        return datosDelCliente;
    }
}
