package desafio09;

/**
 * @author Victor$
 * @date 4/12/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();
        conta.sacar(100);

        System.out.println("-----------------------------------------------");

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(100);
    }
}
