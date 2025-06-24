package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class LoginWindow extends JFrame {

    private JPanel contentPane;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginWindow frame = new LoginWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginWindow() {
        setTitle("Biblioteca Fatec - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 240, 240));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Acesso ao Sistema");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblTitulo.setBounds(120, 20, 150, 30);
        contentPane.add(lblTitulo);

        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblUsuario.setBounds(50, 80, 80, 20);
        contentPane.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(140, 80, 200, 25);
        contentPane.add(txtUsuario);
        txtUsuario.setColumns(10);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSenha.setBounds(50, 120, 80, 20);
        contentPane.add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(140, 120, 200, 25);
        contentPane.add(txtSenha);

        JButton btnLogin = new JButton("Entrar");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fazerLogin();
            }
        });
        btnLogin.setBackground(new Color(0, 120, 215));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBounds(140, 170, 100, 30);
        contentPane.add(btnLogin);
    }

    private void fazerLogin() {
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("123456")) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            abrirSistemaBiblioteca();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos", "Erro", JOptionPane.ERROR_MESSAGE);
            txtSenha.setText("");
            txtUsuario.requestFocus();
        }
    }

    private void abrirSistemaBiblioteca() {
        BibliotecaWindow sistema = new BibliotecaWindow();
        sistema.setVisible(true);
    }
}
