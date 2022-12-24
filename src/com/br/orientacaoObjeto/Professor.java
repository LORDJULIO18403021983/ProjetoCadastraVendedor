package com.br.orientacaoObjeto;

public class Professor {
    DadosPessoais dadosPessoais;
    DadosProfissionais dadosProfissionais;

    public void exibirDados() {
        dadosPessoais.exibirDados();
        dadosProfissionais.exibirDados();
    }
}
