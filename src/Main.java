import lista.TipoConversion;
import modelo.*;

import javax.swing.*;
import java.math.BigDecimal;


public class Main {

    public static void main(String[] args) throws Exception {

        String conversionDeMoneda = "Convetir moneda";
        String conversionDeTemperatura = "Convertir temperatura";

        boolean ejecuta = true;

        Repetidor repetidor = new Repetidor();

        while (ejecuta){
            String operacion = JOptionPane.showInputDialog(null, "Elige la operación", "Conversiones", JOptionPane.QUESTION_MESSAGE, null, new String[]{conversionDeMoneda, conversionDeTemperatura}, "Elección").toString();

            if (operacion.equals(conversionDeMoneda)){
                InicializadorMonedas iniciadorConversionMonedas = new InicializadorMonedas();
                String operacionMonedas = JOptionPane.showInputDialog(null, "Elige una moneda",
                        "monedas", JOptionPane.QUESTION_MESSAGE, null, new String[]{
                                TipoConversion.PESOS_COLOMBIANOS_DOLAR.getDescripcion(),
                                TipoConversion.PESOS_COLOMBIANOS_EURO.getDescripcion(),
                                TipoConversion.PESOS_COLOMBIANOS_LIBRA_ESTERLINA.getDescripcion(),
                                TipoConversion.PESOS_COLOMBIANOS_YEN_JAPONES.getDescripcion(),
                                TipoConversion.PESOS_COLOMBIANOS_WON_SUL_COREANO.getDescripcion(),
                                TipoConversion.DOLAR_PESOS_COLOMBIANOS.getDescripcion(),
                                TipoConversion.EURO_PESOS_COLOMBIANOS.getDescripcion(),
                                TipoConversion.LIBRA_ESTERLINA_PESOS_COLOMBIANOS.getDescripcion(),
                                TipoConversion.YEN_JAPONES_PESOS_COLOMBIANOS.getDescripcion(),
                                TipoConversion.WON_SUL_COREANO_PESOS_COLOMBIANOS.getDescripcion()
                        }, "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Invalido");
                } else {
                    double valorInicial = validador.transformarEnDouble(valorString);
                    BigDecimal valorConvertido = iniciadorConversionMonedas.operarConversion(operacionMonedas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            } else if (operacion.equals(conversionDeTemperatura)){
                IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
                String operacionTemperaturas = JOptionPane.showInputDialog(null, "Elige la escale de temperatura",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[]{
                                TipoConversion.CELSIUS_PARA_FAHRENHEIT.getDescripcion(),
                                TipoConversion.CELSIUS_PARA_KELVIN.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_KELVIN.getDescripcion(),
                                TipoConversion.KELVIN_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.KELVIN_PARA_FAHRENHEIT.getDescripcion(),},
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador validador = new Validador();
                if (!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else {
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorConversionTemperatura.operarConversao(operacionTemperaturas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }
            ejecuta = repetidor.intentaRepetir();
        }
    }

}
