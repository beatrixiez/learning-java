package br.com.fiap.tds;

import javax.swing.*;

public class LacoForSoma {

    public static void main(String[] args) {

        int soma = 0;
        int num;

        System.out.println("A soma dos números de 1 a 100 é:");

        for (num=1;num<=100;num++) {
            soma += num;
            System.out.println(soma);
        }

    }

}
