package com.br.bancoDeDados.dao;

import com.br.bancoDeDados.model.Aluno;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.br.bancoDeDados.util.ConnectionFactory.getConnection;

public class AlunoDao {
    private final Connection conn;

    public AlunoDao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Aluno aluno) throws SQLException {
        String sql = "insert into aluno (nome, idade, cidade) values (?, ?, ?)";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, aluno.getNome());
        pstm.setInt(2, aluno.getIdade());
        pstm.setString(3, aluno.getCidade());

        pstm.execute();
    }

    //CONSULTAR
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
    public void Consultar() throws SQLException {
        String sql = "select * from aluno order by nome";
        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet cursor = pstm.executeQuery();

        while (cursor.next()) {
            System.out.println(cursor.getString("nome"));
        }
    }

    public void alterar(Aluno aluno) throws SQLException {
        String sql = "update aluno set idade = ?, cidade = ? where nome = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, aluno.getIdade());
        pstm.setString(2, aluno.getCidade());
        pstm.setString(3, aluno.getNome());

        pstm.executeUpdate();
    }

    public void excluir(Aluno aluno) throws SQLException {
        String sql = "Delete From aluno Where nome = ?";
        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            getConnection();
            String nome1 = aluno.getNome();
            pstm.executeUpdate("Delete From aluno Where nome = '" + nome1 + "'");
        JOptionPane.showMessageDialog(null,"Dados deletados!");
        }
    }
}
