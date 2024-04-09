package desafio4;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class Produto {
    private String nome;
    private double preco;

    public Produto() {

    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double valor) {
        double valorParcial = preco * (valor / 100);
        preco -= valorParcial;
        System.out.printf("Valor do desconto: R$%.2f \nTotal a ser pago: %.2f", valorParcial, preco);
    }
}
