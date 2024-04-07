import java.util.Scanner;

/**
 * @author Victor$
 * @date 4/7/2024$
 * Description:
 */
public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "Victor";
        String tipoConta = "Conta corrente";
        double saldoInicial = 2500.00;

        System.out.printf("""
                ********************************************
                Nome:                      %s
                Tipo de conta:             %s
                Saldo inicial:             R$%.2f
                ********************************************\n
                """, nome, tipoConta, saldoInicial);

        while (true) {
            System.out.println("""
                
                Operacoes
                
                * Digite sua opcao **
                
                1- Consutar saldos
                2- Receber valor
                3- Transferir valor
                4- sair
                """);
            int opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.printf("Saldo disponivel : R$%.2f\n", saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja depositar/receber: R$");
                double novoSaldo = scan.nextDouble();
                if (novoSaldo > 0) {
                    saldoInicial+= novoSaldo;
                    System.out.printf("Saldo atualizado: R$%.2f\n", saldoInicial);
                } else {
                    System.out.println("Valor para deposito insuficiente!");
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja transferir: R$");
                double valorTransferencia = scan.nextDouble();
                if (valorTransferencia <= saldoInicial) {
                    System.out.printf("Transferencia no valor de R$%2f realizada com sucesso!\n",
                            valorTransferencia);
                    saldoInicial -= valorTransferencia;
                    System.out.printf("Saldo disponivel: R$%.2f\n", saldoInicial);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (opcao == 4) {
                System.out.println("Encerrando operacoes...");
                System.exit(0);
            } else {
                System.out.println("Opcao invalida, tente novamente!");
            }

        }
    }
}
