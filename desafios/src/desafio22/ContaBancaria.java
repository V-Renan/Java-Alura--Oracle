package desafio22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 4/24/2024$
 * Description:
 */
public class ContaBancaria {
    private String nome;
    private int numeroConta;
    private double saldo;
    private List<ContaBancaria> contaBancarias = new ArrayList<>();
    public ContaBancaria() {

    }
    public ContaBancaria(String nome, int numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarConta(String nome, int numeroConta, double saldo) {
        var novaConta = new ContaBancaria(nome, numeroConta, saldo);
        this.contaBancarias.add(novaConta);
    }
    public void exibirConta() {
        contaBancarias.forEach(System.out::println);
    }
    public void contaComMaiorSaldo() {
        ContaBancaria contaMaiorSaldo = contaBancarias.get(0);
        for (ContaBancaria contaBancaria : contaBancarias) {
            if (contaBancaria.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = contaBancaria;
            }
        }
        System.out.printf("""
                ----------------Conta com maior saldo----------------
                Proprietario: %s
                Numero da conta: %d
                Saldo: R$%.2f
                ------------------------------------------------------
                """, contaMaiorSaldo.getNome(),
                contaMaiorSaldo.getNumeroConta(), contaMaiorSaldo.getSaldo());
    }

    @Override
    public String toString() {
        return String.format("""
                Proprietario: %s
                Numero da conta: %d
                Saldo: R$%.2f
                """, getNome(), getNumeroConta(), getSaldo());
    }
}
