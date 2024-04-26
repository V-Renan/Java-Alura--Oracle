package desafio07;

/**
 * @author Victor$
 * @date 4/12/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.definirModelo("Golf GTI");
        carro1.adicionarPreco(569000.00,160000.00,59900.00);
        carro1.exibirInfo();
    }
}
