package com.br.bancoDeDados.teste;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
import com.br.bancoDeDados.util.ConnectionFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestaConsultaAluno2 {

    private JFrame janela;
    private JPanel painelDaJanela;
    private JTable tabela;
//    private JButton botaoIncluir;
//    private JButton botaoExcluir;
    private JScrollPane painelDeScroll;
    private String[] colunas = new String[]{"Nome", "Idade", "Cidade"};
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
        painelDaJanela = (JPanel) janela.getContentPane();
        painelDaJanela.setLayout(null);

//        botaoIncluir = new JButton("Incluir");
//        botaoIncluir.setBounds(10, 200, 100, 50);
//        botaoIncluir.addActionListener(new ListenerBotaoIncluir());
//
//        botaoExcluir = new JButton("Excluir");
//        botaoExcluir.setBounds(150, 200, 100, 50);
//        botaoExcluir.addActionListener(new ListenerRemoveLinhaSelecionada());

        /*AO INVÉS DE PASSAR DIRETO, COLOCAMOS OS DADOS EM UM MODELO.*/
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        tabela = new JTable(modelo);
        //INSERINDO TABELA EM UM PAINEL DE SCROLL.
        painelDeScroll = new JScrollPane(tabela);
        painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        painelDeScroll.setBounds(35, 50, 300, 95);
        painelDaJanela.add(painelDeScroll);
//        painelDaJanela.add(botaoIncluir);
//        painelDaJanela.add(botaoExcluir);
        janela.setVisible(true);

        try {
            Connection conn = ConnectionFactory.getConnection();
            AlunoDao aluno = new AlunoDao(conn);
            List<Aluno> retornoAluno = new ArrayList<Aluno>();
            retornoAluno = aluno.buscarTodosDao();
            for (Aluno s : retornoAluno) {
                modelo.addRow(new String[]{s.getNome(), Integer.toString(s.getIdade()), s.getCidade()});
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("Erro de Conexão");
        }
    }
}
