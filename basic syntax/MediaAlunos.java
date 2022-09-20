package br.com.fiap.tds;

import javax.swing.*;

public class MediaAlunos {

    public static void main(String[] args) {

        double n1, n2, media;
        int i;

        for (i=1;i<=30;i++) {

            JOptionPane.showMessageDialog(null, "Aluno " + i);

            n1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a primeira nota:"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a segunda nota:"));

            media = (n1 + n2) / 2;

            if (media >= 7) {
                JOptionPane.showMessageDialog(null, "A média é: " + media + "\r\nA situação é: Aprovado");
            } else {
                JOptionPane.showMessageDialog(null, "A média é: " + media + "\r\nA situação é: Reprovado");
            }

        }

    }

}