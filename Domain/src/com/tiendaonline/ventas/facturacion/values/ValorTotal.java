package com.tiendaonline.ventas.facturacion.values;

import co.com.sofka.domain.generic.ValueObject;

public class ValorTotal implements ValueObject<Double> {

        private final Double total;
        public ValorTotal(Double total) {
                this.total = total;
        }
        @Override
        public Double value() {
                return total;
        }
}
