package com.br.orientacaoObjeto;

import java.util.Scanner;

public class TestaCachorro {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        Data ultimaVacinacao = new Data();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Animal:");
        cachorro1.nome = scanner.next();
        scanner.nextLine();
        System.out.println("Digite a idade do Animal:");
        cachorro1.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o sexo do Animal:");
        cachorro1.sexo = scanner.nextLine().charAt(0);
        scanner.nextLine();
        System.out.println("Data do ultimo dia da vacinação:");
        ultimaVacinacao.dia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Data do ultimo mes da vacinação:");
        ultimaVacinacao.mes = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Data do ultimo ano da vacinação:");
        ultimaVacinacao.ano = scanner.nextInt();
        scanner.nextLine();

        cachorro1.ultimaVacinacao = ultimaVacinacao;

        scanner.close();
        System.out.println("\n Exibição dos dados dos animais: ");

        cachorro1.exibirDados();
    }
}
