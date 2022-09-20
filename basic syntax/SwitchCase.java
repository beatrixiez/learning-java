package br.com.fiap.tds;

import javax.swing.*;

public class SwitchCase {

    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7:"));

        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu domingo.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você escolheu segunda-feira.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Você escolheu terça-feira.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Você escolheu quarta-feira.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Você escolheu quinta-feira.");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Você escolheu sexta-feira.");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Você escolheu sábado.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida, digite um número de 1 a 7.");
                main(args);
                break;

        }

    }
}