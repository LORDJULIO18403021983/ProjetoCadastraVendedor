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
	public void inserir(Aluno aluno) throws SQLException {
		String sql = "insert into aluno (nome, idade, cidade) values (?, ?, ?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, aluno.getNome());
		pstm.setInt(2, aluno.getIdade());
		pstm.setString(3, aluno.getCidade());

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
	public void consultar(Aluno aluno) throws SQLException {
		String sql = "select * from aluno order by nome";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet cursor = pstm.executeQuery();
		while (cursor.next()) {
			// AS DUAS MANEIRAS S?O ACEITADAS.
			// System.out.println(cursor.getString(1));
			System.out.println(cursor.getString("nome"));
		}
	}

	public void alterar(Aluno aluno) throws SQLException {
		String sql = "update aluno set idade = ?, cidade = ? where nome = ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, aluno.getIdade());
		pstm.setString(2, aluno.getCidade());
		pstm.setString(3, aluno.getNome());

		pstm.execute();
	}

	public void excluir(Aluno aluno) throws SQLException {

		String sql = "delete from aluno where nome = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, aluno.getNome());
		pstm.execute();
	}
}
