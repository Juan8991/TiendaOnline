package com.tiendaonline.ventas.politicaDeDevolucion.commands;

import co.com.sofka.domain.generic.Command;
import com.tiendaonline.ventas.politicaDeDevolucion.values.DireccionDeEntrega;
import com.tiendaonline.ventas.politicaDeDevolucion.values.DireccionDeRecolecta;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticasDeDistribuidorId;

public class RedireccionarProductoDePoliticasDeDistribuidor extends Command {
    private final PoliticasDeDistribuidorId politicasDeDistribuidorId;
    private final DireccionDeEntrega direccionDeEntrega;
    private final DireccionDeRecolecta direccionDeRecolecta;


    public RedireccionarProductoDePoliticasDeDistribuidor(PoliticasDeDistribuidorId politicasDeDistribuidorId, DireccionDeEntrega direccionDeEntrega, DireccionDeRecolecta direccionDeRecolecta) {
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
