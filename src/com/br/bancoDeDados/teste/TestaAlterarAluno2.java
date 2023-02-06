package com.br.bancoDeDados.teste;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
import com.br.bancoDeDados.util.ConnectionFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestaAlterarAluno2 {
    private JLabel labelNome, labelIdade, labelCidade;
    private JTextField textFieldNome, textFieldIdade, textFieldCidade;
    private JButton botaoAlterar;

    private JFrame janela;
    private JPanel painelConteudo;

    public TestaAlterarAluno2() {
        iniciar();
    }

    public static void main(String[] args) {
        new TestaAlterarAluno2();
    }

    public void iniciar() {

        try {
            Connection db = ConnectionFactory.getConnection();
            AlunoDao aluno = new AlunoDao(db);
            List<Aluno> retornoAluno = new ArrayList<Aluno>();
            retornoAluno = aluno.buscarTodosDao();
            for (Aluno s : retornoAluno) {
                System.out.println(s.getNome());
                System.out.println(s.getIdade());
                System.out.println(s.getCidade());
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("Erro de Conexão");
        }

        botaoAlterar = new JButton("Alterar");
        botaoAlterar.setBounds(50, 200, 95, 30);
        botaoAlterar.addActionListener(new BotaoAlterarListener());

        labelNome = new JLabel("Nome: ");
        labelNome.setBounds(50, 20, 100, 20);
        labelCidade = new JLabel("Cidade: ");
        labelCidade.setBounds(50, 80, 100, 20);
        labelIdade = new JLabel("Idade: ");
        labelIdade.setBounds(50, 140, 100, 20);

        textFieldNome = new JTextField();
        textFieldNome.setBounds(50, 42, 250, 20);
        textFieldCidade = new JTextField();
        textFieldCidade.setBounds(50, 102, 250, 20);
        textFieldIdade = new JTextField();
        textFieldIdade.setBounds(50, 162, 20, 20);

        janela = new JFrame("TELA ALTERAR ALUNO");
        painelConteudo = (JPanel) janela.getContentPane();
        painelConteudo.setLayout(null);
        painelConteudo.add(labelNome);
        painelConteudo.add(labelCidade);
        painelConteudo.add(labelIdade);
        painelConteudo.add(textFieldNome);
        painelConteudo.add(textFieldCidade);
        painelConteudo.add(textFieldIdade);
        painelConteudo.add(botaoAlterar);
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    private void listaAlunos(String[] strings) {
        // TODO Auto-generated method stub

    }

    public class BotaoAlterarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botaoAlterar) {
                Connection db = ConnectionFactory.getConnection();
                try {
                    AlunoDao alunoDao = new AlunoDao(db);
                    Aluno aluno = new Aluno();
                    aluno.setNome(textFieldNome.getText().toUpperCase());
                    aluno.setCidade(textFieldCidade.getText().toUpperCase());
                    aluno.setIdade(Integer.parseInt(textFieldIdade.getText()));
                    alunoDao.alterar(aluno);
                    // FECHANDO O BANCO DE DADOS
                    JOptionPane.showMessageDialog(null, "ALTERAÇÃO REALIZADA COM SUCESSO", "INFORMAÇÃO", 2);
                    db.close();
                    janela.setVisible(true);

                } catch (SQLException ee) {
                    // TODO: handle exceptions
                    JOptionPane.showMessageDialog(null, "ERRO AO INCLUIR ALUNO", "ERRO !!!", 2);
                    ee.printStackTrace();
                }
            }
        }
    }
}
