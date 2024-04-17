package desafio15;

/**
 * @author Victor$
 * @date 4/17/2024$
 * Description:
 */
public class Servico implements Vendavel{
    private String descicrao;
    private double precoHora;
    public Servico() {

    }
    public Servico(String descicrao, double precoHora) {
        this.descicrao = descicrao;
        this.precoHora = precoHora;
    }
    public String getDescicrao() {
        return descicrao;
    }

    public void setDescicrao(String descicrao) {
        this.descicrao = descicrao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPrecoFinal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }

    @Override
    public void exibirInfos() {
    }
}
