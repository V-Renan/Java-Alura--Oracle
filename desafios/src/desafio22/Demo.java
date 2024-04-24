package desafio22;

/**
 * @author Victor$
 * @date 4/24/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.adicionarConta("Victor", 123456789,2000.00);
        contaBancaria.adicionarConta("Renan", 987654321,33500.00);
        contaBancaria.adicionarConta("Michael Jackson", 678954321, 10000.00);

        contaBancaria.exibirConta();

        contaBancaria.contaComMaiorSaldo();
    }
}
