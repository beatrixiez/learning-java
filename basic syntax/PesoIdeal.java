package br.com.fiap.tds;

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {

        System.out.println("Vamos calcular o peso ideal de acordo com seu gênero e altura");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = sc.next();

        System.out.println("Digite sua altura utilizando a vírgula, exemplo: 1,68:");
        double altura = sc.nextDouble();

        System.out.println("Gênero: digite M para masculino ou F para feminino:");
        char genero = sc.next().charAt(0);

        double pesoIdeal;

        if (genero == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("O peso ideal de " + nome + " é de " + pesoIdeal + " quilos.");

    }

}