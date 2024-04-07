import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/6/2024$
 * Description:
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero para exibir a tabuada: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada do : " + numero);
        for (int i = 0; i <= 10; i++) {
            int mult = numero * i;
            System.out.println(numero + " x " + i + " = " + mult);
        }
        scan.close();
    }
}
