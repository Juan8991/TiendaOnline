package com.tiendaonline.ventas.politicaDeDevolucion.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticasInternasId;
import com.tiendaonline.ventas.politicaDeDevolucion.values.Razon;

public class ActualizarRazonDePoliticasInternas extends Command {
    private final PoliticasInternasId politicasInternasId;
    private final Razon razon;

    public ActualizarRazonDePoliticasInternas(PoliticasInternasId politicasInternasId, Razon razon) {
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
