package com.br.testaTela;

import javax.swing.*;
import java.awt.*;

public class TesteGUI3 {
    private int x = 0;
    private int y = 0;
    private int w = 200;
    private int z = 0;
    private JFrame frame;

    public static void main(String[] args) {
        TesteGUI3 gui = new TesteGUI3();
        gui.iniciaGUI();
    }

    public void iniciaGUI() {
        MeuPainel painel = new MeuPainel();

        frame = new JFrame("Aprendendo GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(painel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int j = 0; j < 220; j++) {
            x++;
            y++;
            w--;
            z++;

            painel.repaint();

            try {
                Thread.sleep(40);
            } catch (Exception ex) {
            }
        }
    }

    public class MeuPainel extends JPanel {
        public void paintComponent(Graphics g) {

            // APAGA DA POSIÇÃO ATUAL.
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            // DESENHA NA NOVA POSIÇÃO.
            g.setColor(Color.GREEN);
            g.fillOval(x, y, 40, 40);

            // DESENHA NA NOVA POSIÇÃO.
            g.setColor(Color.GREEN);
            g.fill3DRect(w, z, 40, 40, true);

        }
    }
}
