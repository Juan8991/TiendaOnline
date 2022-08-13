package com.tiendaonline.ventas.facturacion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.tiendaonline.ventas.envio.Envios;
import com.tiendaonline.ventas.envio.values.EnvioId;
import com.tiendaonline.ventas.facturacion.entities.DetalleDelProducto;
import com.tiendaonline.ventas.facturacion.entities.Factura;
import com.tiendaonline.ventas.facturacion.entities.FormaDePago;
import com.tiendaonline.ventas.facturacion.values.DatosDelCliente;
import com.tiendaonline.ventas.facturacion.values.FacturacionId;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticaDeDevolucionId;

import java.util.Set;

public class Facturacion extends AggregateEvent<FacturacionId> {
    protected Set<DetalleDelProducto> detalleDelProductos;
    protected FormaDePago formaDePago;
    protected DatosDelCliente datosDelCliente;
    protected EnvioId envioId;
    protected Factura factura;
    protected PoliticaDeDevolucionId politicaDeDevolucionId;

    public Facturacion(FacturacionId entityId, Set<DetalleDelProducto> detalleDelProductos, FormaDePago formaDePago, DatosDelCliente datosDelCliente, EnvioId envioId, Factura factura, PoliticaDeDevolucionId politicaDeDevolucionId) {
        super(entityId);
        this.detalleDelProductos = detalleDelProductos;
        this.formaDePago = formaDePago;
        this.datosDelCliente = datosDelCliente;
        this.envioId = envioId;
        this.factura = factura;
        this.politicaDeDevolucionId = politicaDeDevolucionId;
    }
}
