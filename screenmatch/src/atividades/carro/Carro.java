package atividades.carro;

import java.util.Date;

/**
 * @author Victor$
 * @date 4/8/2024$
 * Description:
 */
public class Carro {
    String modelo;
    int idade;
    int ano;
    String cor;
    public Carro() {

    }
    void exibirCarro() {
        System.out.printf("""
                Modelo: %s
                Idade: %d
                Ano: %d
                Cor: %s
                """, modelo, idade, ano, cor);
    }

    int calcularIdade() {
        return 2024 - ano;
    }
}
