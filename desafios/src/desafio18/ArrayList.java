package desafio18;

import java.util.List;

/**
 * @author Victor$
 * @date 4/23/2024$
 * Description:
 */
public class ArrayList {
    public static void main(String[] args) {
        List<String> nomes = new java.util.ArrayList<>();
        nomes.add("Victor");
        nomes.add("Renan");
        nomes.add("Dean");
        nomes.add("Sammy");

        System.out.println("Percorrendo o Array usando lambda...");
        nomes.forEach(nome -> System.out.println(nome));
        System.out.println("Percorrendo o Array usando Method Reference");
        nomes.forEach(System.out::println);
    }
}
