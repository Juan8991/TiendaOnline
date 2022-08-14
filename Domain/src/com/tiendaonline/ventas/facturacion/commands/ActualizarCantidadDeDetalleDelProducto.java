package com.tiendaonline.ventas.facturacion.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.facturacion.values.Cantidad;
import com.tiendaonline.ventas.facturacion.values.DetalleDelProductoId;
import com.tiendaonline.ventas.facturacion.values.EspecificacionesTecnicas;

public class ActualizarCantidadDeDetalleDelProducto extends Command {
    private final Cantidad cantidad;
    private final EspecificacionesTecnicas especificacionesTecnicas;
    private final DetalleDelProductoId detalleDelProductoId;

    public ActualizarCantidadDeDetalleDelProducto(Cantidad cantidad, EspecificacionesTecnicas especificacionesTecnicas, DetalleDelProductoId detalleDelProductoId) {
        this.cantidad = cantidad;
        this.especificacionesTecnicas = especificacionesTecnicas;
        this.detalleDelProductoId = detalleDelProductoId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public EspecificacionesTecnicas getEspecificacionesTecnicas() {
        return especificacionesTecnicas;
    }

    public DetalleDelProductoId getDetalleDelProductoId() {
        return detalleDelProductoId;
    }
}
