package com.tiendaonline.ventas.politicaDeDevolucion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.tiendaonline.ventas.envio.events.EnvioCreado;
import com.tiendaonline.ventas.politicaDeDevolucion.entities.PoliticasDeDistribuidor;
import com.tiendaonline.ventas.politicaDeDevolucion.entities.PoliticasInternas;
import com.tiendaonline.ventas.politicaDeDevolucion.events.DevolucionCreada;
import com.tiendaonline.ventas.politicaDeDevolucion.events.ProductoRedireccionado;
import com.tiendaonline.ventas.politicaDeDevolucion.events.RazonDeDevolucionActualizada;
import com.tiendaonline.ventas.politicaDeDevolucion.values.DireccionDeEntrega;
import com.tiendaonline.ventas.politicaDeDevolucion.values.DireccionDeRecolecta;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticaDeDevolucionId;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticasDeDistribuidorId;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticasInternasId;
import com.tiendaonline.ventas.politicaDeDevolucion.values.Razon;

import java.util.Objects;

public class PoliticaDeDevolucion extends AggregateEvent<PoliticaDeDevolucionId> {

    protected PoliticasInternas politicasInternas;

    protected PoliticasDeDistribuidor politicasDeDistribuidor;


    public PoliticaDeDevolucion(PoliticaDeDevolucionId entityId, PoliticasInternas politicasInternas, PoliticasDeDistribuidor politicasDeDistribuidor) {
        super(entityId);
        this.politicasInternas = politicasInternas;
        this.politicasDeDistribuidor = politicasDeDistribuidor;
    }
    public void CrearDevolucion(PoliticaDeDevolucionId politicaDeDevolucionId){
        Objects.requireNonNull(politicaDeDevolucionId);
        appendChange(new DevolucionCreada(politicaDeDevolucionId));
    }
    public void RedireccionarProducto(PoliticasDeDistribuidorId politicasDeDistribuidorId, DireccionDeEntrega direccionDeEntrega, DireccionDeRecolecta direccionDeRecolecta){
        Objects.requireNonNull(politicasDeDistribuidorId);
        Objects.requireNonNull(direccionDeEntrega);
        Objects.requireNonNull(direccionDeRecolecta);
        appendChange(new ProductoRedireccionado(politicasDeDistribuidorId,direccionDeEntrega,direccionDeRecolecta) );
    }
    public void ActualizarRazon(PoliticasInternasId politicasInternasId, Razon razon){
        Objects.requireNonNull(politicasInternasId);
        Objects.requireNonNull(razon);
        appendChange(new RazonDeDevolucionActualizada(politicasInternasId,razon));
    }
}
