package Ui;

import model.Livro;
import Service.BibliotecaService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaUI {
    private BibliotecaService bibliotecaService = new BibliotecaService();

    public void iniciar() {
        JFrame frame = new JFrame("Sistema de Gerenciamento de Biblioteca");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Título do Livro:");
        userLabel.setBounds(10, 20, 100, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(120, 20, 165, 25);
        panel.add(userText);

        JButton cadastrarButton = new JButton("Cadastrar Livro");
        cadastrarButton.setBounds(10, 80, 150, 25);
        panel.add(cadastrarButton);

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = userText.getText();
                Livro livro = new Livro(titulo, "Autor Desconhecido", "0000", true);
                bibliotecaService.cadastrarLivro(livro);
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
            }
        });
    }

    public static void main(String[] args) {
        BibliotecaUI ui = new BibliotecaUI();
        ui.iniciar();
    }
}