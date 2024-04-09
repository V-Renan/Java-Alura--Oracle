import br.com.alura.modelos.Filme;

/**
 * @author Victor$
 * @date 4/7/2024$
 * Description:
 */
public class DemoFilme {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("Avengers - Infinity War");
        filme.setAnoDeLancamento(2018);
        filme.setDuracaoEmMinutos(150);

        filme.exibirFichaTecnica();
        filme.avalia(10);
        filme.avalia(9.9);
        filme.avalia(9);
        System.out.println("Total de avaliacoes: " + filme.getTotalDeAvaliacao());
        System.out.printf("Media de avaliacoes: %.1f", filme.pegaMedia());
    }
}
