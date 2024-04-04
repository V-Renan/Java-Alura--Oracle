/**
 * @author Victor$
 * @date 4/4/2024$
 * Description:
 */
public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 150.0;
        double percentualDesconto = 10.0;

        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double resultado =  precoOriginal - valorDesconto;

        System.out.println("Valor do produto: R$" + precoOriginal + "\nValor total a ser pago com " + percentualDesconto + "% de desconto: R$" + String.format("%.2f", resultado));
    }
}
