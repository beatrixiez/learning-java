package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class TresValoresSoma {

    public static void main(String[] args) {

        // ler três valores diferentes e escrever a soma dos dois maiores

        double num1, num2, num3, soma;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        if (num1 == num2 || num1 == num3 || num2 == num3) {

            JOptionPane.showMessageDialog(null, "Por favor, digite números diferentes!");

        } else if (num1 > num3 && num2 > num3) {

            soma = num1 + num2;
            JOptionPane.showMessageDialog(null, "A soma de " + num1 + " + " + num2 + " é igual a " + soma);

        } else if (num1 > num2 && num3 > num2) {

            soma = num1 + num3;
            JOptionPane.showMessageDialog(null, "A soma de " + num1 + " + " + num3 + " é igual a " + soma);

        } else if (num2 > num1 && num3 > num1) {

            soma = num2 + num3;
            JOptionPane.showMessageDialog(null, "A soma de " + num2 + " + " + num3 + " é igual a " + soma);

        }

    }

}