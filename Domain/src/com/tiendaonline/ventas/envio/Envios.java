package com.tiendaonline.ventas.envio;

import co.com.sofka.domain.generic.AggregateEvent;
import com.tiendaonline.ventas.envio.entities.Distribuidor;
import com.tiendaonline.ventas.envio.entities.EnviosNacionales;
import com.tiendaonline.ventas.envio.events.EnvioCreado;
import com.tiendaonline.ventas.envio.events.EstadoDeEntregaActualizado;
import com.tiendaonline.ventas.envio.events.TiempoDeEntregaObtenido;
import com.tiendaonline.ventas.envio.events.ValorDeEnvioObtenido;
import com.tiendaonline.ventas.envio.values.DatosDelDestinatario;
import com.tiendaonline.ventas.envio.values.DistribuidorId;
import com.tiendaonline.ventas.envio.values.EnvioId;
import com.tiendaonline.ventas.envio.values.EnviosNacionalesId;
import com.tiendaonline.ventas.envio.values.PrecioDelEnvio;
import com.tiendaonline.ventas.envio.values.TiempoDeEntrega;

import java.util.Objects;

public class Envios extends AggregateEvent<EnvioId> {
    protected Distribuidor distribuidor;
    protected EnviosNacionales enviosNacionales;


    public Envios(EnvioId envioId, Distribuidor distribuidor, EnviosNacionales enviosNacionales) {
        super(envioId);
        this.enviosNacionales = enviosNacionales;
        this.distribuidor = distribuidor;


    }
    public void CalcularTiempoDeEntrega(DistribuidorId distribuidorId, TiempoDeEntrega tiempoDeEntrega){
        Objects.requireNonNull(distribuidorId);
        Objects.requireNonNull(tiempoDeEntrega);
        appendChange(new TiempoDeEntregaObtenido(distribuidorId, tiempoDeEntrega) );
    }
    public void ObtenerValorEnvio(EnviosNacionalesId enviosNacionalesId, PrecioDelEnvio precioDelEnvio){
        Objects.requireNonNull(enviosNacionalesId);
        Objects.requireNonNull(precioDelEnvio);
        appendChange(new ValorDeEnvioObtenido(enviosNacionalesId, precioDelEnvio) );
    }

    public void ActualizarEstadoDeLaEntrega(DistribuidorId distribuidorId, TiempoDeEntrega tiempoDeEntrega){
        Objects.requireNonNull(distribuidorId);
        Objects.requireNonNull(tiempoDeEntrega);
        appendChange(new EstadoDeEntregaActualizado(distribuidorId, tiempoDeEntrega) );
    }

    public void CrearEnvio(EnvioId envioId, DatosDelDestinatario datosDelDestinatario){
        Objects.requireNonNull(envioId);
        Objects.requireNonNull(datosDelDestinatario);
        appendChange(new EnvioCreado(envioId, datosDelDestinatario) );
    }


}
