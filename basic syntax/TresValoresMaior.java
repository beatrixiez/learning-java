package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class TresValoresMaior {

    public static void main(String[] args) {

        // ler três valores diferentes e escrever o maior deles

        double num1, num2, num3;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (num1 == num2 || num1 == num3 || num2 == num3) {

            JOptionPane.showMessageDialog(null, "Por favor, digite números diferentes!");

        } else if (num1 > num2 && num1 > num3) {

            JOptionPane.showMessageDialog(null, "O número " + num1 + " é o maior!");

        } else if (num2 > num1 && num2 > num3) {

            JOptionPane.showMessageDialog(null, "O número " + num2 + " é o maior!");

        } else {

            JOptionPane.showMessageDialog(null, "O número " + num3 + " é o maior!");

        }

    }

}