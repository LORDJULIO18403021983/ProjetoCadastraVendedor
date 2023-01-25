package com.br.testaTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TelaCadastraFilme {
    private JFrame janelaFilme;
    private JLabel labelCodigo, labelNome, labelGenero, labelDisponivel, labelValor;
    private JTextField textFieldCodigo, textFieldNome, textFieldValor;
    private JButton botaoIncluir, botaoSair;
    private List<ModeloFilme> filmeList = new ArrayList<>();
    // Variáveis do comboBox.
    private JComboBox comboBoxDisponivel, comboBoxGenero;
    private String[] statusFilme = {"Disponivel", "Indisponivel"};
    private String[] generoFilme = {"Ficção", "Ação/Aventura", "Terror", "Comédia", "Romance", "Outro"};

    public TelaCadastraFilme() {
        iniciar();
    }

    public static void main(String[] args) {
        new TelaCadastraFilme();
    }

    private void iniciar() {

        // CRIA A JANELA.
        janelaFilme = new JFrame("Tela insere Filme");
        janelaFilme.setLayout(null);

        // Configurando os Label's
        labelCodigo = new JLabel("Codigo: ");
        labelCodigo.setBounds(10, 50, 100, 20);
        labelNome = new JLabel("Nome: ");
        labelNome.setBounds(10, 80, 100, 20);
        labelGenero = new JLabel("Genero: ");
        labelGenero.setBounds(10, 140, 150, 20);
        labelDisponivel = new JLabel("Disponibilidade: ");
        labelDisponivel.setBounds(10, 180, 150, 20);
        labelValor = new JLabel("Valor: ");
        labelValor.setBounds(10, 110, 100, 20);

        // Adiciona os elementos label's na janela.
        janelaFilme.getContentPane().add(labelCodigo);
        janelaFilme.getContentPane().add(labelNome);
        janelaFilme.getContentPane().add(labelDisponivel);
        janelaFilme.getContentPane().add(labelGenero);
        janelaFilme.getContentPane().add(labelValor);

        // Configurando os TextField's
        textFieldCodigo = new JTextField("9999");
        textFieldCodigo.setBounds(130, 50, 50, 20);
        textFieldNome = new JTextField("Nome do Filme");
        textFieldNome.setBounds(130, 80, 300, 20);
        textFieldValor = new JTextField("999.99");
        textFieldValor.setBounds(130, 110, 50, 20);

        // Adiciona os elementos TextField na janela.
        janelaFilme.getContentPane().add(textFieldCodigo);
        janelaFilme.getContentPane().add(textFieldNome);
        janelaFilme.getContentPane().add(textFieldValor);

        //Cria o Menu retrátil.
        comboBoxGenero = new JComboBox<>(generoFilme);
        comboBoxGenero.setSelectedIndex(-1);
        comboBoxGenero.setBounds(130, 140, 300, 30);
        comboBoxGenero.setMaximumRowCount(5);

        comboBoxDisponivel = new JComboBox<>(statusFilme);
        comboBoxDisponivel.setSelectedIndex(-1);
        comboBoxDisponivel.setBounds(130, 180, 300, 30);
        comboBoxDisponivel.setMaximumRowCount(2);

        // Adicionando os ComboBox's.
        janelaFilme.getContentPane().add(comboBoxGenero);
        janelaFilme.getContentPane().add(comboBoxDisponivel);

        // Configurando os bostões.
        botaoIncluir = new JButton("Incluir");
        botaoIncluir.addActionListener(new FilmeListener());
        botaoIncluir.setBounds(150, 230, 95, 30);
        botaoSair = new JButton("Retornar");
        botaoSair.addActionListener(new FilmeListener());
        botaoSair.setBounds(250, 230, 95, 30);

        // Adicionando os botões.
        janelaFilme.getContentPane().add(botaoIncluir);
        janelaFilme.getContentPane().add(botaoSair);


        janelaFilme.setSize(500, 350);
        janelaFilme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaFilme.setVisible(true);
    }

    public class FilmeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            ModeloFilme modeloFilme = new ModeloFilme();
            if (e.getSource() == botaoIncluir) {
                boolean iCodigo = false;
                boolean iValor = false;
                try {
                    modeloFilme.setCodigo(Integer.parseInt(textFieldCodigo.getText().trim()));
                    iCodigo = true;
                } catch (java.lang.NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, "Codigo do Filme inválido, redigitar ...  ", "INFORMAÇÃO", 2);
                }

                try {
                    if (textFieldNome.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "O nome não pode estar vazio!", "Informação", JOptionPane.ERROR_MESSAGE);
                    } else if (textFieldNome.getText().length() > 50) {
                        JOptionPane.showMessageDialog(null, "O nome não pode ter mais de 50 caracteres!", "Informação", JOptionPane.ERROR_MESSAGE);
                    } else {
                        modeloFilme.setNome(textFieldNome.getText().trim().toUpperCase(Locale.ROOT));
                    }
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro no campo nome!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                }

                try {
                    modeloFilme.setValor(Double.parseDouble(textFieldValor.getText().trim()));
                    iValor = true;
                } catch (java.lang.NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, "Valor do Filme inválido, redigitar !!!", "INFORMAÇÃO", 2);
                }
                if (iCodigo && iValor) {

                    try {
                        File arquivo = new File("cadastraFilme.txt");
                        FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
                        PrintStream gravador = new PrintStream(arquivoOutput);
                        gravador.print("\nCodigo: " + Integer.parseInt(textFieldCodigo.getText().trim()) + ", ");
                        gravador.print("Nome : " + textFieldNome.getText().toUpperCase() + ", ");
                        gravador.print("Valor: " + Double.parseDouble(textFieldValor.getText().trim()) + ", ");
                        gravador.print("Genero: " + generoFilme[comboBoxGenero.getSelectedIndex()] + ", ");

                        if (comboBoxDisponivel.getSelectedIndex() == 0) {
                            modeloFilme.setDisponivel(true);
                            gravador.println("Disponivel" + "\n");
                        }
                        if (comboBoxDisponivel.getSelectedIndex() == 1) {
                            modeloFilme.setDisponivel(false);
                            gravador.println("Indisponivel" + "\n");
                        }
                        gravador.close();
                    } catch (Exception ee) {
                        System.out.println("Erro de Gravação ....");
                    }

                    filmeList.add(modeloFilme);
                    System.out.println(filmeList.toString());

                    JOptionPane.showMessageDialog(null, "INCLUSÃO REALIZADA !!!", "INFORMAÇÃO", 2);
                    textFieldCodigo.setText("9999");
                    textFieldNome.setText("Nome do Filme");
                    textFieldValor.setText("999.99");
                    comboBoxDisponivel.setSelectedIndex(-1);
                    comboBoxGenero.setSelectedIndex(-1);
                }
            }

            if (e.getSource() == botaoSair) {
                System.out.println("Saindo ...");
                System.exit(0);
            }
        }
    }
}
