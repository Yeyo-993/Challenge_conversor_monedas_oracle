package modelo;

import lista.Moneda;
import lista.TipoConversion;

import java.math.BigDecimal;

public class InicializadorMonedas {

    private static final String PESOS_COLOMBIANOS_DOLAR = "De Pesos Colombianos a Dólar";
    private static final String PESOS_COLOMBIANOS_EURO = "De Pesos Colombianos a Euro";
    private static final String PESOS_COLOMBIANOS_LIBRA_ESTERLINA = "De Pesos Colombianos a Libra Esterlina";
    private static final String PESOS_COLOMBIANOS_YEN_JAPONES = "De Pesos Colombianos a Yen Japones";
    private static final String PESOS_COLOMBIANOS_WON_SUL_COREANO = "De Pesos Colombianos a Won sul-coreano";
    private static final String DOLAR_PESOS_COLOMBIANOS = "De Dólar a Real";
    private static final String EURO_PESOS_COLOMBIANOS = "De Euro a Real";
    private static final String LIBRA_ESTERLINA_PESOS_COLOMBIANOS = "De Libra Esterlina a Real";
    private static final String YEN_JAPONES_PESOS_COLOMBIANOS = "De Peso Argentino a Real";
    private static final String WON_SUL_COREANO_PESOS_COLOMBIANOS = "De Peso Chileno a Real";
    private ConvertidorMoneda convertidorDolar = new ConvertidorDolar();
    private ConvertidorMoneda convertidorEuro = new ConvertidorEuro();
    private ConvertidorMoneda convertidorLibra = new ConvertidorLibra();
    private ConvertidorMoneda convertidorYen = new ConvertidorYen();
    private ConvertidorMoneda convertidorWon = new ConvertidorWon();

    private Moneda moneda;

    public BigDecimal operarConversion(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case PESOS_COLOMBIANOS_DOLAR -> {
                return convertidorDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESOS_COLOMBIANOS_EURO -> {
                return convertidorEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESOS_COLOMBIANOS_LIBRA_ESTERLINA -> {
                return convertidorLibra.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESOS_COLOMBIANOS_YEN_JAPONES -> {
                return convertidorYen.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESOS_COLOMBIANOS_WON_SUL_COREANO -> {
                return convertidorWon.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_PESOS_COLOMBIANOS -> {
                return convertidorDolar.convertirParaPesosColombianos(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PESOS_COLOMBIANOS -> {
                return convertidorEuro.convertirParaPesosColombianos(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PESOS_COLOMBIANOS -> {
                return convertidorLibra.convertirParaPesosColombianos(moneda, BigDecimal.valueOf(valorInicial));
            }
            case YEN_JAPONES_PESOS_COLOMBIANOS -> {
                return  convertidorYen.convertirParaPesosColombianos(moneda, BigDecimal.valueOf(valorInicial));
            }
            case WON_SUL_COREANO_PESOS_COLOMBIANOS -> {
                return convertidorWon.convertirParaPesosColombianos(moneda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("ELECCIÓN INVÁLIDA");
        }

    }

}
