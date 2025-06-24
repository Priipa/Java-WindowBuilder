package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BibliotecaWindow extends JFrame {

    private JPanel contentPane;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextArea txtAreaLivros;
    private String livros = "";

    public BibliotecaWindow() {
        setTitle("Sistema de Biblioteca - Fatec Carapicuíba");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Sistema de Gestão de Livros");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblTitulo.setBounds(180, 10, 250, 30);
        contentPane.add(lblTitulo);

        JLabel lblNovoLivro = new JLabel("Adicionar Novo Livro:");
        lblNovoLivro.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNovoLivro.setBounds(20, 50, 150, 20);
        contentPane.add(lblNovoLivro);

        JLabel lblTituloLivro = new JLabel("Título:");
        lblTituloLivro.setBounds(20, 80, 80, 20);
        contentPane.add(lblTituloLivro);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(100, 80, 200, 20);
        contentPane.add(txtTitulo);
        txtTitulo.setColumns(10);

        JLabel lblAutor = new JLabel("Autor:");
        lblAutor.setBounds(20, 110, 80, 20);
        contentPane.add(lblAutor);

        txtAutor = new JTextField();
        txtAutor.setBounds(100, 110, 200, 20);
        contentPane.add(txtAutor);
        txtAutor.setColumns(10);

        JButton btnAdicionar = new JButton("Adicionar Livro");
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarLivro();
            }
        });
        btnAdicionar.setBounds(100, 150, 120, 25);
        contentPane.add(btnAdicionar);

        JLabel lblLivros = new JLabel("Livros Disponíveis:");
        lblLivros.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblLivros.setBounds(350, 50, 150, 20);
        contentPane.add(lblLivros);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(350, 80, 200, 200);
        contentPane.add(scrollPane);

        txtAreaLivros = new JTextArea();
        txtAreaLivros.setEditable(false);
        scrollPane.setViewportView(txtAreaLivros);

        // Exemplo de livros iniciais
        livros += "• Java Como Programar - Deitel\n";
        livros += "• Clean Code - Robert Martin\n";
        atualizarListaLivros();
    }

    private void adicionarLivro() {
        String titulo = txtTitulo.getText();
        String autor = txtAutor.getText();

        if (titulo.isEmpty() || autor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        livros += "• " + titulo + " - " + autor + "\n";
        atualizarListaLivros();

        txtTitulo.setText("");
        txtAutor.setText("");
        txtTitulo.requestFocus();

        JOptionPane.showMessageDialog(this, "Livro adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void atualizarListaLivros() {
        txtAreaLivros.setText(livros);
    }
}
