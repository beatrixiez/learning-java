package learningjava;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        int numero1;
        int numero2;
        int Soma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a soma de dois n�meros");

        System.out.println("Digite o primeiro n�mero:");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo n�mero:");
        numero2 = sc.nextInt();

        Soma = numero1 + numero2;

        System.out.println("A soma dos n�meros � igual a: " + Soma);

        sc.close();
    }
}
