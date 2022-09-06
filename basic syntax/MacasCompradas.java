package br.com.fiap.tds;

import java.util.Scanner;

public class MacasCompradas {

    public static void main(String[] args) {

        // calcular o custo total de uma compra de acordo com a quantidade de maçãs compradas

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de maçãs compradas:");
        int macasCompradas = sc.nextInt();

        if (macasCompradas < 12) {
            double valorTotal = macasCompradas * 1.30;
            System.out.println("O valor total da compra é de: " + valorTotal + " reais.");
        } else {
            System.out.println("O valor total da compra é de: " + macasCompradas + " reais.");
        }

        sc.close();

    }

}