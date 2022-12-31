package com.br.vetores;

import com.br.Comparator.ComparaNome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFilme<arrayListFilme> {
    public static void main(String[] args) {

        // Primeiro criamos arryList
        List<Filme> arrayListFilme = new ArrayList<Filme>();

        // Criando os 3 filmes
        Filme filme1 = new Filme();
        filme1.setCodigo(1);
        filme1.setNome("Código de conduta");

        Filme filme2 = new Filme();
        filme2.setCodigo(2);
        filme2.setNome("A era do gelo");

        Filme filme3 = new Filme();
        filme3.setCodigo(3);
        filme3.setNome("Origem");

        if (filme1.equals(filme2)) {
            System.out.println("\nFilmes iguais!");
        } else {
            System.out.println("\nFilmes diferentes!");
        }

        // Adicionando na lista
        arrayListFilme.add(filme3);
        arrayListFilme.add(filme2);
        arrayListFilme.add(filme1);

        // Exibindo a lista
        for (Filme f : arrayListFilme) {
            System.out.println(f.getCodigo() + " " + f.getNome());
        }

        System.out.println("\n------------------ORDENANDO-------------------- ");
       // Ordenando a lista
        Collections.sort(arrayListFilme, new ComparaNome() {
            @Override
            public int compare(Filme o1, Filme o2) {
                return 0;
            }
        });

        // Exibindo lista ordenada
        for (Filme f : arrayListFilme) {
            System.out.println(f.getCodigo() + " " + f.getNome());
        }
    }
}
