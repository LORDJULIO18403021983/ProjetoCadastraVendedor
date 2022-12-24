package com.br.exerciciosUniversidade;

import com.br.vetores.Mensagem;

import java.util.Scanner;

public class Universidade {
    /**
     * Desenvolvido por Julio_Abreu
     * e-mail = juliocasp38@gmail.com
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//        final int idade =10;   EXEMPLO DO FINAL
//        idade = 7;
        int selecionar = 0;
        // contador do vetor
        int x;
        System.out.println(Mensagem.InformeTamanhoVetor);
        x = ler.nextInt();
        Faxineira[] faxineira = new Faxineira[x];
        Professor[] professor = new Professor[x];
        Secretaria[] secretaria = new Secretaria[x];

        while (selecionar == 0) {
            System.out.println(Mensagem.InformeOpcoesSolicitadas);
            System.out.println(Mensagem.Sair);
            System.out.println(Mensagem.CadastrarFaxineira);
            System.out.println(Mensagem.ExibirFaxineira);
            System.out.println(Mensagem.CadastrarProfessor);
            System.out.println(Mensagem.ExibirProfessor);
            System.out.println(Mensagem.CadastrarSecretaria);
            System.out.println(Mensagem.ExibirSecretaria);
            System.out.println(Mensagem.ExibirTodosCadastrados);
            int opcao1 = ler.nextInt();
            ler.nextLine();
            //Cadastro Faxineira:
            if (opcao1 == 1) {
                for (int contador = 0; contador < faxineira.length; contador++) {
                    Faxineira faxi2 = new Faxineira();
                    System.out.println(Mensagem.InformeNome);
                    faxi2.setNome(ler.nextLine());
                    ler.nextLine();
                    System.out.println(Mensagem.InformeIdade);
                    faxi2.setIdade(ler.nextInt());
                    ler.nextLine();
                    System.out.println(Mensagem.InformeSalario);
                    faxi2.setSalario(ler.nextDouble());
                    ler.nextLine();

                    faxineira[contador] = faxi2;
                    contador = ler.nextInt();
                    System.out.println(Mensagem.Incluido);
                }
            }
            if (opcao1 == 2) {
                for (int contador = 0; contador < faxineira.length;
                     contador++) {
                    faxineira[contador].exibirDados();
                    System.out.println("Contador [" + contador + "] => " + faxineira[contador]);
                }
            }
            if (opcao1 == 3) {
                //Cadastro Professor:
                for (int contador = 0; contador < professor.length; contador++) {
                    professor[contador] = new Professor();
                    System.out.println(Mensagem.InformeNome);
                    professor[contador].setNome(ler.nextLine());
                    ler.nextLine();
                    System.out.println(Mensagem.InformeIdade);
                    professor[contador].setIdade(ler.nextInt());
                    ler.nextLine();
                    System.out.println(Mensagem.InformeSalario);
                    professor[contador].setSalario(ler.nextDouble());
                    ler.nextLine();
                    System.out.println(Mensagem.InformeMateria);
                    professor[contador].setMateria(ler.nextLine());
                    ler.nextLine();

                    System.out.println(Mensagem.Incluido);
                }
            }
            if (opcao1 == 4) {
                for (int contador = 0; contador < professor.length; contador++) {
                    professor[contador].exibirDados();
                    System.out.println("Contador [" + contador + "] => " + professor[contador]);
                }
            }
            //Cadastro Secretária:
            if (opcao1 == 5) {
                for (int contador = 0; contador < secretaria.length; contador++) {
                    secretaria[contador] = new Secretaria();
                    System.out.println(Mensagem.InformeNome);
                    secretaria[contador].setNome(ler.nextLine());
                    ler.nextLine();
                    System.out.println(Mensagem.InformeIdade);
                    secretaria[contador].setIdade(ler.nextInt());
                    ler.nextLine();
                    System.out.println(Mensagem.InformeSalario);
                    secretaria[contador].setSalario(ler.nextDouble());
                    ler.nextLine();
                    System.out.println(Mensagem.InformeRamal);
                    secretaria[contador].setRamal(ler.nextInt());
                    ler.nextLine();

                    System.out.println(Mensagem.Incluido);
                }
            }
            if (opcao1 == 6) {
                for (int contador = 0; contador < secretaria.length; contador++) {
                    secretaria[contador].exibirDados();
                    System.out.println("Contador [" + contador + "] => " + secretaria[contador]);
                }
            }
            //Exibir todos os cadastros:
            if (opcao1 == 7) {
                for (int contador = 0; contador < faxineira.length;
                     contador++) {
                    faxineira[contador].exibirDados();
                    System.out.println("Contador [" + contador + "] => " + faxineira[contador]);
                }
                for (int contador = 0; contador < professor.length; contador++) {
                    professor[contador].exibirDados();
                    System.out.println("Contador [" + contador + "] => " + professor[contador]);
                }
                for (int contador = 0; contador < secretaria.length; contador++) {
                    secretaria[contador].exibirDados();
                    System.out.println("Contador [" + contador + "] => " + secretaria[contador]);
                }
            }
            if (opcao1 == 0) {
                System.out.println("Saindo...");
                break;
            }
            if (opcao1 != 0 && opcao1 != 1 && opcao1 != 2 && opcao1 != 3 && opcao1 != 4 && opcao1 != 5 && opcao1 != 6 && opcao1 != 7) {
                System.out.println("Opção inválida");
            }
        }
        ler.close();
    }
}
