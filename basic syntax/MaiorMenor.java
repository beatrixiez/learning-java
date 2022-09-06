package br.com.fiap.tds;

import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {

        // verificar se um número é igual, maior ou menor que 10

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = sc.nextDouble();

        if (numero > 10) {
            System.out.println("O número é maior que 10!");
        } else if (numero == 10) {
            System.out.println("O número é igual a 10!");
        } else {
            System.out.println("O número é menor que 10!");
        }

        sc.close();
    }
}