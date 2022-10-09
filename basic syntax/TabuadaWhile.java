package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class TabuadaWhile {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Escolha o número do qual deseja ver a tabuada:"));

        int i = 0;

        do {

            int resultado = num * i;
            JOptionPane.showMessageDialog(null, num + " * " + i + " = " + resultado);
            i++;

        } while (i <= 10);

    }

}
