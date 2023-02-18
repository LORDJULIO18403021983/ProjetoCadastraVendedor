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

	// Declaração de referencias
	private JFrame janela;
	private JLabel labelPainelDeScroll;
	private JTable jTableTabela;
	private JScrollPane painelDeScroll;
	private String[] colunas = new String[] { "Nome", "Idade", "Cidade" };
	private String[][] dados = new String[][] { {} };
	private JButton botaoExcluir;
	private JButton botaoOk;

//	public TestaExcluirAluno2() {
//		iniciar();
//	}
//
//	public static void main(String[] args) {
//		new TestaExcluirAluno2();
//	}

	@SuppressWarnings("unchecked")
	public void iniciar() {

		// *CONFIGURANDO A JANELA.*/
		janela = new JFrame("Tabela Excluir Alunos");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Criando o Label banco de dados.
		labelPainelDeScroll = new JLabel("Banco de Dados jdbc:");
		labelPainelDeScroll.setBounds(40, 20, 200, 20);

		// Criando os botões.
		botaoOk = new JButton("Ok");
		botaoOk.setBounds(40, 160, 100, 50);
		botaoOk.addActionListener(new botaoOkListener());
		botaoExcluir = new JButton("Excluir");
		botaoExcluir.setBounds(240, 160, 100, 50);
		botaoExcluir.addActionListener(new botaoExcluirListener());

		/* AO INVÃ‰S DE PASSAR DIRETO, COLOCAMOS OS DADOS EM UM MODELO. */
		DefaultTableModel modelo1 = new DefaultTableModel(dados, colunas);
		jTableTabela = new JTable(modelo1);
		// INSERINDO TABELA EM UM PAINEL DE SCROLL.
		painelDeScroll = new JScrollPane(jTableTabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		painelDeScroll.setBounds(40, 42, 300, 100);

		// Adicionando na janela.
		janela.add(labelPainelDeScroll);
		janela.add(painelDeScroll);
		janela.add(botaoOk);
		janela.add(botaoExcluir);
		janela.setSize(400, 300);
		janela.setResizable(false);
		janela.setLayout(null);
		janela.setVisible(true);

		try {
			Connection conn = (Connection) ConnectionFactory.getConnection();
			AlunoDao aluno = new AlunoDao(conn);
			List<Aluno> retornoAluno = new ArrayList<Aluno>();
			retornoAluno = aluno.buscarTodosDao();
			for (Aluno s : retornoAluno) {
				modelo1.addRow(new String[] { s.getNome(), Integer.toString(s.getIdade()), s.getCidade() });
			}
		} catch (SQLException err) {
			err.printStackTrace();
		}
	}

	public class botaoOkListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == botaoOk) {
				System.out.println("Saindo ...");
				JOptionPane.showMessageDialog(null, "Saindo ...", "Informação", 2);
				System.exit(0);
			}
		}
	}

	public class botaoExcluirListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == botaoExcluir) {
				Connection conn = (Connection) ConnectionFactory.getConnection();
				try {
					AlunoDao alunoDao = new AlunoDao(conn);
					Aluno aluno = new Aluno();

					// COLOCAMOS OS DADOS EM UM MODELO.
					DefaultTableModel modelo1 = (DefaultTableModel) jTableTabela.getModel();

					// Criamos uma variável fila.
					int row = jTableTabela.getSelectedRow();
					aluno.setNome(jTableTabela.getModel().getValueAt(row, 0).toString());

					// executamos o metodo excluir.
					alunoDao.excluir(aluno);
					JOptionPane.showMessageDialog(null, "Congratulation !!");

					// Removendo a linha selecionada da JTable.
					modelo1.removeRow(jTableTabela.getSelectedRow());

					// FECHANDO O BANCO DE DADOS
					conn.close();

				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, erro.getMessage());
				}
			}
		}
	}
}
