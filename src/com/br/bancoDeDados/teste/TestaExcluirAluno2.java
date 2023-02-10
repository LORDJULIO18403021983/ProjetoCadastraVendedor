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

public class TestaExcluirAluno2 {

	private JFrame janela;
	private JTable tabela;
	private JButton botaoExcluir;
	private JScrollPane painelDeScroll;
	private String[] colunas = new String[] { "Nome", "Idade", "Cidade" };
	private String[][] dados = new String[][] { {} };

	public TestaExcluirAluno2() {
		iniciar();
	}

	public static void main(String[] args) {
		new TestaExcluirAluno2();
	}

	public void iniciar() {

		// *CONFIGURANDO A JANELA.*/
		janela = new JFrame("Tabela Excluir Alunos");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);
		janela.setSize(400, 300);
		janela.setLayout(null);

		botaoExcluir = new JButton("Excluir");
		botaoExcluir.setBounds(130, 180, 100, 50);
		botaoExcluir.addActionListener(new ListenerBotaoExcluir());

		/* AO INVÉS DE PASSAR DIRETO, COLOCAMOS OS DADOS EM UM MODELO. */
		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		tabela = new JTable(modelo);
		// INSERINDO TABELA EM UM PAINEL DE SCROLL.
		painelDeScroll = new JScrollPane(tabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		painelDeScroll.setBounds(35, 50, 300, 100);
		janela.add(painelDeScroll);
		janela.add(botaoExcluir);

		janela.setVisible(true);

		try {
			Connection conn = ConnectionFactory.getConnection();
			AlunoDao aluno = new AlunoDao(conn);
			List<Aluno> retornoAluno = new ArrayList<Aluno>();
			retornoAluno = aluno.buscarTodosDao();
			for (Aluno s : retornoAluno) {
				modelo.addRow(new String[] { s.getNome(), Integer.toString(s.getIdade()), s.getCidade() });
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Erro de Conexão");
		}
	}

	public class ListenerBotaoExcluir implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == botaoExcluir) {
				// Obtem o modelo da JTable.
				DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
				// Removendo a linha selecionada da JTable.
				modelo.removeRow(tabela.getSelectedRow());

				Connection conn = ConnectionFactory.getConnection();
				AlunoDao alunoDao = new AlunoDao(conn);
				Aluno aluno = new Aluno();
				// ???
				
				//alunoDao.excluir();

			}
		}
	}
}
