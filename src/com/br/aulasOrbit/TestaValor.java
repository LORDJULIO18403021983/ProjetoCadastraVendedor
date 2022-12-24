package com.br.aulasOrbit;

public class TestaValor {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(" Valor de b:" + b);
        // Casting e Promoção
        double valorD = 3.1415; // Valor de Pi
        int valorInt = (int) valorD; // Erro de compilação se não fiser o Casting
        double d = 100;
        int i = (int) d;
        System.out.println(valorInt);
        System.out.println(i);
    }
}
