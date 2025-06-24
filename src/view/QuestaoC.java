package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestaoC {

	private JFrame frame;
	private JComboBox<String> comboCurso;
	private JRadioButton rdbManha, rdbTarde, rdbNoite;
	private JTextArea textAreaCadastro;
	private ButtonGroup grupoTurno;
	private String cadastros = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestaoC window = new QuestaoC();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuestaoC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Cadastro de Curso - Fatec");
		frame.setBounds(100, 100, 550, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCurso = new JLabel("Selecione o Curso:");
		lblCurso.setBounds(30, 30, 150, 20);
		frame.getContentPane().add(lblCurso);

		comboCurso = new JComboBox<>();
		comboCurso.setBounds(160, 30, 200, 22);
		comboCurso.addItem("Escolha uma opção");
		comboCurso.addItem("Análise e Desenvolvimento de Sistemas");
		comboCurso.addItem("Design de Midias Digitais");
		comboCurso.addItem("Jogos Digitais");
		comboCurso.addItem("Logística");
		comboCurso.addItem("Secretariado");
		comboCurso.addItem("Sistemas para Internet");
		comboCurso.addItem("Gestão Empresarial – EAD");
		frame.getContentPane().add(comboCurso);

		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setBounds(30, 70, 50, 20);
		frame.getContentPane().add(lblTurno);

		rdbManha = new JRadioButton("Manhã");
		rdbManha.setBounds(90, 70, 70, 20);
		frame.getContentPane().add(rdbManha);

		rdbTarde = new JRadioButton("Tarde");
		rdbTarde.setBounds(170, 70, 70, 20);
		frame.getContentPane().add(rdbTarde);

		rdbNoite = new JRadioButton("Noite");
		rdbNoite.setBounds(250, 70, 70, 20);
		frame.getContentPane().add(rdbNoite);

		grupoTurno = new ButtonGroup();
		grupoTurno.add(rdbManha);
		grupoTurno.add(rdbTarde);
		grupoTurno.add(rdbNoite);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		btnCadastrar.setBounds(90, 110, 100, 30);
		frame.getContentPane().add(btnCadastrar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimpar.setBounds(210, 110, 100, 30);
		frame.getContentPane().add(btnLimpar);

		JLabel lblCadastros = new JLabel("Cadastros Realizados:");
		lblCadastros.setBounds(30, 160, 150, 20);
		frame.getContentPane().add(lblCadastros);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 190, 450, 150);
		frame.getContentPane().add(scrollPane);

		textAreaCadastro = new JTextArea();
		textAreaCadastro.setEditable(false);
		scrollPane.setViewportView(textAreaCadastro);
	}

	private void cadastrar() {
		String curso = (String) comboCurso.getSelectedItem();
		String turno = "";

		if (rdbManha.isSelected()) {
			turno = "Manhã";
		} else if (rdbTarde.isSelected()) {
			turno = "Tarde";
		} else if (rdbNoite.isSelected()) {
			turno = "Noite";
		} else {
			JOptionPane.showMessageDialog(frame, "Por favor, selecione um turno.", "Erro", JOptionPane.WARNING_MESSAGE);
			return;
		}

		String resultado = "Curso: " + curso + " | Turno: " + turno + "\n";
		cadastros += resultado;
		textAreaCadastro.setText(cadastros);

		JOptionPane.showMessageDialog(frame, "Cadastro realizado com sucesso!");
	}

	private void limparCampos() {
		grupoTurno.clearSelection();
		textAreaCadastro.setText("");
		cadastros = "";
	}
}
