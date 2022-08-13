package com.tiendaonline.ventas.politicaDeDevolucion.entities;

import co.com.sofka.domain.generic.Entity;
import com.tiendaonline.ventas.politicaDeDevolucion.values.DireccionDeEntrega;
import com.tiendaonline.ventas.politicaDeDevolucion.values.DireccionDeRecolecta;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticasDeDistribuidorId;

import java.util.Objects;

public class PoliticasDeDistribuidor extends Entity<PoliticasDeDistribuidorId> {
    private DireccionDeEntrega direccionDeEntrega;
    private DireccionDeRecolecta direccionDeRecolecta;

    public PoliticasDeDistribuidor(PoliticasDeDistribuidorId entityId, DireccionDeEntrega direccionDeEntrega, DireccionDeRecolecta direccionDeRecolecta) {
        super(entityId);
        this.direccionDeEntrega = direccionDeEntrega;
        this.direccionDeRecolecta = direccionDeRecolecta;
    }

    public void RedireccionarProducto(DireccionDeEntrega direccionDeEntrega){
        this.direccionDeEntrega = Objects.requireNonNull(direccionDeEntrega);
    }
}
