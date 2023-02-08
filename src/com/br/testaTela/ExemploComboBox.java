package com.br.testaTela;

import javax.swing.*;

public class ExemploComboBox {
    private JFrame janela;

    private JComboBox<Object> cbox;
    private String[] computerComps = {"Monitor", "Teclado", "Mouse", "Scanner", "Moden", "CDROM", "RAM", "Disquete"};

    public static void main(String[] args) {
        ExemploComboBox aplicativo = new ExemploComboBox();
        aplicativo.iniciar();
    }

    public void iniciar() {
        janela = new JFrame("Exemplo de ComboBox");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);

        janela.setLayout(null);

        // Cria o menu retrátil
        cbox = new JComboBox<Object>(computerComps);
        cbox.setSelectedIndex(-1);
        cbox.setBounds(10, 10, 300, 30);
        // Numero de colunas visiveis
        cbox.setMaximumRowCount(5);
        // adiciona no painel
        janela.add(cbox);

        janela.setVisible(true);
    }
}
