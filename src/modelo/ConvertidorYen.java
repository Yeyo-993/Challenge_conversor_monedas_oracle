package modelo;

import lista.Moneda;

import java.math.BigDecimal;

public class ConvertidorYen extends ConvertidorMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosColombianos){
        moneda = Moneda.YEN_JAPONES;
        return super.convertirParaMoneda(moneda, valorEnPesosColombianos);
    }

    @Override
    public BigDecimal convertirParaPesosColombianos(Moneda moneda, BigDecimal valorEnMoneda){
        moneda = Moneda.YEN_JAPONES;
        return super.convertirParaPesosColombianos(moneda, valorEnMoneda);
    }

}
