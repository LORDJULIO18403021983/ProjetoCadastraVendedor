package com.br.aulasOrbit;

public class TestaWhile {
    public static void main(String[] args) {
        // Declaração das variavéis
        int numVezes = 100;
        int multiplo = 7;
        int i = 1;
        int maiorMult = 0;
        int menorMult = numVezes;
        int mediaAritNumInt = 0;
        int somaDosMult = 0;
        int qtdDosMult = 0;
        // Condição while if
        while (i < numVezes) {
            if (i % multiplo == 0) {
                qtdDosMult++;
                somaDosMult += i;
                System.out.println(" \n " + i + " é múltiplo de: " + multiplo);
                if (i > maiorMult) {
                    maiorMult = i;
                }
                if (i < menorMult) {
                    menorMult = i;
                }
            }
            // Pode-se fazer assim também:
            // mediaAritNumInt += i; i++;
            mediaAritNumInt = mediaAritNumInt + i;
            // Ou isso i++;
            i = i + 1;
        }
        System.out.println("\n O maior múltiplo obtido é: " + maiorMult);
        System.out.println("\n O menor múltiplo obtido é: " + menorMult);
        System.out.println("\n A média aritmética é: " + (mediaAritNumInt / numVezes));
        System.out.println("\n A média de todos os múltiplos é:" + (somaDosMult / qtdDosMult));
        System.out.println("\n A média do 1º e o ultimo múltiplo é: " + ((maiorMult + menorMult) / 2));
    }
}
