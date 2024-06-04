package br.com.victor.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Title") String titulo,
                             @JsonAlias("Season") String temporada,
                             @JsonAlias("Episodes") List<DadosEpisodio> episodios) {
    public void exibirDetalhe() {
        System.out.println("Season: " + temporada);
        for (DadosEpisodio episodio : episodios) {
            System.out.println("Episodio: " +episodio.titilo() + " - " + episodio.avaliacao());
        }
        System.out.println("-------------------------------------------------------");

    }
}
