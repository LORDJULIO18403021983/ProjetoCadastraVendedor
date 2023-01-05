package com.br.testaTela;

import javax.swing.*;

public class ExemploTabbed {
    // Declaração das variaveis
    private JFrame janela;
    private JTabbedPane painelComAbas;
    private JPanel painelDaJanela;
    private JPanel primeiraAba;
    private JPanel segundaAba;
    private JPanel terceiraAba;

    public static void main(String[] args) {
        ExemploTabbed aplicativo = new ExemploTabbed();
        aplicativo.iniciar();
    }

    public void iniciar() {
        janela = new JFrame("Exemplo de TabbedPane");
        painelComAbas = new JTabbedPane();
        painelDaJanela = (JPanel) janela.getContentPane();
        primeiraAba = new JPanel();
        segundaAba = new JPanel();
        terceiraAba = new JPanel();
        // Adiciona o Painel com abas (JTabbedPane).
        painelComAbas.addTab("Guia 1", primeiraAba);
        painelComAbas.addTab("Guia 2", segundaAba);
        painelComAbas.addTab("Guia 3", terceiraAba);
        painelComAbas.setBounds(14, 21, 342, 220);
        // Carrega o ContentPane.
        painelDaJanela.setLayout(null);
        painelDaJanela.add(painelComAbas);
        // Insere texto na aba.
        primeiraAba.add(new JLabel("Esta é a primeira Aba"));
        segundaAba.add(new JLabel("Esta é a segunda Aba"));
        terceiraAba.add(new JLabel("Esta é a terceira Aba"));
        // Configura a janela.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(390, 300);
        janela.setVisible(true);
        janela.setLayout(null);
    }
}
