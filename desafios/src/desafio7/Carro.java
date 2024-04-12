package desafio7;

/**
 * @author Victor$
 * @date 4/12/2024$
 * Description:
 */
public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public void definirModelo(String nome) {
        this.modelo = nome;
    }
    public void adicionarPreco(double ano1, double ano2, double ano3) {
        this.precoAno1 = ano1;
        this.precoAno2 = ano2;
        this.precoAno3 = ano3;
    }
    public void exibirInfo() {
        System.out.println("Modelo: " + getModelo());
        System.out.printf("Preco ano 1 R$%.2f\n", getPrecoAno1());
        System.out.println("Preco ano 2 R$"+ getPrecoAno2());
        System.out.println("Preco ano 3 R$" + getPrecoAno3());
        System.out.println("Menor preco: R$" + calcularMenorPreco());
        System.out.println("Maior preco: R$" + calcularMaiorPreco());
    }

    private double calcularMenorPreco() {
        double menorPreco = getPrecoAno1();
        if (getPrecoAno2() < menorPreco) {
            menorPreco = getPrecoAno2();
        } else if (getPrecoAno3() < menorPreco) {
            menorPreco = getPrecoAno3();
        }
        return menorPreco;
    }
    private double calcularMaiorPreco() {
        double maiorPreco = getPrecoAno1();
        if (getPrecoAno2() > maiorPreco) {
            maiorPreco = getPrecoAno2();
        } else if (getPrecoAno3() > maiorPreco) {
            maiorPreco = getPrecoAno3();
        }
        return maiorPreco;
    }
}
