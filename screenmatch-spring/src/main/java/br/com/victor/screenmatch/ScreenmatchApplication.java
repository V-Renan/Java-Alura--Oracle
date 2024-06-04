package br.com.victor.screenmatch;

import br.com.victor.screenmatch.model.DadosEpisodio;
import br.com.victor.screenmatch.model.DadosSerie;
import br.com.victor.screenmatch.model.DadosTemporada;
import br.com.victor.screenmatch.service.ConsumoApi;
import br.com.victor.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args){
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=game+of+thrones&apikey=d7c6eae8");
//		System.out.println(json);
//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
		json = consumoApi.obterDados("http://www.omdbapi.com/?t=game+of+thrones&season=1&episode=1&apikey=d7c6eae8");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);
		System.out.println("-----------------------------------");
		json = consumoApi.obterDados("https://www.omdbapi.com/?t=game+of+thrones&season=1&apikey=d7c6eae8");
		DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
		System.out.println(dadosTemporada);
		//dadosTemporada.exibirDetalhe();

		List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i<= dados.totalTemporadas(); i++) {
			json = consumoApi.obterDados("https://www.omdbapi.com/?t=game+of+thrones&season=" + i + "&apikey=d7c6eae8");
			DadosTemporada dadosTemporada1 = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada1);
		}

		//temporadas.forEach(System.out::println);
		temporadas.forEach(DadosTemporada::exibirDetalhe);
	}
}
