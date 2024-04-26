package desafio23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Victor$
 * @date 4/26/2024$
 * Description:
 */
public class ListaNumerosOrdenados {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(10);
        listaNumeros.add(23);
        listaNumeros.add(8);
        listaNumeros.add(1);
        listaNumeros.add(6);
        listaNumeros.add(3);

        Collections.sort(listaNumeros);
        System.out.println("Lista de numeros ordenada...");
        System.out.println(listaNumeros);
    }
}
