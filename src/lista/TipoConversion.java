package lista;

public enum TipoConversion {

    PESOS_COLOMBIANOS_DOLAR("De Pesos Colombianos a Dólar"),
    PESOS_COLOMBIANOS_EURO("De Pesos Colombianos a Euro"),
    PESOS_COLOMBIANOS_LIBRA_ESTERLINA("De Pesos Colombianos a Libra Esterlina"),
    PESOS_COLOMBIANOS_YEN_JAPONES("De Pesos Colombianos a Yen Japones"),
    PESOS_COLOMBIANOS_WON_SUL_COREANO("De Pesos Colombianos a Won sul-coreano"),
    DOLAR_PESOS_COLOMBIANOS("De Dólar a Pesos Colombianos"),
    EURO_PESOS_COLOMBIANOS("De Dólar a Pesos Colombianos"),
    LIBRA_ESTERLINA_PESOS_COLOMBIANOS("De Dólar a Pesos Colombianos"),
    YEN_JAPONES_PESOS_COLOMBIANOS("De Dólar a Pesos Colombianos"),
    WON_SUL_COREANO_PESOS_COLOMBIANOS("De Dólar a Pesos Colombianos"),

    //TEMPERATURA
    CELSIUS_PARA_FAHRENHEIT("Celsius a Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius a Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin a Fahrenheit"),
    KELVIN_PARA_CELSIUS ("Kelvin a Celsius"),
    FAHRENHEIT_PARA_CELSIUS ("Fahrenheit a Celsius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit a Kelvin");

    private String descripcion;

    TipoConversion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
