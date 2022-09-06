package br.com.fiap.tds;

import java.util.Scanner;

public class SucessorAntecessor {

    public static void main(String[] args) {

        // informar o sucessor e antecessor de um número digitado

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int numero = sc.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor do número " + numero + " é " + antecessor);
        System.out.println("O sucessor do número " + numero + " é " + sucessor);

        sc.close();

    }
}