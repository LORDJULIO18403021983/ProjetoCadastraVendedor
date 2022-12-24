package com.br.testaTela;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {

        try {
            //Scanner leitor = new Scanner(new FileReader("C:\\Users\\Julio\\MeusProjetos2\\CursoJavaOrbit\\src\\com\\br\\testaTela\\entrada.txt"));
            Scanner leitor = new Scanner(new FileReader("entrada.txt"));
            System.out.println("Arquivo encontrado com sucesso.");
            while (leitor.hasNext()) {
                System.out.println(leitor.nextLine());
            }
            leitor.close();
        } catch (FileNotFoundException error) {
            System.out.print("Arquivo de entrada nao encontrado.");
        }
    }
}
