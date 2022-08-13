package com.tiendaonline.ventas.politicaDeDevolucion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticaDeDevolucionId;

public class DevolucionCreada extends DomainEvent {
    private final PoliticaDeDevolucionId politicaDeDevolucionId;

    public DevolucionCreada(PoliticaDeDevolucionId politicaDeDevolucionId) {
        super("com.tiendaonline.ventas.DevolucionCreada");
        this.politicaDeDevolucionId = politicaDeDevolucionId;
    }

    public PoliticaDeDevolucionId getPoliticaDeDevolucionId() {
        return politicaDeDevolucionId;
    }
}
