package com.tiendaonline.ventas.facturacion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.tiendaonline.ventas.envio.Envios;
import com.tiendaonline.ventas.envio.events.TiempoDeEntregaObtenido;
import com.tiendaonline.ventas.envio.values.EnvioId;
import com.tiendaonline.ventas.facturacion.entities.DetalleDelProducto;
import com.tiendaonline.ventas.facturacion.entities.Factura;
import com.tiendaonline.ventas.facturacion.entities.FormaDePago;
import com.tiendaonline.ventas.facturacion.events.*;
import com.tiendaonline.ventas.facturacion.values.*;
import com.tiendaonline.ventas.politicaDeDevolucion.values.PoliticaDeDevolucionId;

import java.util.Objects;
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

    //comportamientos

    public void ActualizarCantidadDeDetalleDelProducto(DetalleDelProductoId detalleDelProductoId, EspecificacionesTecnicas especificacionesTecnicas, Cantidad cantidad){
        Objects.requireNonNull(detalleDelProductoId);
        Objects.requireNonNull(especificacionesTecnicas);
        Objects.requireNonNull(cantidad);
        appendChange(new CantidadActualizada(detalleDelProductoId, especificacionesTecnicas,cantidad) );
    }

    public void ActualizarNumeroDeTarjetaCreditoDeFormaDePago(FormadePagoId formadePagoId  , TarjetaCredito tarjetaCredito){
        Objects.requireNonNull(formadePagoId);
        Objects.requireNonNull(tarjetaCredito);
        appendChange(new NumeroDeTrajetaCreditoActulizada(formadePagoId,tarjetaCredito));
    }

    public void ActualizarIVADeFactura(FacturaId facturaid, IVA iva){

        Objects.requireNonNull(facturaid);
        Objects.requireNonNull(iva);
        appendChange(new IvaActualizado(facturaid,iva));

    }

    public void ActualizarValorTotalDeFactura(FacturaId facturaId, IVA iva, ValorTotal valorTotal){

        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(iva);
        Objects.requireNonNull(valorTotal);
        appendChange(new ValorTotalDeFacturaActualizada(facturaId,iva, valorTotal));
    }

    public void CrearFacturacion(FacturacionId facturacionId, DatosDelCliente datosDelCliente){
        Objects.requireNonNull(facturacionId);
        Objects.requireNonNull(datosDelCliente);
        appendChange(new FacturacionCreada(facturacionId,datosDelCliente));
    }
}
