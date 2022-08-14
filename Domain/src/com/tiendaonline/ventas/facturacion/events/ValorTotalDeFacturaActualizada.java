package com.tiendaonline.ventas.facturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.tiendaonline.ventas.facturacion.values.FacturaId;
import com.tiendaonline.ventas.facturacion.values.IVA;
import com.tiendaonline.ventas.facturacion.values.ValorTotal;

public class ValorTotalDeFacturaActualizada extends DomainEvent {

    private final FacturaId facturaId;
    private final IVA iva;
    private final ValorTotal valorTotal;

    public ValorTotalDeFacturaActualizada(FacturaId facturaId, IVA iva, ValorTotal valorTotal) {
        super("com.tiendaonline.ventas.facturacion.ValorTotalDeFacturaActualizada");
        this.facturaId = facturaId;
        this.iva = iva;
        this.valorTotal = valorTotal;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public IVA getIva() {
        return iva;
    }

    public ValorTotal getValorTotal() {
        return valorTotal;
    }
}
