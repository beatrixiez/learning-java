package learningjava;

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {

        double base;
        double altura;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base do ret�ngulo:");
        base = sc.nextDouble();

        System.out.println("Digite o valor da altura do ret�ngulo:");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.println("A �rea do ret�ngulo corresponde a: " + area);

        sc.close();

    }

}
