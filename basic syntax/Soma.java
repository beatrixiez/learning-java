package learningjava;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        int numero1;
        int numero2;
        int Soma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a soma de dois números");

        System.out.println("Digite o primeiro número:");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = sc.nextInt();

        Soma = numero1 + numero2;

        System.out.println("A soma dos números é igual a: " + Soma);

        sc.close();
    }
}
