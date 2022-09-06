package br.com.fiap.tds;

public class OperadoresLogicos {

    public static void main(String[] args) {

        // realizar testes com operadores lógicos

        int x = 14;
        int y = 8;

        if (x > 10 && y > 10) {
            System.out.println("Ambos são maiores que 10");
        }

        if (x > 10 || y > 10) {
            System.out.println("Pelo menos um dos números é maior que 10");
        }

        if (x > 10 ^ y > 10) {
            System.out.println("Um dos números é maior que 10, o outro não");
        }

        if (!(x == 10 && y == 10)) {
            System.out.println("Os números são diferentes de 10");
        }

    }
}