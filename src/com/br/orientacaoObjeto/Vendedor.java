package com.br.orientacaoObjeto;

public class Vendedor {
    String nome;
    String rg;
    int idade;
    double salario;
    Data nascimento;
    Data expedicao;
    Endereco endereco;

    public void exibirDados() {
        System.out.println("\n Nome: " + nome);
        System.out.println(" Idade: " + idade);
        System.out.println(" Salário: " + salario);
        System.out.println(" RG: " + rg + " Data de expedição: " + expedicao.dia + "/" + expedicao.mes + "/" + expedicao.ano);
        System.out.println(" Nascimento: " + nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
        System.out.println(" Endereço: " + endereco.rua);
        System.out.println(" Cidade: " + endereco.cidade);
        System.out.println(" Estado: " + endereco.estado);
    }
}
