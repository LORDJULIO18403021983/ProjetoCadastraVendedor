package com.br.vetores;

public class Vetor {
    public static void main(String[] args) {
        int quantidade[];
        quantidade = new int[4];
        quantidade[0] = 19;
        quantidade[3] = 50;
        System.out.println("Conteudo da variavel de refência:" + quantidade);
        for (int i = 0; i < quantidade.length ; i++) {
            System.out.println("quantidade [" + i + "] =" + quantidade[i]);
        }
    }
}
