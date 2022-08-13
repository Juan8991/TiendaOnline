package com.tiendaonline.ventas.envio.entities;

import co.com.sofka.domain.generic.Entity;
import com.tiendaonline.ventas.envio.values.DistribuidorId;
import com.tiendaonline.ventas.envio.values.InformacionDeLaEmpresa;
import com.tiendaonline.ventas.envio.values.TiempoDeEntrega;

import java.util.Objects;

public class Distribuidor extends Entity<DistribuidorId> {
    private TiempoDeEntrega tiempoDeEntrega;
    private InformacionDeLaEmpresa informacionDeLaEmpresa;
    public Distribuidor(DistribuidorId entityId, TiempoDeEntrega tiempoDeEntrega, InformacionDeLaEmpresa informacionDeLaEmpresa) {
        super(entityId);
        this.informacionDeLaEmpresa= informacionDeLaEmpresa;
        this.tiempoDeEntrega=tiempoDeEntrega;
    }
    public TiempoDeEntrega tiempoDeEntrega(){
        return tiempoDeEntrega;
    }
    public InformacionDeLaEmpresa informacionDeLaEmpresa(){
        return informacionDeLaEmpresa;
    }
    public void ActualizarEstadoDeLaEntrega(TiempoDeEntrega tiempoDeEntrega){
        this.tiempoDeEntrega = Objects.requireNonNull(tiempoDeEntrega);
    }
    public void ObtenerTiempoDeEntrega(TiempoDeEntrega tiempoDeEntrega){
        this.tiempoDeEntrega = Objects.requireNonNull(tiempoDeEntrega);
    }

}
