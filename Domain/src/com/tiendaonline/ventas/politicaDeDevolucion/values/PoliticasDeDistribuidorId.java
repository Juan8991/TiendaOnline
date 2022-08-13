package com.tiendaonline.ventas.politicaDeDevolucion.values;

import co.com.sofka.domain.generic.Identity;

public class PoliticasDeDistribuidorId extends Identity
{
    public PoliticasDeDistribuidorId(String uuid) {
        super(uuid);
    }

    public PoliticasDeDistribuidorId() {
    }

    public static PoliticasDeDistribuidorId of (String uuid) {return new PoliticasDeDistribuidorId(uuid);}

}
