package br.com.fiap.tds;

public class ValorVariavel {

    public static void main(String[] args) {

        // inverter o valor de duas variáveis

        int a = 10;
        int b = 20;
        int aux;

        System.out.println("Variável A: " + a);
        System.out.println("Variável B: " + b);

        aux = a;
        a = b;
        b = aux;

        System.out.println("Variável A: " + a);
        System.out.println("Variável B: " + b);

    }
}