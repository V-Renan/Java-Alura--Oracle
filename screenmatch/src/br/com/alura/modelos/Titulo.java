package br.com.alura.modelos;

import br.com.alura.excecao.ErroDeConversaoAnoException;
import com.google.gson.annotations.SerializedName;

/**
 * @author Victor$
 * @date 4/9/2024$
 * Description:
 */
public class Titulo implements Comparable<Titulo>{
  //  @SerializedName("Title")
    private String nome;
   // @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvalicao;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoAnoException("Nao consegui converter o ano pq tem mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void avalia(double nota) {
        somaAvalicao+= nota;
        totalDeAvaliacao++;
    }

    public void exibirFichaTecnica() {
        System.out.println("-------------------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());
        System.out.println("Duracao: " + getDuracaoEmMinutos());
    }

    public double pegaMedia() {
        return somaAvalicao / totalDeAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return String.format("""
                (Nome: %s
                Ano de lancamento: %d
                Duracao: %d)
                """, getNome(), getAnoDeLancamento(), getDuracaoEmMinutos());
    }
}