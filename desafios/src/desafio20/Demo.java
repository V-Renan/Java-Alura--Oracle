package desafio20;

/**
 * @author Victor$
 * @date 4/24/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.adicionarProduto("Coca Cola",12.00,1);
        produto.adicionarProduto("Teclado Gamer",300.00,1);
        produto.adicionarProduto("Microfone",250.00,1);

        produto.exibirProdutos();

        System.out.printf("Valor total a ser pago: R$%.2f \n", produto.getValorTotal());
        System.out.printf("Preco medio dos produtos: R$%.2f \n", produto.getValorMedio());
    }
}
