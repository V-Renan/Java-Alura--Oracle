package desafio15;

/**
 * @author Victor$
 * @date 4/17/2024$
 * Description:
 */
public class Produto implements Vendavel{
    private String nome;
    private double precoUnitario;
    private double precoFinal;
    private int quantidadeProdutos;
    private double percentual;
    public Produto() {

    }
    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calcularPrecoFinal(int quantidade) {
        setQuantidadeProdutos(quantidade);
        setPrecoFinal(precoUnitario * quantidade);
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        setPercentual(percentualDesconto);
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }

    @Override
    public void exibirInfos() {
        System.out.printf("""
                Nome: %s
                Porcentagem do desconto: %.2f%%
                Quantidade: %d
                Preco final da compra: R$%.2f
                """, getNome(), getPercentual(), getQuantidadeProdutos(), getPrecoFinal());
    }
}
