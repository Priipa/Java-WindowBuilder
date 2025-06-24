package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestaoA {

    private JFrame frame;
    private JTextField textField;
    private JLabel lblResultado;
    private JButton btnPerfeito;
    private JButton btnDSU;
    private JButton btnLimpar;
    private JButton btnSair;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    QuestaoA window = new QuestaoA();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public QuestaoA() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Verificação de Números");
        frame.setBounds(100, 100, 526, 296);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblDigiteNumero = new JLabel("Digite um número:");
        lblDigiteNumero.setBounds(30, 30, 120, 20);
        frame.getContentPane().add(lblDigiteNumero);
        
        textField = new JTextField();
        textField.setBounds(150, 30, 120, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(30, 60, 350, 20);
        frame.getContentPane().add(lblResultado);
        
        btnPerfeito = new JButton("Perfeito");
        btnPerfeito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarNumeroPerfeito();
            }
        });
        btnPerfeito.setBounds(30, 100, 100, 30);
        frame.getContentPane().add(btnPerfeito);
        
        btnDSU = new JButton("DSU");
        btnDSU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularDSU();
            }
        });
        btnDSU.setBounds(140, 100, 100, 30);
        frame.getContentPane().add(btnDSU);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                lblResultado.setText("Resultado:");
            }
        });
        btnLimpar.setBounds(250, 100, 100, 30);
        frame.getContentPane().add(btnLimpar);
        
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnSair.setBounds(370, 100, 100, 30);
        frame.getContentPane().add(btnSair);
    }

    private void verificarNumeroPerfeito() {
        try {
            int numero = Integer.parseInt(textField.getText());
            if (isNumeroPerfeito(numero)) {
                lblResultado.setText("Resultado: " + "Número é perfeito");
                JOptionPane.showMessageDialog(frame, "Número é perfeito", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                lblResultado.setText("Resultado: " + "Númeiro não é perfeito");
                JOptionPane.showMessageDialog(frame, "Númeiro não é perfeito", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, digite um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isNumeroPerfeito(int numero) {
        if (numero <= 1) return false;
        
        int somaDivisores = 1; 
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                somaDivisores += i;
                if (i != numero / i) {
                    somaDivisores += numero / i;
                }
            }
        }
        
        return somaDivisores == numero;
    }

    private void calcularDSU() {
        try {
            int numero = Integer.parseInt(textField.getText());
            
            if (numero < 10 || numero > 99) {
                JOptionPane.showMessageDialog(frame, "Número de entrada não tem 2 dígitos", "Message", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            int dezena = numero / 10;
            int unidade = numero % 10;
            int soma = dezena + unidade;
            
            String resultado = dezena + "" + soma + "" + unidade;
            
            lblResultado.setText("Resultado: " + resultado);
            
            JOptionPane.showMessageDialog(frame, "Número: " + numero, "Message", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(frame, "Dígito da unidade: " + unidade, "Message", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(frame, "Dígito da dezena: " + dezena, "Message", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(frame, "Soma da dezena com unidade: " + soma, "Message", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, digite um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}