package com.tiendaonline.ventas.politicaDeDevolucion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.tiendaonline.ventas.politicaDeDevolucion.entities.PoliticasDeDistribuidor;
import com.tiendaonline.ventas.politicaDeDevolucion.entities.PoliticasInternas;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticaDeDevolucionId;

public class PoliticaDeDevolucion extends AggregateEvent<PoliticaDeDevolucionId> {

    protected PoliticasInternas politicasInternas;

    protected PoliticasDeDistribuidor politicasDeDistribuidor;


    public PoliticaDeDevolucion(PoliticaDeDevolucionId entityId, PoliticasInternas politicasInternas, PoliticasDeDistribuidor politicasDeDistribuidor) {
        super(entityId);
        this.politicasInternas = politicasInternas;
        this.politicasDeDistribuidor = politicasDeDistribuidor;
    }
}
