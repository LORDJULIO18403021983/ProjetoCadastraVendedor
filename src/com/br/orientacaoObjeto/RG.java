package com.br.orientacaoObjeto;

public class RG {
    String numeroRg;
    Data2 dataNascimento;
    Data2 dataExpedicao;
    String nomeDaMae;
    public void exibirDados(){
        System.out.println(" Numero do rg: " + numeroRg);
        System.out.println(" Data de nascimneto: " + dataNascimento.dia + "/" + dataNascimento.mes + "/" + dataNascimento.ano);
        System.out.println(" Data de expedição: " + dataExpedicao.dia + "/" + dataExpedicao.mes + "/" + dataExpedicao.ano);
        System.out.println(" Nome da mãe: " + nomeDaMae);
    }
}
