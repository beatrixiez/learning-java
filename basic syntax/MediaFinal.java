package br.com.fiap.tds;

import java.util.Scanner;

public class MediaFinal {

    public static void main(String[] args) {

        // receber três notas e informar a média ponderada final

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        float nota1 = sc.nextFloat();

        System.out.println("Digite a segunda nota:");
        float nota2 = sc.nextFloat();

        System.out.println("Digite a terceira nota:");
        float nota3 = sc.nextFloat();

        double mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.println("A média final é: " + mediaFinal);

        sc.close();

    }
}