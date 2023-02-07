package com.br.bancoDeDados.gui;

import com.br.bancoDeDados.teste.TestaAlterarAluno2;
import com.br.bancoDeDados.teste.TestaConsultaAluno2;
import com.br.bancoDeDados.teste.TestaExcluirAluno2;
import com.br.bancoDeDados.teste.TestaInsereAluno2;

import javax.swing.*;

public class MenuBanco {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Menu do Banco de Dados.");

        //Criação da barra de menu
        JMenuBar barraMenu = new JMenuBar();

        //criação dos menu
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuConsulta = new JMenu("Consulta");
        JMenu menuAlterar = new JMenu("Alterar");
        JMenu menuExcluir = new JMenu("Excluir");

        //criação dos itens do menu
        JMenuItem cadastroAluno = new JMenuItem("Aluno");
        JMenuItem consultaAluno = new JMenuItem("Consulta Aluno");
        JMenuItem alterarAluno = new JMenuItem("Alterar Aluno");
        JMenuItem excluirAluno = new JMenuItem("Excluir Aluno");

        ImageIcon icone = new ImageIcon("src/imagens/cadastrar15x15.png");
        menuCadastro.setIcon(icone);
        ImageIcon icone2 = new ImageIcon("src/imagens/rsz_consultar.png");
        menuConsulta.setIcon(icone2);
        ImageIcon icone3 = new ImageIcon("src/imagens/rsz_consultar.png");
        menuAlterar.setIcon(icone3);
        ImageIcon icone4 = new ImageIcon("src/imagens/rsz_consultar.png");
        menuExcluir.setIcon(icone4);

        icone = new ImageIcon("src/imagens/salvar15x15.png");
        cadastroAluno.setIcon(icone);
        icone2 = new ImageIcon("src/imagens/rsz_consultar.png");
        consultaAluno.setIcon(icone2);
        icone3 = new ImageIcon("src/imagens/salvar15x15.png");
        alterarAluno.setIcon(icone3);
        icone4 = new ImageIcon("src/imagens/salvar15x15.png");
        excluirAluno.setIcon(icone4);

        // adiciona os menus a barra
        barraMenu.add(menuCadastro);
        barraMenu.add(menuConsulta);
        barraMenu.add(menuAlterar);
        barraMenu.add(menuExcluir);

        menuCadastro.add(cadastroAluno);
        menuConsulta.add(consultaAluno);
        menuAlterar.add(alterarAluno);
        menuExcluir.add(excluirAluno);

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
        alterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAlunoActionListener(evt);
            }
        });
        excluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirAlunoActionListener(evt);
            }
        });

        janela.setJMenuBar(barraMenu);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);
        janela.setVisible(true);
    }

    private static void cadastroAlunoActionListener(java.awt.event.ActionEvent evt) {
        new TestaInsereAluno2();
    }

    private static void consultaAlunoActionListener(java.awt.event.ActionEvent evt) {
        new TestaConsultaAluno2();
    }

    private static void alterarAlunoActionListener(java.awt.event.ActionEvent evt) {
        new TestaAlterarAluno2();
    }

    private static void excluirAlunoActionListener(java.awt.event.ActionEvent evt) {
        new TestaExcluirAluno2();
    }
}
