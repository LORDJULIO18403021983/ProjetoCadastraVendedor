package com.br.testaTela;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ExemploBordasPaineis {
    // Declaração das variavéis.
    private JFrame janela;
    private JPanel painel;
    private JPanel painel1;
    private JPanel painel2;
    private JPanel painel3;
    private JPanel painel4;

    public static void main(String[] args) {
        ExemploBordasPaineis aplicativo = new ExemploBordasPaineis();
        aplicativo.iniciar();
    }

    public void iniciar() {
        janela = new JFrame("Bordas de Painéis");
        painel = (JPanel) janela.getContentPane();
        painel1 = new JPanel();
        painel2 = new JPanel();
        painel3 = new JPanel();
        painel4 = new JPanel();
        // ContentPane
        painel.setLayout(null);
        painel.add(painel1);
        painel.add(painel2);
        painel.add(painel3);
        painel.add(painel4);
        // jPanel1
        painel1.setBounds(4, 6, 200, 100);
        painel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        painel1.setBorder(BorderFactory.createEtchedBorder());
        // jPanel2
        painel2.setBounds(208, 6, 200, 100);
        painel2.setLayout(new BorderLayout(0, 0));
        painel2.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        // jPanel3
        painel3.setBounds(3, 109, 200, 100);
        painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
        painel3.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        // jPanel4
        painel4.setBounds(208, 110, 200, 100);
        painel4.setLayout(new GridLayout(1, 0, 0, 0));
        painel4.setBorder(new TitledBorder("Promoção"));
        // Janela Principal
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(new Dimension(422, 246));
        janela.setVisible(true);
    }
}
