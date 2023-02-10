package com.br.bancoDeDados.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() {
		final String driver = "com.mysql.jdbc.Driver";
		final String local = "jdbc:mysql://localhost/turmas";
		final String login = "root";
		final String senha = "root";

		Connection conexao = null;

		try {
			Class.forName(driver);
			System.out.println("Driver carregado com sucesso.");
			conexao = (Connection) DriverManager.getConnection(local, login, senha);
			System.out.println("Conex�o estabelecida com sucesso.");
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER N�O ENCONTRADO.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("ERRO DURANTE � CONEX�O.");
			e.printStackTrace();
		}
		return conexao;
	}

}
