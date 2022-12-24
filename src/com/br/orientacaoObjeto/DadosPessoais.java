package com.br.orientacaoObjeto;

public class DadosPessoais {
    String nome;
    int idade;
    String cpf;
    RG rg;
    Endereco2 endereco2;
    Contato contato;

    public void exibirDados() {
        System.out.println(" Nome: " + nome);
        System.out.println(" idade: " + idade);
        System.out.println(" CPF: " + cpf);
        endereco2.exibirDados();
        contato.exibirDados();
        rg.exibirDados();
    }
}
