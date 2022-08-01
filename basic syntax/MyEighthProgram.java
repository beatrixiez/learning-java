package learningjava;

import java.util.Scanner;

public class MyEighthProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;

        do {
            System.out.println("O número digitado é: " + x);
            System.out.println("Digite outro número:");
            x = sc.nextInt();
        } while (x != 0);

        System.out.println("Saiu do laço de repetição");
    }
}
