package desafio20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 4/24/2024$
 * Description:
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private List<Produto> produtos = new ArrayList<>();

    public Produto() {

    }
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public void adicionarProduto(String nome, double preco, int quantidade) {
        var produto = new Produto(nome, preco, quantidade);
        this.produtos.add(produto);
    }
    public double getValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total+= produto.getQuantidade() * produto.getPreco();
        }
        return total;
    }
    public double getValorMedio() {
        double total = 0;
        double media = 0;
        for (Produto produto : produtos) {
            total+= produto.getPreco();
        }
        media = total / produtos.size();
        return media;
    }
    public void exibirProdutos() {
        System.out.println("---------------------------------------------");
        //produtos.forEach(nome -> System.out.println(nome));
        produtos.forEach(System.out::println);
        System.out.println("---------------------------------------------");
    }

    @Override
    public String toString() {
        String mensagem = String.format("Produto: %s | Preco: R$%.2f",
                getNome(), getPreco());
        return mensagem;
    }
}
