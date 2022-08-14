package com.tiendaonline.ventas.facturacion.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.facturacion.values.DatosDelCliente;
import com.tiendaonline.ventas.facturacion.values.FacturacionId;

public class CrearFacturacion extends  Command {

    private final FacturacionId facturacionId;
    private final DatosDelCliente datosDelCliente;

    public CrearFacturacion(FacturacionId facturacionId, DatosDelCliente datosDelCliente) {
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
