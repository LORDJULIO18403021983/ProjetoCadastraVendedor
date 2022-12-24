package com.br.aulasOrbit;

public class Produto {
    public static void main(String[] args) {
        String nome = "Bolacha";
        double custo = 10;
        double porcentagemDeLucro = 20;
        int quantidadeVendida = 3;

        int valorTotal = (int) custo * quantidadeVendida;
        //Desconto adquirido
        double desconto = custo * porcentagemDeLucro / 100;

        System.out.println("Produto: " + nome);
        System.out.println("Preço do produto: " + custo);
        System.out.println("Quantidade vendida: " + quantidadeVendida);
        System.out.println("O valor total da venda: " + valorTotal );
        System.out.println("Desconto adquirido por unidade: " + desconto);


    }
}
