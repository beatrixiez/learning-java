package br.com.fiap.tds;

import javax.swing.*;

public class Tabuada {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Escolha o número do qual deseja ver a tabuada:"));

        for (int i = 0; i <= 10; i++) {

            int resultado = num * i;

            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Tabuada do número " + num);
            }

            JOptionPane.showMessageDialog(null, num + " * " + i + " = " + resultado);

        }

    }

}