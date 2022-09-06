package br.com.fiap.tds;

import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) {

        // converter a idade de uma pessoa para dias

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva quantos anos você têm: ");
        int anos = sc.nextInt();

        System.out.println("Escreva quantos meses você têm: ");
        int meses = sc.nextInt();

        System.out.println("Escreva quantos dias você têm: ");
        int dias = sc.nextInt();

        int totalAnos = anos * 365;
        int totalMeses = meses * 30;
        int idade = totalAnos + totalMeses + dias;

        System.out.println("Você tem " + idade + " dias de vida.");

        sc.close();

    }
}