package desafio11;

/**
 * @author Victor$
 * @date 4/16/2024$
 * Description:
 */
public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double a = altura * largura;
        System.out.println("Area da sala retangular: " + a);
    }

    @Override
    public void calcularParimentro(double altura, double largura) {
        double a = altura * largura;
        System.out.println("Area da sala retangular: " + a);
    }
}
