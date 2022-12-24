package com.br.aulasOrbit;

public class LojaDeRoupa {
    public static void main(String[] args) {
        // Declaração das variáveis
        String descricao = "Calça jeans", tamanho = "G", cor = "Branco", estilo = "Moda verão";
        int codigo = 1, estoque = 3, pecasCompradas = 3;
        double valor = 100.5, valorPago = 350.25, numeroDeParcelas = 6;
        double valorTotal = valor * pecasCompradas;
        double valorDaParcela = valor / numeroDeParcelas;
        boolean informacoesDeParcelas = true;

        // 5% de desconto no pagamento à vista
        double desconto = (valor * 5 / 100) * pecasCompradas;
        double descontoFinal = valorTotal - desconto;

        // Houve a necessidade de um 'Casting', por causa da incompatibilidade da variáveis
        int parcelas = (int) (numeroDeParcelas);
        if (valorPago >= valor) {
            System.out.println("\n Descrição da roupa: " + descricao);
            System.out.println(" Código da roupa: " + codigo);
            System.out.println(" Tipo do estoque: " + estoque);
            System.out.println(" Tamanho da peça: " + tamanho);
            System.out.println(" Cor da peça: " + cor);
            System.out.println(" Estilo da peça: " + estilo);
            System.out.println("\n Numero de peças Compradas: " + pecasCompradas);
            System.out.println(" Total a pagar: " + (int) (valor * pecasCompradas));
            System.out.println(" Desconto de 5 % : " + (int) desconto);
            System.out.println(" Total a pagar com o desconto de 5 % : " + (int) descontoFinal);
            System.out.println("\n COMPRA REALIZADA COM SUCESSO!");
            System.out.println("\n VOLTE SEMPRE!");
        }
        if (valorPago <= valor && informacoesDeParcelas == true || valorPago >= valor && informacoesDeParcelas) {
            System.out.println("\n Desrição da roupa: " + descricao);
            System.out.println(" Código da roupa: " + codigo);
            System.out.println(" Tipo do estoque: " + estoque);
            System.out.println(" Tamanho da peça: " + tamanho);
            System.out.println(" Cor da peça: " + cor);
            System.out.println(" Estilo da peça: " + estilo);
            System.out.println("\n Numero de peças Compradas: " + pecasCompradas);
            System.out.println(" Valor da 1º Parcela: " + valorDaParcela * pecasCompradas);
            System.out.println("\n COMPRA REALIZADA COM SUCESSO!");
            System.out.println("\n VOLTE SEMPRE!");
        }
    }
}
