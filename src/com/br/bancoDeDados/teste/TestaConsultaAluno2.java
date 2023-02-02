package com.br.bancoDeDados.teste;

import com.br.bancoDeDados.dao.AlunoDao;
import com.br.bancoDeDados.model.Aluno;
import com.br.bancoDeDados.util.ConnectionFactory;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestaConsultaAluno2 {
    public TestaConsultaAluno2() {
        iniciar();
    }

    public static void main(String[] args) {
        new TestaConsultaAluno2();
    }

    public void iniciar() {

        Connection db = ConnectionFactory.getConnection();

        // Mostra a banco de dados de forma ordenada pelo nome.
        try {
            AlunoDao alunoDao = new AlunoDao(db);
            alunoDao.buscarTodos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO AO CONSULTAR ALUNO");
            e.printStackTrace();
        }

        try {
            AlunoDao aluno = new AlunoDao(db);

            List<Aluno> retornoAluno = new ArrayList<Aluno>();

            retornoAluno = aluno.buscarTodosDao();

            for (Aluno aluno1 : retornoAluno) {
                System.out.println(aluno1.getNome());
                System.out.println(aluno1.getIdade());
                System.out.println(aluno1.getCidade());
            }
        } catch (SQLException er) {
            JOptionPane.showMessageDialog(null, "ERRO AO CONSULTAR ALUNO");
        }
    }
}
