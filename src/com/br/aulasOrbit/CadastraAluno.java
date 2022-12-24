package com.br.aulasOrbit;

public class CadastraAluno {
    public static void main(String[] args) {
        // Declaração das variaveis
        String nome = "Julio Abreu";
        int matricula = 5;
        int idade = 39;
        char nota1 = 'A';
        char nota2 = 'B';
        char nota3 = 'C';
        char nota4 = 'D';
        char notaFinal = 'A';
        String cidade = "Jandira";
        String estado = "São Paulo";
        // Condições 'se' para verificar se o aluno é menor ou maior
        System.out.println(
                "\nMatricula" + "     " + "Nome" + "            " + "Idade" + "    " + "Cidade" + "     " + "Estado");

        if (idade < 18) {
            System.out.println(
                    "\n " + matricula + "            " + nome + "     " + idade + "       " + cidade + "    " + estado);
            System.out.println("\nO aluno é menor. ");
        }
        if (idade > 18) {
            System.out.println(
                    "\n " + matricula + "            " + nome + "     " + idade + "       " + cidade + "    " + estado);
            System.out.println("\nO aluno é maior. ");
        }
        if (notaFinal == nota1) {
            System.out.println("\nA nota do aluno " + nome + " é: " + nota1);
            System.out.println("\nNota excelente!");
        } else if (notaFinal == nota2) {
            System.out.println("\nA nota do aluno " + nome + " é: " + nota2);
            System.out.println("\nNota boa!");
        } else if (notaFinal == nota3) {
            System.out.println("\nA nota do aluno " + nome + " é: " + nota3);
            System.out.println("\nNota regular!");
        } else if (notaFinal == nota4) {
            System.out.println("\nA nota do aluno " + nome + " é: " + nota4);
            System.out.println("\nNota abaixo do esperado!");
        }
    }
}
