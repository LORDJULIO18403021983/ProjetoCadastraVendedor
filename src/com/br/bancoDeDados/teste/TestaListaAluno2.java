package com.br.bancoDeDados.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
import com.br.bancoDeDados.util.ConnectionFactory;

public class TestaListaAluno2 {
	public static void main(String[] args) {

		try {
			Connection conn = (Connection) ConnectionFactory.getConnection();
			AlunoDao aluno = new AlunoDao(conn);
			List<Aluno> retornoAluno = new ArrayList<Aluno>();
			retornoAluno = aluno.buscarTodosDao();
			for (Aluno aluno2 : retornoAluno) {
				System.out.println("Nome: " + aluno2.getNome() + "\nIdade: " + aluno2.getIdade() + "\nCidade: "
						+ aluno2.getCidade());
			}

		} catch (SQLException err) {
			err.printStackTrace();
		}
	}
}
