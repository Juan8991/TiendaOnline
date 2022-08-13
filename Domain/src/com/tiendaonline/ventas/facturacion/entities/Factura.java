package com.tiendaonline.ventas.facturacion.entities;

import co.com.sofka.domain.generic.Entity;
import com.tiendaonline.ventas.facturacion.values.FacturaId;
import com.tiendaonline.ventas.facturacion.values.IVA;
import com.tiendaonline.ventas.facturacion.values.ValorTotal;

import java.util.Objects;


public class Factura extends Entity<FacturaId> {
    private ValorTotal valorTotal;
    private IVA iva;

    public Factura(FacturaId entityId, ValorTotal valorTotal, IVA iva) {
        super(entityId);
        this.valorTotal = valorTotal;
        this.iva = iva;
    }
    public void ActualizarValorTotal(ValorTotal valorTotal){
        this.valorTotal= Objects.requireNonNull(valorTotal);
    }
    public void ActualizarIVA(IVA iva){
        this.iva= Objects.requireNonNull(iva);
    }
}
