package desafio24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Victor$
 * @date 4/26/2024$
 * Description:
 */
public class Titulo implements Comparable<Titulo>{
    private String nome;
    private List<Titulo> titulos = new ArrayList<>();
    public Titulo() {

    }
    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void adicionarTitulo(String nome) {
        var novoTitulo = new Titulo(nome);
        this.titulos.add(novoTitulo);
    }
    public void exibirListaOrdenada() {
        Collections.sort(titulos);
        System.out.println("-------------------------------------------");
        System.out.println("Lista de titulos ordenadas...");
        for (Titulo titulo : titulos) {
            System.out.println("Titulo: " + titulo.getNome());
        }
        System.out.println("-------------------------------------------\n");
    }
    public void exbirLista() {
        System.out.println("-------------------------------------------");
        System.out.println("Lista fora de ordem...");
        for (Titulo titulo : titulos) {
            System.out.println("Titulo: " + titulo.getNome());
        }
        System.out.println("-------------------------------------------\n");
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
