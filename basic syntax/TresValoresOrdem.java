package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class TresValoresOrdem {

    public static void main(String[] args) {

        // ler três valores diferentes e escrever em ordem crescente

        double num1, num2, num3;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (num1 == num2 || num1 == num3 || num2 == num3) {

            JOptionPane.showMessageDialog(null, "Por favor, digite números diferentes!");

        } else if (num1 > num2 && num2 > num3) {

            JOptionPane.showMessageDialog(null, "O valores digitados em ordem crescente: " + num3 + " - " + num2 + " - " + num1);

        } else if (num2 > num3 && num3 > num1) {

            JOptionPane.showMessageDialog(null, "O valores digitados em ordem crescente: " + num1 + " - " + num3 + " - " + num2);

        } else if (num3 > num1 && num1 > num2) {

            JOptionPane.showMessageDialog(null, "O valores digitados em ordem crescente: " + num2 + " - " + num1 + " - " + num3);

        } else if (num3 > num2 && num2 > num1) {

            JOptionPane.showMessageDialog(null, "O valores digitados em ordem crescente: " + num1 + " - " + num2 + " - " + num3);

        } else if (num1 > num3 && num3 > num2) {

            JOptionPane.showMessageDialog(null, "O valores digitados em ordem crescente: " + num2 + " - " + num3 + " - " + num1);

        } else {

            JOptionPane.showMessageDialog(null, "O valores digitados em ordem crescente: " + num3 + " - " + num1 + " - " + num2);

        }

    }

}