package com.br.bancoDeDados.teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
import com.br.bancoDeDados.util.ConnectionFactory;
import com.mysql.jdbc.Connection;

public class TestaExcluirAluno2 {

	// Declaração de referencias
	private JFrame janela;
	private JLabel labelPainelDeScroll;
	private JTable tabela;
	private JScrollPane painelDeScroll;
	private String[] colunas = new String[] { "Nome", "Idade", "Cidade" };
	private String[][] dados = new String[][] { {} };
	private JButton botaoExcluir;
	private JButton botaoOk;

	public TestaExcluirAluno2() {
		iniciar();
	}

	public static void main(String[] args) {
		new TestaExcluirAluno2();
	}

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
		tabela = new JTable(modelo1);
		// INSERINDO TABELA EM UM PAINEL DE SCROLL.
		painelDeScroll = new JScrollPane(tabela);
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
				AlunoDao alunoDao = new AlunoDao(conn);
				Aluno aluno = new Aluno();

				try {
					// Obtendo o modelo da JTable.
					DefaultTableModel modelo1 = (DefaultTableModel) tabela.getModel();
					modelo1.addRow(
							new String[] { aluno.getNome(), Integer.toString(aluno.getIdade()), aluno.getCidade() });

					if (tabela.getSelectedRow() != 0) {
						JOptionPane.showMessageDialog(null, "Aluno apagado com sucesso", "Informação", 2);

						// Removendo a linha selecionada da JTable.
						modelo1.removeRow(tabela.getSelectedRow());
					}

					alunoDao.excluir(aluno);

					if (tabela.getModel() == null) {
						JOptionPane.showMessageDialog(null, "O nome não pode estar vazio!", "Informação", 2);
					}
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Erro ... o aluno não foi excluido!", "Informação", 2);
					e1.printStackTrace();
				}
			}
		}
	}
}
