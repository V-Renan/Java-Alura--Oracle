package desafio19;

/**
 * @author Victor$
 * @date 4/24/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Maggie");
        cachorro.brincar();
        cachorro.fazerBarulho();

        Animal animal = (Animal) cachorro;

        animal.brincar();
    }
}
