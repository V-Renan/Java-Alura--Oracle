import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/6/2024$
 * Description:
 */
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        if (numero >= 0) {
            System.out.println("O valor digitado é POSITIVO!");
        } else {
            System.out.println("O valor digitado é NEGATIVO!");
        }

        scan.close();
    }
}
