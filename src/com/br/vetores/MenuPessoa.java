package com.br.vetores;

import java.util.Scanner;

public class MenuPessoa {
    /**
     * Desenvolvido por Julio_Abreu
     * e-mail = juliocasp38@gmail.com
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int selecionar = 0;
        int x = 0;// contador do vetor
        System.out.println(Mensagem.InformeTamanhoVetor);
        x = ler.nextInt();
        Pessoa2[] pessoa2 = new Pessoa2[x];

        while (selecionar == 0) {
            System.out.println("\nInforme as opções: ");
            System.out.println("0 - Sair: ");
            System.out.println("1 - Cadastrar: ");
            System.out.println("2 - Exibir: ");
            int opcao1 = ler.nextInt();
            ler.nextLine();

            if (opcao1 == 1) {
                for (int i = 0; i < pessoa2.length; i++) {
                    Pessoa2 p2 = new Pessoa2();
                    System.out.println(Mensagem.InformeNome);
                    p2.nome = ler.nextLine();
                    ler.nextLine();
                    System.out.println(Mensagem.InformeIdade);
                    p2.idade = ler.nextInt();
                    ler.nextLine();
                    System.out.println(Mensagem.informeCpf);
                    p2.cpf = ler.nextLine();
                    ler.nextLine();
                    System.out.println(Mensagem.InformeSalario);
                    p2.salario = ler.nextDouble();
                    ler.nextLine();

                    pessoa2[i] = p2;
                    System.out.println(Mensagem.Incluido);
                }
            }
            if (opcao1 == 2) {
                for (int i = 0; i < pessoa2.length; i++) {
                    pessoa2[i].exibirDados();
                }
            }
            if (opcao1 == 0) {
                System.out.println("Saindo...");
                break;
            }
            if (opcao1 != 1 && opcao1 != 2 && opcao1 != 0) {
                System.out.println("Opção inválida");
            }
        }
        ler.close();
    }
}
