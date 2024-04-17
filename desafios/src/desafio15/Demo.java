package desafio15;

/**
 * @author Victor$
 * @date 4/17/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Grand Theft Auto VI", 700);
        produto1.aplicarDesconto(10);
        produto1.calcularPrecoFinal(2);
        produto1.exibirInfos();

        Servico servico1 = new Servico("Dev estagiario", 10.50);
        servico1.aplicarDesconto(1.00);
        System.out.println(servico1.calcularPrecoFinal(5));
    }
}
