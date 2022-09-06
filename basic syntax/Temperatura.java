package br.com.fiap.tds;

public class Temperatura {

    public static void main(String[] args) {

        // mostrar uma temperatura em diferentes sistemas de medição

        double C = 2.43;
        double F = C * 1.8 + 32;
        double K = C + 273.15;
        double Re = C * 0.8;
        double Ra = C * 1.8 + 32 + 459.67;

        System.out.println("Temperatura em Celsius: " + C);
        System.out.println("Temperatura em Fahrenheit: " + F);
        System.out.println("Temperatura em Kelvin: " + K);
        System.out.println("Temperatura em Réaumur: " + Re);
        System.out.println("Temperatura em Rankine: " + Ra);
    }
}