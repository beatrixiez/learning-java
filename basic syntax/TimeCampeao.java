package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class TimeCampeao {

    public static void main(String[] args) {

        // ler o nome de dois times e declarar o vencedor ou empate

        String time1, time2;
        int golsTime1, golsTime2;

        time1 = JOptionPane.showInputDialog("Digite o nome do primeiro time:");
        golsTime1 = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos gols o " + time1 + " marcou:"));

        time2 = JOptionPane.showInputDialog("Digite o nome do segundo time:");
        golsTime2 = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos gols o " + time2 + " marcou:"));

        if (golsTime1 >= 0 && golsTime2 >= 0) {

            if (golsTime1 > golsTime2) {

                JOptionPane.showMessageDialog(null, "Com " + golsTime1 + " gol(s) marcado(s), " + time1 + " é o vencedor da partida!");

            } else if (golsTime2 > golsTime1) {

                JOptionPane.showMessageDialog(null, "Com " + golsTime2 + " gol(s) marcado(s), " + time2 + " é o vencedor da partida!");

            } else {

                JOptionPane.showMessageDialog(null, "A partida entre " + time1 + " e " + time2 + " terminou em empate!");

            }

        } else {

            JOptionPane.showMessageDialog(null, "Os dados inseridos são inválidos!");

        }

    }

}
