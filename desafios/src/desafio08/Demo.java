package desafio08;

/**
 * @author Victor$
 * @date 4/12/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Billy");
        cachorro1.abanarRabo();
        cachorro1.emitirSom();

        Gato gato1 = new Gato();
        gato1.nome = "Gamora";
        gato1.emitirSom();
        gato1.arranharMoveis();
    }
}
