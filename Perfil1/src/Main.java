import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Ola " + nome + "! \nTudo bem?");
        String resposta = scan.next().toUpperCase();

        if (resposta.equals("SIM")) {
            System.out.println("Que legal " + nome + ", fico feliz que voce esta bem!");
        } else {
            System.out.println("Poxa, espero que voce fique bem logo!");
        }
        scan.close();
    }
}