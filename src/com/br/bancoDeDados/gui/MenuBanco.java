package com.br.bancoDeDados.gui;

import com.br.bancoDeDados.TestaInsereAluno2;

import javax.swing.*;

public class MenuBanco {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo de menu.");

        //Criação da barra de menu
        JMenuBar barraMenu = new JMenuBar();

        //criação dos itens do menu
        JMenu menuCadastro = new JMenu("Cadastro");

        JMenuItem cadastroAluno = new JMenuItem("Aluno");

        ImageIcon icone = new ImageIcon("src/imagens/cadastrar15x15.png");
        menuCadastro.setIcon(icone);

        icone = new ImageIcon("src/imagens/salvar15x15.png");
        cadastroAluno.setIcon(icone);

        // adiciona os menus a barra
        barraMenu.add(menuCadastro);
        menuCadastro.add(cadastroAluno);


        //ActionListener
        cadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionListener(evt);
            }
        });

        janela.setJMenuBar(barraMenu);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }

    private static void itemActionListener(java.awt.event.ActionEvent evt) {
        new TestaInsereAluno2();
    }
}
