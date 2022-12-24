package com.br.excecoes;

public class TestaErro {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Inicio do metodo1");
        try {
            metodo2();
        } catch (ArrayIndexOutOfBoundsException erro) {
            System.out.println("Erro no For!!!");
        }
        System.out.println("Fim do metodo1");
    }

    public static void metodo2() {
        System.out.println("Inicio do metodo2");
        int[] array = new int[15];
        //int[] array = new int[1]; //OCORRE O ERRO!!!
        try {

            for (int i = 0; i < 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException erro) {
            System.out.println("Erro no for.");
        }
        System.out.println("Fim do metodo2");
    }
}
