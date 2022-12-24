package com.br.testaTela;

import javax.swing.*;

public class TesteGUI4 {
    // Declara as vriaveis de referências
    private JFrame janela;
    private JButton botao;

    public static void main(String[] args) {
        TesteGUI4 aplicativo = new TesteGUI4();
        aplicativo.iniciaGui();
    }

    public void iniciaGui() {
        // Cria as instâncias
        janela = new JFrame();
        botao = new JButton("Aperte aqui");

        // Configura o botâo
        botao.setBounds(50, 50, 200, 100);

        // Desativa o gerenciador de Layout.
        janela.setLayout(null);

        // Adiciona os elementos gráficos na janela.
        janela.getContentPane().add(botao);

        // Configura a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }
}
