package com.br.bancoDeDados.dao;

import com.br.bancoDeDados.model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDao {
	private final Connection conn;

	public AlunoDao(Connection conn) {
		this.conn = conn;
	}

	// INSERIR
	public void inserir(String nome, int idade, String cidade) throws SQLException {
		String sql = "insert into aluno (nome, idade, cidade) values (?, ?, ?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, nome);
		pstm.setInt(2, idade);
		pstm.setString(3, cidade);

		pstm.execute();
	}

	// CONSULTAR
	public List<Aluno> buscarTodosDao() throws SQLException {

		String sql = "select * from aluno ";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet cursor = pstm.executeQuery();

		List<Aluno> alunos = new ArrayList<Aluno>();

		while (cursor.next()) {
			Aluno aluno = new Aluno();
			aluno.setNome(cursor.getString("nome"));
			aluno.setIdade(cursor.getInt("idade"));
			aluno.setCidade(cursor.getString("cidade"));
			alunos.add(aluno);
		}
		return alunos;
	}

	// dados ordenado pelo nome.
	public void Consultar(String nome) throws SQLException {
		String sql = "select * from aluno order by nome";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet cursor = pstm.executeQuery();
		while (cursor.next()) {
			// AS DUAS MANEIRAS SÂO ACEITADAS.
			// System.out.println(cursor.getString(1));
			System.out.println(cursor.getString("nome"));
		}
	}

	public void alterar(int idade, String cidade, String nome) throws SQLException {
		String sql = "update aluno set idade = ?, cidade = ? where nome = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, idade);
		pstm.setString(2, cidade);
		pstm.setString(3, nome);

		pstm.execute();
	}

	public void excluir(String nome) throws SQLException {

		String sql = "delete from aluno where nome = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, nome);
		pstm.execute();
	}
}
