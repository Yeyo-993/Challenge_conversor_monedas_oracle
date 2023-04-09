package modelo;

import lista.Moneda;

import java.math.BigDecimal;

public class ConvertidorLibra extends ConvertidorMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosColombianos) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaMoneda(moneda, valorEnPesosColombianos);
    }

    @Override
    public BigDecimal convertirParaPesosColombianos(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaPesosColombianos(moneda, valorEnMoneda);
    }

}
