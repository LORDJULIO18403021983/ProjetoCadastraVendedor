package com.br.testaTela;

import javax.swing.*;

public class ExemploMenu {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo de menu.");

        //Criação da barra de menu
        JMenuBar barraMenu = new JMenuBar();

        //criação dos itens do menu
        JMenu menu01 = new JMenu("Menu 01.");
        JMenu menu02 = new JMenu("Menu 02.");
        JMenuItem itemMenu = new JMenuItem("Item");

        // adiciona os menus a barra
        barraMenu.add(menu01);
        barraMenu.add(menu02);
        menu02.add(itemMenu);

        //ActionListener
        itemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionListener(evt);
            }
        });

        janela.setJMenuBar(barraMenu);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 300);
        janela.setVisible(true);
    }

    private static void itemActionListener(java.awt.event.ActionEvent evt) {
        new ExCamposTexto();
    }
}
