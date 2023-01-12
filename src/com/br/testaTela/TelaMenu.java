package com.br.testaTela;

import javax.swing.*;

public class TelaMenu {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Tela do Menu - Exercicio");

        //Criação da barra de menu
        JMenuBar barraMenu = new JMenuBar();

        // criação dos itens do menu
        JMenu menuCadastrar = new JMenu("Cadastramento ");
        JMenu menuConsultar = new JMenu("Consultas ");
        JMenu menuLocacao = new JMenu("Locação de Filme ");

        JMenuItem cadastraFilme = new JMenuItem("Cadastra Filme ");
        JMenuItem cadastraVendedor = new JMenuItem("Cadastra Vendedor ");
        JMenuItem efetuaLocacao = new JMenuItem("Efetua Locação ");

        JMenuItem consultaFilme = new JMenuItem("Consulta Filme ");
        JMenuItem consultaVendedor = new JMenuItem("Consulta Vendedor ");

        // adiciona os menus a barra
        barraMenu.add(menuCadastrar);
        barraMenu.add(menuConsultar);
        barraMenu.add(menuLocacao);
        // menu cadastrar
        menuCadastrar.add(cadastraFilme);
        menuCadastrar.add(cadastraVendedor);
        menuCadastrar.add(efetuaLocacao);
        // menu consultar
        menuConsultar.add(consultaFilme);
        menuConsultar.add(consultaVendedor);

        // ActionListener cadastrar
        cadastraFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraFilmeActionListener(evt);
            }
        });

        cadastraVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraVendedorActionListener(evt);
            }
        });

        efetuaLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetuaLocacaoActionListener(evt);
            }
        });

        // ActionListener consultar
        consultaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaFilmeActionListener(evt);
            }
        });

        consultaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaVendedorActionListener(evt);
            }
        });

        janela.setJMenuBar(barraMenu);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(700, 500);
        janela.setVisible(true);
    }

    private static void cadastraFilmeActionListener(java.awt.event.ActionEvent evt) {
        new TelaCadastraFilme();
    }

    private static void cadastraVendedorActionListener(java.awt.event.ActionEvent evt) {
        new TelaCadastraVendedor();
    }

    private static void efetuaLocacaoActionListener(java.awt.event.ActionEvent evt) {
        new TelaEfetuaLocacao();
    }

    private static void consultaFilmeActionListener(java.awt.event.ActionEvent evt) {
        new TelaConsultaFilme();
    }

    private static void consultaVendedorActionListener(java.awt.event.ActionEvent evt) {
        new TelaConsultaVendedor();
    }
}
