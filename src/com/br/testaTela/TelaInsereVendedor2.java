package com.br.testaTela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaInsereVendedor2 extends Vendedor {
    /**
     * Desenvolvido por Julio_Abreu
     * e-mail = juliocasp38@gmail.com
     */
    ArrayList<Vendedor> listaVendedor = new ArrayList<>();
    private JFrame janelaVendedor;
    private JButton inserir, consultar, limpar, cancelar;
    private JLabel labelNome, labelSalario, labelEmail, labelIdade, labelCidade, labelEstado;
    private JTextField textFieldNome, textFieldSalario, textFieldEmail, textFieldIdade, textFieldCidade, textFieldEstado;
    private JTabbedPane painelComAbasVendedor;
    private JPanel painelDaJanelaVendedor;
    private JPanel primeiraAbaVendedor;
    private JPanel segundaAbaFilme;
    private JPanel terceiraAbaLocacao;
    // Variáveis do checkBox.
    private JLabel labelEscolhaTemaDoFilme;
    private JLabel labelRespostaTemaDoFilme;
    private JCheckBox checkBoxFiccao;
    private JCheckBox checkBoxAcao;
    private JCheckBox checkBoxTerror;
    private JCheckBox checkBoxComedia;
    private JCheckBox checkBoxOutro;
    private JButton botaoResposta;
    // Variáveis do radioButton.
    private JLabel labelEscolhaSexo;
    private JLabel labelRespostaSexo;
    private JRadioButton radioButtonMasculino;
    private JRadioButton radioButtonFeminino;
    private JButton botaoVerificaSexo;
    private ButtonGroup buttonGroupRadio;
    // Variáveis do comboBox.
    private JComboBox<Object> comboBoxVendedor;
    private String[] cargoDoVendedor = {"VendedorJunior", "VendedorSenior", "VendedorPleno", "VendedorGeral"};

    public static void main(String[] args) {
        TelaInsereVendedor2 aplicativo = new TelaInsereVendedor2();
        aplicativo.iniciaGui();
    }

    public void iniciaGui() {
        // Cria a janela.
        janelaVendedor = new JFrame("Tela Insere Vendedor");
        painelComAbasVendedor = new JTabbedPane();
        painelDaJanelaVendedor = (JPanel) janelaVendedor.getContentPane();
        primeiraAbaVendedor = new JPanel();
        segundaAbaFilme = new JPanel();
        terceiraAbaLocacao = new JPanel();

        // Adiciona as Abas na janela.
        painelComAbasVendedor.add("Vendedor", primeiraAbaVendedor);
        painelComAbasVendedor.add("Filmes", segundaAbaFilme);
        painelComAbasVendedor.add("Locação", terceiraAbaLocacao);
        painelComAbasVendedor.setBounds(20, 20, 550, 450);

        // Carrega o ContentPane no (JTabbledPane).
        painelDaJanelaVendedor.add(painelComAbasVendedor);
        painelDaJanelaVendedor.setLayout(null);
        primeiraAbaVendedor.setLayout(null);
        segundaAbaFilme.setLayout(null);
        terceiraAbaLocacao.setLayout(null);

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

        // Cria os label do radioButton.
        labelEscolhaSexo = new JLabel();
        labelEscolhaSexo.setHorizontalTextPosition(SwingConstants.CENTER);
        labelEscolhaSexo.setForeground(Color.RED);
        labelEscolhaSexo.setText("Escolha o sexo:");
        labelEscolhaSexo.setBounds(300, 18, 230, 18);
        // Cria os label resposta do radioButton.
        labelRespostaSexo = new JLabel();
        labelRespostaSexo.setHorizontalTextPosition(SwingConstants.CENTER);
        labelRespostaSexo.setForeground(Color.BLUE);
        labelRespostaSexo.setText("Resposta:");
        labelRespostaSexo.setBounds(300, 240, 300, 18);
        // Cria o radioButton masculino.
        radioButtonMasculino = new JRadioButton();
        radioButtonMasculino.setText("Masculino");
        radioButtonMasculino.setSelected(true);
        radioButtonMasculino.setBounds(300, 50, 100, 24);
        // Cria os radioButton feminino.
        radioButtonFeminino = new JRadioButton();
        radioButtonFeminino.setText("Feminino");
        radioButtonFeminino.setBounds(300, 75, 100, 24);
        // Cria o botão verifica sexo.
        botaoVerificaSexo = new JButton();
        botaoVerificaSexo.setText("Mostrar");
        botaoVerificaSexo.setBounds(300, 196, 83, 28);
        //Cria o objeto do grupo de botões.
        buttonGroupRadio = new ButtonGroup();
        // Adiciona os botões do grupo.
        buttonGroupRadio.add(radioButtonFeminino);
        buttonGroupRadio.add(radioButtonMasculino);
        // Adiciona os componentes radioButton's à segundaAbaFilme.
        segundaAbaFilme.add(labelEscolhaSexo);
        segundaAbaFilme.add(labelRespostaSexo);
        segundaAbaFilme.add(radioButtonFeminino);
        segundaAbaFilme.add(radioButtonMasculino);
        segundaAbaFilme.add(botaoVerificaSexo);
        // Cria um Listener do botãoVerificaSexo.
        botaoVerificaSexo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String respostaSexo = "";
                if (radioButtonFeminino.isSelected()) {
                    respostaSexo += radioButtonFeminino.getText();
                }
                if (radioButtonMasculino.isSelected()) {
                    respostaSexo += radioButtonMasculino.getText();
                }
                // troca a cor da fonte do rotulo para vermelho
                labelRespostaSexo.setForeground(Color.RED);
                // Escreve a resposta no rótulo azul.
                labelRespostaSexo.setText(respostaSexo);
                respostaSexo = "";
            }
        });

        // Configurando os label do checkBox
        labelEscolhaTemaDoFilme = new JLabel();
        labelEscolhaTemaDoFilme.setForeground(Color.RED);
        labelEscolhaTemaDoFilme.setText("Escolha o Gênero de Filme:");
        labelEscolhaTemaDoFilme.setBounds(42, 15, 208, 18);
        // Configurando o label resposta do checkBox
        labelRespostaTemaDoFilme = new JLabel();
        labelRespostaTemaDoFilme.setForeground(Color.BLUE);
        labelRespostaTemaDoFilme.setText("Resposta");
        labelRespostaTemaDoFilme.setBounds(42, 240, 300, 18);
        // Configurando o checkBoxFiccao
        checkBoxFiccao = new JCheckBox();
        checkBoxFiccao.setText("Ficção");
        checkBoxFiccao.setSelected(true);
        checkBoxFiccao.setBounds(42, 44, 145, 24);
        // Configurando o checkBoxAcao
        checkBoxAcao = new JCheckBox();
        checkBoxAcao.setText("Ação");
        checkBoxAcao.setBounds(42, 64, 154, 24);
        // Configurando o checkBoxTerror
        checkBoxTerror = new JCheckBox();
        checkBoxTerror.setText("Terror");
        checkBoxTerror.setSelected(true);
        checkBoxTerror.setBounds(42, 84, 157, 24);
        // Configurando o checkBoxComédia
        checkBoxComedia = new JCheckBox();
        checkBoxComedia.setText("Comédia");
        checkBoxComedia.setBounds(42, 104, 154, 24);
        // Configurando o checkBoxOutro
        checkBoxOutro = new JCheckBox();
        checkBoxOutro.setText("Outro");
        checkBoxOutro.setBounds(42, 124, 154, 24);
        // Configura o BotaoResposta.
        botaoResposta = new JButton();
        botaoResposta.setText("Verificar");
        botaoResposta.setBounds(42, 196, 83, 28);

        // Adiciona os checkBox e label's à segundaAbaFilme
        segundaAbaFilme.add(labelEscolhaTemaDoFilme);
        segundaAbaFilme.add(labelRespostaTemaDoFilme);
        segundaAbaFilme.add(checkBoxFiccao);
        segundaAbaFilme.add(checkBoxAcao);
        segundaAbaFilme.add(checkBoxTerror);
        segundaAbaFilme.add(checkBoxComedia);
        segundaAbaFilme.add(checkBoxOutro);
        segundaAbaFilme.add(botaoResposta);
        // Cria um listener para o botãoResposta.
        botaoResposta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String resposta = "";
                if (checkBoxFiccao.isSelected()) {
                    resposta += checkBoxFiccao.getText();
                }
                if (checkBoxAcao.isSelected()) {
                    resposta += checkBoxAcao.getText();
                }
                if (checkBoxTerror.isSelected()) {
                    resposta += checkBoxTerror.getText();
                }
                if (checkBoxComedia.isSelected()) {
                    resposta += checkBoxComedia.getText();
                }
                if (checkBoxOutro.isSelected()) {
                    resposta += checkBoxOutro.getText();
                }
                if (resposta.isEmpty()) {
                    resposta = "Nenhum item selecionado";
                }
                // Escreve a resposta no rótulo azul.
                labelRespostaTemaDoFilme.setText(resposta);
                resposta = "";
            }
        });

        // CONFIGURANDO A JANELA
        janelaVendedor.setSize(650, 550);
        janelaVendedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaVendedor.setResizable(true);
        janelaVendedor.setVisible(true);
        janelaVendedor.setLayout(null);
    }

    public class InserirListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            Vendedor vendedor = new Vendedor();
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

            listaVendedor.add(vendedor);
            System.out.println("Exemplo de lista:(referência) " + listaVendedor);
            System.out.println(comboBoxVendedor.getSelectedIndex());
            System.out.println(comboBoxVendedor.getSelectedItem());
            System.out.println(cargoDoVendedor);

            if (listaVendedor.size() > 2) {
                try {
                    JOptionPane.showMessageDialog(null, "Numero máximo de cadastro!", "Informação", 2);
                    JOptionPane.showMessageDialog(null, " Possível apenas 2 registro!", "Informação", 2);
                } catch (ArrayIndexOutOfBoundsException erro) {
                    JOptionPane.showMessageDialog(null, "ERRO!", "Informação", 2);
                }
            }
        }
    }

    public class ConsultarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // Exibe os dados registrados.
            System.out.println("\n Dados do vendedor (numero de referência do Objeto) => " + listaVendedor);
            for (Vendedor vendedor : listaVendedor) {
                System.out.println("\nNome: " + vendedor.getNome() + "\nSalário: " + vendedor.getSalario() + "\nEmail: " + vendedor.getEmail() + "\nIdade: " + vendedor.getIdade()
                        + "\nCidade: " + vendedor.getCidade() + "\nEstado: " + vendedor.getEstado());
                System.out.println("====================================================\n");
            }
            System.out.println(comboBoxVendedor.getSelectedIndex());
            System.out.println(comboBoxVendedor.getSelectedItem());
            System.out.println(cargoDoVendedor);
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
