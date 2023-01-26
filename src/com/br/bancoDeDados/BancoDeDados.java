package com.br.bancoDeDados;

public class BancoDeDados {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver carregado com sucesso.");
        } catch (ClassNotFoundException e) {
            System.out.println("DRIVE DO BANCO NÃO ENCONTRADO.");
        }
    }
}
