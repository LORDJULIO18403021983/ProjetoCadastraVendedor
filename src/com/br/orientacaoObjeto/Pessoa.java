package com.br.orientacaoObjeto;

public class Pessoa {
    String nome;
    String cpf;
    int idade;
    double salario;

    public Double retornaNovoSalario(){
        double novoSalario =salario * 0.5;
        return novoSalario;
    }
    public Double retornaNovoSalario1(){
        return salario * 0.5;
    }
    public void exibirDados() {
        System.out.println(" Nome: " + nome);
        if (idade >= 18) {
            System.out.println(" Maior de idade: ");
        } else {
            System.out.println(" Menor de idade: ");
        }
        System.out.println(" Idade: " + idade);
        System.out.println(" CPF: " + cpf + "\n");
    }
    public void receberDados(String nomeRecebido, int idadeRecebida, String cpfRecebido) {
        nome = nomeRecebido;
        idade = idadeRecebida;
        cpf = cpfRecebido;
    }
}