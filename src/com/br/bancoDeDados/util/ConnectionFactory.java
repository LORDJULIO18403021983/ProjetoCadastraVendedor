package com.br.bancoDeDados.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        String driver = "com.mysql.jdbc.Driver";
        String local = "jdbc:mysql://localhost:3306/turmas";
        String login = "root";
        String senha = "root";

        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(local, login, senha);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do Banco não encontrado");
        } catch (SQLException e) {
            System.out.println("ERRO conectando ao banco");
            e.getMessage();
            System.out.println(e);
        }
        return conn;
    }
}
