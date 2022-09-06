package br.com.fiap.tds;

import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {

        // ler dois valores e escrever em ordem crescente

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        double num1 = sc.nextDouble();

        System.out.println("Insira um outro número:");
        double num2 = sc.nextDouble();

        if (num1 == num2) {
            System.out.println("O números precisam ser diferentes!");
        } else if (num1 > num2) {
            System.out.println("Os números em ordem crescente: " + num2 + " - " + num1);
        } else {}
        System.out.println("Os números em ordem crescente: " + num1 + " - " + num2);

        sc.close();
    }
}