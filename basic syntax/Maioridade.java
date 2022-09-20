package br.com.fiap.tds;

import javax.swing.*;

public class Maioridade {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            String nome = JOptionPane.showInputDialog("Por favor, digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira a idade:"));

            if (idade >= 18) {

                JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos, logo, é maior de idade!");

            } else {

                JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos, logo, é menor de idade!");

            }

        }

    }

}