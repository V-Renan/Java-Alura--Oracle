package atividades.carro;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Golf GTI";
        carro1.ano = 2022;
        carro1.cor = "Preto";

        carro1.exibirCarro();

        System.out.println("Idade do carro: " + carro1.calcularIdade() + " Anos.");
    }
}
