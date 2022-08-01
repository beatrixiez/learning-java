package learningjava;

import java.util.Scanner;

public class MySixthProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número diferente de 0 para não sair do laço de repetição:");
        x = sc.nextInt();

        while (x != 0) {
            System.out.println("O número digitado foi: " + x);
            x = sc.nextInt();
        }

        System.out.println("Saiu do laço de repetição");

    }
}
