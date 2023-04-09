package modelo;

import lista.Moneda;

import java.math.BigDecimal;

public class ConvertidorWon extends ConvertidorMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosColombianos) {
        moneda = Moneda.WON_SUL_COREANO;
        return super.convertirParaMoneda(moneda, valorEnPesosColombianos);
    }

    @Override
    public BigDecimal convertirParaPesosColombianos(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.WON_SUL_COREANO;
        return super.convertirParaPesosColombianos(moneda, valorEnMoneda);
    }

}
