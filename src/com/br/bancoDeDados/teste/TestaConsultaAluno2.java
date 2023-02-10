package com.br.bancoDeDados.teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
import com.br.bancoDeDados.util.ConnectionFactory;

public class TestaConsultaAluno2 {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox<Object> comboAluno;
	private String[] aluno = {};
	private JButton botaoOk;
	private JLabel labelEscolher;

	public TestaConsultaAluno2() {
		iniciar();
	}

	public static void main(String[] args) {
		new TestaConsultaAluno2();
	}

	public void iniciar() {

		janela = new JFrame("Buscar Aluno");
		painelDaJanela = (JPanel) janela.getContentPane();
		painelDaJanela.setLayout(null);
		labelEscolher = new JLabel("Escolha Aluno");
		labelEscolher.setBounds(10, 10, 150, 20);
		comboAluno = new JComboBox<Object>(aluno);
		comboAluno.setSelectedIndex(-1);
		comboAluno.setBounds(10, 30, 670, 20);
		comboAluno.setMaximumRowCount(8);

		try {
			Connection conn = ConnectionFactory.getConnection();
			AlunoDao aluno = new AlunoDao(conn);
			Aluno aluno2 = new Aluno();

			// Foi necessário chamar o metodo sql.
			String sql = "select * from aluno order by nome";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet cursor = pstm.executeQuery();
			while (cursor.next()) {
				// AS DUAS MANEIRAS SÂO ACEITADAS.
				// System.out.println(cursor.getString(1));
				comboAluno.addItem(cursor.getString("nome"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "ERRO DE CONEXÃO");
			e.printStackTrace();
		}
		comboAluno.setSelectedIndex(-1);
		botaoOk = new JButton("Ok");
		botaoOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TestaAlterarAluno2();
			}
		});
		botaoOk.setBounds(10, 200, 95, 30);
		painelDaJanela.add(comboAluno);
		painelDaJanela.add(botaoOk);
		painelDaJanela.add(labelEscolher);
		janela.setVisible(true);
		janela.setSize(710, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}
