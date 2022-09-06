package br.com.fiap.tds;

import java.util.Scanner;

public class OperacoesAritmeticas {

    public static void main(String[] args) {

        // receber dois números e realizar as quatro operações básicas

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite outro número:");
        double n2 = sc.nextDouble();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        System.out.println("O resultado da soma de " + n1 + " + " + n2 + " é igual a: " + soma);
        System.out.println("O resultado da subtração de " + n1 + " - " + n2 + " é igual a: " + subtracao);
        System.out.println("O resultado da multiplicação de " + n1 + " * " + n2 + " é igual a: " + multiplicacao);
        System.out.println("O resultado da divisão de " + n1 + " / " + n2 + " é igual a: " + divisao);

        sc.close();
    }
}