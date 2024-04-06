import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/6/2024$
 * Description:
 */
public class LoopWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mediaFilme = 0;
        double nota = 0;
        double resultado = 0;
        int cont = 0;

        while (nota != 99) {
            System.out.print("Digite a sua avalicao do filme de 0 a 10 ou 99 para encerrar: ");
            nota = scan.nextDouble();
            if (nota != 99) {
                mediaFilme += nota;
                cont++;
            }
        }

        resultado = mediaFilme / cont;

        System.out.println("Media de avalicoes: " + resultado);
        scan.close();
    }
}
