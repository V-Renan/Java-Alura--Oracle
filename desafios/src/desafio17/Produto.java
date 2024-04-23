package desafio17;

import java.util.ArrayList;

/**
 * @author Victor$
 * @date 4/23/2024$
 * Description:
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private ArrayList<Produto> produtos = new ArrayList<>();
    public Produto() {
    }
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void adicionarProduto(String nome, double preco, int quantidade) {
        var produto = new Produto(nome, preco, quantidade);
        this.produtos.add(produto);
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    //  metodo para retornar o valor total da compra
    public double getValorTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total+= p.quantidade * p.preco;
        }
        return total;
    }
    // metodo para exibir o nome e preco dos produtos
    public void exibirProdutos() {
        for (Produto p : produtos) {
            System.out.printf("Produto: %s | Preco: R$%.2f\n", p.getNome(), p.preco);
        }
    }
}
