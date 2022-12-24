package com.br.aulasOrbit;

public class AlugaFilme {
    public static void main(String[] args) {
        double valorAluguelDiario = 20.5;
        double valorPago = 41.5;
        int qtdDiasAlugados = 2;
        double troco = valorPago - qtdDiasAlugados * valorAluguelDiario;
        String filmeASerAlugado = "Naufrágio";
        String filmeASerAlugado2 = "A Ilha";
        boolean disponivel = true;
        boolean disponivel2 = true;
        // Verificação da disponibilidade do filme
        if (disponivel && disponivel2) {
            System.out.println("Os 2 filmes estão disponiveis!");
        } else if (!disponivel && !disponivel2) {
            System.out.println("Nenhum dos filmes estão disponiveis!");
        } else if (!disponivel2 || !disponivel) {
            System.out.println("1 filme apenas está disponivel!");
        }
        // Verifica os valores pagos
        if (valorPago > valorAluguelDiario * qtdDiasAlugados) {
            System.out.println("O troco a ser devolvido e: " + troco);
            System.out.println("Filme alugado com sucesso! " + filmeASerAlugado);
        }
        if (valorPago < valorAluguelDiario * qtdDiasAlugados) {
            System.out.println("Valor insulficiente");
        }
        if (valorPago > valorAluguelDiario * qtdDiasAlugados) {
            System.out.println("O troco a ser devolvido e: " + troco);
            System.out.println("Filme alugado com sucesso! " + filmeASerAlugado2);
        }
        if (valorPago < valorAluguelDiario * qtdDiasAlugados) {
            System.out.println("Valor insulficiente");
        }
    }
}

