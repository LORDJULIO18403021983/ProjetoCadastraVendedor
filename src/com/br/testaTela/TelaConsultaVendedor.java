package com.br.testaTela;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TelaConsultaVendedor {

    public TelaConsultaVendedor() {
        iniciar();
    }

    public static void main(String[] args) {
        new TelaConsultaVendedor();
    }

    private void iniciar() {

        //LENDO UM ARQUIVO .TXT
        try {
            Scanner leitor = new Scanner(new FileReader("cadastraVendedor.txt"));
            System.out.println("\nDados do cliente ==> ");
            while (leitor.hasNext()) {
                String line = leitor.nextLine();
                System.out.println(line);
            }
            leitor.close();
        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "ERROR! \n Arquivo não encontrado. \n Não foi possivel realizar a leitura.");
        }
    }
}
