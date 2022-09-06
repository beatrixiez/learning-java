package br.com.fiap.tds;

import java.util.Scanner;

public class ValorMaior {

    public static void main(String[] args) {

        // ler dois valores e escrever o maior

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        double num1 = sc.nextDouble();

        System.out.println("Insira um outro número:");
        double num2 = sc.nextDouble();

        if (num1 == num2) {
            System.out.println("O números precisam ser diferentes!");
        } else if (num1 > num2) {
            System.out.println("O " + num1 + " é maior que o " + num2);
        } else {}
        System.out.println("O " + num2 + " é maior que o " + num1);

        sc.close();

    }
}