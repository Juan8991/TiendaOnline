package com.tiendaonline.ventas.politicaDeDevolucion.values;

import co.com.sofka.domain.generic.Identity;

public class PoliticasInternasId extends Identity {

    public PoliticasInternasId() {
    }

    public PoliticasInternasId(String uuid) {
        super(uuid);
    }

    public static PoliticasInternasId of (String uuid) {return new PoliticasInternasId(uuid);}
}
