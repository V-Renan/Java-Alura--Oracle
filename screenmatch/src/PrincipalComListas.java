import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;
import br.com.alura.modelos.Titulo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 4/23/2024$
 * Description:
 */
public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Um lugar silencioso", 2018);
        filme1.avalia(10);
        Filme filme2 = new Filme("Avengers - Infinity War", 2018);
        filme2.avalia(10);
        Filme filme3 = new Filme("Tropa de Elite", 2010);
        filme3.avalia(8);

        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }

    }
}
