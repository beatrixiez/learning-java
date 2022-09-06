 

package br.com.fiap.tds;

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {

        // calcular a área de um retângulo

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("A área do triângulo corresponde a: " + area);

    }
}