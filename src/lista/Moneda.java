package lista;

import java.math.BigDecimal;

public enum Moneda {

    //TRM Taza Representativa Monetaria del 07 de Abril del 2023 para pesos colombianos
    DOLAR(BigDecimal.valueOf(4569.49)),
    EURO(BigDecimal.valueOf(5024.38)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(5675.76)),
    YEN_JAPONES(BigDecimal.valueOf(34.40)),
    WON_SUL_COREANO(BigDecimal.valueOf(3.45));

    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {this.FACTOR_CONVERSION = FACTOR_CONVERSION;}

    public BigDecimal getFACTOR_CONVERSION() {return FACTOR_CONVERSION;}

}
