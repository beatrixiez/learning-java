package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class PrecoProduto {

    public static void main(String[] args) {

        // ler dados de entrada e calcular preço do produto e descontos

        String nome;
        int qtdAdquirida;
        double preco, precoTotal, desconto, totalPagar;

        nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        qtdAdquirida = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada:"));
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));

        precoTotal = qtdAdquirida * preco;

        if (qtdAdquirida > 0 && qtdAdquirida <= 5) {

            desconto = precoTotal * 0.02;
            totalPagar = precoTotal - desconto;

        } else if (qtdAdquirida <= 10) {

            desconto = precoTotal * 0.03;
            totalPagar = precoTotal - desconto;

        } else {

            desconto = precoTotal * 0.05;
            totalPagar = precoTotal - desconto;

        }

        JOptionPane.showMessageDialog(null, "Produto: " + nome + "\nQuantidade: " + qtdAdquirida + "\nTotal da compra: " + totalPagar + " reais");

    }

}