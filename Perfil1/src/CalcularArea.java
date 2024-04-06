import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/6/2024$
 * Description:
 */
public class CalcularArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 0;
        while (true) {
            menu();
            op = scan.nextInt();
            if (op == 1) {
                double areaQuadrado = quadrado();
                System.out.println("Area do quadrado : " + areaQuadrado);
            } else if (op == 2) {
                double areaCirculo = circulo();
                System.out.println("Area do circulo: " + areaCirculo);
            } else if (op == 3) {
                System.out.println("Encerrando programa...");
                System.exit(0);
            }
        }
    }

    public static void menu () {
        System.out.println("-------MENU-------");
        System.out.println("""
                    [1] Calucular area do quadrado
                    [2] Calcular area do circulo
                    [3] Sair
                    """);
    }

    public static double quadrado() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();
        double resultado = lado * lado;
        return resultado;
    }
    public static double circulo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = scan.nextDouble();
        double resultado = 3.14 * raio * raio;
        return resultado;
    }
}
