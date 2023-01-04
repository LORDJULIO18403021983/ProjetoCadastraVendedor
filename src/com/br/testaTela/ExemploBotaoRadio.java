package com.br.testaTela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploBotaoRadio {
    private JFrame janela;
    private JLabel labelEscolha;
    private JRadioButton radioButtonSolteiro;
    private JRadioButton radioButtonCasado;
    private JRadioButton radioButtonViuvo;
    private JRadioButton radioButtonDesquitado;
    private JButton botaoVerificar;
    private JPanel painelDaJanela;
    private ButtonGroup buttonGroupRadio;

    public static void main(String[] args) {
        new ExemploBotaoRadio().iniciar();
    }

    public void iniciar() {
        janela = new JFrame("Exemplo de Botões de Radio");
        labelEscolha = new JLabel();
        radioButtonSolteiro = new JRadioButton();
        radioButtonCasado = new JRadioButton();
        radioButtonViuvo = new JRadioButton();
        radioButtonDesquitado = new JRadioButton();
        botaoVerificar = new JButton();
        painelDaJanela = (JPanel) janela.getContentPane();

        //Cria o objeto do grupo de botões.
        buttonGroupRadio = new ButtonGroup();

        //Adiciona os botões no grupo.
        buttonGroupRadio.add(radioButtonSolteiro);
        buttonGroupRadio.add(radioButtonCasado);
        buttonGroupRadio.add(radioButtonDesquitado);
        buttonGroupRadio.add(radioButtonViuvo);

        //labelEscolha
        labelEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
        labelEscolha.setText("Escolha o estado civil:");
        labelEscolha.setBounds(82, 18, 230, 18);

        //radioButtonSolteiro
        radioButtonSolteiro.setText("Solteiro");
        radioButtonSolteiro.setBounds(80, 50, 100, 24);

        //radioButtonCasado
        radioButtonCasado.setText("Casado");
        radioButtonCasado.setBounds(80, 75, 100, 24);

        //radioButtonViuvo
        radioButtonViuvo.setText("Viúvo");
        radioButtonViuvo.setBounds(80, 100, 100, 24);

        //radioButtonDesquitado
        radioButtonDesquitado.setText("Desquitado");
        radioButtonDesquitado.setBounds(80, 125, 146, 24);

        //botaoVerificar
        botaoVerificar.setText("Verificar");
        botaoVerificar.setBounds(126, 176, 83, 28);

        botaoVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verifica qual foi selecionado
                String resposta = "";
                if (radioButtonCasado.isSelected()) {
                    resposta += radioButtonCasado.getText();
                }
                if (radioButtonSolteiro.isSelected()) {
                    resposta += radioButtonSolteiro.getText();
                }
                if (radioButtonViuvo.isSelected()) {
                    resposta += radioButtonViuvo.getText();
                }
                if (radioButtonDesquitado.isSelected()) {
                    resposta += radioButtonDesquitado.getText();
                }
                // troca a cor da fonte do rotulo para vermelho
                labelEscolha.setForeground(Color.RED);
                // escreve a opção selecionada no rotulo
                labelEscolha.setText(resposta);
                resposta = "";
            }
        });

        // painelConteúdo
        painelDaJanela.setLayout(null);
        painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
        painelDaJanela.add(labelEscolha);
        painelDaJanela.add(radioButtonSolteiro);
        painelDaJanela.add(radioButtonCasado);
        painelDaJanela.add(radioButtonViuvo);
        painelDaJanela.add(radioButtonDesquitado);
        painelDaJanela.add(botaoVerificar);

        // Janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(340, 273);
        janela.setVisible(true);
    }
}
