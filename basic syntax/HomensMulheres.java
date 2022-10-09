package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class HomensMulheres {

    public static void main(String[] args) {

        // ler a idade de dois homens e duas mulheres e realizar cálculos

        int idadeH1, idadeH2, idadeM1, idadeM2, somaIdades, produtoIdades;

        idadeH1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do primeiro homem:"));
        idadeH2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do segundo homem:"));

        idadeM1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira mulher:"));
        idadeM2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda mulher:"));

        if (idadeH1 == idadeH2 || idadeM1 == idadeM2) {

            JOptionPane.showMessageDialog(null, "As idades precisam ser diferentes entre os homens e entre as mulheres!");

        } else if (idadeH1 > idadeH2 && idadeM1 < idadeM2) {

            somaIdades = idadeH1 + idadeM1;
            produtoIdades = idadeH2 * idadeM2;
            JOptionPane.showMessageDialog(null, "A soma das idades do homem mais velho e da mulher mais nova é: " + somaIdades + "\nO produto das idades do homem mais novo e da mulher mais velha é: " +produtoIdades);

        } else if (idadeH1 > idadeH2 && idadeM2 < idadeM1) {

            somaIdades = idadeH1 + idadeM2;
            produtoIdades = idadeH2 * idadeM1;
            JOptionPane.showMessageDialog(null, "A soma das idades do homem mais velho e da mulher mais nova é: " + somaIdades + "\nO produto das idades do homem mais novo e da mulher mais velha é: " +produtoIdades);

        } else if (idadeH2 > idadeH1 && idadeM1 < idadeM2) {

            somaIdades = idadeH2 +idadeM1;
            produtoIdades = idadeH1 * idadeM2;
            JOptionPane.showMessageDialog(null, "A soma das idades do homem mais velho e da mulher mais nova é: " + somaIdades + "\nO produto das idades do homem mais novo e da mulher mais velha é: " +produtoIdades);

        } else if (idadeH2 > idadeH1 && idadeM2 < idadeM1) {

            somaIdades = idadeH2 + idadeM2;
            produtoIdades = idadeH1 * idadeM1;
            JOptionPane.showMessageDialog(null, "A soma das idades do homem mais velho e da mulher mais nova é: " + somaIdades + "\nO produto das idades do homem mais novo e da mulher mais velha é: " +produtoIdades);

        }

    }

}