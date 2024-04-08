/**
 * @author Victor$
 * @date 4/7/2024$
 * Description:
 */
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvalicao;
    int totalDeAvaliacao;
    int duracaoEmMinutos;



    void avalia(double nota) {
        somaAvalicao+= nota;
        totalDeAvaliacao++;
    }

    void exibirFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Duracao: " + duracaoEmMinutos);
    }

    double pegaMedia() {
        return somaAvalicao / totalDeAvaliacao;
    }
}
