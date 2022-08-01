package learningjava;

import java.util.Scanner;

public class MyFifthProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Digite um número de 1 a 5:");
        x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("O número digitado foi o 1");
                break;
            case 2:
                System.out.println("O número digitado foi o 2");
                break;
            case 3:
                System.out.println("O número digitado foi o 3");
                break;
            case 4:
                System.out.println("O número digitado foi o 4");
                break;
            case 5:
                System.out.println("O número digitado foi o 5");
                break;
            default:
                System.out.println("O número digitado não está entre 1 e 5");
                break;
        }
    }
}
