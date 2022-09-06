package br.com.fiap.tds;

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {

        // informa se um número digitado é positivo ou negativo

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo!");
        } else if (numero == 0) {
            System.out.println("O número é neutro!");
        } else {
            System.out.println("O número é negativo!");
        }

        sc.close();

    }

}