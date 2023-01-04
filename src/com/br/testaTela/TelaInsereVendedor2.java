package com.br.testaTela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaInsereVendedor2 {
    /**
     * Desenvolvido por Julio_Abreu
     * e-mail = juliocasp38@gmail.com
     */

    ArrayList<Vendedor> listaVendedor = new ArrayList<>();
    Vendedor vendedor = new Vendedor();
    private JFrame janelaVendedor;
    private JButton inserir, consultar, limpar, cancelar;
    private JLabel labelNome, labelSalario, labelEmail, labelIdade, labelCidade, labelEstado;
    private JTextField textFieldNome, textFieldSalario, textFieldEmail, textFieldIdade, textFieldCidade, textFieldEstado;
    private JTabbedPane painelComAbasVendedor;
    private JPanel painelDaJanelaVendedor;
    private JPanel primeiraAbaVendedor;
    private JPanel segundaAbaFilme;
    private JComboBox<Object> comboBoxVendedor;
    private String[] cargoDoVendedor = {"VendedorJunior", "VendedorSenior", "VendedorPleno", "VendedorMegaBlaster"};

    public static void main(String[] args) {
        TelaInsereVendedor2 aplicativo = new TelaInsereVendedor2();
        aplicativo.iniciaGui();
    }

    public void iniciaGui() {
        // CRIA A JANELA.
        janelaVendedor = new JFrame("Tela Insere Vendedor");
        painelComAbasVendedor = new JTabbedPane();
        painelDaJanelaVendedor = (JPanel) janelaVendedor.getContentPane();
        primeiraAbaVendedor = new JPanel();
        segundaAbaFilme = new JPanel();

        // Painel com abas (JTabbledPane).
        painelComAbasVendedor.add("Vendedor", primeiraAbaVendedor);
        painelComAbasVendedor.add("Filmes", segundaAbaFilme);
        painelComAbasVendedor.setBounds(20, 20, 550, 450);

        // ContentPane (JTabbledPane).
        painelDaJanelaVendedor.setLayout(null);
        painelDaJanelaVendedor.add(painelComAbasVendedor);
        primeiraAbaVendedor.setLayout(null);

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
        primeiraAbaVendedor.add(labelNome);
        primeiraAbaVendedor.add(labelSalario);
        primeiraAbaVendedor.add(labelEmail);
        primeiraAbaVendedor.add(labelIdade);
        primeiraAbaVendedor.add(labelCidade);
        primeiraAbaVendedor.add(labelEstado);

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
        primeiraAbaVendedor.add(textFieldNome);
        primeiraAbaVendedor.add(textFieldSalario);
        primeiraAbaVendedor.add(textFieldEmail);
        primeiraAbaVendedor.add(textFieldIdade);
        primeiraAbaVendedor.add(textFieldCidade);
        primeiraAbaVendedor.add(textFieldEstado);

        // Configurando os bostões.
        inserir = new JButton("Inserir");
        inserir.addActionListener(new TelaInsereVendedor2.InserirListener());
        inserir.setBounds(40, 340, 95, 30);

        consultar = new JButton("Consultar");
        consultar.addActionListener(new TelaInsereVendedor2.ConsultarListener());
        consultar.setBounds(140, 340, 95, 30);

        limpar = new JButton("Limpar");
        limpar.addActionListener(new TelaInsereVendedor2.LimparListener());
        limpar.setBounds(240, 340, 95, 30);

        cancelar = new JButton("Cancelar");
        cancelar.addActionListener(new TelaInsereVendedor2.CancelarListener());
        cancelar.setBounds(340, 340, 95, 30);

        // Adicionando os botões a janela.
        primeiraAbaVendedor.add(inserir);
        primeiraAbaVendedor.add(consultar);
        primeiraAbaVendedor.add(limpar);
        primeiraAbaVendedor.add(cancelar);

        //Cria o Menu retrátil.
        comboBoxVendedor = new JComboBox<>(cargoDoVendedor);
        comboBoxVendedor.setSelectedIndex(-1);
        comboBoxVendedor.setBounds(40, 285, 200, 30);

        // Numero de colunas visiveis
        comboBoxVendedor.setMaximumRowCount(4);

        // Adiciona no painel
        primeiraAbaVendedor.add(comboBoxVendedor);

        // CONFIGURANDO A JANELA
        janelaVendedor.setSize(650, 550);
        janelaVendedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaVendedor.setResizable(true);
        janelaVendedor.setVisible(true);
        janelaVendedor.setLayout(null);
    }

    public class InserirListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            try {
                if (textFieldNome.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O nome não pode estar vazio!", "Informação", JOptionPane.ERROR_MESSAGE);
                } else if (textFieldNome.getText().length() > 50) {
                    JOptionPane.showMessageDialog(null, "O nome não pode ter mais de 50 caracteres!", "Informação", JOptionPane.ERROR_MESSAGE);
                } else {
                    vendedor.setNome(textFieldNome.getText().trim().toUpperCase());
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro no campo nome!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            try {
                if (textFieldSalario.getText().trim().isEmpty() || textFieldSalario.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "O salário não pode estar vazio. ", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    vendedor.setSalario(Double.parseDouble(textFieldSalario.getText().trim()));
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas numero!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            try {
                int indexador = textFieldEmail.getText().trim().indexOf('@');
                if (indexador > 2) {
                    vendedor.setEmail(textFieldEmail.getText().trim());
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
                    vendedor.setIdade(Integer.parseInt(textFieldIdade.getText()));
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
                    vendedor.setCidade(textFieldCidade.getText().trim().toUpperCase());
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
                    vendedor.setEstado(textFieldEstado.getText().trim().toUpperCase());
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro no campo estado.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("\n Dados do vendedor inseridos com sucesso!!!");

            listaVendedor.add(vendedor);

            if (listaVendedor.size() > 2) {
                try {
                    JOptionPane.showMessageDialog(null, "Numero máximo de cadastro!", "Informação", JOptionPane.ERROR_MESSAGE);
                } catch (ArrayIndexOutOfBoundsException erro) {
                    JOptionPane.showMessageDialog(null, " Possível apenas 5 registro!", "Informação", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public class ConsultarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // Exibe os dados registrados.
            System.out.println("\n Dados do vendedor ==>\n");
            for (Vendedor s : listaVendedor) {
                System.out.println("\nNome: " + s.getNome() + "\nSalário: " + s.getSalario() + "\nEmail: " + s.getEmail() + "\nIdade: " + s.getIdade()
                        + "\nCidade: " + s.getCidade() + "\nEstado: " + s.getEstado());
                System.out.println("====================================================\n");

            }
            try {
                if (listaVendedor == null) {
                    JOptionPane.showMessageDialog(null, "Arquivo não encontrado!");
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, " Verifique se há algum registro salvo!");
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
