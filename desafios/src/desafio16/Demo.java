package desafio16;

import java.util.ArrayList;

/**
 * @author Victor$
 * @date 4/23/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Pessoas> listaPessoas = new ArrayList<>();

        Pessoas pessoa1 = new Pessoas("Victor", 24);
        Pessoas pessoa2 = new Pessoas("Renan", 20);
        Pessoas pessoa3 = new Pessoas("Eminem", 51);

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaPessoas.size());
        System.out.println(listaPessoas.get(0));
        System.out.println(listaPessoas.toString());

        System.out.println("\nPercorrendo lista de pessoas com for...");
        for (Pessoas pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }
}
