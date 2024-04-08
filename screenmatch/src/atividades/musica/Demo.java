package atividades.musica;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Bones";
        minhaMusica.artista = "Imagine Dragons";
        minhaMusica.anoLancamento = 2022;

        minhaMusica.exibirFichaTecnica();

        minhaMusica.avaliarMusica(10);
        minhaMusica.avaliarMusica(8);
        minhaMusica.avaliarMusica(9.5);

        double mediaAvalicoes = minhaMusica.mediaAvalicao();

        System.out.printf("Media das avaliacoes: %.1f", mediaAvalicoes);
    }
}
