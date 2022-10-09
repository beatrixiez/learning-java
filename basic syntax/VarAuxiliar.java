package br.com.fiap.tds;

public class VarAuxiliar {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int aux = a;

        System.out.println("A é igual a:" + a);
        System.out.println("B é igual a:" + b);

        a = b;
        b = aux;

        System.out.println("A é igual a:" + a);
        System.out.println("B é igual a:" + b);
    }
}