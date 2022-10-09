
package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class Frutas {

    public static void main(String[] args) {

        // ler quantidade de frutas compradas e informar valor final com descontos

        double pesoMorango, pesoMaca, valorMorangos = 0, valorMacas = 0, valorFrutas, pesoFrutas, desconto, valorFinal;

        pesoMorango = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos quilos (Kg) de morango foram comprados:"));
        pesoMaca = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos quilos (Kg) de maçã foram comprados:"));

        if (pesoMorango > 0 && pesoMorango <= 5) {

            valorMorangos = pesoMorango * 2.50;

        } else if (pesoMorango > 5 && pesoMorango < 8) {

            valorMorangos = pesoMorango * 2.20;

        }

        if (pesoMaca > 0 && pesoMaca <= 5) {

            valorMacas = pesoMaca * 1.80;

        } else if (pesoMaca > 5 && pesoMaca < 8) {

            valorMacas = pesoMaca * 1.50;

        }

        pesoFrutas = pesoMorango + pesoMaca;
        valorFrutas = valorMorangos + valorMacas;

        if (pesoFrutas > 8 && valorFrutas >= 25) {

            desconto = (pesoFrutas * valorFrutas) * 0.10;
            valorFinal = (pesoFrutas * valorFrutas) + desconto;
            JOptionPane.showMessageDialog(null, "Valor total da compra: " + valorFinal + " reais");

        } else {

            JOptionPane.showMessageDialog(null, "Valor total da compra: " + valorFrutas + " reais");
        }

    }

}