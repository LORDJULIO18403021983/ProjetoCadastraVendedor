package com.br.bancoDeDados.teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
			AlunoDao alunoDao = new AlunoDao(conn);
			alunoDao.buscarTodosDao();
			List<Aluno> listaAluno = alunoDao.buscarTodosDao(); 
			for(Aluno s: listaAluno) {
				comboAluno.addItem(s.getNome());
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
