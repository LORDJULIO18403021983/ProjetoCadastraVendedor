package com.br.bancoDeDados.teste;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
import com.br.bancoDeDados.util.ConnectionFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaInsereAluno2 {

	private JLabel labelNome, labelIdade, labelCidade;
	private JTextField textFieldNome, textFieldIdade, textFieldCidade;
	private JButton buttonIncluir;
	private JFrame janela;

	public TestaInsereAluno2() {
		iniciar();
	}

	public static void main(String[] args) {
		new TestaInsereAluno2();
	}

	private void iniciar() {

		janela = new JFrame("Cadastramento de Aluno");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttonIncluir = new JButton("Inserir");
		buttonIncluir.setBounds(50, 200, 95, 30);
		buttonIncluir.addActionListener(new BotaoListener());

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

		janela.add(labelNome);
		janela.add(labelCidade);
		janela.add(labelIdade);
		janela.add(textFieldNome);
		janela.add(textFieldCidade);
		janela.add(textFieldIdade);
		janela.add(buttonIncluir);
		janela.setLayout(null);
		janela.setSize(400, 300);
		janela.setVisible(true);
	}

	public class BotaoListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonIncluir) {
				Connection conn = (Connection) ConnectionFactory.getConnection();
				try {
					AlunoDao alunoDAO = new AlunoDao(conn);
					Aluno aluno = new Aluno();
					// Converto os textField's em informação que o metodo inserir entenda.
					aluno.setNome(textFieldNome.getText().toUpperCase());
					aluno.setCidade(textFieldCidade.getText().toUpperCase());
					aluno.setIdade(Integer.parseInt(textFieldIdade.getText()));

					// Alimento o metodo inserir com as informações digitadas dos textField's.
					alunoDAO.inserir(aluno);
					JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso...", "INFORMAÇÃO ", 2);

					// FECHANDO O BANCO DE DADOS
					conn.close();

					// CATHC VERIFICANDO SE O BANCO DEU ERRO AO ABRIR
				} catch (SQLException ee) {
					JOptionPane.showMessageDialog(null, "Erro ao incluir Aluno ..", "Erro !!!", 2);
					ee.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Saindo ...", "Informação", 2);
				System.exit(0);
			}
		}
	}
}
