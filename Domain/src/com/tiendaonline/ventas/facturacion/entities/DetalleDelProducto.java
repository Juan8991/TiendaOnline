package com.tiendaonline.ventas.facturacion.entities;

import co.com.sofka.domain.generic.Entity;
import com.tiendaonline.ventas.facturacion.values.Cantidad;
import com.tiendaonline.ventas.facturacion.values.DetalleDelProductoId;
import com.tiendaonline.ventas.facturacion.values.EspecificacionesTecnicas;
import com.tiendaonline.ventas.facturacion.values.Precio;

import java.util.Objects;

public class DetalleDelProducto extends Entity<DetalleDelProductoId> {
    private Precio precio;
    private Cantidad cantidad;
    private EspecificacionesTecnicas especificacionesTecnicas;

    public DetalleDelProducto(DetalleDelProductoId entityId, Precio precio, Cantidad cantidad, EspecificacionesTecnicas especificacionesTecnicas) {
        super(entityId);
        this.precio = precio;
        this.cantidad = cantidad;
        this.especificacionesTecnicas = especificacionesTecnicas;
    }
    public void ActualizarCantidad(Cantidad cantidad){
        this.cantidad= Objects.requireNonNull(cantidad);
    }


}
