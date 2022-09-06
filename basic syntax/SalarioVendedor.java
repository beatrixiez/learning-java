package br.com.fiap.tds;

import java.util.Scanner;

public class SalarioVendedor {

    public static void main(String[] args) {

        // calcular salário final de um vendedor com acréscimos de comissão

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de carros vendidos:");
        int carrosVendidos = sc.nextInt();

        System.out.println("Digite o valor das vendas efetuadas:");
        double valorTotalVendas = sc.nextDouble();

        System.out.println("Digite o valor do seu salário fixo:");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o valor recebido por cada carro vendido:");
        double valorPorCarroVendido = sc.nextDouble();

        double percentualSobreVendas = valorTotalVendas * 0.05;

        double salarioFinal = salarioFixo + valorPorCarroVendido + percentualSobreVendas;

        System.out.println("O salário final é de: " + salarioFinal + " reais.");

        sc.close();
    }
}