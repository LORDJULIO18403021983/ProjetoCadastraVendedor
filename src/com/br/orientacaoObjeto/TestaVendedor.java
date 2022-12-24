package com.br.orientacaoObjeto;

import java.util.Scanner;

public class TestaVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        Data nascimento = new Data();
        Data expedicao = new Data();
        Endereco endereco = new Endereco();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o nome: ");
        vendedor.nome = scanner.next(); scanner.nextLine();
        System.out.println("Digite o idade: ");
        vendedor.idade = scanner.nextInt(); scanner.nextLine();
        System.out.println("Digite o Salário: ");
        vendedor.salario = scanner.nextDouble(); scanner.nextLine();
        System.out.println("Digite o RG: ");
        vendedor.rg = scanner.next(); scanner.nextLine();

        System.out.println("Digite o dia da data de expedição: ");
        expedicao.dia = scanner.nextInt(); scanner.nextLine();
        System.out.println("Digite o mês da data de expedição: ");
        expedicao.mes = scanner.nextInt(); scanner.nextLine();
        System.out.println("Digite o ano da data de expedição: ");
        expedicao.ano = scanner.nextInt(); scanner.nextLine();

        System.out.println("Digite o dia de nascimento: ");
        nascimento.dia = scanner.nextInt(); scanner.nextLine();
        System.out.println("Digite o mês de nascimento: ");
        nascimento.mes = scanner.nextInt(); scanner.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        nascimento.ano = scanner.nextInt(); scanner.nextLine();

        System.out.println("Digite a rua: ");
        endereco.rua = scanner.next(); scanner.nextLine();
        System.out.println("Digite a cidade: ");
        endereco.cidade = scanner.next(); scanner.nextLine();
        System.out.println("Digite o estado: ");
        endereco.estado = scanner.next(); scanner.nextLine();

        vendedor.expedicao = expedicao;
        vendedor.nascimento = nascimento;
        vendedor.endereco = endereco;

        scanner.close();
        System.out.println("\n Exibição dos dados: ");
        vendedor.exibirDados();

    }
}
