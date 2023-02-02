package com.br.bancoDeDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JFrame janela;

    private JPanel painel0, painel1;

    private JButton botao0, botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9;
    private JButton adicao, subtracao, multiplicacao, divisao, porcentagem, igualdade, zerarTela, virgula;

    private JTextField operacao;

    private JLabel labelOperacao;

    private double numero1;
    private double numero2;

    private int operacaoMatenatica;

    public static void main(String[] args) {
        Calculadora aplicativo = new Calculadora();
        aplicativo.iniciar();
    }

   // @SuppressWarnings("static-access")
    public void iniciar() {

        janela = new JFrame("Calculadora");
        painel0 = (JPanel) janela.getContentPane();

        painel1 = new JPanel();

        // contentPane
        painel0.setLayout(null);
        painel0.add(painel1);
        Font font = new Font(null, Font.BOLD, 26);
        Font bot = new Font(null, Font.BOLD, 18);
        operacao = new JTextField("");
        operacao.setHorizontalAlignment(operacao.RIGHT);
        operacao.setFont(font);
        operacao.setBounds(32, 51, 288, 78);

        labelOperacao = new JLabel();
        labelOperacao.setFont(font);
        labelOperacao.setHorizontalAlignment(labelOperacao.RIGHT);
        labelOperacao.setBounds(150, 10, 150, 20);

        botao1 = new JButton("1");
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "1");
            }
        });

        botao2 = new JButton("2");
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "2");
            }
        });
        botao3 = new JButton("3");
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "3");
            }
        });
        botao4 = new JButton("4");
        botao4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "4");
            }
        });
        botao5 = new JButton("5");
        botao5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "5");
            }
        });
        botao6 = new JButton("6");
        botao6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "6");
            }
        });
        botao7 = new JButton("7");
        botao7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "7");
            }
        });
        botao8 = new JButton("8");
        botao8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "8");
            }
        });
        botao9 = new JButton("9");
        botao9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "9");
            }
        });
        botao0 = new JButton("0");
        botao0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + "0");
            }
        });
        divisao = new JButton("/");
        divisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(operacao.getText());
                operacaoMatenatica = 1;
                operacao.setText("");
                labelOperacao.setText(numero1 + "/");
            }
        });
        multiplicacao = new JButton("X");
        multiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(operacao.getText());
                operacaoMatenatica = 2;
                operacao.setText("");
                labelOperacao.setText(numero1 + "X");
            }
        });
        subtracao = new JButton("-");
        subtracao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(operacao.getText());
                operacaoMatenatica = 3;
                operacao.setText("");
                labelOperacao.setText(numero1 + "-");
            }
        });
        adicao = new JButton("+");
        adicao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(operacao.getText());
                operacaoMatenatica = 4;
                operacao.setText("");
                labelOperacao.setText(numero1 + "+");
            }
        });
        porcentagem = new JButton("%");
        porcentagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(operacao.getText());
                operacaoMatenatica = 5;
                operacao.setText("");
                labelOperacao.setText(numero1 + "%");
            }
        });
        zerarTela = new JButton("<-");
        zerarTela.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int tamanho = operacao.getText().length();
                int numero = operacao.getText().length() - 1;
                String armazenar;

                if (tamanho > 0) {
                    StringBuilder back = new StringBuilder(operacao.getText());
                    back.deleteCharAt(numero);
                    armazenar = back.toString();
                    operacao.setText(armazenar);
                }
            }
        });

        igualdade = new JButton("=");
        igualdade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ExecutaCalculo();
                labelOperacao.setText("");
            }
        });

        virgula = new JButton(",");
        virgula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao.setText(operacao.getText() + ".");
            }
        });

        botao0.setFont(bot);
        botao1.setFont(bot);
        botao2.setFont(bot);
        botao3.setFont(bot);
        botao4.setFont(bot);
        botao5.setFont(bot);
        botao6.setFont(bot);
        botao7.setFont(bot);
        botao8.setFont(bot);
        botao9.setFont(bot);
        divisao.setFont(bot);
        multiplicacao.setFont(bot);
        porcentagem.setFont(bot);
        subtracao.setFont(bot);
        adicao.setFont(bot);
        zerarTela.setFont(bot);
        igualdade.setFont(bot);

        botao0.setBounds(30, 260, 110, 30);
        virgula.setBounds(150, 260, 50, 30);
        adicao.setBounds(210, 260, 50, 30);

        botao1.setBounds(30, 220, 50, 30);
        botao2.setBounds(90, 220, 50, 30);
        botao3.setBounds(150, 220, 50, 30);
        subtracao.setBounds(210, 220, 50, 30);
        igualdade.setBounds(270, 220, 51, 70);

        botao4.setBounds(30, 180, 50, 30);
        botao5.setBounds(90, 180, 50, 30);
        botao6.setBounds(150, 180, 50, 30);
        multiplicacao.setBounds(210, 180, 50, 30);
        zerarTela.setBounds(270, 180, 51, 30);

        botao7.setBounds(30, 140, 50, 30);
        botao8.setBounds(90, 140, 50, 30);
        botao9.setBounds(150, 140, 50, 30);
        divisao.setBounds(210, 140, 50, 30);
        porcentagem.setBounds(270, 140, 51, 30);

        // jPainel1
        painel1.setBounds(30, 50, 290, 80);
        painel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        painel1.setBorder(BorderFactory.createEtchedBorder());

        janela.add(botao1);
        janela.add(botao2);
        janela.add(botao3);
        janela.add(botao4);
        janela.add(botao5);
        janela.add(botao6);

        janela.add(botao7);
        janela.add(botao8);
        janela.add(botao9);

        janela.add(subtracao);
        janela.add(adicao);
        janela.add(virgula);
        janela.add(botao0);
        janela.add(igualdade);
        janela.add(multiplicacao);
        janela.add(zerarTela);
        janela.add(divisao);
        janela.add(porcentagem);
        janela.add(labelOperacao);

        janela.add(operacao);

        // jANELA PRINCIPAL
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(new Dimension(360, 350));
        janela.setVisible(true);
    }

    public void ExecutaCalculo() {

        switch (operacaoMatenatica) {
            case 1: // divisão
                numero2 = numero1 / Double.parseDouble(operacao.getText());
                operacao.setText(Double.toString(numero2));
                break;
            case 2: // multiplicação
                numero2 = numero1 * Double.parseDouble(operacao.getText());
                operacao.setText(Double.toString(numero2));
                break;
            case 3: // subtração
                numero2 = numero1 - Double.parseDouble(operacao.getText());
                operacao.setText(Double.toString(numero2));
                break;
            case 4: // adição
                numero2 = numero1 + Double.parseDouble(operacao.getText());
                operacao.setText(Double.toString(numero2));
                break;
            case 5: // porcentagem
                numero2 = numero1 * (Double.parseDouble(operacao.getText()) / 100);
                operacao.setText(Double.toString(numero2));
                break;
        }
    }
}

