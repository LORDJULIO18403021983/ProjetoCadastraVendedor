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

public class TestaAlterarAluno2 {
	private JLabel labelNome, labelIdade, labelCidade, labelPainelDeScroll;
	private JTextField textFieldNome, textFieldIdade, textFieldCidade;
	private JButton botaoAlterar;
	private JTable jTableTabela;
	private JScrollPane painelDeScroll;
	private String[] colunas = new String[] { "Nome", "Idade", "Cidade" };
	private String[][] dados = new String[][] { {} };
	private JFrame janela;

	public TestaAlterarAluno2() {
		iniciar();
	}

	public static void main(String[] args) {
		new TestaAlterarAluno2();
	}

	public void iniciar() {
		janela = new JFrame("TELA ALTERAR ALUNO");
		janela.setLayout(null);

		// Criando os label's.
		labelNome = new JLabel("Nome: ");
		labelNome.setBounds(50, 20, 100, 20);
		labelCidade = new JLabel("Cidade: ");
		labelCidade.setBounds(50, 80, 100, 20);
		labelIdade = new JLabel("Idade: ");
		labelIdade.setBounds(50, 140, 100, 20);
		labelPainelDeScroll = new JLabel("Banco de Dados jdbc:");
		labelPainelDeScroll.setBounds(400, 20, 200, 20);

		// Criando os TextField's.
		textFieldNome = new JTextField();
		textFieldNome.setBounds(50, 42, 250, 20);
		textFieldCidade = new JTextField();
		textFieldCidade.setBounds(50, 102, 250, 20);
		textFieldIdade = new JTextField();
		textFieldIdade.setBounds(50, 162, 20, 20);

		// Criando o botão.
		botaoAlterar = new JButton("Alterar");
		botaoAlterar.setBounds(50, 200, 95, 30);
		botaoAlterar.addActionListener(new BotaoAlterarListener());

		/* AO INVÉS DE PASSAR DIRETO, COLOCAMOS OS DADOS EM UM MODELO. */
		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		jTableTabela = new JTable(modelo);
		// INSERINDO TABELA EM UM PAINEL DE SCROLL.
		painelDeScroll = new JScrollPane(jTableTabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		painelDeScroll.setBounds(400, 42, 300, 100);

		// Adicionando a Tela janela.
		janela.add(labelPainelDeScroll);
		janela.add(painelDeScroll);
		janela.add(botaoAlterar);
		janela.add(labelNome);
		janela.add(labelCidade);
		janela.add(labelIdade);
		janela.add(textFieldNome);
		janela.add(textFieldCidade);
		janela.add(textFieldIdade);
		janela.add(botaoAlterar);
		janela.setSize(800, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);
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
			System.out.println("Erro de Conexão");
		}
	}

	public class BotaoAlterarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == botaoAlterar) {
				Connection conn = ConnectionFactory.getConnection();
				try {
					AlunoDao alunoDao = new AlunoDao(conn);
					Aluno aluno = new Aluno();

					// Atribuindo os valores dos textField nas variaveis.
					aluno.setIdade(Integer.parseInt(textFieldIdade.getText().trim()));
					aluno.setCidade(textFieldCidade.getText().trim().toUpperCase());
					aluno.setNome(textFieldNome.getText().trim().toUpperCase());

					// Obtendo o modelo da JTable.
					DefaultTableModel modelo = (DefaultTableModel) jTableTabela.getModel();

					// Criamos uma vari?vel fila.
					int row = jTableTabela.getSelectedRow();

					// Atribuindo os valores dos JTable's nas variaveis.
					aluno.setNome(jTableTabela.getModel().getValueAt(row, 3).toString());
					aluno.setCidade(jTableTabela.getModel().getValueAt(row, 2).toString());
					aluno.setIdade(Integer.parseInt((jTableTabela.getModel().getValueAt(row, 1)).toString()));

					// Executamos o metodo alterar.
					alunoDao.alterar(aluno);
					JOptionPane.showMessageDialog(null, "Parab?ns, aluno alterado com sucesso !!!");

					// FECHANDO O BANCO DE DADOS
					conn.close();
				} catch (SQLException ee) {
					// TODO: handle exceptions
					JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR ALUNO", "ERRO !!!", 2);
					ee.printStackTrace();
				}
			}
		}
	}
}
