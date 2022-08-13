package com.tiendaonline.ventas.politicaDeDevolucion.entities;

import co.com.sofka.domain.generic.Entity;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticasInternasId;
import com.tiendaonline.ventas.politicaDeDevolucion.values.Razon;

import java.util.Objects;

public class PoliticasInternas extends Entity<PoliticasInternasId> {

    private Razon razon;

    public PoliticasInternas(PoliticasInternasId entityId, Razon razon) {
        super(entityId);
        this.razon = razon;
    }


    public void ActualizarRazonDeDevolucion(Razon razon) {
        this.razon = Objects.requireNonNull(razon);
    }

}
