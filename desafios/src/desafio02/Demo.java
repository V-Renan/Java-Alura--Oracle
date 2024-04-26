package desafio02;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Jorginho boladao");
        conta.setNumeroConta(123);
        conta.setSaldo(1000);

        conta.exibirDados();

        conta.setSaldo(1500);
        double novoSaldoJorgin = conta.getSaldo();

        System.out.printf("\nNovo saldo: R$%.2f", novoSaldoJorgin);
    }
}
