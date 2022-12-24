package com.br.orientacaoObjeto;

public class DadosProfissionais {
    double salario;
    String disciplina;
    Data2 dataAdmissao;
    String nomeDaEscola;
    public void exibirDados(){
        System.out.println(" Salário: " + salario);
        System.out.println(" Disciplina: " + disciplina);
        System.out.println(" Data de admissão: ");
        dataAdmissao.exibirDados();
        System.out.println(" Nome da Escola: " + nomeDaEscola);
    }
}
