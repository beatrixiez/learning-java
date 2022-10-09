package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class ContaCorrente {

    public static void main(String[] args) {

        // calcular o saldo final de uma conta e informar se é positivo ou negativo

        int numeroConta;
        double saldoAtual,
               debitos,
               credito,
               saldoFinal;

        numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o número da conta utilizando somente números:"));
        saldoAtual = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite o saldo atual de sua conta:"));
        debitos = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite o valor de seus débitos:"));
        credito = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite o valor de seu crédito:"));

        saldoFinal = saldoAtual - debitos + credito;

        if (saldoFinal >= 0) {

            JOptionPane.showMessageDialog(null, "Seu saldo atual é POSITIVO, no valor de " + saldoFinal + " reais");

        } else {

            JOptionPane.showMessageDialog(null, "Seu saldo atual é NEAGTIVO, no valor de " + saldoFinal + " reais");

        }

    }

}