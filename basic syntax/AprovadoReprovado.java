package br.com.fiap.tds;

import java.util.Scanner;

public class AprovadoReprovado {

    public static void main(String[] args) {

        // ler duas notas e informar se o aluno foi aprovado ou reprovado

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();

        double mediaFinal = (nota1 + nota2) / 2;

        if (mediaFinal >= 6) {
            System.out.println("Média final: " + mediaFinal);
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Média final: " + mediaFinal);
            System.out.println("Situação: REPROVADO");
        }

        sc.close();
    }
}