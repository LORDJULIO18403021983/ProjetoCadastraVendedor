package com.br.testaTela;

import java.util.HashSet;

public class TestaHashSet {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<String>();

        lista.add("A Era do gelo");
        lista.add("Madagascar");
        lista.add("A Ilha");
        lista.add("O procurado");
        lista.add("De volta para o futuro");
        lista.add("A Era do gelo");
        lista.add("A nova onda do imperador");

        System.out.println("\n..." + lista + "...\n");
    }
}
