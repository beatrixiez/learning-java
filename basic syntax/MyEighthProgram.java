package learningjava;

import java.util.Scanner;

public class MyEighthProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;

        do {
            System.out.println("O n�mero digitado �: " + x);
            System.out.println("Digite outro n�mero:");
            x = sc.nextInt();
        } while (x != 0);

        System.out.println("Saiu do la�o de repeti��o");
    }
}
