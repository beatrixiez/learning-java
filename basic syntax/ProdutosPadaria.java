package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class ProdutosPadaria {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            String nomeProduto = JOptionPane.showInputDialog("Digite o nome do " + i + "º produto:");
            double valorProduto;

            while (true) {

                try {

                    valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
                    break;

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "Valor digitado incorretamente!", "Atenção", JOptionPane.ERROR_MESSAGE);
                }

            }

            double desconto = 0.5 * valorProduto;
            double valorComDesconto = valorProduto - desconto;
            JOptionPane.showMessageDialog(null, i + "º Produto: " + nomeProduto + "\nValor original: " + valorProduto + "\nValor com desconto: " + valorComDesconto);

        }

    }

}