package br.com.alura.modelos;

/**
 * @author Victor$
 * @date 4/18/2024$
 * Description:
 */
public class Audio implements Metodos{
    private String titulo;
    private double duracao;
    private int totalReproducao;
    private int curtidas;
    private double classificacao;

    public Audio() {
    }

    public Audio(String titulo, double duracao, int totalReproducao, int curtidas, double classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalReproducao = totalReproducao;
        this.curtidas = curtidas;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public double getClassificacao() {
        return classificacao;
    }

    @Override
    public void curte() {
        this.curtidas++;
        System.out.println("Total de curtidas: " + getCurtidas());
    }

    @Override
    public void reproduz() {
        this.totalReproducao++;
        System.out.println("Voce esta ouvindo: " + getTitulo());
    }
}
