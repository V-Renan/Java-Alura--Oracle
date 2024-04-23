import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.modelos.Episodio;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;

import java.util.ArrayList;

/**
 * @author Victor$
 * @date 4/7/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Avengers - Infinity War", 2018);

        filme1.setDuracaoEmMinutos(150);

        filme1.exibirFichaTecnica();
        filme1.avalia(10);
        filme1.avalia(9.9);
        filme1.avalia(9);
        System.out.println("Total de avaliacoes: " + filme1.getTotalDeAvaliacao());
        System.out.printf("Media de avaliacoes: %.1f\n", filme1.pegaMedia());
        System.out.println("-------------------------------------------");

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibirFichaTecnica();
        System.out.println("Duracao para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme filme2 = new Filme("Tropa de Elite", 2010);
        filme2.setDuracaoEmMinutos(200);
        System.out.println("-------------------------------------------");

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(filme1);
        calc.inclui(filme2);
        calc.inclui(lost);
        System.out.println("Tempo total para maratonar: " + calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.println("-------------------------------------------");
        System.out.println("O filme: " + filme1.getNome());
        filtro.filtra(filme1);
        System.out.println("-------------------------------------------");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoVictor = new Filme("Um Lugar Silencioso", 2028);
        filmeDoVictor.setDuracaoEmMinutos(130);
        filmeDoVictor.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        // adicionando o filme com o .add disponivel no proprio array (tambem pode ser criado um metodo para adicionar)
        listaDeFilmes.add(filmeDoVictor);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);

        // .size mostra o tamanho do array
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());

        // acessando o arrauy pelo index
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());

        // percorrendo o array com for
        for (Filme filme : listaDeFilmes) {
            System.out.println("\nFilme: " + filme.getNome());
        }

        // usando metodo toString
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());

    }
}
