import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/4/2024$
 * Description:
 */
public class ConversaoReais {
    public static void main(String[] args) {
        double reais = 4.94;

        System.out.println("---------------Conversor de Dolar para Reais---------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor em dolares para ser convertido: ");
        double valorEmDolares = scan.nextDouble();
        double conversao = valorEmDolares * reais;

        System.out.println("US$" + valorEmDolares + " Convertidos em reais -> R$" + String.format("%.2f", conversao));
        scan.close();
    }
}
