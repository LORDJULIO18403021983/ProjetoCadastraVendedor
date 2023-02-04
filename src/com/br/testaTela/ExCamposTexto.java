package com.br.testaTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExCamposTexto {
    private JFrame janela;
    private JLabel lbllogin;
    private JLabel lblsenha;
    private JLabel lblObs;
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JTextArea txtObs;
    private JScrollPane brBarrDeRolagem;
    private JButton btnVerificar;
    private JPanel painelConteudo;

    public ExCamposTexto() {
        iniciar();
    }

    public static void main(String[] args) {
        new ExCamposTexto();
    }

    private void iniciar() {
        lbllogin = new JLabel("Login: ");
        lbllogin.setBounds(56, 40, 71, 18);
        lblsenha = new JLabel("Senha: ");
        lblsenha.setBounds(55, 75, 60, 18);
        lblObs = new JLabel("Observação: ");
        lblObs.setBounds(55, 108, 104, 17);
        txtLogin = new JTextField();
        txtLogin.setBounds(140, 38, 100, 22);
        txtSenha = new JPasswordField();
        txtSenha.setBounds(140, 74, 100, 22);

        txtObs = new JTextArea();
        brBarrDeRolagem = new JScrollPane();
        brBarrDeRolagem.setBounds(140, 110, 100, 44);
        brBarrDeRolagem.setViewportView(txtObs);

        btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(117, 200, 83, 28);

        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // verifica login e senha
                if (txtLogin.getText().equals("programador") && new String(txtSenha.getPassword()).equals("java")) {
                    txtObs.append("\nLogin correto.");
                    JOptionPane.showMessageDialog(null, "\nLogin correto.");
                    txtObs.setText("");
                } else {
                    txtObs.append("\nLogin incorreto!!!");
                    JOptionPane.showMessageDialog(null, "\nLogin incorreto.\nverifique login e senha novamente!!!");
                    txtObs.setText("");
                }
            }
        });
        //PainelConteudo
        janela = new JFrame("Usando campos de textos.");
        painelConteudo = (JPanel) janela.getContentPane();
        painelConteudo.setLayout(null);
        painelConteudo.add(lbllogin);
        painelConteudo.add(lblsenha);
        painelConteudo.add(lblObs);
        painelConteudo.add(txtLogin);
        painelConteudo.add(txtSenha);
        painelConteudo.add(brBarrDeRolagem);
        painelConteudo.add(btnVerificar);

        // EXCamposDeTexto
        janela.setSize(330, 330);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
