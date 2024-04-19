package br.com.alura.principal;

import br.com.alura.modelos.MinhasPreferidas;
import br.com.alura.modelos.Musica;
import br.com.alura.modelos.Podcast;

/**
 * @author Victor$
 * @date 4/18/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("We Are Young");
        musica1.setArtista("Fun., Janelle Monae");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Podpah");
        podcast1.setHost("Igao e Mitico");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);
    }
}
