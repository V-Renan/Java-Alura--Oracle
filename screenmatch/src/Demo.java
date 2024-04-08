/**
 * @author Victor$
 * @date 4/7/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.nome = "Avengers - Infinity War";
        filme.anoDeLancamento = 2018;
        filme.duracaoEmMinutos = 150;

        filme.exibirFichaTecnica();
        filme.avalia(10);
        filme.avalia(9.9);
        filme.avalia(9);
        System.out.println(filme.somaAvalicao);
        System.out.println(filme.totalDeAvaliacao);
        System.out.println(filme.pegaMedia());
    }
}
