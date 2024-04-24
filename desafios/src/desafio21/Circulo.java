package desafio21;

/**
 * @author Victor$
 * @date 4/24/2024$
 * Description:
 */
public class Circulo implements Forma{
    double raio;
    @Override
    public void calcularArea() {
        double area = Math.PI * (raio * raio);
        System.out.printf("Area do circulo: %.1f \n", area);
    }
}
