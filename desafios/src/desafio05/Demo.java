package desafio05;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Michael Jackson", 9, 7, 5);
        System.out.println("Nome: " + aluno1.getNome());
        aluno1.calcularMedia();
    }
}
