package com.br.testaTela;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploTabela {
    private JFrame janela;
    private JPanel painelDaJanela;
    private JTable tabela;
    private JButton botaoIncluir;
    private JButton botaoExcluir;
    private JScrollPane painelDeScroll;
    private String[] colunas = new String[]{"UF", "Estado"};
    private String[][] dados = new String[][]{{"SP", "São Paulo"}, {"RJ", "Rio de Janeiro"},
            {"RN", "Rio Grande do Norte"}, {"PR", "Paraná"}};

    public static void main(String[] args) {
        ExemploTabela aplicacao = new ExemploTabela();
        aplicacao.iniciar();
    }

    public void iniciar() {
        //*CONFIGURANDO A JANELA.*/
        janela = new JFrame("Exemplo de Tabela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setSize(400, 300);
        painelDaJanela = (JPanel) janela.getContentPane();
        painelDaJanela.setLayout(null);

        botaoIncluir = new JButton("Incluir");
        botaoIncluir.setBounds(10, 200, 100, 50);
        botaoIncluir.addActionListener(new ListenerBotaoIncluir());

        botaoExcluir = new JButton("Excluir");
        botaoExcluir.setBounds(150, 200, 100, 50);
        botaoExcluir.addActionListener(new removeLinhaSelecionada());

        /*AO INVÉS DE PASSAR DIRETO, COLOCAMOS OS DADOS EM UM MODELO.*/
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        tabela = new JTable(modelo);
        //INSERINDO TABELA EM UM PAINEL DE SCROLL.
        painelDeScroll = new JScrollPane(tabela);
        painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        painelDeScroll.setBounds(10, 50, 300, 95);
        painelDaJanela.add(painelDeScroll);
        painelDaJanela.add(botaoIncluir);
        painelDaJanela.add(botaoExcluir);
        janela.setVisible(true);
    }


    public class ListenerBotaoIncluir implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            adicionaLinha();
        }
        /**
         * METODO PARA ADICIONAR UMA NOVA LINHA NA JTABLE.
         */
        public void adicionaLinha() {
            /**OBTEM O MODELO DA JTABLE.*/
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            if (tabela.getModel() == null) {
                JOptionPane.showMessageDialog(null, "O nome não pode estar vazio!", "Informação", JOptionPane.ERROR_MESSAGE);
            }
            /**ADICIONA UMA NOVA LINHA EM BRANCO NO MODELO.*/
            modelo.addRow(new String[]{"AL", "Alagoas"});
            modelo.addRow(new String[]{"AM", "Amazonas"});
        }
    }

    public class removeLinhaSelecionada implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            removeLinhaSelecionada();
        }
        public void removeLinhaSelecionada() {
            // Obtem o modelo da JTable
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.removeRow(tabela.getSelectedRow());
        }
    }
}
