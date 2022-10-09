package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class ValorCombustivel {

    public static void main(String[] args) {

        // calcular o valor final da compra de combustível com descontos

        double alcool = 2.90, gasolina = 3.30, litros, valorSemDesconto, valorDesconto, valorFinal;
        int combustivel;
        String[] opcoes = {"Gasolina", "Alcóol"};

        combustivel = JOptionPane.showOptionDialog(null,
                "Qual combustível você comprou?",
                "Atenção",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (combustivel == 0) {

            litros = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros de gasolina você comprou?"));
            valorSemDesconto = litros * gasolina;

            if (litros > 0 && litros <= 20) {

                valorDesconto = valorSemDesconto * 0.04;
                valorFinal = valorSemDesconto - valorDesconto;
                JOptionPane.showMessageDialog(null, "O valor total da compra é de " + valorFinal + " reais");

            } else if (litros > 20) {

                valorDesconto = valorSemDesconto * 0.06;
                valorFinal = valorSemDesconto - valorDesconto;
                JOptionPane.showMessageDialog(null, "O valor total da compra é de " + valorFinal + " reais");

            }

        } else {

            litros = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros de alcóol você comprou?"));
            valorSemDesconto = litros * alcool;

            if (litros > 0 && litros <= 20) {

                valorDesconto = valorSemDesconto * 0.03;
                valorFinal = valorSemDesconto - valorDesconto;
                JOptionPane.showMessageDialog(null, "O valor total da compra é de " + valorFinal + " reais");

            } else if (litros > 20) {

                valorDesconto = valorSemDesconto * 0.05;
                valorFinal = valorSemDesconto - valorDesconto;
                JOptionPane.showMessageDialog(null, "O valor total da compra é de " + valorFinal + " reais");

            }

        }

    }

}