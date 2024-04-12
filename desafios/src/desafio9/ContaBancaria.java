package desafio9;

/**
 * @author Victor$
 * @date 4/12/2024$
 * Description:
 */
public class ContaBancaria {
    private double saldo;
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        double novoSaldo;
        if (valor > 0) {
            System.out.printf("Deposito no valor de %.2f, relizado com sucesso!\n", valor);
            novoSaldo = getSaldo() + valor;
            setSaldo(novoSaldo);
        } else {
            System.out.println("Valor de deposito invalido!\n");
        }
    }
    public void sacar(double valor) {
        double novoSaldo;
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente!");
        } else {
            novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            System.out.printf("Saque no valor de R$%.2f realizado com sucesso!\n", valor);
            System.out.printf("Saldo atualizado: R$%.2f\n", getSaldo());
        }
    }
    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$%.2f\n", getSaldo());
    }
}
