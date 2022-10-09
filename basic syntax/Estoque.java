package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class Estoque {

    public static void main(String[] args) {

        // verificar a média atual de estoque  informar necessidade de compra de produtos

        int qtdAtual,
            qtdMinima,
            qtdMaxima;
        double qtdMedia;

        qtdAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade atual de produtos em estoque:"));
        qtdMinima = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade mínima de produtos que cabem no estoque:"));
        qtdMaxima = Integer.parseInt(JOptionPane.showInputDialog("Insira a quatidade máxima de produtos que cabem no estoque: "));

        qtdMedia = (qtdMaxima + qtdMinima) / 2.0;

        if (qtdAtual >= qtdMedia) {

            JOptionPane.showMessageDialog(null, "Não realize a compra de  mais produtos!" + "\nQuantidade atual de produtos: " + qtdAtual + "\nQuantidade média de produto: " + qtdMedia);

        } else {

            JOptionPane.showMessageDialog(null, "Realize a compra de mais produtos!" + "\nQuantidade atual de produtos: " + qtdAtual + "\nQuantidade média de produto: " + qtdMedia);

        }

    }

}