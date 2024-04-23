package desafio16;

import java.util.ArrayList;

/**
 * @author Victor$
 * @date 4/23/2024$
 * Description:
 */
public class Pessoas {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Pessoas() {

    }

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                " (Idade: " + this.idade + ")";
    }
}
