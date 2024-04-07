import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/7/2024$
 * Description:
 */
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = scan.nextInt();

        if (valor % 2 == 0) {
            System.out.printf("O numero %d é PAR!", valor);
        } else {
            System.out.printf("O numero %d é ÍMPAR!", valor);
        }

        scan.close();
    }
}
