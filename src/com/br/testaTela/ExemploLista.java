package com.br.testaTela;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ExemploLista {
    // Declaração de referencias
    JFrame janela;
    JList list;
    JLabel label;
    JPanel painelDeJanela = null;

    //Cria um vetor com a lista para seleção
    String[] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};

    public static void main(String[] args) {
        ExemploLista aplicativo = new ExemploLista();
        aplicativo.iniciar();
    }

    public void iniciar() {
        janela = new JFrame("Exemplo de Lista");
        painelDeJanela = (JPanel) janela.getContentPane();
        painelDeJanela.setLayout(null);

        //Cria o objeto de lista
        list = new JList(diasSemana);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // registra a classe de listener
        list.addListSelectionListener(new ListenerLista());

        // adiciona um painel com barras de rolagem
        JScrollPane sp = new JScrollPane(list);
        sp.setBounds(10, 60, 300, 90);
        painelDeJanela.add(sp);

        // cria um rotulo
        label = new JLabel("CTRL para multiseleções", JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.lightGray);
        label.setForeground(Color.BLACK);
        label.setBounds(10, 10, 300, 30);
        painelDeJanela.add(label);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);
        janela.setVisible(true);
    }

    // Classe de listener
    class ListenerLista implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent evt) {
            label.setText((String) list.getSelectedValue());
        }
    }
}
