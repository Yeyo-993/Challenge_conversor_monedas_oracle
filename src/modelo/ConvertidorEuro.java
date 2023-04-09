package modelo;

import lista.Moneda;

import java.math.BigDecimal;

public class ConvertidorEuro extends ConvertidorMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosColombianos) {
        moneda = Moneda.EURO;
        return super.convertirParaMoneda(moneda, valorEnPesosColombianos);
    }

    @Override
    public BigDecimal convertirParaPesosColombianos(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.EURO;
        return super.convertirParaPesosColombianos(moneda, valorEnMoneda);
    }

}
