package com.tiendaonline.ventas.facturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.tiendaonline.ventas.facturacion.values.FacturaId;
import com.tiendaonline.ventas.facturacion.values.IVA;

public class IvaActualizado extends DomainEvent {

    private final IVA iva;
    private final FacturaId facturaid;

    public IvaActualizado(FacturaId facturaid,IVA iva) {
        super("com.tiendaonline.ventas.facturacion.IvaActualizado");
        this.iva = iva;
        this.facturaid = facturaid;
    }

    public IVA getIva() {
        return iva;
    }

    public FacturaId getFacturaid() {
        return facturaid;
    }
}
