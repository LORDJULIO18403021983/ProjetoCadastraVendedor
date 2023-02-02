package com.br.bancoDeDados.teste;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
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
            Aluno aluno = new Aluno();
            aluno.setNome(nomeDoAluno);
            aluno.setCidade(cidadeDoAluno);
            aluno.setIdade(idadeDoAluno);
            alunoDao.inserir(aluno);
            System.out.println("Aluno inserido com sucesso!");
            teclado.close();
            bd.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERRO ao inserir aluno");
        }
    }
}
