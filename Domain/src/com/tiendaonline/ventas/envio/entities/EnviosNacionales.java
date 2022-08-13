package com.tiendaonline.ventas.envio.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;
import com.tiendaonline.ventas.envio.values.DireccionDeEnvio;
import com.tiendaonline.ventas.envio.values.EnviosNacionalesId;
import com.tiendaonline.ventas.envio.values.InformacionDeLaEmpresa;
import com.tiendaonline.ventas.envio.values.PrecioDelEnvio;

import java.util.Objects;

public class EnviosNacionales extends Entity<EnviosNacionalesId> {
    private PrecioDelEnvio precioDelEnvio;
    private DireccionDeEnvio direccionDeEnvio;
    public EnviosNacionales(EnviosNacionalesId entityId,DireccionDeEnvio direccionDeEnvio,PrecioDelEnvio precioDelEnvio) {
        super(entityId);
        this.direccionDeEnvio=direccionDeEnvio;
        this.precioDelEnvio=precioDelEnvio;
    }
    public PrecioDelEnvio precioDelEnvio(){
        return precioDelEnvio;
    }
    public DireccionDeEnvio direccionDeEnvio(){
        return direccionDeEnvio;
    }
    public void ObtenerValorDeEnvio(PrecioDelEnvio precioDelEnvio){
        this.precioDelEnvio = Objects.requireNonNull(precioDelEnvio);
    }


}
