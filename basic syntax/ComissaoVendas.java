package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class ComissaoVendas {

    public static void main(String[] args) {

        // calcular comissão sobre vendas até valor X, e comissão acima do valor X

        double salarioFixo,
               valorVendasTotais,
               comissao,
               salarioFinal;

        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de seu salário fixo:"));

        valorVendasTotais = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de suas vendas totais:"));

        if (valorVendasTotais > 0 && valorVendasTotais <= 1500) {

            comissao = (valorVendasTotais * 0.03);
            salarioFinal = salarioFixo + valorVendasTotais + comissao;
            JOptionPane.showMessageDialog(null, "O salário final com comissão é de: " + salarioFinal + " reais");

        } else if (valorVendasTotais > 1500) {

            comissao = (valorVendasTotais * 0.05);
            salarioFinal = salarioFixo + valorVendasTotais + comissao;
            JOptionPane.showMessageDialog(null, "O salário final com comissão é de: " + salarioFinal + " reais");

        } else {

            JOptionPane.showMessageDialog(null, "Por favor, digite um valor válido de vendas totais!");

        }

    }

}