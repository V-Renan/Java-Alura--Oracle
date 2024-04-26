package desafio08;

/**
 * @author Victor$
 * @date 4/12/2024$
 * Description:
 */
public class Cachorro extends Animal{
    public Cachorro() {

    }
    public Cachorro(String nome) {
        this.nome = nome;
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + ": AU! AU!\n");
    }
    public void abanarRabo() {
        System.out.printf("O(A) %s esta abanando o rabo de felicidade!\n", nome);
    }
}
