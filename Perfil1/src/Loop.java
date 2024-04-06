import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/6/2024$
 * Description:
 */
public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaFilme = 0;
        double nota = 0;
        double resultado = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a sua avalicao para o filme: ");
            nota = scan.nextDouble();
            mediaFilme += nota;
        }

        resultado = mediaFilme / 3;

        System.out.println("Media do filme: " + resultado);
        scan.close();
    }
}
