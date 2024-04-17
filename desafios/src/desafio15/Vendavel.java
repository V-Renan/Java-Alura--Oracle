package desafio15;

public interface Vendavel {
    double calcularPrecoFinal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
    void exibirInfos();
}
