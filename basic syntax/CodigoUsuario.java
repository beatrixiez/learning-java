package br.com.fiap.tds;

import javax.swing.JOptionPane;

public class CodigoUsuario {

    public static void main(String[] args) {

        // ler dados de entrada do usuário, verificar se estão corretos e permitir acesso

        int codigo, codigoInterno = 1234, senha, senhaInterna = 9999;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu código de usuário:"));

        if (codigo == codigoInterno) {

            senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha:"));

            if (senha == senhaInterna) {

                JOptionPane.showMessageDialog(null, "Acesso permitido!");

            } else {

                JOptionPane.showMessageDialog(null, "Senha inválida!");
            }

        } else {

            JOptionPane.showMessageDialog(null, "Usuário inválido!");

        }

    }

}