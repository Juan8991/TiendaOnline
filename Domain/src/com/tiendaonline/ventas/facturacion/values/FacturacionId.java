package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.Identity;
import com.tiendaonline.ventas.envio.values.EnvioId;

public class FacturacionId extends Identity {
    public FacturacionId(String uuid) {
        super(uuid);
    }
    public FacturacionId() {
    }
    public static FacturacionId of(String uuid) {
        return new FacturacionId(uuid);
    }
}
