package com.br.bancoDeDados;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TestaInsereAluno2 {

    public TestaInsereAluno2() {
        iniciar();
    }

    public static void main(String[] args) {
        new TestaInsereAluno2();
    }

    private void iniciar() {

        //conecta com o banco
        Connection bd = ConnectionFactory.getConnection();
        // recebe do teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome do aluno.....: ");
        String nomeDoAluno = teclado.nextLine();
        System.out.println("Cidade do aluno...: ");
        String cidadeDoAluno = teclado.nextLine();
        System.out.println("Idade do aluno....: ");
        int idadeDoAluno = teclado.nextInt();

        try {
            AlunoDao alunoDao = new AlunoDao(bd);
            alunoDao.inserir(nomeDoAluno, idadeDoAluno, cidadeDoAluno);
            System.out.println("Aluno inserido com sucesso.");
            bd.close();
            System.out.println("Conexão encerrada com sucesso.");
            System.exit(0);
            System.out.println("Saindo...");
        } catch (SQLException e) {
            System.out.println("ERRO CONECTANDO AO BANCO.");
            e.printStackTrace();
        }

    }
}
