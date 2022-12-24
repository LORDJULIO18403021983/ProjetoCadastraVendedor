package com.br.orientacaoObjeto;

import java.util.Scanner;

public class InsereProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Endereco2 endereco2 = new Endereco2();
        Contato contato = new Contato();
        Data2 dataNacimento = new Data2();
        Data2 dataAdmissao = new Data2();
        Data2 dataExpedicao = new Data2();
        DadosPessoais dadosPessoais = new DadosPessoais();
        DadosProfissionais dadosProfissionais = new DadosProfissionais();
        RG rg = new RG();

        Scanner scanner = new Scanner(System.in);


        System.out.println("\n Digite o nome do professor:");
        dadosPessoais.nome = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite a idade do professor:");
        dadosPessoais.idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Digite o salário do professor:");
        dadosProfissionais.salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(" Digite a disciplina do professor:");
        dadosProfissionais.disciplina = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite o cpf do professor:");
        dadosPessoais.cpf = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite o RG do professor:");
        rg.numeroRg = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite o logradouro do Professor:");
        endereco2.logradouro = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite a rua do Professor:");
        endereco2.rua = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite o numero do Professor:");
        endereco2.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Digite o complemento do Professor:");
        endereco2.complemento = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite a cidade do Professor:");
        endereco2.cidade = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite o estado do Professor:");
        endereco2.estado = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite o CEP do Professor:");
        endereco2.cep = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite o e-mail:");
        contato.email = scanner.nextLine();
        scanner.nextLine();
        System.out.println(" Digite o telefone:");
        contato.telefone = scanner.nextLine();
        scanner.nextLine();
        System.out.println(" Digite o WhatsApp:");
        contato.whatsApp = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite o dia da data de expedição:");
        dataExpedicao.dia = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Digite o mês da data de expedição:");
        dataExpedicao.mes = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Digite o ano da data de expedição:");
        dataExpedicao.ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Digite o dia do nascimento:");
        dadosPessoais.rg.dataNascimento.dia = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Digite o mês do nascimento:");
        rg.dataNascimento.mes = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Digite o ano do nascimento:");
        rg.dataNascimento.ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Digite o nome da mãe:");
        rg.nomeDaMae = scanner.nextLine();
        scanner.nextLine();

        System.out.println(" Digite o dia da admissão:");
        dataAdmissao.dia = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Digite o mês da admissão:");
        dataAdmissao.mes = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Digite o ano da admissão:");
        dataAdmissao.ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Digite o nome da Escola:");
        dadosProfissionais.nomeDaEscola = scanner.nextLine();
        scanner.nextLine();

        professor.dadosProfissionais = dadosProfissionais;
        professor.dadosPessoais = dadosPessoais;
        dadosProfissionais.dataAdmissao = dataAdmissao;
        dadosPessoais.rg.dataExpedicao = dataExpedicao;
        dadosPessoais.rg.dataNascimento = dataNacimento;
        dadosPessoais.rg = rg;
        rg.dataNascimento = dataNacimento;
        rg.dataExpedicao = dataExpedicao;


        scanner.close();
        System.out.println("\n Exibição dos dados: ");
        professor.exibirDados();
    }
}
