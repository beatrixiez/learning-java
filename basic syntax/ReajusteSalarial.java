package br.com.fiap.tds;

import java.util.Scanner;

public class ReajusteSalarial {

    public static void main(String[] args) {

        // informar valor final de um salário com reajuste

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor atual do seu salário:");
        double salarioAtual = sc.nextDouble();

        System.out.println("Digite o valor percentual de ajuste:");
        double reajuste = sc.nextDouble();

        double valorReajuste = (salarioAtual * reajuste) / 100.0;
        double salarioReajustado = salarioAtual + valorReajuste;

        System.out.println("O valor do salário atualizado é de: " + salarioReajustado + " reais.");
       
        sc.close();
    }
}