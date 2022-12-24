package com.br.orientacaoObjeto;

import java.util.Scanner;

public class TestaObjeto {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do cachorro: ");
        pessoa.nome = scanner.next();
        System.out.println(pessoa.nome);
        System.out.println("Informe o Salário: ");
        pessoa.salario = scanner.nextDouble();
        System.out.println(pessoa.retornaNovoSalario());
    }
}
