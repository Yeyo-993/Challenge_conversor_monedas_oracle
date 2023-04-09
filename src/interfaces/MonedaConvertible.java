package interfaces;

import lista.Moneda;

import java.math.BigDecimal;

public interface MonedaConvertible {

    BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosColombianos);
    BigDecimal convertirParaPesosColombianos(Moneda moneda, BigDecimal valorEnMoneda);

}
