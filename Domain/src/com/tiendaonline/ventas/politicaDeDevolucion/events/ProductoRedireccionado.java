package com.tiendaonline.ventas.politicaDeDevolucion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.tiendaonline.ventas.politicaDeDevolucion.values.DireccionDeEntrega;
import com.tiendaonline.ventas.politicaDeDevolucion.values.DireccionDeRecolecta;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticasDeDistribuidorId;

public class ProductoRedireccionado extends DomainEvent {
    private final PoliticasDeDistribuidorId politicasDeDistribuidorId;
    private final DireccionDeEntrega direccionDeEntrega;
    private final DireccionDeRecolecta direccionDeRecolecta;


    public ProductoRedireccionado(PoliticasDeDistribuidorId politicasDeDistribuidorId, DireccionDeEntrega direccionDeEntrega, DireccionDeRecolecta direccionDeRecolecta) {
        super("com.tiendaonline.ventas.ProductoRedireccionado");
        this.politicasDeDistribuidorId = politicasDeDistribuidorId;
        this.direccionDeEntrega = direccionDeEntrega;
        this.direccionDeRecolecta = direccionDeRecolecta;
    }

    public PoliticasDeDistribuidorId getPoliticasDeDistribuidorId() {
        return politicasDeDistribuidorId;
    }

    public DireccionDeEntrega getDireccionDeEntrega() {
        return direccionDeEntrega;
    }

    public DireccionDeRecolecta getDireccionDeRecolecta() {
        return direccionDeRecolecta;
    }
}
