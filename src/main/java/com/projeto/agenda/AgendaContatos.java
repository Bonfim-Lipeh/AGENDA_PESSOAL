package com.projeto.agenda;

import javax.swing.SwingUtilities;

import com.projeto.agenda.view.ContatoView;
import com.projeto.agenda.controller.ContatoController;
import com.projeto.agenda.model.ContatoModel;

/**
 * Classe principal que inicializa a aplicação Agenda de Contatos.
 * Responsável por criar as instâncias dos componentes MVC e iniciar a interface.
 *
 * @author Felipe Bonfim Pontes
 * @version 1.0
 */
public class AgendaContatos {

    public static void main(String[] args) {
        // Executa a inicialização da aplicação na thread de eventos do Swing
        SwingUtilities.invokeLater(() -> {
            // Criação das instâncias de View, Model e Controller
            ContatoView view = new ContatoView();
            ContatoModel model = new ContatoModel();
            new ContatoController(view, model);

            // Tornando a interface gráfica visível
            view.setVisible(true);
        });
    }
}