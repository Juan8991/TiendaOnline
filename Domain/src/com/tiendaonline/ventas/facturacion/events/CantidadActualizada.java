package com.tiendaonline.ventas.facturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.tiendaonline.ventas.facturacion.values.Cantidad;
import com.tiendaonline.ventas.facturacion.values.DetalleDelProductoId;
import com.tiendaonline.ventas.facturacion.values.EspecificacionesTecnicas;

public class CantidadActualizada extends DomainEvent {

    private final DetalleDelProductoId detalleDelProductoId;
    private final EspecificacionesTecnicas especificacionesTecnicas;
    private final Cantidad cantidad;



    public CantidadActualizada(DetalleDelProductoId detalleDelProductoId, EspecificacionesTecnicas especificacionesTecnicas, Cantidad cantidad) {
        super("com.tiendaonline.ventas.facturacion.CantidadActualizada");
        this.detalleDelProductoId = detalleDelProductoId;
        this.especificacionesTecnicas = especificacionesTecnicas;
        this.cantidad = cantidad;
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
