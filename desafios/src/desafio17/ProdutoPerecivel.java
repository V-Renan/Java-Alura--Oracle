package desafio17;

/**
 * @author Victor$
 * @date 4/23/2024$
 * Description:
 */
public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "\nProduto Perecivel\n" +
                "Nome: " + getNome() + "\n" +
                "Preco: R$" + getPreco() + "\n" +
                "Data de Validade: " + getDataValidade() + "\n" +
                "Quantidade: " + getQuantidade();
    }
}
