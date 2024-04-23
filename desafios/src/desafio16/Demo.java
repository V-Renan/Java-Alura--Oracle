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
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        System.out.println(listaPessoas.toString());
    }
}
