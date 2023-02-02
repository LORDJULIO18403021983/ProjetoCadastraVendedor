package com.br.bancoDeDados.gui;

import com.br.bancoDeDados.teste.TestaConsultaAluno2;
import com.br.bancoDeDados.teste.TestaInsereAluno2;

import javax.swing.*;

public class MenuBanco {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo de menu.");

        //Criação da barra de menu
        JMenuBar barraMenu = new JMenuBar();

        //criação dos menu
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuConsulta = new JMenu("Consulta");

        //criação dos itens do menu
        JMenuItem cadastroAluno = new JMenuItem("Aluno");
        JMenuItem consultaAluno = new JMenuItem("Consulta Aluno");

        ImageIcon icone = new ImageIcon("src/imagens/cadastrar15x15.png");
        menuCadastro.setIcon(icone);
        ImageIcon icone2 = new ImageIcon("src/imagens/rsz_consultar.png");
        menuConsulta.setIcon(icone2);

        icone = new ImageIcon("src/imagens/salvar15x15.png");
        cadastroAluno.setIcon(icone);
        icone2 = new ImageIcon("src/imagens/rsz_consultar.png");
        consultaAluno.setIcon(icone2);

        // adiciona os menus a barra
        barraMenu.add(menuCadastro);
        barraMenu.add(menuConsulta);
        menuCadastro.add(cadastroAluno);
        menuConsulta.add(consultaAluno);


        //ActionListener
        cadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAlunoActionListener(evt);
            }
        });
        consultaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaAlunoActionListener(evt);
            }
        });

        janela.setJMenuBar(barraMenu);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }

    private static void cadastroAlunoActionListener(java.awt.event.ActionEvent evt) {
        new TestaInsereAluno2();
    }

    private static void consultaAlunoActionListener(java.awt.event.ActionEvent evt) {
        new TestaConsultaAluno2();
    }
}
