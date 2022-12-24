package com.br.orientacaoObjeto;

public class TestaReferencia {
    public static void main(String[] args) {
        // Variáveis
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = pessoa1;

        // Condição if
        if (pessoa1 == pessoa2) {
            System.out.println("São iguais!");

        } else {
            System.out.println("São diferentes!");
        }
        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}
