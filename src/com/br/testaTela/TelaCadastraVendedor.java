package com.br.testaTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TelaCadastraVendedor extends ModeloVendedor {

    /**
     * Desenvolvido por Julio_Abreu
     * e-mail = juliocasp38@gmail.com
     */

    private JFrame janelaVendedor;
    private JButton inserir, consultar, limpar, cancelar;
    private JLabel labelNome, labelSalario, labelEmail, labelIdade, labelCidade, labelEstado;
    private JTextField textFieldNome, textFieldSalario, textFieldEmail, textFieldIdade, textFieldCidade, textFieldEstado;
    private List<ModeloVendedor> vendedorList = new ArrayList<>();
    // Variáveis do comboBox.
    private JComboBox<Object> comboBoxVendedor;
    private String[] cargoDoVendedor = {"Vendedor Estagiario", "Vendedor Junior", "Vendedor Pleno", "Vendedor Senior", "Vendedor Master"};

    public TelaCadastraVendedor() {
        iniciar();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new TelaCadastraVendedor();
    }

    private void iniciar() {
        // CRIA A JANELA.
        janelaVendedor = new JFrame("Tela Insere Vendedor");
        janelaVendedor.setLayout(null);

        // Configurando os Label's
        labelNome = new JLabel("Nome:");
        labelNome.setBounds(50, 40, 100, 20);
        labelSalario = new JLabel("Salário:");
        labelSalario.setBounds(50, 80, 100, 20);
        labelEmail = new JLabel("Email:");
        labelEmail.setBounds(50, 120, 100, 20);
        labelIdade = new JLabel("Idade:");
        labelIdade.setBounds(50, 160, 100, 20);
        labelCidade = new JLabel("Cidade:");
        labelCidade.setBounds(50, 200, 100, 20);
        labelEstado = new JLabel("Estado:");
        labelEstado.setBounds(50, 240, 100, 20);

        // Adiciona os elementos label's na janela.
        janelaVendedor.getContentPane().add(labelNome);
        janelaVendedor.getContentPane().add(labelSalario);
        janelaVendedor.getContentPane().add(labelEmail);
        janelaVendedor.getContentPane().add(labelIdade);
        janelaVendedor.getContentPane().add(labelCidade);
        janelaVendedor.getContentPane().add(labelEstado);

        // Configurando os TextField's
        textFieldNome = new JTextField(null, "Nome ...", 40);
        textFieldNome.setBounds(250, 40, 250, 20);
        textFieldSalario = new JTextField(null, "12345", 12);
        textFieldSalario.setBounds(250, 80, 250, 20);
        textFieldEmail = new JTextField(null, "abc@gmail.com", 40);
        textFieldEmail.setBounds(250, 120, 250, 20);
        textFieldIdade = new JTextField(null, "99", 40);
        textFieldIdade.setBounds(250, 160, 250, 20);
        textFieldCidade = new JTextField(null, "Cidade ...", 15);
        textFieldCidade.setBounds(250, 200, 250, 20);
        textFieldEstado = new JTextField(null, "Estado ...", 3);
        textFieldEstado.setBounds(250, 240, 250, 20);

        // Adiciona os elementos TextField na janela.
        janelaVendedor.getContentPane().add(textFieldNome);
        janelaVendedor.getContentPane().add(textFieldSalario);
        janelaVendedor.getContentPane().add(textFieldEmail);
        janelaVendedor.getContentPane().add(textFieldIdade);
        janelaVendedor.getContentPane().add(textFieldCidade);
        janelaVendedor.getContentPane().add(textFieldEstado);

        // Configurando os bostões.
        inserir = new JButton("Inserir");
        inserir.addActionListener(new InserirListener());
        inserir.setBounds(40, 340, 95, 30);

        consultar = new JButton("Consultar");
        consultar.addActionListener(new ConsultarListener());
        consultar.setBounds(140, 340, 95, 30);

        limpar = new JButton("Limpar");
        limpar.addActionListener(new LimparListener());
        limpar.setBounds(240, 340, 95, 30);

        cancelar = new JButton("Cancelar");
        cancelar.addActionListener(new CancelarListener());
        cancelar.setBounds(340, 340, 95, 30);


        // Adicionando os botões
        janelaVendedor.add(inserir);
        janelaVendedor.add(consultar);
        janelaVendedor.add(limpar);
        janelaVendedor.add(cancelar);

        //Cria o Menu retrátil.
        comboBoxVendedor = new JComboBox<>(cargoDoVendedor);
        comboBoxVendedor.setSelectedIndex(-1);
        comboBoxVendedor.setBounds(40, 285, 200, 30);
        // Numero de colunas visiveis
        comboBoxVendedor.setMaximumRowCount(4);
        // Adiciona no painel
        janelaVendedor.add(comboBoxVendedor);

        // CONFIGURANDO A JANELA
        janelaVendedor.setSize(600, 500);
        janelaVendedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaVendedor.setResizable(false);
        janelaVendedor.setVisible(true);
        janelaVendedor.setLayout(null);
    }

    public class InserirListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            ModeloVendedor modeloVendedor = new ModeloVendedor();
            try {
                if (textFieldNome.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O nome não pode estar vazio!", "Informação", JOptionPane.ERROR_MESSAGE);
                } else if (textFieldNome.getText().length() > 50) {
                    JOptionPane.showMessageDialog(null, "O nome não pode ter mais de 50 caracteres!", "Informação", JOptionPane.ERROR_MESSAGE);
                } else {
                    modeloVendedor.setNome(textFieldNome.getText().trim().toUpperCase(Locale.ROOT));
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro no campo nome!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            try {
                if (textFieldSalario.getText().trim().isEmpty() || textFieldSalario.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "O salário não pode estar vazio. ", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    modeloVendedor.setSalario(Double.parseDouble(textFieldSalario.getText().trim()));
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas numero!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            try {
                int indexador = textFieldEmail.getText().trim().indexOf('@');
                if (indexador > 2) {
                    modeloVendedor.setEmail(textFieldEmail.getText().trim());
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de email inválido.\nExemplo: abc@gmail.com", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro no campo do email!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            try {
                if (textFieldIdade.getText().trim().equals("") || textFieldIdade.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Formato da idade inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
                } else {
                    modeloVendedor.setIdade(Integer.parseInt(textFieldIdade.getText().trim()));
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Erro no campo idade.\nDigite apenas numero!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            try {
                if (textFieldCidade.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo cidade não pode estar vazio!", "Informação", JOptionPane.ERROR_MESSAGE);
                } else if (textFieldCidade.getText().length() > 30) {
                    JOptionPane.showMessageDialog(null, "O campo cidade não pode ter mais de 30 caracteres!", "Informação", JOptionPane.ERROR_MESSAGE);
                } else {
                    modeloVendedor.setCidade(textFieldCidade.getText().trim().toUpperCase());
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro no campo cidade", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            try {
                if (textFieldEstado.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo estado não pode estar vazio.", " ERRO", JOptionPane.ERROR_MESSAGE);
                } else if (textFieldEstado.getText().length() > 30) {
                    JOptionPane.showMessageDialog(null, "O campo estado não pode ter mais de 30 caracteres!", "Informação", JOptionPane.ERROR_MESSAGE);
                } else {
                    modeloVendedor.setEstado(textFieldEstado.getText().trim().toUpperCase());
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro no campo estado.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("\nDados do vendedor inseridos com sucesso!!!");

            vendedorList.add(modeloVendedor);

            if (vendedorList.size() > 2) {
                try {
                    JOptionPane.showMessageDialog(null, "Numero máximo de cadastro!", "Informação", JOptionPane.ERROR_MESSAGE);
                } catch (ArrayIndexOutOfBoundsException erro) {
                    JOptionPane.showMessageDialog(null, " Possível apenas 2 registro!", "Informação", JOptionPane.ERROR_MESSAGE);
                }
            }

            //SALVANDO EM .TXT
            try {
                File arquivo = new File("cadastraVendedor.txt");
                FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
                PrintStream gravador = new PrintStream(arquivoOutput);
                gravador.print("\nNome: " + textFieldNome.getText().trim().toUpperCase() + ", ");
                gravador.print("Salário: " + textFieldSalario.getText().trim() + ", ");
                gravador.print("Email : " + textFieldEmail.getText().trim() + ", ");
                gravador.print("Idade: " + textFieldIdade.getText().trim() + ", ");
                gravador.print("Cidade: " + textFieldCidade.getText().trim().toUpperCase() + ", ");
                gravador.print("Estado: " + textFieldEstado.getText().trim().toUpperCase() + ", ");
                gravador.print("Cargo do vendedor : " + comboBoxVendedor.getSelectedItem() + ".\n");
                gravador.close();
                System.out.println("Dados inseridos com sucesso!!!\n");
            } catch (FileNotFoundException error) {
                System.out.println("Arquivo de entrada nao encontrado.");
            } catch (Exception e) {
                System.out.println("Erro na gravação.");
            }
            //LENDO UM ARQUIVO .TXT
            try {
                Scanner leitor = new Scanner(new FileReader("cadastraVendedor.txt"));
                System.out.println("\nDados do cliente ==> ");
                while (leitor.hasNext()) {
                    String line = leitor.nextLine();
                    System.out.println(line);
                }
                leitor.close();
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "ERROR! \n Arquivo não encontrado. \n Não foi possivel realizar a leitura.");
            }
        }
    }

    public class ConsultarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // Exibe os dados registrados.
            System.out.println("\nDados do vendedor ==>");
            for (ModeloVendedor modeloVendedor : vendedorList) {
                System.out.println("\nNome: " + modeloVendedor.getNome() + "\nSalário: " + modeloVendedor.getSalario() + "\nEmail: " + modeloVendedor.getEmail() + "\nIdade: "
                        + modeloVendedor.getIdade() + "\nCidade: " + modeloVendedor.getCidade() + "\nEstado: " + modeloVendedor.getEstado());
            }
            System.out.println(vendedorList.size());
            System.out.println("====================================================\n");
            try {
                if (vendedorList.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Arquivo não encontrado!");
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, " Verifique se há algum registro salvo!");
            }

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

    public class LimparListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            // Limpa os dados dos campos.
            textFieldNome.setText(null);
            textFieldSalario.setText(null);
            textFieldEmail.setText(null);
            textFieldIdade.setText(null);
            textFieldCidade.setText(null);
            textFieldEstado.setText(null);

        }
    }

    public class CancelarListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            System.out.println("Saindo ...");
            System.exit(0);
        }
    }
}
