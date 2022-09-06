package br.com.fiap.tds;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        // calcular o IMC

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc >= 18.5 && imc <= 25) {
            System.out.println("Seu peso está ideal!");
        } else {
            System.out.println("Seu peso está fora do ideal!");
        }

        sc.close();

    }

}