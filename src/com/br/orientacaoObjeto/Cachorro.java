package com.br.orientacaoObjeto;

public class Cachorro {
    String nome;
    int idade;
    char sexo;
    Data ultimaVacinacao;
    public int diasVividos(){
        int diasVividos = idade * 365;
        return diasVividos;
    }

    public void exibirDados() {
        System.out.println("\n Nome: " + nome);
        System.out.println(" Idade: " + idade);
        System.out.println(" Sexo: " + sexo);
        System.out.println(" Dias aproximados: " + diasVividos());
        System.out.println(" A ultima vacinação foi: " + ultimaVacinacao.dia + "/" + ultimaVacinacao.mes + "/" + ultimaVacinacao.ano);
        System.out.println("----------------");
    }
}
