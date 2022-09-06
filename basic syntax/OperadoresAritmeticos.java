package br.com.fiap.tds;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        // realizar as quatro operações com dois números

        int x = 9;
        int y = 2;

        int soma = x + y;
        int subtracao = x - y;
        int divisao = x / y;
        int multiplicacao = x * y;
        int resto = x % y;

        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da divisão é: " + divisao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado do resto da divisão é: " + resto);

        // utilizar operadores de incremento

        x++;
        System.out.println("O resultado do incremento de X é: " + x);

        y--;
        System.out.println("O resultado do decremento de Y é: " + y);

        x += 10;
        System.out.println("O resultado da atribuição aditiva é: " + x);

        y -= 10;
        System.out.println("O resultado da atribuição subtrativa é: " + y);

    }
}