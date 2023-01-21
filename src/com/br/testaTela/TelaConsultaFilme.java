package com.br.testaTela;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TelaConsultaFilme {

    public TelaConsultaFilme() {
        iniciar();
    }

    public static void main(String[] args) {
        new TelaConsultaFilme();
    }

    private void iniciar() {

        //LENDO UM ARQUIVO .TXT
        try {
            Scanner leitor = new Scanner(new FileReader("cadastraFilme.txt"));
            System.out.println("\nDados do Filme ==> ");
            while (leitor.hasNext()) {
                String line = leitor.nextLine();
                System.out.println(line);
                JOptionPane.showMessageDialog(null, line);
            }
            leitor.close();
        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "ERROR! \n Arquivo não encontrado. \n Não foi possivel realizar a leitura.");
        }
    }
}
