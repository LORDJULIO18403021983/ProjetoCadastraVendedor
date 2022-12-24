package com.br.testaTela;

import javax.swing.JOptionPane;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) throws FileNotFoundException {

        JOptionPane.showMessageDialog(null, "Bem vindo ao Sistema!");
        JOptionPane.showMessageDialog(null, "Preencha seus dados abaixo: ");

        //EXIBINDO MENU:
        int loop = 0;
        int selecionaInt = 0;
        while (loop != 1) {
            try {
                String selecionar = JOptionPane.showInputDialog("========================\n" + "       == Cadastro Cliente == \n" +
                                                                "            Digite uma opção    \n" + "          01-Cadastrar cliente  \n" +
                                                                "           02-Exibir clientes   \n" + "                      0-Sair        \n" +
                                                                "========================");
                selecionar = selecionar.trim();
                selecionaInt = Integer.parseInt(selecionar);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO! \nDigite somente numeros.");
            }
            if (selecionaInt == 0) {
                JOptionPane.showMessageDialog(null, "Saindo...");
                System.exit(0);
            } else if (selecionaInt == 1) {

                //Inserindo e validando nome.
                String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Informação", 2);
                System.out.println("Nome: " + nome.trim().toUpperCase());

                //inserindo e validando salário.
                String salario = null;
                int i = 0;
                while (i != 1) {
                    try {
                        salario = JOptionPane.showInputDialog(null, "Digite seu salário: ", "Informação", 2);
                        salario = salario.trim();
                        salario = Double.toString(Double.parseDouble(salario));
                        i = 1;
                        System.out.println("Salário: " + salario);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "ERROR! \n Digite somente numero.");
                    }
                }

                //Inserindo e validando idade.
                String idadeCliente = JOptionPane.showInputDialog(null, "Informe sua idade: ", "Digite a idade: ", 2);
                int idade = Integer.parseInt(idadeCliente);
                System.out.println("Idade: " + idade);
                try {
                    if (idade >= 18)
                        System.out.println("Maior: " + idade);
                    else
                        System.out.println("Menor: "+ idade);
                } catch (HeadlessException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println("Digite apenas numero!");
                }

                //Inserindo e validando Email.
                String email = null;
                int loopEmail = 0;
                while (loopEmail != 1) {
                    try {
                        email = JOptionPane.showInputDialog(null, "Informe seu Email: ", "Digite o email: ", 2);
                        int index = email.indexOf("@");
                        if (index > 2) {
                            email = email.trim();
                            loopEmail = 1;
                            System.out.println("Email: " + email.trim());
                        } else {
                            JOptionPane.showMessageDialog(null, "ERRO! \n Formato de email inválido. \n Exemplo: abc@gmail.com ");
                            loopEmail = 0;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERRO!");
                    }
                }

                int perguntaTI = JOptionPane.showConfirmDialog(null, "O cliente gosta de TI?");
                if (perguntaTI == 0) {
                    System.out.println("Sim" + perguntaTI);
                } else if (perguntaTI == 2) {
                    System.out.println("Não!" + perguntaTI);
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                }

                //SALVANDO EM .TXT
                try {
                    File arquivo = new File("cadastroCliente.txt");
                    FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
                    PrintStream gravador = new PrintStream(arquivoOutput);
                    gravador.println("\nDados do cliente: ");
                    gravador.println("Nome: " + nome.trim().toUpperCase());
                    gravador.println("Salário: " + salario);
                    gravador.println("Idade : " + idade);
                    gravador.println("Email: " + email.trim());
                    gravador.close();
                    System.out.println("Dados inseridos com sucesso!!!\n");
                } catch (FileNotFoundException error) {
                    System.out.println("Arquivo de entrada nao encontrado.");
                } catch (Exception e) {
                    System.out.println("Erro na gravação.");
                }

                //LENDO UM ARQUIVO .TXT
            } else if (selecionaInt == 2) {
                try {
                    Scanner leitor = new Scanner(new FileReader("cadastroCliente.txt"));
                        System.out.println("\nDados do cliente ==> ");
                    while (leitor.hasNext()) {
                        String line = leitor.nextLine();
                        System.out.println(line);
                    }
                    leitor.close();
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "ERROR! \n Arquivo não encontrado. \n Não foi possivel realizar a leitura.");
                }
            }
        }
    }
}