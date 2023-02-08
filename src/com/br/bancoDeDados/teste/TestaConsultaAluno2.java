package com.br.bancoDeDados.teste;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
import com.br.bancoDeDados.util.ConnectionFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaConsultaAluno2 {

    private JFrame janela;
    private JButton botaoOK;
    private JComboBox<Aluno> comboBoxAluno;
    private String[] consultarAlunos = {};

    public TestaConsultaAluno2() {
        iniciar();
    }

    public static void main(String[] args) {
        new TestaConsultaAluno2();
    }

    public void iniciar() {

        //*CONFIGURANDO A JANELA.*/
        janela = new JFrame("Tabela consulta alunos");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setSize(400, 300);
        janela.setLayout(null);

        botaoOK = new JButton("OK");
        botaoOK.setBounds(130, 180, 100, 50);
        botaoOK.addActionListener(new ListenerBotaoOK());

        // Cria o menu retrátil
        comboBoxAluno = new JComboBox<Aluno>();
        comboBoxAluno.setSelectedIndex(-1);
        comboBoxAluno.setBounds(35, 50, 300, 100);
        // Numero de colunas visiveis
        comboBoxAluno.setMaximumRowCount(5);

        // adiciona no painel.
        janela.add(comboBoxAluno);
        janela.add(botaoOK);
        janela.setVisible(true);

        try {


        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("Erro de Conexão");
        }
    }

    public class ListenerBotaoOK implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botaoOK) {
                new TestaAlterarAluno2();
            }
        }
    }
}

