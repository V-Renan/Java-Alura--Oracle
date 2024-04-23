package desafio17;

/**
 * @author Victor$
 * @date 4/23/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.adicionarProduto("God of War - Ragnarok",300.00,2);
        produto.adicionarProduto("Grand Theft Auto VI",700.00,1);
        produto.adicionarProduto("Call of Duty - MW3",270.00,1);
        produto.exibirProdutos();
        System.out.printf("Valor total da compra: R$%.2f \n", produto.getValorTotal());

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Coca Cola",12.00,1, "23-11-2024");
        System.out.println(produtoPerecivel);
    }
}
