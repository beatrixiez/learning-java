package br.com.fiap.tds;

public class TiposDeDados {

    public static void main(String[] args) {

        // exibir strings na tela

        int idade = 10;
        double preco = 10.0;
        char genero = 'M';
        boolean maiorIdade = false;

        System.out.println(idade);
        System.out.println(preco);
        System.out.println(genero);
        System.out.println(maiorIdade);

        int novoPreco = (int) preco;

        System.out.println(novoPreco);

    }
}