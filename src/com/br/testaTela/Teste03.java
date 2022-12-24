package com.br.testaTela;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Teste03 {
    public static void main(String[] args) {

        try {
            File arquivo = new File("saida.txt");
            FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
            PrintStream gravador = new PrintStream(arquivoOutput);
            gravador.println("\nFileOutPutStream");
            gravador.println("Utilizando o FileOutPutStream é possivel");
            gravador.println("Abrir um arquivo e gravar dados sem");
            gravador.println("Ser necessároio sobrescrever o arquivo");
            gravador.close();
            arquivoOutput.close();

        } catch (Exception e) {
            System.out.println("Erro na gravação.");
        }

    }
}
