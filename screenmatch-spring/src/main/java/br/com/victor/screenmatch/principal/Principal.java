package br.com.victor.screenmatch.principal;

import br.com.victor.screenmatch.model.DadosSerie;
import br.com.victor.screenmatch.service.ConsumoApi;
import br.com.victor.screenmatch.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String API_KEY = "&apikey=d7c6eae8";
    private Scanner scan = new Scanner(System.in);
    public void exibirMenu() {
        System.out.println("Digite o nome da serie: ");
        var nomeSerie = scan.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+" + API_KEY));
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
}
