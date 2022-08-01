package learningjava;

import java.util.Scanner;

public class MyThirdProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite um número: ");
        valor1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("Entrou no primeiro bloco");
        } else if (valor1 == 3) {
            System.out.println("Entrou no segundo bloco");
        } else {
            System.out.println("Entrou no terceiro bloco");
        }
    }
}
