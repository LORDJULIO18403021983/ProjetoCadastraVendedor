package com.br.exerciciosUniversidade;

public class Professor extends Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private String materia;

    public Professor() {
        System.out.println("Professor criado");
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matéria: " + materia);
    }

    @Override
    public void recebeDados() {

    }

    @Override
    public void CalculaSalario() {

    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
