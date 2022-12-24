package com.br.testaTela;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {
    public static void main(String[] args) {

        try {
            //PrintStream gravador = new PrintStream("C:\\Users\\Julio\\MeusProjetos2\\CursoJavaOrbit\\src\\com\\br\\testaTela\\saida.txt");
            PrintStream gravador = new PrintStream("saida.txt");
            gravador.println("PrintStream");
            gravador.println("A classe PrintStream possui um construtor que já");
            gravador.println("recebe um nome de um arquivo como argumento");
            gravador.println("");
            gravador.println("È importante lembrar que o arquivo de saida");
            gravador.println("DEVE SER FECHADO USANDO O METODO CLOSE");
            gravador.println("ARQUIVO SALVO COM SUCESSO!!!");
            gravador.close();
            System.out.println("Arquivo salvo com sucesso!");

        } catch (FileNotFoundException e) {
            System.out.println("Erro na gravação.");
        }
    }
}
