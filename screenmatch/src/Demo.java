import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;

/**
 * @author Victor$
 * @date 4/7/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("Avengers - Infinity War");
        filme1.setAnoDeLancamento(2018);
        filme1.setDuracaoEmMinutos(150);

        filme1.exibirFichaTecnica();
        filme1.avalia(10);
        filme1.avalia(9.9);
        filme1.avalia(9);
        System.out.println("Total de avaliacoes: " + filme1.getTotalDeAvaliacao());
        System.out.printf("Media de avaliacoes: %.1f\n", filme1.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("Tropa de Elite");
        filme2.setAnoDeLancamento(2010);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(filme1);
        calc.inclui(filme2);
        calc.inclui(lost);
        System.out.println(calc.getTempoTotal());
    }
}
