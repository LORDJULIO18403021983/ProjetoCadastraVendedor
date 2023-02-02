package com.br.bancoDeDados.dao;

import com.br.bancoDeDados.model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDao {
    private Connection bd;

    public AlunoDao(Connection bd) {
        this.bd = bd;
    }

    public void inserir(Aluno aluno) throws SQLException {
        String sql = "insert into aluno (nome, idade, cidade) values (?, ?, ?)";

        PreparedStatement comando = bd.prepareStatement(sql);

        comando.setString(1, aluno.getNome());
        comando.setInt(2, aluno.getIdade());
        comando.setString(3, aluno.getCidade());

        comando.execute();
    }

    //CONSULTAR
    public List<Aluno> buscarTodosDao() throws SQLException {

        String sql = "select * from aluno ";
        PreparedStatement comando = bd.prepareStatement(sql);
        ResultSet cursor = comando.executeQuery();

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
    public void buscarTodos() throws SQLException {
        String sql = "select * from aluno order by nome";
        PreparedStatement comando = bd.prepareStatement(sql);
        ResultSet cursor = comando.executeQuery();

        while (cursor.next()) {
            System.out.println(cursor.getString("nome"));
        }
    }

    public void alterar(Aluno aluno) throws SQLException {
        String sql = "update aluno set idade = ?, cidade = ? where nome = ?";

        PreparedStatement comando = bd.prepareStatement(sql);
        comando.setInt(1, aluno.getIdade());
        comando.setString(2, aluno.getCidade());
        comando.setString(3, aluno.getNome());

        comando.execute();
    }
}
