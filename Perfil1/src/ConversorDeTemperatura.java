import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/4/2024$
 * Description:
 */
public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura para ser convertida de Celsius para Fahrenheit: ");
        double temperaturaCelsius = scan.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        // String resultadoFormatado = String.format("%.1f", temperaturaFahrenheit);
        int resultadoComCasting = (int) temperaturaFahrenheit;

        System.out.println("Temperatura convertida para Fahrenheit -> " + resultadoComCasting);
        scan.close();
    }
}
