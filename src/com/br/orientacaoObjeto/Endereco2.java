package com.br.orientacaoObjeto;

public class Endereco2 {
    String logradouro;
    String rua;
    int numero;
    String complemento;
    String cidade;
    String estado;
    String cep;

    public void exibirDados(){
        System.out.println(" Logradouro:" + logradouro);
        System.out.println(" Rua:" + rua);
        System.out.println(" Numero:" + numero);
        System.out.println(" Complemento:" + complemento);
        System.out.println(" Cidade:" + cidade);
        System.out.println(" Estado:" + estado);
        System.out.println(" CEP:" + cep);
    }
}
