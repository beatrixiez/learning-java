package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class QuestionarioCinema {

    public static void main(String[] args) {

        String[] opcoes = {"A", "B", "C", "D", "E"};
        int idade,
                avaliacao,
                i = 0,
                otimo = 0,
                ruim = 0,
                pessimo = 0;
        double somaIdadesRuim = 0,
                mediaIdadesRuim = 0;

        while (i < 40) {

            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade:"));
            avaliacao = JOptionPane.showOptionDialog(null,
                    "Escolha uma opção \nA - Ótimo\nB - Bom\nC - Regular\nD - Ruim\nE - Péssimo", "O que você achou do filme?",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            i++;

            switch (avaliacao) {

                case 0:
                    otimo++;
                    break;
                case 3:
                    ruim++;
                    somaIdadesRuim = somaIdadesRuim + idade;
                    mediaIdadesRuim = somaIdadesRuim / ruim;
                    break;
                case 4:
                    pessimo++;
                    break;
            }

        }

        // a quantidade de respostas "ótimo";
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas que avaliaram o filme como 'Ótimo': " + otimo);

        // a média de idade das pessoas que responderam "ruim";
        JOptionPane.showMessageDialog(null, "Média de idade das pessoas que responderam 'Ruim': " + mediaIdadesRuim);

        // a porcentagem de respostas "péssimo"
        double porcentagemPessimo = (pessimo / 40.0) * 100.0;
        JOptionPane.showMessageDialog(null, "Porcentagem de pessoas que avaliaram o filme como 'Péssimo': " + porcentagemPessimo + "%");

    }

}