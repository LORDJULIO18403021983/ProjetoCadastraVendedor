package com.br.bancoDeDados;

public class Principal {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.println("Var i: " + i);
        }
        System.out.println("Verificar multiplos de 1 a 15");
        primeirofor: for (int i = 1; i < 15; i++) {
            System.out.println("Multiplos de i: " + i);
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println(j + "-");
                    break primeirofor;
                }
            }
            System.out.println();
        }
    }
}
