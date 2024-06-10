package br.com.victor.screenmatch.principal;

import br.com.victor.screenmatch.model.DadosEpisodio;
import br.com.victor.screenmatch.model.DadosSerie;
import br.com.victor.screenmatch.model.DadosTemporada;
import br.com.victor.screenmatch.service.ConsumoApi;
import br.com.victor.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String API_KEY = "&apikey=d7c6eae8";
    private Scanner scan = new Scanner(System.in);
    public void exibirMenu() {
        System.out.println("Digite o nome da serie: ");
        var nomeSerie = scan.nextLine().replace(" ","+");
        var json = consumo.obterDados(ENDERECO + nomeSerie + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i<= dados.totalTemporadas(); i++) {
            json = consumo.obterDados("https://www.omdbapi.com/?t=" + nomeSerie + "&season=" + i + "&apikey=d7c6eae8");
            DadosTemporada dadosTemporada1 = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada1);
        }

        //temporadas.forEach(System.out::println);
        temporadas.forEach(DadosTemporada::exibirDetalhe);


        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

        System.out.println("\nTop 5 episodios");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}
