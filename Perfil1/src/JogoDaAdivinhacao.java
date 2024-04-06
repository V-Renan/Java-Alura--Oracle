import java.util.Random;
import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/6/2024$
 * Description:
 */
public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int cont = 0;
        int chute = 0;
        System.out.println(numeroSecreto);

        System.out.println("Digite um numero entre 0 e 100: ");
        chute = scan.nextInt();

        while (cont <= 5) {
            cont++;

            if (chute == numeroSecreto) {
                System.out.printf("Parabens voce acertou o numero secreto!! [%d]", numeroSecreto);
                System.out.printf("\nTotal de tentativas: %d", cont);
                break;
            } else if (chute > numeroSecreto) {
                System.out.println("O numero secreto é menor do que " + chute + ", tente novamente!");
                chute = scan.nextInt();
            } else {
                System.out.println("O numero secreto é maior do que " + chute + ", tente novamente!");
                chute = scan.nextInt();
            }
        }
        scan.close();
    }
}
