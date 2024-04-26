package desafio03;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class IdadePessoa {
    private String nome;
    private int idade;
    public IdadePessoa() {

    }
    public IdadePessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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

    public void maiorOuMenorIdade() {
        if (getIdade() >= 18) {
            System.out.println("A pessoa é maior de idade!");
        } else {
            System.out.println("A pessoa é menor de idade!");
        }
    }

    public void exibirDados() {
        System.out.println("\n-------------------------------------");
        String dados = "Nome: " + getNome() +
                "\nIdade: " + getIdade();
        System.out.println(dados);
        maiorOuMenorIdade();
    }
}
