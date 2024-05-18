package br.com.victor.modelo;

public class CurrencyConversion {
    private String baseCurreny;
    private String targetCurrency;
    private double amount;
    private double convertedAmount;

    public CurrencyConversion(String baseCurreny, String targetCurrency, double amount, double convertedAmount) {
        this.baseCurreny = baseCurreny;
        this.targetCurrency = targetCurrency;
        this.amount = amount;
        this.convertedAmount = convertedAmount;
    }

    public String getBaseCurreny() {
        return baseCurreny;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    @Override
    public String toString() {
        return String.format("%.2f %s é igual a %.2f %s", getAmount(), getBaseCurreny(), getConvertedAmount(), getTargetCurrency());
    }
}
