package com.br.testaTela;

import javax.swing.*;
import java.awt.*;

public class TesteGUI2 {
    private int x = 70;
    private int y = 70;
    private JFrame frame;

    public static void main(String[] args) {
        TesteGUI2 gui = new TesteGUI2();
        gui.iniciaGUI();
    }

    public void iniciaGUI() {
        MeuPainel painel = new MeuPainel();

        frame = new JFrame("Aprendendo GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(painel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;

            painel.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex) {
            }
        }
    }

    public class MeuPainel extends JPanel {
        public void paintComponent(Graphics g) {
            //Apagua a posição atual.
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getWidth());
            //Desenha a nova posição atual.
            g.setColor(Color.GREEN);
            g.fillOval(x, y, 40, 40);
        }
    }
}
