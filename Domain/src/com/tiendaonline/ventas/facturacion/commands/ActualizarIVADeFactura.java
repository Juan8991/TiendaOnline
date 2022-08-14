package com.tiendaonline.ventas.facturacion.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.facturacion.values.FacturaId;
import com.tiendaonline.ventas.facturacion.values.IVA;

public class ActualizarIVADeFactura extends Command {
    private final IVA iva;
    private final FacturaId facturaid;

    public ActualizarIVADeFactura(IVA iva, FacturaId facturaid) {
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
