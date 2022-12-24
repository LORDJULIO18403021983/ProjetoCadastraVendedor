package com.br.testaTela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TesteGUI1 {
    private JFrame janela;
    private JButton botao, botao2;
    private JTextField campo;
    private JTextArea area;

    public static void main(String[] args) {
        TesteGUI1 aplicativo = new TesteGUI1();
        aplicativo.iniciaGui();
    }

    public void iniciaGui() {
        janela = new JFrame();
        botao = new JButton("Clique Aqui!");
        botao.addActionListener(new TextoListener());
        botao2 = new JButton("Troca cor!");
        botao2.addActionListener(new CorListener());
        campo = new JTextField();
        campo.addActionListener(new TextoListener());
        area = new JTextArea();
        janela.getContentPane().add(BorderLayout.NORTH, campo);
        janela.getContentPane().add(BorderLayout.CENTER, area);
        janela.getContentPane().add(BorderLayout.SOUTH, botao);
        janela.getContentPane().add(BorderLayout.EAST, botao2);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }

    public class TextoListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            area.append(campo.getText() + "\n");
            campo.setText(null);
        }
    }

    public class CorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (area.getBackground().equals(Color.BLACK)) {
                area.setBackground(Color.WHITE);
                area.setForeground(Color.BLACK);
            } else {
                area.setBackground(Color.BLACK);
                area.setForeground(Color.WHITE);
            }
        }
    }
}
