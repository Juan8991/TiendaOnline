package com.tiendaonline.ventas.politicaDeDevolucion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticasInternasId;
import com.tiendaonline.ventas.politicaDeDevolucion.values.Razon;

public class RazonDeDevolucionActualizada extends DomainEvent {
    private final PoliticasInternasId politicasInternasId;
    private final Razon razon;

    public RazonDeDevolucionActualizada(PoliticasInternasId politicasInternasId, Razon razon) {
        super("com.tiendaonline.ventas.RazonDeDevolucionActualizada");
        this.politicasInternasId = politicasInternasId;
        this.razon = razon;
    }

    public PoliticasInternasId getPoliticasInternasId() {
        return politicasInternasId;
    }

    public Razon getRazon() {
        return razon;
    }
}
