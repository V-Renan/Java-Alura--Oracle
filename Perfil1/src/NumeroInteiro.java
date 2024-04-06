import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/6/2024$
 * Description:
 */
public class NumeroInteiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro numero inteiro: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        n2 = scan.nextInt();
        if (n1 == n2) {
            System.out.println("Os valores digitados sao iguais!");
        } else if (n1 > n2) {
            System.out.println("O primeiro valor digitado é maior!");
        } else {
            System.out.println("O segundo valor digitado é maior!");
        }


        scan.close();
    }
}
