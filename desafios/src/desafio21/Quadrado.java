package desafio21;

/**
 * @author Victor$
 * @date 4/24/2024$
 * Description:
 */
public class Quadrado implements Forma{
    double lado;
    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("Area do quadrado: " + area);
    }
}
