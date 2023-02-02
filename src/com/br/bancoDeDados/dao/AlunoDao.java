package com.br.bancoDeDados.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDao {
    private Connection bd;
    public AlunoDao(Connection bd){
        this.bd = bd;
    }
    public void inserir(String nome,int idade,String cidade) throws SQLException{
        String sql = "insert into aluno (nome, idade, cidade) values (?, ?, ?)";

        PreparedStatement comando = bd.prepareStatement(sql);

        comando.setString(1, nome);
        comando.setInt(2, idade);
        comando.setString(3, cidade);

        comando.execute();
    }
}
