package br.com.fiap.tds;

import java.util.Scanner;

public class MediaSalarial {

    public static void main(String[] args) {

        // calcular a média entre quatro salários

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a média salarial de 4 funcionários.");
        System.out.println("-------------------");

        System.out.println("Digite o valor do primeiro salário:");
        double sal1 = sc.nextDouble();

        System.out.println("Digite o valor do segundo salário:");
        double sal2 = sc.nextDouble();

        System.out.println("Digite o valor do terceiro salário:");
        double sal3 = sc.nextDouble();

        System.out.println("Digite o valor do quarto salário:");
        double sal4 = sc.nextDouble();

        double medialSalarial = (sal1 + sal2 + sal3 + sal4) / 4;

        System.out.println("A média salarial é de: " + medialSalarial + " reais.");

        sc.close();

    }
}