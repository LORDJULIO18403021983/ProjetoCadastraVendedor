package com.br.testaTela;

import java.util.HashSet;

public class TestaHashSet {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();

        lista.add("A Era do gelo");
        lista.add("Madagascar");
        lista.add("A Era do gelo");
        lista.add("A nova onda do imperador");

        System.out.println(lista);
    }
}
