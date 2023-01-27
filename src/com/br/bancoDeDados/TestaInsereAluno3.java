package com.br.bancoDeDados;

import java.sql.*;
import java.util.Scanner;

public class TestaInsereAluno3 {
    public static void main(String[] args) {
        String local = "jdbc:mysql://localhost/turmas";
        String login = "root";
        String senha = "root";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome do aluno.....: ");
        String nomeDoAluno = teclado.nextLine();
        System.out.println("Cidade do aluno...: ");
        String cidadeDoAluno = teclado.nextLine();
        System.out.println("Idade do aluno....: ");
        int idadeDoAluno = teclado.nextInt();

        Connection bd = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver carregado com sucesso.");
            bd = (Connection) DriverManager.getConnection(local, login, senha);
            System.out.println("Conexão estabelecida com sucesso.");
            // Inserindo aluno.
            String sql = "insert into aluno (nome, idade, cidade) values (?, ?, ?)";

            PreparedStatement comando = bd.prepareStatement(sql);

            comando.setString(1, nomeDoAluno);
            comando.setInt(2, idadeDoAluno);
            comando.setString(3, cidadeDoAluno);

            comando.execute();
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
