package desafio13;

/**
 * @author Victor$
 * @date 4/16/2024$
 * Description:
 */
public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " graus Celsius equivalem a : " + fahrenheit + " graus Fahrenheit");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * (5/9.0);
        System.out.println(fahrenheit + " graus Fahrenheit equivalem a: " + celsius + " graus Celsius");
    }
}
