package com.br.testaTela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInsereFilme {
    // Variáveis:
    private JFrame janela;
    private JButton botao;
    private JButton botao2;
    private JTextField nomeFilme;
    private JTextField valorFilme;
    private JTextArea area;

    public static void main(String[] args) {
        TelaInsereFilme aplicativo = new TelaInsereFilme();
        aplicativo.iniciaTela();
    }

    public void iniciaTela() {

        // Criando a Janela.
        janela = new JFrame("Tela Insere Filme - Exercícios");

        area = new JTextArea();

        botao = new JButton("Inserir");
        botao.addActionListener(new VerificaListener());

        botao2 = new JButton("Troca Cor");
        botao2.addActionListener(new CorListener());

        nomeFilme = new JTextField("Nome do Filme:");
        nomeFilme.addActionListener(new VerificaListener());

        valorFilme = new JTextField("Valor do Filme:");
        valorFilme.addActionListener(new VerificaListener());

        // COLOCANDO A TELA E SEUS RESPECTIVOS ITENS EM NORTE, SUL, LESTE E OESTE.
        janela.getContentPane().add(BorderLayout.WEST, botao);
        janela.getContentPane().add(BorderLayout.EAST, botao2);
        janela.getContentPane().add(BorderLayout.CENTER, area);
        janela.getContentPane().add(BorderLayout.NORTH, nomeFilme);
        janela.getContentPane().add(BorderLayout.SOUTH, valorFilme);

        // CONFIGURA O TAMANHO DA JANELA.
        janela.setSize(700, 400);
        // CONFIGURA O BOTÃO 'X', PARA FECHAR A APLICAÇÃO.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // CONFIGURA A VISIBILIDADE PARA 'TRUE' ( MOSTRA A JANELA ).
        janela.setVisible(true);
    }

    public class VerificaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.append(nomeFilme.getText() + "\n");
            nomeFilme.setText(null);

            area.append(valorFilme.getText() + "\n");
            valorFilme.setText(null);
        }
    }

    public class CorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // SE O FUNDO FOR BRANCO O SISTEMA TROCA PARA PRETO.
            if (area.getBackground().equals(Color.BLACK)) {
                // setBackgound = Primeiro plano.
                area.setBackground(Color.WHITE);
                // setForegound = Segundo plano.
                area.setForeground(Color.BLACK);
            } else {
                area.setBackground(Color.BLACK);
                area.setForeground(Color.WHITE);
            }
        }
    }
}
