package desafio14;

/**
 * @author Victor$
 * @date 4/16/2024$
 * Description:
 */
public class Livro extends Produto implements Calculavel{
    private String autor;
    @Override
    public double calcularPrecoFinal() {
        double precoFinal = getPreco() * 0.9;
        return precoFinal;
    }
}
