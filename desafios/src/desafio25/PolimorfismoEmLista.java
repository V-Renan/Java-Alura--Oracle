package desafio25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Victor$
 * @date 4/26/2024$
 * Description:
 */
public class PolimorfismoEmLista {
    public static void main(String[] args) {
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        listaPolimorfica.add("Elemento C");

        System.out.println("Lista polimorfica ArrayList");
        listaPolimorfica.forEach(System.out::println);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        listaPolimorfica.add("Elemento 3");

        System.out.println("Lista polimorfica LinkedList");
        listaPolimorfica.forEach(System.out::println);
    }
}
