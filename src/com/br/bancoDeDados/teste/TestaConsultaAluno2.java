package com.br.bancoDeDados.teste;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
import com.br.bancoDeDados.util.ConnectionFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestaConsultaAluno2 {

    private JFrame janela;
    private JTable tabela;
    private JButton botaoOK;
    private JScrollPane painelDeScroll;
    private String[] colunas = new String[]{"Nome"};
    private String[][] dados = new String[][]{{}};

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

        /*AO INVÉS DE PASSAR DIRETO, COLOCAMOS OS DADOS EM UM MODELO.*/
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        tabela = new JTable(modelo);
        //INSERINDO TABELA EM UM PAINEL DE SCROLL.
        painelDeScroll = new JScrollPane(tabela);
        painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        painelDeScroll.setBounds(35, 50, 300, 100);
        janela.add(painelDeScroll);
        janela.add(botaoOK);

        janela.setVisible(true);

        try {
            Connection conn = ConnectionFactory.getConnection();
            AlunoDao aluno = new AlunoDao(conn);
            List<Aluno> retornoAluno = new ArrayList<Aluno>();
            retornoAluno = aluno.buscarTodosDao();
            for (Aluno s : retornoAluno) {
                modelo.addRow(new String[]{s.getNome()});
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("Erro de Conexão");
        }
    }

    public class ListenerBotaoOK implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botaoOK) {

                tabela.getSelectedRow();
                new TestaAlterarAluno2();
            }
        }
    }
}

