package com.projeto.agenda.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

/**
 * Classe responsável pela interface gráfica da agenda de contatos.
 */
public class ContatoView extends JFrame {

    private JTextField txtNome;
    private JTextField txtTelefone;
    private JButton btnAdicionar;
    private JButton btnAtualizar;
    private JButton btnDeletar;
    private JButton btnListar;
    private JTable tabelaContatos;
    private DefaultTableModel model;

    /**
     * Construtor da classe ContatoView.
     * Define e inicializa todos os componentes da interface.
     */
    public ContatoView() {
        // Configuração básica da janela principal
        setTitle("Agenda de Contatos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Configuração dos componentes da interface
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 100, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(120, 20, 200, 25);
        add(txtNome);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(20, 60, 100, 25);
        add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(120, 60, 200, 25);
        add(txtTelefone);

        btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(340, 20, 100, 25);
        add(btnAdicionar);

        btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(450, 20, 100, 25);
        add(btnAtualizar);

        btnDeletar = new JButton("Deletar");
        btnDeletar.setBounds(340, 60, 100, 25);
        add(btnDeletar);
        
        btnListar = new JButton("Listar");
        btnListar.setBounds(410, 60, 100, 25);
        add(btnListar);
        
        tabelaContatos = new JTable();
        model = new DefaultTableModel(new String[] {"ID", "Nome", "Telefone"}, 0);
        tabelaContatos.setModel(model);
        JScrollPane scrollPane = new JScrollPane(tabelaContatos);
        scrollPane.setBounds(20, 100, 540, 200);
        add(scrollPane);
    }
    
    //Métodos Getters para acessar os componentes da interface
    
    /**
     * * Retorna o campo de texto para o nome.
     * @return Campo de texto para nome do contato.
     */
    
    public JTextField getTxtNome() {
    	return txtNome;
    }
    
    /**
     * * Retorna o campo de texto para o telefone.
     * @return Campo de texto para telefone do contato.
     */
    
    public JTextField getTxtTelefone() {
    	return txtTelefone;
    }
    
    /**
     * * Retorna o botão "Adicionar".
     * @return Botão de adicionar um contato.
     */
    
    public JButton getBtnAdicionar() {
    	return btnAdicionar;
    }
    
    /**
     * * Retorna o botão "Atualizar".
     * @return Botão de atualizar um contato.
     */
    
    public JButton getBtnAtualizar() {
    	return btnAtualizar;
    }
     
    /**
     * * Retorna o botão "Deletar".
     * @return Botão de deletar um contato.
     */
    
    public JButton getBtnDeletar() {
    	return btnDeletar;
    }
    
    /**
     * * Retorna o botão "Listar".
     * @return Botão de Listar os contatos.
     */
    
    public JButton getBtnListar() {
    	return btnListar;
    }
    
    /**
     * * Retorna o modelo da tabela que contém os contatos.
     * @return Modelo da tabela dos contatos.
     */
    
    public DefaultTableModel getModel() {
    	return model;
    }
    
    /**
     * * Retorna a tabela que exibe os contatos".
     * @return Tabela de Contatos.
     */
    
    public JTable getTabelaContatos() {
    	return tabelaContatos;
    }
}
        