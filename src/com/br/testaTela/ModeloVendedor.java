package com.br.testaTela;

public class ModeloVendedor {

    private String nome;
    private double salario;
    private String email;
    private int idade;
    private String cidade;
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void exibirDadosModeloVendedor() {
        System.out.println(" Nome: " + getNome());
        System.out.println(" Salário:" + getSalario());
        System.out.println(" Email:" + getEmail());
        System.out.println(" Idade: " + getIdade());
        System.out.println(" Cidade:" + getCidade());
        System.out.println(" Estado:" + getEstado());
    }
}
