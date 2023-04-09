package modelo;

import lista.Moneda;

import java.math.BigDecimal;

public class ConvertidorDolar extends ConvertidorMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosColombianos){
        moneda = Moneda.DOLAR;
        return super.convertirParaMoneda(moneda, valorEnPesosColombianos);
    }

    @Override
    public BigDecimal convertirParaPesosColombianos(Moneda moneda, BigDecimal valorEnMoneda){
        moneda = Moneda.DOLAR;
        return super.convertirParaPesosColombianos(moneda, valorEnMoneda);
    }

}
