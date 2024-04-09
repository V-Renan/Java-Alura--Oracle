package desafio3;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa("Victor", 24);
        IdadePessoa pessoa2 = new IdadePessoa("Renan", 15);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        pessoa1.maiorOuMenorIdade();

        pessoa2.exibirDados();
    }
}
