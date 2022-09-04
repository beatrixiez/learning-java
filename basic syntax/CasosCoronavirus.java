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

        System.out.println("Digite o número de casos da região Sudeste:");
        sudeste = sc.nextInt();

        System.out.println("Digite o número de casos da região Sul:");
        sul = sc.nextInt();

        System.out.println("Digite o número de casos da região Centro-Oeste:");
        centro_oeste = sc.nextInt();

        System.out.println("Digite o número de casos da região Nordeste:");
        nordeste = sc.nextInt();

        System.out.println("Digite o número de casos da região Norte:");
        norte = sc.nextInt();

        brasil = sudeste + sul + centro_oeste + nordeste + norte;
        percentualSudeste = (sudeste * 100.0) / brasil;
        percentualSul = (sul * 100.0) / brasil;
        percentualCentro_Oeste = (centro_oeste * 100.0) / brasil;
        percentualNordeste = (nordeste * 100.0) / brasil;
        percentualNorte = (norte * 100.0) / brasil;

        System.out.println("Número de casos no Brasil: " + brasil + "\r\nPercentual: 100%\n");
        System.out.println("Número de casos na região Sudeste: " + sudeste + "\r\nPercentual: " + percentualSudeste + "%\n");
        System.out.println("Número de casos na região Sul: " + sul + "\r\nPercentual: " + percentualSul + "%\n");
        System.out.println("Número de casos na região Centro-Oeste: " + centro_oeste + "\r\nPercentual: " + percentualCentro_Oeste + "%\n");
        System.out.println("Número de casos na região Nordeste: " + nordeste + "\r\nPercentual: " + percentualNordeste + "%\n");
        System.out.println("Número de casos na região Norte: " + norte + "\r\nPercentual: " + percentualNorte + "%\n");

        sc.close();

    }

}
