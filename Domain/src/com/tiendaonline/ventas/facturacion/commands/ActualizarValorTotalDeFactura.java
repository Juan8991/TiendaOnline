package com.tiendaonline.ventas.facturacion.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.facturacion.values.FacturaId;
import com.tiendaonline.ventas.facturacion.values.IVA;
import com.tiendaonline.ventas.facturacion.values.ValorTotal;

public class ActualizarValorTotalDeFactura extends Command {
    private final FacturaId facturaId;
    private final IVA iva;
    private final ValorTotal valorTotal;

    public ActualizarValorTotalDeFactura(FacturaId facturaId, IVA iva, ValorTotal valorTotal) {
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
