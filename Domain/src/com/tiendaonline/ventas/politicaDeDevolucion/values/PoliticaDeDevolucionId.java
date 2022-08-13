package com.tiendaonline.ventas.politicaDeDevolucion.values;

import co.com.sofka.domain.generic.Identity;

public class PoliticaDeDevolucionId extends Identity {
    public PoliticaDeDevolucionId() {
    }

    public PoliticaDeDevolucionId(String uuid) {
        super(uuid);
    }

    public static PoliticaDeDevolucionId of (String uuid) {return new PoliticaDeDevolucionId(uuid);}
}
