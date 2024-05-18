package br.com.victor.demo;

import br.com.victor.modelo.CurrencyConversion;
import br.com.victor.servico.ExchangeRateService;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExchangeRateService exchangeRateService = new ExchangeRateService();

        System.out.println("Digite a moeda base: ");
        String baseCurrency = scan.next().toUpperCase();

        System.out.println("Digite a moeda alvo: ");
        String targetCurrency = scan.next().toUpperCase();

        System.out.println("Digite o valor em " + baseCurrency + " a ser convertido: ");
        double amount = scan.nextDouble();

        try {
            double exchangeRate = exchangeRateService.getExchangeRate(baseCurrency, targetCurrency);
            System.out.println("Taxa de cambio obtida: " + exchangeRate);
            double convertedAmount = amount * exchangeRate;
            CurrencyConversion conversion = new CurrencyConversion(baseCurrency, targetCurrency, amount, convertedAmount);
            System.out.println(conversion);
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            e.printStackTrace();
        }

        scan.close();
    }
}
