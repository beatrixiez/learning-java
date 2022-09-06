package br.com.fiap.tds;

import java.util.Scanner;

public class IdadeVotacao {

    public static void main(String[] args) {

        // solicitar a idade de uma pessoa e verificar se ela pode votar

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o ano atual:");
        int anoAtual = sc.nextInt();

        System.out.println("Insira seu ano de nascimento:");
        int anoDeNascimento = sc.nextInt();

        int idadePessoa = anoAtual - anoDeNascimento;

        if (idadePessoa >= 16 && idadePessoa < 18 || idadePessoa > 70) {
            System.out.println("Você tem " + idadePessoa + " anos. Você pode votar, mas não é obrigatório.");
        } else if (idadePessoa >= 18 && idadePessoa <= 70) {
            System.out.println("Você tem " + idadePessoa + " anos. Você é obrigado a votar.");
        } else {
            System.out.println("Você tem " + idadePessoa + " anos. Você não pode votar.");
        }

        sc.close();

    }
}