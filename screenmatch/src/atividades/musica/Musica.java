package atividades.musica;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numeroAvaliacoes;

    void exibirFichaTecnica() {
        separador();
        System.out.printf("""
                Titulo: %s
                Artista: %s
                Ano de lancamento %d
                """, titulo, artista, anoLancamento);
        separador();
    }
    void separador() {
        System.out.println("--------------------------------");
    }
    void avaliarMusica(double nota) {
        somaAvaliacao += nota;
        numeroAvaliacoes++;
    }
    double mediaAvalicao() {
        return somaAvaliacao / numeroAvaliacoes;
    }
}
