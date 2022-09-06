package br.com.fiap.tds;

import java.util.Scanner;

public class PercentualVotos {

    public static void main(String[] args) {

        // calcular percentual de votos brancos, nulos e válidos

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de eleitores:");
        int eleitores = sc.nextInt();

        System.out.println("Digite a quantidade de votos brancos:");
        int votosBrancos = sc.nextInt();

        System.out.println("Digite a quantidade de votos nulos:");
        int votosNulos = sc.nextInt();

        System.out.println("Digite a quantidade de votos válidos:");
        int votosValidos = sc.nextInt();

        double percentualBrancos = (votosBrancos * 100.0) / eleitores;
        double percentualNulos = (votosNulos * 100.0) / eleitores;
        double percentualValidos = (votosValidos * 100.0) / eleitores;

        System.out.println("Do total de " + eleitores + " eleitores, " + percentualBrancos + "% votaram em branco, " + percentualNulos + "% votaram nulo, e " + percentualValidos + "% foram os votos válidos." );

        sc.close();
    }
}