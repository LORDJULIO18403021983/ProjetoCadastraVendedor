package com.br.aulasOrbit;

public class CaixaEletronico {
    public static void main(String[] args) {
        // Declarando as variáveis nota.
        int nota50 = 50, nota20 = 20, nota10 = 10, nota05 = 05, nota02 = 02, notaResto = 1;
        int qtdNota50 = 0, qtdNota20 = 0, qtdNota10 = 0, qtdNota05 = 0, qtdNota02 = 0, qtdResto = 0;
        // Referenciando o valor a ser sacado.
        int valor = 1441;
        // Foi necessário criar essa variável para armazenar o valor desejado para sacar.
        //int valor1 = valor;
        //int restoValor = valor - notaResto;
        // Criando a condição while, if e if else.
        while (valor > 0) {
            if (valor >= nota50) {
                valor = valor - nota50;
                qtdNota50++;
            } else if (valor >= nota20) {
                valor = valor - nota20;
                qtdNota20++;
            } else if (valor >= nota10) {
                valor = valor - nota10;
                qtdNota10++;
            } else if (valor >= nota05) {
                valor = valor - nota05;
                qtdNota05++;
            } else if (valor >= nota02) {
                valor = valor - nota02;
                qtdNota02++;
            }else if (valor == 1 ) {
                 System.out.println("O valor não pode ser sacado!");
                break;
            }

        }
        System.out.println("\n " + qtdNota50 + " Notas de R$ 50,00");
        System.out.println("\n " + qtdNota20 + " Notas de R$ 20,00");
        System.out.println("\n " + qtdNota10 + " Notas de R$ 10,00");
        System.out.println("\n " + qtdNota05 + " Notas de R$ 05,00");
        System.out.println("\n " + qtdNota02 + " Notas de R$ 02,00");
        System.out.println("\n  Sobrou " + (qtdNota50+qtdNota20+qtdNota10+qtdNota05+qtdNota02) + " notas diversa em caixa o valor sacado R$ " + valor);
        System.out.println("\n Quantidades de notas necessárias para o valor de: " + valor);
    }
}

