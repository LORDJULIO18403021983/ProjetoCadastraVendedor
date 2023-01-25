package com.br.testaTela;

import java.io.*;

public class TelaEfetuaLocacao {

    public TelaEfetuaLocacao() {
        iniciar();
    }

    public static void main(String[] args) {
        new TelaEfetuaLocacao();
    }

    private void iniciar() {

        //texte 04 para Filme!!!
        try {
            InputStream is = new FileInputStream("cadastraFilme.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader leitor = new BufferedReader(isr);

            String texto = leitor.readLine();//Primeira linha.

            while (texto != null) {
                System.out.println(texto);
                texto = leitor.readLine();
            }
        } catch (FileNotFoundException e) {//Para FileInputStream
            System.out.println("Arquivo \" cadastraFilme.txt\" não encontrado.");
            e.printStackTrace();
        } catch (IOException e) {//Para o readLine() .
            System.out.println("Erro na leitura do arquivo de cadastraFilme");
            e.printStackTrace();
        }

        //Texte 04 para Vendedor!!!
        try {
            InputStream is = new FileInputStream("cadastraVendedor.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader leitor = new BufferedReader(isr);

            String texto = leitor.readLine();//Primeira linha.

            while (texto != null) {
                System.out.println(texto);
                texto = leitor.readLine();
            }
        } catch (FileNotFoundException e) {//Para FileInputStream
            System.out.println("Arquivo \" cadastraVendedor.txt\" não encontrado.");
            e.printStackTrace();
        } catch (IOException e) {//Para o readLine() .
            System.out.println("Erro na leitura do arquivo de cadastraVendedor");
            e.printStackTrace();
        }
    }
}
