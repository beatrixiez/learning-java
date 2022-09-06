package br.com.fiap.tds;

import java.util.Scanner;

public class CustoFinal {

    public static void main(String[] args) {

        // calcular o custo final de um carro com acréscimo de percentuais

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        double custoDeFabrica = sc.nextDouble();

        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double valorDistribuidor = custoDeFabrica * percentualDistribuidor;
        double valorImpostos = custoDeFabrica * percentualImpostos;

        double custoFinal = (custoDeFabrica + valorDistribuidor + valorImpostos);

        System.out.println("O valor final do automóvel é de: " + custoFinal + " reais.");

        sc.close();
    }
}