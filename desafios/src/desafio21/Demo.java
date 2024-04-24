package desafio21;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 4/24/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        Circulo circulo = new Circulo();
        circulo.raio = 5;
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        formas.add(circulo);
        formas.add(quadrado);

        for (Forma forma : formas) {
            forma.calcularArea();
        }
    }
}
