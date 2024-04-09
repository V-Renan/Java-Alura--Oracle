package desafio2;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void exibirDados() {
        System.out.printf("""
                Numero da conta: %d
                Saldo: R$%.2f
                Titular: %s
                """, getNumeroConta(), getSaldo(), getTitular());
    }
}
