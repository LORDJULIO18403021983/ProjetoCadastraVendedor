package com.br.testaTela;

import javax.swing.*;
import java.awt.*;

public class TestaJOptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao Sistema!");
        JOptionPane.showMessageDialog(null, "Preencha seus dados abaixo: ", "Informação", 2);
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Informação", 3);
        System.out.println("Nome: " + nome);
        try {

            int opcao = JOptionPane.showConfirmDialog(null, "voce é maior de idade!");
            if (opcao == 0)
                System.out.println("Maior");
            else if (opcao == 1)
                System.out.println("Menor");
            else if (opcao == 2)
                System.out.println("Não informado");
            String idadeTela = JOptionPane.showInputDialog(null, "Informe sua idade: ", "Digite a idade: ", 3);
            int idade = Integer.parseInt(idadeTela);

        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Digite apenas numero!");
        }
    }
}

