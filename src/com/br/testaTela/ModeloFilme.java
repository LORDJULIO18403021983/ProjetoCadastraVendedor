package com.br.testaTela;

public class ModeloFilme {
    private int codigo;
    private String nome;
    private double valor;
    private String genero;
    private boolean disponivel;

    @Override
    public String toString() {
        String texto = "Dados do Filme\n";
        texto += "\nCodigo ........." + this.getCodigo() + "\n";
        texto += "\nNome ..........." + this.getNome() + "\n";
        texto += "\nValor .........." + this.getValor() + "\n";
        texto += "\nDisponivel......" + (disponivel ? "SIM" : "NÃO");
        return texto;
    }

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
