package desafio14;

/**
 * @author Victor$
 * @date 4/16/2024$
 * Description:
 */
public class ProdutoFisico extends Produto implements Calculavel{
    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05;
    }
}
