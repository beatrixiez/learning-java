package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class DoisValores {

    public static void main(String[] args) {

        // ler dois valores e informar se são iguais ou qual deles é maiop

        double num1, num2;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (num1 == num2) {

            JOptionPane.showMessageDialog(null, "Os números são iguais!");

        } else if (num1 > num2) {

            JOptionPane.showMessageDialog(null, "O primeiro número é o maior!");

        } else {

            JOptionPane.showMessageDialog(null, "O segundo número é o maior!");

        }

    }

}