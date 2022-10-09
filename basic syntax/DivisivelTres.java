package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class DivisivelTres {

    public static void main(String[] args) {

        int numero = 0;

        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número diferente de zero"));

            if (numero % 3 == 0) {

                JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 3!");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " NÃO é divisível por 3!");
            }
        } while (numero != 0);
    }
}