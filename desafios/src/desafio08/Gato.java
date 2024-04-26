package desafio08;

/**
 * @author Victor$
 * @date 4/12/2024$
 * Description:
 */
public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println(nome + " MIAU! MIAU!");
    }
    public void arranharMoveis() {
        System.out.printf("O(A) %s arranhando movel...", nome);
    }
}
