package br.com.victor.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Season") Integer temporada,
                             @JsonAlias("Runtime") String duracao,
                             @JsonAlias("Episodes") List<DadosEpisodio> episodios) {
    public void exibirDetalhe() {
        System.out.println("Season: " + temporada);
        for (DadosEpisodio episodio : episodios) {
            System.out.println("Episodio: " +episodio.titilo() + " -Nota: " + episodio.avaliacao());
        }
        System.out.println("-------------------------------------------------------");

    }
}
