package learningjava;

import java.util.Scanner;

public class MySixthProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um n�mero diferente de 0 para n�o sair do la�o de repeti��o:");
        x = sc.nextInt();

        while (x != 0) {
            System.out.println("O n�mero digitado foi: " + x);
            x = sc.nextInt();
        }

        System.out.println("Saiu do la�o de repeti��o");

    }
}
