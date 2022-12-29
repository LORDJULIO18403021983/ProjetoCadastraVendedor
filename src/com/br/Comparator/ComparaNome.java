package com.br.Comparator;

import com.br.vetores.Filme;

import java.util.Comparator;

public abstract class ComparaNome implements Comparator<Filme> {
    public int Compare(Filme filme, Filme outroFilme){
        return filme.getNome().compareTo(outroFilme.getNome());
    }

}
