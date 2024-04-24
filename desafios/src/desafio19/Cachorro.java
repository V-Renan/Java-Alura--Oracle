package desafio19;

/**
 * @author Victor$
 * @date 4/24/2024$
 * Description:
 */
public class Cachorro extends Animal{
    @Override
    public void fazerBarulho() {
        System.out.printf("%s: AU! AU!\n", getNome());
    }

    @Override
    public void brincar() {
        System.out.printf("Voce jogou a bolinha para %s...\n", getNome());
    }
}
