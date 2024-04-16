package desafio10;

/**
 * @author Victor$
 * @date 4/16/2024$
 * Description:
 */
public class ConversorMoeda implements CoversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valor) {
        double cotacaoDolar = 4.80;
        double valorReal = valor * cotacaoDolar;
        System.out.printf("Valor em reais: R$%.2f", valorReal);
    }
}
