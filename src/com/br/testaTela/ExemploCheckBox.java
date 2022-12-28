package com.br.testaTela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploCheckBox {
    private JFrame janela;
    private JLabel labelEscolha;
    private JLabel labelResposta;
    private JCheckBox checkBoxCartaoCredito;
    private JCheckBox checkBoxDepositoBancario;
    private JCheckBox checkBoxBoletoBancario;
    private JButton botaoResposta;
    private JPanel painelDaJanela;

    public static void main(String[] args) {
        new ExemploCheckBox().iniciar();
    }

    public void iniciar() {
        janela = new JFrame("Exemplo de check Box");
        painelDaJanela = (JPanel) janela.getContentPane();
        labelEscolha = new JLabel();
        labelResposta = new JLabel();
        checkBoxCartaoCredito = new JCheckBox();
        checkBoxDepositoBancario = new JCheckBox();
        checkBoxBoletoBancario = new JCheckBox();
        botaoResposta = new JButton();
        // lEscolha
        labelEscolha.setForeground(Color.RED);
        labelEscolha.setText("Escolha a forma de pagamento:");
        labelEscolha.setBounds(42, 15, 208, 18);
        // lResposta
        labelEscolha.setForeground(Color.BLUE);
        labelEscolha.setText("Resposta");
        labelEscolha.setBounds(42, 230, 300, 18);
        // checkBoxCartaoCredito.
        checkBoxCartaoCredito.setText("Cartão de Crédito");
        checkBoxCartaoCredito.setSelected(true);
        checkBoxCartaoCredito.setBounds(42, 124, 145, 24);
        // checkBoxDepositoBancário.
        checkBoxDepositoBancario.setText("Depósito bancário");
        checkBoxDepositoBancario.setBounds(42, 98, 154, 24);
        // checBoxBoletobancário.
        checkBoxBoletoBancario.setText("Boleto Bancário");
        checkBoxBoletoBancario.setSelected(true);
        checkBoxBoletoBancario.setBounds(42, 70, 157, 24);
        // janelaBotao.
        botaoResposta.setText("Verificar");
        botaoResposta.setBounds(146, 196, 83, 28);
        // Cria um listener para o botão.
        botaoResposta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String resposta = "";
                // Verifica se está selecionado
                if (checkBoxCartaoCredito.isSelected()) {
                    resposta += checkBoxCartaoCredito.getText();
                }
                if (checkBoxDepositoBancario.isSelected()) {
                    resposta += checkBoxDepositoBancario.getText();
                }
                if (checkBoxBoletoBancario.isSelected()) {
                    resposta += checkBoxBoletoBancario.getText();
                }
                if (resposta.isEmpty()) {
                    resposta = "Nenhum item selecionado";
                }
                // Escreve a resposta no rótulo azul.
                labelEscolha.setText(resposta);
                resposta = "";
            }
        });
        // painelConteúdo
        painelDaJanela.setLayout(null);
        painelDaJanela.add(labelEscolha);
        painelDaJanela.add(checkBoxCartaoCredito);
        painelDaJanela.add(checkBoxDepositoBancario);
        painelDaJanela.add(checkBoxBoletoBancario);
        painelDaJanela.add(botaoResposta);
        painelDaJanela.add(labelResposta);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(390, 300);
        janela.setVisible(true);
    }
}
