package desafio25;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

/**
 * @author Victor$
 * @date 4/26/2024$
 * Description:
 */
public class ExemplosLinkedList {
    public static void main(String[] args) {
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento A");
        listaArrayList.add("Elemento B");
        listaArrayList.add("Elemento C");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento 1");
        listaLinkedList.add("Elemento 2");
        listaLinkedList.add("Elemento 3");

        listaArrayList.forEach(System.out::println);

        listaLinkedList.forEach(System.out::println);
    }
}
