package learningjava;

import java.util.Scanner;

public class CasosCoronavirus {

    public static void main(String[] args) {

        int sudeste;
        int sul;
        int centro_oeste;
        int nordeste;
        int norte;
        int brasil;

        double percentualSudeste;
        double percentualSul;
        double percentualCentro_Oeste;
        double percentualNordeste;
        double percentualNorte;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o n�mero de casos da regi�o Sudeste:");
        sudeste = sc.nextInt();

        System.out.println("Digite o n�mero de casos da regi�o Sul:");
        sul = sc.nextInt();

        System.out.println("Digite o n�mero de casos da regi�o Centro-Oeste:");
        centro_oeste = sc.nextInt();

        System.out.println("Digite o n�mero de casos da regi�o Nordeste:");
        nordeste = sc.nextInt();

        System.out.println("Digite o n�mero de casos da regi�o Norte:");
        norte = sc.nextInt();

        brasil = sudeste + sul + centro_oeste + nordeste + norte;
        percentualSudeste = (sudeste * 100.0) / brasil;
        percentualSul = (sul * 100.0) / brasil;
        percentualCentro_Oeste = (centro_oeste * 100.0) / brasil;
        percentualNordeste = (nordeste * 100.0) / brasil;
        percentualNorte = (norte * 100.0) / brasil;

        System.out.println("N�mero de casos no Brasil: " + brasil + "\r\nPercentual: 100%\n");
        System.out.println("N�mero de casos na regi�o Sudeste: " + sudeste + "\r\nPercentual: " + percentualSudeste + "%\n");
        System.out.println("N�mero de casos na regi�o Sul: " + sul + "\r\nPercentual: " + percentualSul + "%\n");
        System.out.println("N�mero de casos na regi�o Centro-Oeste: " + centro_oeste + "\r\nPercentual: " + percentualCentro_Oeste + "%\n");
        System.out.println("N�mero de casos na regi�o Nordeste: " + nordeste + "\r\nPercentual: " + percentualNordeste + "%\n");
        System.out.println("N�mero de casos na regi�o Norte: " + norte + "\r\nPercentual: " + percentualNorte + "%\n");

        sc.close();

    }

}
