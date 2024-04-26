package desafio09;

/**
 * @author Victor$
 * @date 4/12/2024$
 * Description:
 */
public class ContaCorrente extends ContaBancaria{
    private double tarifa = 3.52;

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void cobrarTarifaMensal() {
        double novoSaldo = getSaldo() - getTarifa();
        setSaldo(novoSaldo);
        System.out.printf("Tarifa mensal de R$%.2f cobrada.\n", tarifa);
    }
}
