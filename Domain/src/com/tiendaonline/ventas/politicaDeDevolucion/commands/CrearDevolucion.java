package com.tiendaonline.ventas.politicaDeDevolucion.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticaDeDevolucionId;

public class CrearDevolucion extends Command {
    private final PoliticaDeDevolucionId politicaDeDevolucionId;

    public CrearDevolucion(PoliticaDeDevolucionId politicaDeDevolucionId) {
        this.politicaDeDevolucionId = politicaDeDevolucionId;
    }

    public PoliticaDeDevolucionId getPoliticaDeDevolucionId() {
        return politicaDeDevolucionId;
    }
}
