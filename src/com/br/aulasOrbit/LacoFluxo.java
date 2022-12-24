package com.br.aulasOrbit;

public class LacoFluxo {
    public static void main(String[] args) {

        int numeroInicial = 253;
        int numeroFinal = 290;

        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " é o primeiro múltiplo de 7 entre " + numeroInicial + " e " + numeroFinal);
                break;
            }
        }
        numeroInicial = 155;
        numeroFinal = 190;

        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 7 != 0) {
                continue;

            } else {

                System.out.println(i + " é o primeiro múltiplo de 7 entre " + numeroInicial + " e " + numeroFinal);
                break;
            }
        }
    }
}
