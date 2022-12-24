package com.br.exerciciosUniversidade;

public class Secretaria extends Funcionario{
    private String nome;
    private int idade;
    private double salario;
    private int ramal;

    public void exibirDados() {

        System.out.println("Ramal: " + ramal);
    }

    @Override
    public void recebeDados() {

    }

    @Override
    public void CalculaSalario() {

    }


    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
