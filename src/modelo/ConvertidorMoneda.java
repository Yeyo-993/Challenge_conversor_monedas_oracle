package modelo;

import lista.Moneda;
import interfaces.MonedaConvertible;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertidorMoneda {

    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosColombianos) {
        return valorEnPesosColombianos.divide(moneda.getFACTOR_CONVERSION(), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal convertirParaPesosColombianos(Moneda moneda, BigDecimal valorEnMoneda){
        return valorEnMoneda.multiply(moneda.getFACTOR_CONVERSION());
    };

}
