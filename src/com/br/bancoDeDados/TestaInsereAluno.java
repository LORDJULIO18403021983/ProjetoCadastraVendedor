package com.br.bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsereAluno {
    public static void main(String[] args) {
        String local = "jdbc:mysql://localhost/turmas";
        String login = "root";
        String senha = "root";

        Connection bd = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver carregado com sucesso.");
            bd = (Connection) DriverManager.getConnection(local, login, senha);
            System.out.println("Conexão estabelecida com sucesso.");
            // Inserindo aluno.
            String sql = "insert into aluno " +
                    "(nome, idade, cidade) values (\"carlos\",25,\"Ourinhos\")";
            Statement comando = bd.createStatement();
            comando.execute(sql);
            System.out.println("Aluno inserido com sucesso.");
            bd.close();
            System.out.println("Conexão encerrada com sucesso.");
        } catch (ClassNotFoundException e) {
            System.out.println("DRIVER DO BANCO NÃO ENCONTRADO.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("ERRO CONECTANDO AO BANCO.");
            e.printStackTrace();
        }
    }
}
