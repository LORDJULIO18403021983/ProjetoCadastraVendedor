package com.br.vetores;

public class Filme implements Comparable<Filme> {
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public boolean equals(Object objeto) {
        if (nome.equals(((Filme) objeto).getNome())) {
            return true;
        }
        return false;
    }
    public int compareTo(Filme outroFilme) {
        if (this.codigo < outroFilme.codigo) {
            return -1;
        }

        if (this.codigo > outroFilme.codigo) {
            return 1;
        }
        return codigo;
    }
}
