package br.com.fiap.tds;

import java.util.Scanner;

public class JornadaTrabalho {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor do salário por hora:");
        double salarioHora = sc.nextDouble();

        double salarioTotal;
        double adicionalHoras = 1.50;

        if (horasTrabalhadas <= 160) {
            salarioTotal = horasTrabalhadas * salarioHora;
        } else {
            salarioTotal = horasTrabalhadas * (salarioHora * adicionalHoras);
        }
        System.out.println("O salário total é de: " + salarioTotal + " reais.");

    }

}