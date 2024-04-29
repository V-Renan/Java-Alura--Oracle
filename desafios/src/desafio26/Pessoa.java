package desafio26;

/**
 * @author Victor$
 * @date 4/29/2024$
 * Description:
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;
    public Pessoa() {

    }
    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }
}
