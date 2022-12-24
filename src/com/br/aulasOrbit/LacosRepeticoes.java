package com.br.aulasOrbit;

public class LacosRepeticoes {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i + " ao cubo é " + ((i * i) * i));
            i = i + 1;
            // Codigo de repetição
           int l = 2;
            do {
                System.out.println(l + " ao cubo é " + ((l * l) * l));
                l = l + 1;

            }    while (l < 10) ;


            for (int j = 0; j < 10; j = j++) {
                System.out.println(j + "ao cubo é: " + ((j * j) * j));

            }
        }
    }
}
