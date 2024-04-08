package atividades.aluno;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class Aluno {
    String nome;
    int idade;

    void exibirAluno() {
        System.out.printf("""
                Nome: %s
                Idade: %d
                """, nome, idade);
    }
}
