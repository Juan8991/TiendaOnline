package com.tiendaonline.ventas.envio.values;

import co.com.sofka.domain.generic.ValueObject;

public class InformacionDeLaEmpresa implements ValueObject<InformacionDeLaEmpresa.Props> {
    private final String nombreEmpresa;
    private final String direccion;
    private final String telefonoDeContacto;
    private final String nit;

    public InformacionDeLaEmpresa(String nombreEmpresa, String direccion, String telefono, String nit) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefonoDeContacto = telefono;
        this.nit = nit;
    }
    @Override
    public Props value() {
        return new Props() {
            @Override
            public String obtenerNombreDeLaEmpresa() {
                return nombreEmpresa;
            }
            @Override
            public String obtenerNit() {
                return nit;
            }
            @Override
            public String obtenerDireccion() {
                return direccion;
            }
            @Override
            public String obtenerTelefonoDeContacto() {
                return telefonoDeContacto;
            }
        };
    }
    public interface Props {
        String obtenerNombreDeLaEmpresa();
        String obtenerDireccion();
        String obtenerNit();
        String obtenerTelefonoDeContacto();

    }

}
