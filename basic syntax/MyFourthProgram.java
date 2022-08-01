package learningjava;

import java.util.Scanner;

public class MyFourthProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome1, nome2;

        System.out.println("Digite um nome:");
        nome1 = sc.next();

        System.out.println("Digite outro nome:");
        nome2 = sc.next();

        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais");
        } else {
            System.out.println("Os nomes são diferentes");
        }
    }
}
